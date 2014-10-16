(function($){
	$(function(){
		$(window).resize(function(){
			var $windowHeight = $(window).outerHeight();
			var $contentWidth = $(window).width();
			var $headHeight = 65;
			var $workpaneHeight = $windowHeight-$headHeight;
			$('#Lworkpane,#Lworkpane iframe').height($workpaneHeight);
			$('#Lworkpane,#Lworkpane iframe').width($contentWidth);
		}).trigger('resize');
	});	
})(jQuery);
