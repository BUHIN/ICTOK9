<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>:: 게시글 보기::</title>
<link href="bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="dist/css/sb-admin-2.css" rel="stylesheet">
<style type="text/css">
.panel-body{
	height: 500px;
}
.col-md-4{
	padding-left: 100px;
}
</style>

</head>
<body>
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-green">
                        <div class="panel-heading">
                            ${board.btitle}
                        </div>
                        <div class="panel-footer"> 
                            작성자: <span id="id">${board.id}</span>&nbsp;&nbsp;작성일: <span
							id="bdate">${board.bdate}</span>
                        </div>
                        <div class="panel-body">
							${board.bcontent}
                        </div>
                    </div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<button onclick="location.href='UpdateBoardPage?bseq=${board.bseq}'" id="login" class="btn btn-success"> 수  정 
			</button>
			<button onclick="location.href='deleteBoard?bseq=${board.bseq}'" id="delete" class="btn btn-default"> 삭  제 
			</button>
			<button onclick="location.href='getBoardList'" class="btn btn-warning">목록으로
			</button>
		</div>
		<div class="col-md-4"></div>
	</div>
</body>
</html>