<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>로그인</title>
<link href="bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="dist/css/sb-admin-2.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
</head>
<style>
.center {
	text-align: center;
}
</style>
<body class="center">
	<h1 style="text-align: center">로그인</h1>
	<hr>
	<form action="login" method="post">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<input class="form-control" type="text" name="id" id="inputSuccess"
					placeholder="아이디"> <input type="password"
					class="form-control" name="password" id="inputSuccess"
					placeholder="비밀번호">
			</div>
			<div class="col-md-4"></div>
		</div>

		<br />

		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<button type="submit" id="login" class="btn btn-success">로그인
				</button>
				<button type="reset" id="cancel" class="btn btn-warning">취
					소</button>
			</div>
			<div class="col-md-4"></div>
		</div>
	</form>
	<hr>
</body>
</html>