<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<spring:url value="/resources/css/bootstrap.css" var="bootstrapCSS" />
<spring:url value="/resources/css/style.css" var="styleCSS" />

<link href="${bootstrapCSS}" rel="stylesheet" />
<link href="${styleCSS}" rel="stylesheet" />
</head>
<body>

	<header> <f:subview id="header">
		<jsp:include page="header.jsp"></jsp:include>
	</f:subview> </header>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<legend>Seyehat List</legend>
				<div style="float: right; margin-bottom: 5px;">				
							<a href="${pageContext.request.contextPath}/seyehatAdd" class="btn btn-primary">Seyehat Ekle</a>
							</div>
				<table id="example" class="table table-striped table-bordered"
					cellspacing="0" width="100%">
					<thead>
						<tr>
							<th>Id</th>
							<th>Seyehat Başlangıcı</th>
							<th>Seyehat Sonu</th>
							<th>Seyehat Yeri</th>
							<th>Gidiş Amacı</th>
							<th>Proje Kodu</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>

						<!-- Kayitlari listeleyelim... -->
						<c:forEach items="${tumSeyehatler}" var="seyehat">
							<tr>
								<td><c:out value="${seyehat.id}" /></td>
								<td><c:out value="${seyehat.seyehatBaslangici}" /></td>
								<td><c:out value="${seyehat.seyehatSonu}" /></td>
								<td><c:out value="${seyehat.seyehatYeri}" /></td>
								<td><c:out value="${seyehat.gidisAmaci}" /></td>
								<td><c:out value="${seyehat.projeKodu}" /></td>
								<!-- Delete islemi icin RequestParam ekleyelim... -->
								<td colspan="2"><a
									href="seyehat.delete?seyehatId=${seyehat.id}"
									class="btn btn-danger" type="button">Delete</a> <!-- edit islemi icin RequestParam ekleyelim... -->
									<a href="seyehat.edit?seyehatId=${seyehat.id}"
									class="btn btn-warning" type="button">Edit</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col-md-6"></div>
		</div>
	</div>
	<footer> <f:subview id="footer">
		<jsp:include page="footer.jsp"></jsp:include>
	</f:subview> </footer>

</body>
</html>