<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<spring:url value="/resources/images" var="logoIMAGES" />
</head>
<body>

	<div class="header">
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-sm-6 col-xs-6">
					<div class="header-logo">
					<a href="${pageContext.request.contextPath}/"><img src="${logoIMAGES}/logo.png"></a>
					</div>
				</div>
				<div class="col-md-6 col-sm-6 col-xs-6">
					<div>
						<ul>
							<li><a class="girisButonu" href="${pageContext.request.contextPath}/login">Giriş Yap / Kayıt Ol</a></li>						
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>