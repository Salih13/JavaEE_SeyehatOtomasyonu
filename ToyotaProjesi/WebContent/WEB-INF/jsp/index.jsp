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
<link href="${styleCSS}" rel="stylesheet" />
</head>
<body>
	<header>
		<f:subview id="header">
			<jsp:include page="header.jsp"></jsp:include>
		</f:subview>
	</header>

	<div class="container">
		<div class="row">

			<div class="col-md-3 col-sm-6 col-xs-12">
				<div class="anasayfaMenu"
					onclick="location.href='${pageContext.request.contextPath}/seyehat.list'">
					<div class="anasayfaMenuBaslik">
						<p>Personel Seyahat Sistemi</p>
						<hr>
					</div>
					<p>Firmamızda çalışan personelllerin şu anda konum olarak
						nerede olduklarını güncel olarak görebilirsiniz.</p>
				</div>
			</div>

			<div class="col-md-3 col-sm-6 col-xs-12">
				<div class="anasayfaMenu"
					onclick="location.href='${pageContext.request.contextPath}/person.list'">
					<div class="anasayfaMenuBaslik">
						<p>Personel Listesi</p>
						<hr>
					</div>
					<p>Firmamızda çalışan tüm personellerimizi güncel olarak 
					  hangi departmanda, bölümde veya ekip ile çalıştıklarını görebilirsiniz. </p>
				</div>
			</div>
			
			<div class="col-md-3 col-sm-6 col-xs-12">
				<div class="anasayfaMenu"
					onclick="location.href='${pageContext.request.contextPath}/departman.list'">
					<div class="anasayfaMenuBaslik">
						<p>Departmanlarımız</p>
						<hr>
					</div>
					<p>Firmamızda bulunan departmanlara ve çalışan personellerimize
					ulaşabilirsiniz. </p>
				</div>
			</div>
			
			
		</div>
	</div>

	<footer>
		<f:subview id="footer">
			<jsp:include page="footer.jsp"></jsp:include>
		</f:subview>
	</footer>
</body>
</html>