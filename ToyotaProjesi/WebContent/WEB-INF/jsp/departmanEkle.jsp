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

	<c:url var="actionURL" value="/departman.add" />
	<c:set var="buttonName" value="Oluştur" />
	<c:if test="${ !empty update}">
		<c:url var="actionURL" value="/departman.update" />
		<c:set var="buttonName" value="Güncelle" />
	</c:if>
	

	<div class="container">
		<div class="col-md-8">

			<form:form class="form-horizontal" method="post"
				modelAttribute="newDepartman" action="${actionURL}">
				<h2 class="form-signin-heading">Departman Ekle</h2>
				<form:hidden path="id" />

				<spring:bind path="name">
					<div class="form-group">
						<label class="col-sm-6 control-label">Departman Adı</label>
						<div class="col-sm-6">
							<form:input path="name" type="text" class="form-control"
								id="name" placeholder="Departman Adı" />
							<form:errors path="name" class="control-label" />
						</div>
					</div>
				</spring:bind>
	

				<div class="form-group">
					<div class="col-sm-offset-6 col-sm-6">
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