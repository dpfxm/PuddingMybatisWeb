<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>푸딩 마이바티스 메인</title>
	</head>
	<body>
		<c:if test="${sessionScope.memberId eq null }">
			<fieldset>
				<legend>로그인</legend>
				<!-- 쿼리스트링이 보이지 않는 post 메소드 선택 -->
				<form action="/member/login.do" method="post">
					<input type="text" name= "memberId" placeholder="아이디를 입력해주세요"><br>
					<input type="password" name= "memberPw" placeholder="비밀번호를 입력해주세요"><br>
					<div>
						<input type="submit" value=로그인>
						<a href="/member/register.do">회원가입</a>
					</div>
				</form>
			</fieldset>
		</c:if>
		<c:if test="${sessionScope.memberId ne null }">
			${sessionScope.memberName } 님, 어서오세요!
			<a href="/member/logout.do">로그아웃</a>
			<a href="/member/myPage.do">마이페이지</a>
		</c:if>
	</body>
</html>