package br.cefet.view.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.cefet.view.command.Command;

import br.cefet.view.command.InsertAlunoTurmaCommand;

/**
 * Servlet implementation class FrontControllerServlet
 *  */
@WebServlet (value="/frontcontrollerservlet") 
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//Criando o Map para fazer um dicionário das actions para os commands
	private static Map<String, Command> commands = new HashMap<String,Command>();
	
	static{
		
		commands.put("inseriraluno", new InsertAlunoTurmaCommand());
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
		String action = request.getParameter("action");
		commands.get(action).execute(request, response);;
		}catch (Exception e) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
