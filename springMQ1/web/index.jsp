<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
    <link rel="stylesheet" type="text/css" href="styles.css" mce_href="styles.css">
    -->
	</head>

	<body>
		<div align="center" style="width: 500px; height: 300px; border:2px; borderColor:black">
			<form action="sendMessage.do" method="post">
				<table align="center">
					<tr>
						<th colspan="2">
							消息发送控制台
						</th>
					</tr>
					<tr>
						<td>
							消息内容：
						</td>
						<td>
							<input type="text" name="message">
						</td>
					</tr>
					<tr>
						<td align="center" colspan="2">
							<input type="reset" value="清除">
							&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="submit" value="发送">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>