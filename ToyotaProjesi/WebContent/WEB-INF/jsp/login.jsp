<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="tr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Güngör Otomotiv</title>
<spring:url value="/resources/css/bootstrap.css" var="bootstrapCSS" />
<spring:url value="/resources/css/style.css" var="styleCSS" />

<link href="${bootstrapCSS}" rel="stylesheet" />
<link href="${styleCSS}"  rel="stylesheet" />
</head>
<body>
	<header>
		<f:subview id="header">
			<jsp:include page="header.jsp"></jsp:include>
		</f:subview>
	</header>

	<div class="container">
		<div class="col-md-4">
			<form class="form-signin" method="post">
				<h2 class="form-signin-heading">Giriş Yap</h2>
				<input type="email" id="Email" class="form-control"
					placeholder="Kullanıcı adınız" required autofocus> <input
					type="password" id="Parola" class="form-control"
					placeholder="Parolanız" required>
				<div class="checkbox">
					<label> <input type="checkbox" value="beni-hatirla">
						Beni hatırla.
					</label>
				</div>
				<button class="btn btn-lg btn-primary btn-block" type="submit">Giriş
					Yap</button>
			</form>
			<br><p><a href="${pageContext.request.contextPath}/register">Kayıt olmak için tıklayınız.</a></p>
			
		</div>
	</div>

	<footer>
		<f:subview id="footer">
			<jsp:include page="footer.jsp"></jsp:include>
		</f:subview>
	</footer>
</body>
</html>