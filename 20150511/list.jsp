<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
</head>
<body>
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">게시글 목록 보기</div>
				<div class="panel-body">
					<div class="dataTable-wrapper">
						<table class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
								<tr>
									<th>번호</th>
									<th>제목</th>
									<th>작성자</th>
									<th>작성일</th>
								</tr>
							</thead>
							<tbody>
								<tr class="odd gradeX">
									<td>1</td>
									<td>첫 번째 게시글 입니다.</td>
									<td>류지수</td>
									<td class="center"></td>
								</tr>
								<tr class="even gradeC">
									<td>2</td>
									<td>두 번째 게시글 입니다.</td>
									<td>권중현</td>
									<td class="center"></td>
								</tr>
								<tr class="odd gradeA">
									<td>3</td>
									<td>세 번째 게시글 입니다.</td>
									<td>권중현</td>
									<td class="center"></td>
								</tr>
								<tr class="odd gradeX">
									<td>1</td>
									<td>첫 번째 게시글 입니다.</td>
									<td>류지수</td>
									<td class="center"></td>
								</tr>
								<tr class="even gradeC">
									<td>2</td>
									<td>두 번째 게시글 입니다.</td>
									<td>권중현</td>
									<td class="center"></td>
								</tr>
								<tr class="odd gradeA">
									<td>3</td>
									<td>세 번째 게시글 입니다.</td>
									<td>권중현</td>
									<td class="center"></td>
								</tr>
								<tr class="odd gradeX">
									<td>1</td>
									<td>첫 번째 게시글 입니다.</td>
									<td>류지수</td>
									<td class="center"></td>
								</tr>
								<tr class="even gradeC">
									<td>2</td>
									<td>두 번째 게시글 입니다.</td>
									<td>권중현</td>
									<td class="center"></td>
								</tr>
								<tr class="odd gradeA">
									<td>3</td>
									<td>세 번째 게시글 입니다.</td>
									<td>권중현</td>
									<td class="center"></td>
								</tr>
								<tr class="odd gradeX">
									<td>1</td>
									<td>첫 번째 게시글 입니다.</td>
									<td>류지수</td>
									<td class="center"></td>
								</tr>
								<tr class="even gradeC">
									<td>2</td>
									<td>두 번째 게시글 입니다.</td>
									<td>권중현</td>
									<td class="center"></td>
								</tr>
								<tr class="odd gradeA">
									<td>3</td>
									<td>세 번째 게시글 입니다.</td>
									<td>권중현</td>
									<td class="center"></td>
								</tr>
								<tr class="odd gradeX">
									<td>1</td>
									<td>첫 번째 게시글 입니다.</td>
									<td>류지수</td>
									<td class="center"></td>
								</tr>
								<tr class="even gradeC">
									<td>2</td>
									<td>두 번째 게시글 입니다.</td>
									<td>권중현</td>
									<td class="center"></td>
								</tr>
								<tr class="odd gradeA">
									<td>3</td>
									<td>세 번째 게시글 입니다.</td>
									<td>권중현</td>
									<td class="center"></td>
								</tr>
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
<!-- 	<!-- Page-Level Demo Scripts - Tables - Use for reference -->
	<script>
		$(document).ready(function() {
			$('#dataTables-example').DataTable({
				responsive : true
			});
		});
	</script> -->
</body>
</html>