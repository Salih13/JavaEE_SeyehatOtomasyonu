<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Güngör Otomotiv</title>
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
				<legend>Departman Listesi</legend>
				<div style="float: right; margin-bottom: 5px;">				
							<a href="${pageContext.request.contextPath}/departmanAdd" class="btn btn-primary">Departman Ekle</a>
							</div>
				<table id="example" class="table table-striped table-bordered"
					cellspacing="0" width="100%">
					<thead>
						<tr>
							<th>Id</th>
							<th>Departman Adı</th>	
							<th>İşlemler</th>							
						</tr>
					</thead>
					<tbody>

						<!-- Kayitlari listeleyelim... -->
						<c:forEach items="${tumDepartmanlar}" var="departman">
							<tr>
								<td><c:out value="${departman.id}" /></td>
								<td><c:out value="${departman.name}" /></td>
								<!-- Delete islemi icin RequestParam ekleyelim... -->
								<td colspan="2"><a
									href="departman.delete?departmanId=${departman.id}"
									class="btn btn-danger" type="button">Delete</a> <!-- edit islemi icin RequestParam ekleyelim... -->
									<a href="departman.edit?departmanId=${departman.id}"
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