<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>
<script type="text/javascript">
function del(){
	var msg = "确定要删除此商品吗？";
	if (confirm(msg) == true){
		return true;
	}
	else{
		return false;
	}
}
</script>
</head>
<body>

<div id="global">
<h1>商品列表</h1>
<a href="<c:url value="/product_input"/>">添加商品</a>
<table>
<tr>
	<th>名称</th>
	<th>描述</th>
	<th>价格</th>
	<th>&nbsp;</th>
	<th>&nbsp;</th>
</tr>
<c:forEach items="${products}" var="product">
	<tr>
		<td>${product.name}</td>
		<td>${product.description}</td>
		<td>￥${product.price}</td>
		<td><a href="product_edit/${product.id}">编辑</a></td>
		<td><a href="product_delete/${product.id}" onclick="javascript:return del();">删除</a></td>
	</tr>
</c:forEach>
</table>
</div>

</body>
</html>