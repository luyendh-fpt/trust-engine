<%--
  Created by IntelliJ IDEA.
  User: xuanhung
  Date: 2019-06-19
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Hello World</title>
    <s:head/>
</head>
<body>
<h1>Login Page</h1>
<s:form action="processLogin">
    <div>
        Username <s:textfield name="account.username"/>
    </div>
    <div>
        Password <s:password name="account.password"/>
    </div>
    <div>
        <input type="submit" value="Submit">
        <input type="reset" value="Reset">
    </div>
</s:form>
</body>
</html>
