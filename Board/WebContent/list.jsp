<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시물 목록</title>
<!-- Bootstrap Core CSS -->
<link href="bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- DataTables CSS -->
<link
	href="datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css"
	rel="stylesheet">
<!-- DataTables Responsive CSS -->
<link href="datatables-responsive/css/dataTables.responsive.css"
	rel="stylesheet">
<link href="dist/css/sb-admin-2.css" rel="stylesheet">
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<style type="text/css">
.panel-body {
	height: 800px;
}
</style>
</head>
<body>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-yellow">
				<div class="panel-heading" style="padding-left: 1000px;">
					${sessionScope.id } 님 어서오세요. &nbsp;&nbsp;
					<button onclick="location.href='logout'" class="btn btn-primary">로그아웃</button>
				</div>
				<div class="panel-body">
					<h4>게시글 목록 보기</h4>
					<div class="dataTable-wrapper">
						<table class="table table-striped table-bordered table-hover"
							id="dataTables-example">

							<thead>
								<tr>
									<td colspan="4">
										<div class="row">
											<div class="col-md-4"></div>
											<div class="col-md-4">
												<button style="margin-left: 700px;"
													onclick="location.href='create.jsp'"
													class="btn btn-success">게시물 등록</button>
											</div>
										</div>
									</td>
								</tr>
								<tr>
									<th>번호</th>
									<th>제목</th>
									<th>작성자</th>
									<th>작성일</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="board" items="${list }">
									<tr class="odd gradeX">
										<td>${board.bseq }</td>
										<td><a href="getBoard?bseq=${board.bseq }">${board.btitle
												}</a></td>
										<td>${board.id }</td>
										<td class="center">${board.bdate }</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>

			</div>
		</div>
	</div>



	<!-- Bootstrap Core JavaScript -->
	<script src="bootstrap/dist/js/bootstrap.min.js"></script>
	<script src="js/jquery.min.js"></script>
	<script src="datatables/media/js/jquery.dataTables.min.js"></script>
	<script
		src="datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>
	<!-- Page-Level Demo Scripts - Tables - Use for reference -->
	<script>
		$(document).ready(function() {
			$('#dataTables-example').DataTable({
				responsive : true
			});
		});
	</script>
</body>
</html>