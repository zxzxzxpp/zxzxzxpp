<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� ����</title>
</head>
<body>
<spring:hasBindErrors name="command"/>
<form:errors path="com imand" />
<form method="post">
	���̵�:<input type="text" name="id" value="${command.id }"/>
	<form:errors path="command.id"/>
	<br>
	�̸� :<input type="text" name="name" value="${command.name }"/>
	<form:errors path="command.name" />
	<br>
	�����ȣ : <input type ="text" name="address.zipcode" value="${command.address.zipcode }"/>
	<form:errors path="command.address.zipcode" />
	<br>
	�ּ�1 : <input type="text" name="address.address1" value="${command.address.address1 }" />
	<form:errors path="command.address.address1" />	
	<br>
	�ּ�2 : <input type="text" name="address.address2" value="${command.address.address2 }"/>
	<form:errors path="command.address.address2" />
	<br>
	<input type="submit" />
</form>
	
</body>
</html>