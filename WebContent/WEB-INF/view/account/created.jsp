<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� ����</title>
</head>
<body>
���� ���� ��

<ul>
	<li>���̵� : ${command.id }</li>
	<li>�̸� : ${command.name }</li>
	<li>���� ��ȣ : ${command.address.zipcode }</li>
	<li>�ּ� : ${command.address.address1 } ${command.address.address2 }</li>
</ul>
</body>
</html>