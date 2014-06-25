require([ 'jquery', 'bootstrap', 'bootstrap-carousel' ], function($) {
	$(function() {
		console.log("test");
		$("#submit").click(function() {
			var data = {
				"url" : $("#url").val()
			};
			$.ajax({
				"url" : "/shortenURL",
				"type" : "POST",
				"data" : data,
				"success" : function(res) {
					$("#result").html("http://suw.kr/" + res);
				}
			});
		});
	});
});