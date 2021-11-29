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
      async :false,
      data: {
        param1:'1'
        ,param2:'2'
      },
      dataType: 'json',
      success: function (result) {
        var data = result.data;
          console.log('data.param1 = ' + data.param1);
          console.log('data.param2 = ' + data.param2);
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
