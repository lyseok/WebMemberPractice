<%@page import="member.vo.JavaMemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	@SuppressWarnings("unchecked")
	List<JavaMemberVO> list = (List<JavaMemberVO>)request.getAttribute("list");
%>

<table border="1">

	<tr>
		<td colspan="5">
			<input type="button" value="회원추가" id="insertBtn">
		</td>
	</tr>

	<tr>
		<th>ID</th>
		<th>비밃번호</th>
		<th>이름</th>
		<th>전화</th>
		<th>주소</th>
	</tr>

<%
	for(JavaMemberVO vo : list){
%>
	<tr>
		<td><a href="<%=request.getContextPath() %>/member/memberView.do?mem_id=<%=vo.getMem_id() %>"><%=vo.getMem_id() %></a></td>
		<td><%=vo.getMem_pass() %></td>
		<td><%=vo.getMem_name() %></td>
		<td><%=vo.getMem_tel() %></td>
		<td><%=vo.getMem_addr() %></td>
	</tr>
<%
	}
%>

</table>

</body>
</html>