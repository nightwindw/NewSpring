<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品信息</title>
</head>
<body>
<div id="global">
	<h4>商品信息已保存。</h4>
	<p>
		<h5>商品详情：</h5>
		商品名：${product.name}<br/>
		商品描述：${product.description }<br/>
		价格：￥${product.price }
	</p>
</div>
</body>
</html>