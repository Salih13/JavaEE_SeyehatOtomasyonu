<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

	<c:url var="actionURL" value="/seyehat.add" />
	<c:set var="buttonName" value="Oluştur" />
	<c:if test="${ !empty update}">
		<c:url var="actionURL" value="/seyehat.update" />
		<c:set var="buttonName" value="Güncelle" />
	</c:if>

	<div class="container">
		<div class="col-md-8">

			<form:form class="form-horizontal" method="post"
				modelAttribute="newSeyehat"
				action="${actionURL}">
				<h2 class="form-signin-heading">Seyehat Ekle</h2>
				<form:hidden path="id" />

				<spring:bind path="seyehatBaslangici">
					<div class="form-group">
						<label class="col-sm-4 control-label">Başlangıç Tarihi</label>
						<div class="col-sm-8">
							<form:input path="seyehatBaslangici" type="text" class="form-control"
								id="seyehatBaslangici" />
							<form:errors path="seyehatBaslangici" class="control-label" />
						</div>
					</div>
				</spring:bind>

				<spring:bind path="seyehatSonu">
					<div class="form-group">
						<label class="col-sm-4 control-label">Bitiş Tarihi</label>
						<div class="col-sm-8">
							<form:input path="seyehatSonu" class="form-control" id="seyehatSonu" />
							<form:errors path="seyehatSonu" class="control-label" />
						</div>
					</div>
				</spring:bind>

				<spring:bind path="seyehatYeri">
					<div class="form-group">
						<label class="col-sm-4 control-label">Seyehat Yeri</label>
						<div class="col-sm-8">
							<form:input path="seyehatYeri" class="form-control"
								id="seyehatYeri" />
							<form:errors path="seyehatYeri" class="control-label" />
						</div>
					</div>
				</spring:bind>

				<spring:bind path="gidisAmaci">
					<div class="form-group">
						<label class="col-sm-4 control-label">Gidiş Amacı</label>
						<div class="col-sm-8">
							<form:input path="gidisAmaci" class="form-control" id="gidisAmaci" />
							<form:errors path="gidisAmaci" class="control-label" />
						</div>
					</div>
				</spring:bind>

				<spring:bind path="projeKodu">
					<div class="form-group">
						<label class="col-sm-4 control-label">Proje Kodu</label>
						<div class="col-sm-8">
							<form:input path="projeKodu" class="form-control" id="projeKodu" />
							<form:errors path="projeKodu" class="control-label" />
						</div>
					</div>
				</spring:bind>

				<div class="form-group">
					<div class="col-sm-offset-4 col-sm-8">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="${buttonName}" />
					</div>
				</div>
				
			</form:form>
		</div>
	</div>

	<footer>
		<f:subview id="footer">
			<jsp:include page="footer.jsp"></jsp:include>
		</f:subview>
	</footer>
</body>
</html>