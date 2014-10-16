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
                    $(function(){
                        $('#postJSON').click(function(){
                            var url = "${contextPath}/test/index.do";
                            $.postJSON(url,["infosys","sun","google"],function(data){
                                $.each(data,function(index,value){

                                });
                            });
                        });
                    });
                });
            })(jQuery);
        </script>
    </head>
    <%@include file="header.jsp"%>
    <body>
        <div id="container">
            <div id="left">
                ${left}
            </div>
            <div id="right">
                <div id="content">
                    <button id="postJSON" name="button">Button</button>
                </div>
            </div>
        </div>
    </body>
    <%@include file="footer.jsp"%>
</html>
