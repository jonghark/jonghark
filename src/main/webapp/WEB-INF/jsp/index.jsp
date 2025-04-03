<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="/webjars/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="https://api-test.eximbay.com/v1/javascriptSDK.js"></script>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
    <form id="payment">
          <input type="text" name="transaction_type" value="PAYMENT">
          <input type="text" name="order_id" value="20220819105102">
          <input type="text" name="currency" value="USD">
          <input type="text" name="amount" value="1">
          <input type="text" name="lang" value="EN">
          <input type="text" name="mid" value="1849705C64">
          <input type="text" name="name" value="eximbay">
          <input type="text" name="email" value="test@eximbay.com">
          <input type="text" name="return_url" value="eximbay.com">
          <input type="text" name="status_url" value="eximbay.com">
</form>

    <button type="button" onclick="beforeCheck()">결제전</button>
  <button type="button" onclick="payment();">결제 창 연동</button><br/>

  <div id="result"></div>
  </body>
<script>

  function beforeCheck(){
    var formData = $("#payment").serialize();
    $.ajax({
          url: '/paymentTest',
          type: 'POST',
          async :false,
          data: formData,
          dataType: 'json',
          success: function (result) {
            console.log(result.result)
          },
          error: function (xhr, option, error) {

          }
        });
  }

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
