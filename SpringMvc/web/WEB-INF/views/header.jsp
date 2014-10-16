<!DOCTYPE html>
<%@page language="java" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>SpringMvc</title>
        <META HTTP-EQUIV=Content-Type CONTENT="text/html; charset=UTF-8" />
        <META HTTP-EQUIV="Pragma" CONTENT="no-cache" />
        <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache" />
        <META HTTP-EQUIV="Expires" CONTENT="0" />
        <script type="text/javascript" src="${contextPath}/static/application-context.js"></script>
        <script type="text/javascript">
            CTX.utilities.load("json2","1.0.0");
            CTX.utilities.load("jquery","1.9.1");
            CTX.utilities.load("jquery.ex","1.0.0")

            CTX.utilities.load("jquery.ui.widget","1.10.3");
            CTX.utilities.load("jquery.ui.mouseinteraction","1.0.0");
            CTX.functions.load("index");
        </script>
        <script type="text/javascript">
            (function($){
                $(function(){
                    $('#subject').click(function(){
                       alert($(this).html()+"header");
                    });
                });
            })(jQuery);
        </script>
    </head>

    <body>
        <header>
            <h1 id="subject">SpringMvc</h1>
            <h4>SpringMvc Jesse Ni</h4>
        </header>
    </body>

</html>
