<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Time Conversion app</title>
<body bgcolor="white">
<h2><center>Time conversion App</center></h2>
<form align="center" method="get" action="./TimezoneServlet">
Enter IST: <input type="datetime-local" name="time_value" value="${timevalue}">
<br>
<br>
<input type="submit" value="Go">
</form>
<br>
<br>
<table align=center width=100%>
  <tr height="50" align=top style="border-bottom: medium double #333;">
	<th width=16.6%>Indian Standard Time</th>
	<th width=16.6%>Central European Standard Time</th>
    <th width=16.6%>Australian Eastern Daylight Time</th>
    <th width=16.6%>Eastern Daylight Time</th>
    <th width=16.6%>Central Standard Time</th>
    <th width=16.6%>Western Greenland Summer Time</th>
  </tr>
  <tr height="50" align=center>
	<td>${ist}</td>
    <td>${cest}</td>
    <td>${aedt}</td>
    <td>${edt}</td>
    <td>${cst}</td>
    <td>${wgst}</td>
  </tr>
  <tr align=center>
	<td align="center"><iframe src="ist.html" frameborder="0" width="100%" height="100%" scrolling="no"></iframe>
</td>
    <td align="center"><iframe src="cest.html" frameborder="0" width="100%" height="100%" scrolling="no"></iframe>
    </td>
    <td align="center"><iframe src="aedt.html" frameborder="0" width="100%" height="100%" scrolling="no"></iframe>
    </td>
    <td align="center"><iframe src="edt.html" frameborder="0" width="100%" height="100%" scrolling="no"></iframe>
    </td>
    <td align="center"><iframe src="cst.html" frameborder="0" width="100%" height="100%" scrolling="no"></iframe>
    </td>
    <td align="center"><iframe src="wgst.html" frameborder="0" width="100%" height="100%" scrolling="no"></iframe>
    </td>
  </tr>  
</table>
</body>
</html>
