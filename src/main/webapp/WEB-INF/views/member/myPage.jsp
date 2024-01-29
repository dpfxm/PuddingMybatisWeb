<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>마이 페이지</title>
	</head>
	<body>
		<ul>
			<li>
				<label for ="">아이디</label>
				${member.memberId }
			</li>
			<li>
				<label for ="">비밀번호</label>
				${member.memberPw }
			</li>
			<li>
				<label for ="">이름</label>
				${member.memberName }
			</li>
			<li>
				<label for ="">나이</label>
				${member.memberAge }
			</li>
			<li>
				<label for ="">성별</label>
				<c:if test="${member.memberGender eq 'M'}">남</c:if>
				<c:if test="${member.memberGender eq 'F'}">여</c:if>
			</li>
			<li>
				<label for ="">이메일</label>
				${member.memberEmail }
			</li>
			<li>
				<label for ="">전화번호</label>
				${member.memberPhone }
			</li>
			<li>
				<label for ="">주소</label>
				${member.memberAddress }
			</li>
			<li>
				<label for ="">취미</label>
				${member.memberHobby }
			</li>
		</ul>
		<a href="/member/modify.do">정보수정</a>
		<a href="javascript:void(0)" onclick = "deleteCheck();">회원탈퇴</a>
	</body>
	<script>
	function deleteCheck() {
		if (confirm("탈퇴하시겠습니까?")) {
			location.href = "/member/delete.do";
		}
	}
	</script>
</html>