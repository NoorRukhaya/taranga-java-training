package com.uttara.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountServlet
 */
public class CountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int count = 0;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountServlet() {
        super();
        System.out.println("in no-arg constr of CS");
    }

    @Override
    public void init() throws ServletException {
    		System.out.println("in init() of CS");
    		File f = new File("mycount.txt");
    		System.out.println("f.path = "+f.getAbsolutePath());
    		if(f.exists())
    		{
    			BufferedReader br = null;
    			try
    			{  
    				br = new BufferedReader(new FileReader(f));
    				String line = br.readLine();
    				count = Integer.parseInt(line);
    			}
    			catch(IOException e)
    			{
    				e.printStackTrace();
    			}
    			finally
    			{
    				if(br!=null)
						try {
							br.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    			}
    			
    		}
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet() of CS");
		PrintWriter pw = response.getWriter();

		synchronized (this) {
			count++;
			pw.write("<html><body><h1>Count is "+count+"</h1></body></html>");
		}
		
	}
	
	
	@Override
	public void destroy() {
		System.out.println("in destroy() of CS");
		BufferedWriter bw = null;
		try  
		{
			bw = new BufferedWriter(new FileWriter("mycount.txt"));
			bw.write(String.valueOf(count));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(bw!=null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost() of CS");
	}

}
