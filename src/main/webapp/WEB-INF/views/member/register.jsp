<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	<body>
		<h1>회원가입</h1>
		<h4>회원정보를 입력해주세요</h4>
		 <form action="/member/register.do" method="post">
			<fieldset>
				<legend>회원가입</legend>
				 <ul>
			 		<li>
						<label for ="">아이디</label>
						<input type="text" name = "member-id" id = "member-id">
					</li>
					<li>
						<label for ="">비밀번호</label>
						<input type="password" name = "member-pw" id = "member-pw">
					</li>
					<li>
						<label for ="">이름</label>
						<input type="text" name = "member-name" id = "member-name">
					</li>
					<li>
						<label for ="">나이</label>
						<input type="text" name = "member-age" id = "member-age">
					</li>
					<li>
						<label for ="">성별</label>
						남 <input type="radio" name = "member-gender" id = "member-gender" value="M">
						여 <input type="radio" name = "member-gender" id = "member-gender" value="F">
					</li>
					<li>
						<label for ="">이메일</label>
						<input type="text" name = "member-email" id = "member-email">
					</li>
					<li>
						<label for ="">전화번호</label>
						<input type="text" name = "member-phone" id = "member-phone">
					</li>
					<li>
						<label for ="">주소</label>
						<input type="text" name = "member-address" id = "member-address">
					</li>
					<li>
						<label for ="">취미</label>
						<input type="text" name = "member-hobby" id = "member-hobby">
					</li>
			 	</ul>
			</fieldset><br>
			<input type="submit" value="가입하기">
			<input type="reset" value="초기화">
		 </form>
	</body>
</html>