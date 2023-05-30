<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>


<title>문의하기</title>



</head>


<body>

<br><br><br><br>
		<h2 ><b>문의 게시판</b></h2>






<div align="center" >
	<table class="table table-hover" style="width:1200px;">
		<thead>
		<tr align="center">
			<th scope="col" width="80px" >번호</th>
			<th scope="col" width="640px">제목</th>
			<th scope="col" width="150px">작성자</th>
			<th scope="col" width="250px">작성일</th>
			<th scope="col" width="80px">조회수</th>
		</tr>
		</thead>
		<tbody class="table-group-divider">

		<c:forEach items="${boardDto.boardList}" var="board">
			<tr>
				<td align="center"><b>${board.idx}</b></td>
				<td align="left">${board.subject}				</td>

					<%--
				<td align="left"><a id="sj" href="javascript:read('<%=bean.getIdx()%>')">
					<%=bean.getSubject()%> <%
					if (bean.getSecret().equals("1")) {
				%> <img src="img/secret_icon.jpg"> <%
					}
				%>
				</a>
				</td>
				--%>

				<td align="center">${board.name}</td>
				<td align="center">${board.reg_date}</td>
				<td align="center">${board.count}</td>
			</tr>

		</c:forEach>



		</tbody>

	</table>
</div>
		

</body>

<script>
	const

</script>

</html>