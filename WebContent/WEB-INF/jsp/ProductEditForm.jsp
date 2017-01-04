<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑商品</title>
</head>
<body>

<div id="global">
<form:form commandName="product" action="/product_update" method="post">
	<fieldset>
		<legend>编辑一个商品</legend>
		<form:hidden id="id" path="id"/>
		<p>
			<label for="name">商品名称：</label>
			<form:input id="name" path="name" />
		</p>
		<p>
			<label for="description">商品描述：</label>
			<form:input id="description" path="description"/>
		</p>
		<p>
			<label for="price">商品价格：</label>
			<form:input id="price" path="price"/>
		</p>
		<p id="buttons">
			<input id="reset" type="reset" tabindex="4" value="重置">
			<input id="submit" type="submit" tabindex="5" value="编辑商品">
		</p>
	</fieldset>
</form:form>
</div>

</body>
</html>