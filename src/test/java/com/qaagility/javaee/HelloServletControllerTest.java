package com.qaagility.javaee;

import com.qaagility.javaee.HelloServletController;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;
public class HelloServletControllerTest{
   
  @Before
    public void setUp() {
        System.out.println("Before Testing");
    }

   
  @Test
  public void testController(){
               
       HelloServletController controller = new HelloServletController(); 
        assertEquals("Pass", controller.returnName() , "Subhasis");
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
