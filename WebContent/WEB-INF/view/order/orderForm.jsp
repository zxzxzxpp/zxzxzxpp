<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" >
	��ǰ1: ID-<input type="text" name="orderItems[0].itemId" />
	���� - <input type="text" name="orderItems[0].number" />
	���� - <input type="text" name="orderItems[0].remark" />
	
	<br>
	
	��ǰ2: ID-<input type="text" name="orderItems[1].itemId" />
	���� - <input type="text" name="orderItems[1].number" />
	���� - <input type="text" name="orderItems[1].remark" />

	<br>
	
	��ǰ3: ID-<input type="text" name="orderItems[2].itemId" />
	���� - <input type="text" name="orderItems[2].number" />
	���� - <input type="text" name="orderItems[2].remark" />
	<br>
	����� : 
	���� ��ȣ - <input type="text" name="address.zipcode" />
	�ּ�1 - <input type="text" name="address.address1"/>
	�ּ�2 - <input type="text" name="address.address2" />
	<input type="submit" />
</form>
</body>
</html> 