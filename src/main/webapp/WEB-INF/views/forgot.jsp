<%-- 
    Document   : forgot.jsp
    Created on : 30-Jan-2015, 16:05:50
    Author     : Sara
--%>

<%@page import="com.archive.spring.form.ForgotPass"%>
<%@ include file="import.jsp" %>
<!DOCTYPE html>
<html lang="en"> <!--<![endif]-->
    <head>
        <%@ include file="header.jsp" %>
        <%
            if (request.getAttribute("ForgotPass") == null) {
                request.setAttribute("ForgotPass", new ForgotPass());
            }
        %>
    </head>
    <body>

        <div id="wrap">

            <%@include file="body_header.jsp" %>
           <div class="account-container btm10">

	<div class="form-content clearfix">
    
		<form:form action="forgot" modelAttribute="ForgotPass">

			<h1><i class="iconbig-lock"></i> Sign In</h1>	
            
			<div class="login-fields">
            
				<p>Reset your password</p>
				<div class="field">

					<label for="password">Mail de recuperation:</label>
                                         <form:input path="email" type="email"  id="email" placeholder="Email address" />					
				</div> <!-- /password -->
			</div> <!-- /login-fields -->			

			<div class="login-actions">
				<span class="login-checkbox">
				<input id="Field" name="Field" type="checkbox" class="field login-checkbox" value="First Choice" tabindex="4" />
				</span>
				<input type="submit" name="submit" value="Sign in" class="btn-signin btn btn-primary" />
                                <a href="signin.jsp" class="btn-signin btn">Cancel</a>
                

			</div> <!-- .actions -->
                        </form:form>

	   </div> <!-- /form-content -->

    </div> <!-- /account-container -->
    
    <%@ include file="footer.jsp" %>

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery-1.7.2.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/image-gallery.js"></script>
    <script src="js/jquery.mousewheel-3.0.6.pack.js"></script>
    <script src="source/jquery.fancybox.js"></script>

  </body>
</html>