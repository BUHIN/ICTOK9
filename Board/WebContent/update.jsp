<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>:: 게시물 등록 ::</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>

</head>
<style>
.center {
	text-align: center;
}

menu {
	margin: 10px;
}

menu li {
	float: left;
	list-style-type: none;
}

div.wisywig iframe {
	margin: 0 auto;
	background-color: white;
}

div.wisywig textarea {
	display: none;
}
</style>
<body>
	<div class="container center">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-green">
				<div class="panel-heading">
					<h3 class="panel-title">새 글 등록</h3>
				</div>
				<div class="panel-footer">
					작성자: <span id="id">${board.id}</span>&nbsp;&nbsp;작성일: <span
						id="bdate">${board.bdate}</span>
				</div>
			</div>
			<div class="panel-body form-group">
				<form action="updateBoard" method="post">
					<div class="wisywig center">
						<input type="hidden" name="bseq" value="${board.bseq }"> <input
							type="text" class="form-control" name="btitle"
							placeholder="제목을 입력하세요" value="${board.btitle }">
						<div class="btn-group" role="group" aria-label="...">
							<menu>
								<button type="button" class="btn btn-default"
									data-command="insertHTML" data-value="black"
									data-placement="bottom" data-original-title="black">■</button>
								<button type="button" class="btn btn-default"
									data-command="insertHTML" data-value="red"
									data-placement="bottom" data-original-title="red">
									<font color="red">■</font>
								</button>
								<button type="button" class="btn btn-default"
									data-command="insertHTML" data-value="blue"
									data-placement="bottom" data-original-title="blue">
									<font color="blue">■</font>
								</button>
								<button type="button" class="btn btn-default"
									data-command="bold" data-placement="bottom"
									data-original-title="굵게">
									<img src="img/button/boldBtn.png">
								</button>
								<button type="button" class="btn btn-default"
									data-command="italic" data-placement="bottom"
									data-original-title="이탤릭체">
									<img src="img/button/italicBtn.png">
								</button>
								<button type="button" class="btn btn-default"
									data-command="insertOrderedList" data-placement="bottom"
									data-original-title="단락번호">단락 번호</button>
								<button type="button" class="btn btn-default"
									data-command="insertUnorderedList" data-placement="bottom"
									data-original-title="목록">
									<img src="img/button/listBtn.png">
								</button>
								<button type="button" class="btn btn-default"
									data-command="createLink" data-placement="bottom"
									data-original-title="하이퍼링크">
									<img src="img/button/linkBtn.png">
								</button>
								<button type="button" class="btn btn-default"
									data-command="unlink" data-placement="bottom"
									data-original-title="하이퍼링크 해제">
									<img src="img/button/linkNBtn.png">
								</button>
								<button type="button" class="btn btn-default"
									data-command="undo" data-placement="bottom"
									data-original-title="실행취소">
									<img src="img/button/backBtn.png">
								</button>
								<button type="button" class="btn btn-default"
									data-command="redo" data-placement="bottom"
									data-original-title="다시실행">
									<img src="img/button/forwardBtn.png">
								</button>
							</menu>
						</div>
						<textarea rows="20" cols="107" class="form-control"
							name="bcontent"></textarea>
						<iframe width="700px" height="300px" srcdoc='${board.bcontent}'></iframe>
					</div>
					<br />
					<button type="submit" class="btn btn-success">수정</button>
					<input type="reset" value="취소" class="btn btn-warning">
				</form>
			</div>
		</div>
	</div>
</body>
<script src="js/fancybox/jquery.fancybox.js"></script>
<script src="js/5_5_1.js"></script>

</html>