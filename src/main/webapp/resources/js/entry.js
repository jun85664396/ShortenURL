requirejs.config({
	"appDir": "/assets/scripts",
	"shim": {
		"jquery": {
			"exports": "jquery"
		},
		"bootstrap": {
			"exports": "bootstrap"
		},
		"bootstrap-carousel":{
			"deps":['bootstrap'],
			"exports":"bootstrap-carousel"
		},
		"jquery.gmap":{
			"deps":['jquery'],
			"exports":"jquery.gmap"
		},
		"jquery-isotope":{
			"deps":['jquery'],
			"exports":"jquery-isotope"
		},
		"google.map":{
			"exports":"google.map"
		}
	},
	"paths": {
		"bootstrap-carousel":"../js/bootstrap-carousel",
		"jquery.gmap":"../js/jquery.gmap",
		"jquery-isotope":"../js/jquery.isotope.min",
		"google.map":"../js/google.map"
	}
});

require(['jquery','slowscript'],function($,slowscript){
	$(function(){
		slowscript.execute();
	});
});