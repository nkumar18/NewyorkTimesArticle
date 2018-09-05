import static org.junit.Assert.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
@Ignore
public class NYServletTest {
	@Mock
	 HttpServletRequest request;
	
	@Mock
	HttpServletResponse response; 
	    
	 

	@Before
	public void setUp() throws Exception {
		
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
		((PrintWriter) this.request).close();
		this.request=null;
		this.response=null;
	}

	@Test
	public void test() throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		 try (PrintWriter out = response.getWriter()) {
	         

	            String[] s=request.getParameterValues("param");
	            for(int i=0;i<s.length;i++)
	            {
	                out.println(s[i]);
	                if(s[i].equals("world"))
	                	
	                {
	                	
	               response.sendRedirect("https://www.nytimes.com/section/world");
	                }
	                else if(s[i].equals("politics"))
	                {
	                    response.sendRedirect("https://www.nytimes.com/section/politics");
	                }
	                else if(s[i].equals("science"))
	                {
	                    response.sendRedirect("https://www.nytimes.com/section/science");
	                }
	                else if(s[i].equals("health"))
	                {
	                    response.sendRedirect("https://www.nytimes.com/section/health");
	                }
	                else if(s[i].equals("sports"))
	                {
	                    response.sendRedirect("https://www.nytimes.com/section/sports");
	                }
	            }
	            
	           
	            
	            
	        }

		
	}

}
