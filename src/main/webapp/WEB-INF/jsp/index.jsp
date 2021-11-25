<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="/webjars/jquery/3.3.1/jquery.min.js"></script>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
  index jsp
  </body>
<script>
  $(document).ready(function() {
    apiTest();
  });

  function apiTest() {
    $.ajax({
      url: '/apiTest',
      type: 'POST',
      data: {
        param1:'1'
        ,param2:'2'
      },
      dataType: 'json',
      success: function (result) {
        var data = result.data;

      },
      error: function (xhr, option, error) {
        if (xhr.status == 401 || xhr.status == 403) {
          document.location = '/';
        } else {
          alert(JSON.parse(xhr.responseText).message);
        }
      }
    });
  }
</script>
</html>
