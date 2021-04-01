package com.ms.timezone;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TimezoneServlet")  
public class TimezoneServlet extends HttpServlet
{
String europe, india, aus, east, central, west;
public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
{

//PrintWriter out = response.getWriter();
//out.println(“hello”);
String n1 = request.getParameter("time_value");
europe = new Timezone().doEurope(n1);
india = new Timezone().doIndia(n1);
aus = new Timezone().doAus(n1);
east = new Timezone().doEast(n1);
central = new Timezone().doCentral(n1);
west = new Timezone().doWest(n1);
request.setAttribute("timevalue",n1);//keeping value in form intact
request.setAttribute("cest",europe);//Central European Standard Time
request.setAttribute("ist",india);//Indian Standard Time
request.setAttribute("aedt",aus);//Australian Eastern Daylight Time
request.setAttribute("edt",east);//Eastern Daylight Time
request.setAttribute("cst",central);//Central Standard Time
request.setAttribute("wgst",west);//Western Greenland Summer Time
RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
rd.forward(request,response);

//String n2 = request.getParameter("no2");
//String opt = request.getParameter("opt");
//if(opt.equals("p")){
//out.println(n1);

 /*res=new Calculater().doAdd(Integer.parseInt(n1),Integer.parseInt(n2));
out.println(res);}
else if(opt.equals("m")){
	 res=new Calculater().doSub(Integer.parseInt(n1),Integer.parseInt(n2));
	 out.println(res);}
else if(opt.equals("mul")){
	 res=new Calculater().doMul(Integer.parseInt(n1),Integer.parseInt(n2));
	 out.println(res);}
else if(opt.equals("d")){
	 res=new Calculater().doDiv(Integer.parseInt(n1),Integer.parseInt(n2));
	 out.println(res);}
}*/
}
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
{
doPost(request,response);
}

}
