
/* Extends jQuery */
(function($){
	$.sp = $.sp || {};
	
	/* extend ajax request methods */
	$.sp.getAjaxConf = function(url, jsonData, success){
		return {
            url: url,
            type: "POST",
            data: jsonData ? JSON.stringify(jsonData) : null,
            //dataType: "json",
            contentType: "application/json; charset=utf-8",
            success: success
        };
	};
	$.postJSON = function (url, jsonData, success, options) {
        $.ajax($.extend(options, $.sp.getAjaxConf(url, jsonData, success)));
    };
	$.putJSON = function (url, jsonData, success, options) {
        $.ajax($.extend(options, $.sp.getAjaxConf(url, jsonData, success), {type:'PUT'}));
    };
	$.deleteJSON = function (url, jsonData, success, options) {
        $.ajax($.extend(options, $.sp.getAjaxConf(url, jsonData, success), {type:'DELETE'}));
    };
	
    /* extend jquery element methods */
	$.sp.toNum = function($el, prop) {
		return parseInt($el.css(prop))||0;
	};
	$.fn.widthEx = function(){
		var $el = $(this), ew = 0; 
		for (var i = 0, props = ['marginLeft', 'borderLeftWidth', 'paddingLeft', 'paddingRight', 'borderRightWidth', 'marginRight']; i < props.length; i++)
			ew += $.sp.toNum($el, props[i]);
		return ew;
	};
	$.fn.heightEx = function(){
		var $el = $(this), eh = 0; 
		for (var i = 0, props = ['marginTop', 'borderTopWidth', 'paddingTop', 'paddingBottom', 'borderBottomWidth', 'marginBottom']; i < props.length; i++)
			eh += $.sp.toNum($el, props[i]);
		return eh;
	};	
})(jQuery);

