require([ 'jquery', 'bootstrap', 'bootstrap-carousel' ], function($) {
  $(function() {
    $("#url").keyup(function(key){
      if(key.keyCode == 13){
        $("#submit").click();
      }           
    }); 
    $("#submit").click(function() {
      var data = { 
        "url" : $("#url").val()
      };  
      $.ajax({
        "url" : "/shortenURL",
        "type" : "POST",
        "data" : data,
        "success" : function(res) {
          $("#result").html("suw.kr/" + res);
        }   
      }); 
    }); 
  }); 
});
