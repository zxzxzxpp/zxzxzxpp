<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�α� ���</title>
</head>
<body>

<form:form method="get">
<form:errors path="from" element="div"/>
<form:errors path="to" element="div" />
������ : <form:input path="from"/>
������ : <form:input path="to"/>
	<input type="submit" value="��ȸ" />
</form:form>
</body>
</html>