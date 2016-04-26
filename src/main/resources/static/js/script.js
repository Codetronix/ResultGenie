 $(document).ready(function() {
 $('#loginForm').submit(function(){
            var url = "/rest/v1/user/login";
            var data = {};
            data.name=$('#username').val();
            data.password=$('#password').val();
            $.ajax({
                   type: "POST",
                   url: url,
                   data: JSON.stringify(data),
                   dataType: 'json',
                   contentType: "application/json",
                   success: function(data)
                   {
                     // localStorage.setItem("isSameSession",false);
                      window.location.href="/index.html";
                   },
                   error:function(data){
                        alert("Login failed");
                        console.log(data);
                   }
                 });
            return false;
        });
        });