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

	<c:url var="actionURL" value="/person.add" />
	<c:set var="buttonName" value="Oluştur" />
	<c:if test="${ !empty update}">
		<c:url var="actionURL" value="/person.update" />
		<c:set var="buttonName" value="Güncelle" />
	</c:if>

	<div class="container">
		<div class="col-md-8">

			<form:form class="form-horizontal" method="post"
				modelAttribute="newPerson" action="${actionURL}">
				<h2 class="form-signin-heading">Kayıt Ol</h2>
				<form:hidden path="id" />

				<spring:bind path="isim">
					<div class="form-group">
						<label class="col-sm-6 control-label">Name</label>
						<div class="col-sm-6">
							<form:input path="isim" type="text" class="form-control"
								id="isim" placeholder="Name" />
							<form:errors path="isim" class="control-label" />
						</div>
					</div>
				</spring:bind>

				<spring:bind path="soyisim">
					<div class="form-group">
						<label class="col-sm-6 control-label">Soyisim</label>
						<div class="col-sm-6">
							<form:input path="soyisim" class="form-control" id="soyisim"
								placeholder="soyisim" />
							<form:errors path="soyisim" class="control-label" />
						</div>
					</div>
				</spring:bind>

				<spring:bind path="kullaniciAdi">
					<div class="form-group">
						<label class="col-sm-6 control-label">Kullanıcı Adı</label>
						<div class="col-sm-6">
							<form:input path="kullaniciAdi" class="form-control"
								id="kullaniciAdi" placeholder="kullaniciAdi" />
							<form:errors path="kullaniciAdi" class="control-label" />
						</div>
					</div>
				</spring:bind>

				<spring:bind path="departman">
					<div class="form-group">
						<label class="col-sm-6 control-label">Departman</label>
						<div class="col-sm-6">
							<form:select path="departman" class="form-control">
							<c:forEach items="${tumDepartmanlar}" var="departman">
								<form:option value="${departman.id}" label="${departman.name}" />							
							</c:forEach>
							</form:select>
							<form:errors path="departman" class="error" />
							</td>
						</div>
					</div>
				</spring:bind>

				<spring:bind path="parola">
					<div class="form-group">
						<label class="col-sm-6 control-label">Parola</label>
						<div class="col-sm-6">
							<form:password path="parola" class="form-control" id="parola"
								placeholder="parola" />
							<form:errors path="parola" class="control-label" />
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