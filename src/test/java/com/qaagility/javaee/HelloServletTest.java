package com.qaagility.javaee;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.javaee.HelloServlet;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class HelloServletTest{
  HelloServlet servlet;
   HttpServletRequest request;
   HttpServletResponse response;
   
  @Before
    public void setUp() {
        HelloServlet servlet = new HelloServlet();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }

   
  @Test
  public void testServlet(){
               
        request.addParameter("userName", "Subhasis");
        servlet.doPost(request, response);
        assertTrue(response.getWriter().toString().contains("Subhasis"));
  }
  /*
  
  @Test
  public void testFailedName(){
     when(request.getParameter("yourName")).thenReturn("WrongName");
        when(request.getParameter("password")).thenReturn("secret");
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);

        new MyServlet().doPost(request, response);

        verify(request, atLeast(1)).getParameter("username"); // only if you want to verify username was called...
        writer.flush(); // it may not have been flushed yet...
        assertTrue(writer.toString().contains("Subhasis"));
  } */
  
}