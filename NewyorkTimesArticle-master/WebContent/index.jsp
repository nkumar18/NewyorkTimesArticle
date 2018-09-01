<%-- 
    Document   : index
    Created on : 09-Jul-2018, 13:11:18
    Author     : Nagaraj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<style>
.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    padding: 12px 16px;
    z-index: 1;
}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>
</head>
<body bgcolor="lightblue">
        <br><br><br>
<center><i><font color="white" size="7">New York Times</font></i></center>
<hr>
        <div class="dropdown">
            
            <span><font size=4 color="white">New York Time Articles</font></span>
  <div class="dropdown-content">
      
      <p><a href="<%=request.getContextPath()%>/NYServlet?param=world&value=world" >World</a></p>
    <p><a href="<%=request.getContextPath()%>/NYServlet?param=politics&value=politics" >Politics</a></p>
    <p><a href="<%=request.getContextPath()%>/NYServlet?param=science&value=science" >Science</a></p>
    <p><a href="<%=request.getContextPath()%>/NYServlet?param=health&value=health" >Health</a></p>
    <p><a href="<%=request.getContextPath()%>/NYServlet?param=sports&value=sports" >Sports</a></p>
  </div>
</div>
       
    </body>
</html>
