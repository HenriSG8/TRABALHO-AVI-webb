package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = { "/Controller", "/add", "/dell" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<String> Nomes = new ArrayList<>();
	private List<String> curso = new ArrayList<>();
	private List<String> hora = new ArrayList<>();
	Curso cr = new Curso();
	Coordenador cord = new Coordenador();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();

		if (path.equals("/dell")) {
			System.out.println(path);
			Nomes.remove(request.getParameter("key"));
			hora.remove(request.getParameter("key"));
			curso.remove(request.getParameter("key"));
			response.reset();
			response.sendRedirect("add");
		} else {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html");
			response.getWriter().append("<!DOCTYPE html>");
			response.getWriter().append("<html>");
			response.getWriter().append("<head>");
			response.getWriter().append("<style>*{\r\n" + "    margin: 0;\r\n" + "    padding: 0;\r\n" + "}\r\n"
					+ "\r\n" + ".main{\r\n" + "    display: flex;\r\n" + "    justify-content: center;\r\n"
					+ "    width: 100%;\r\n" + "}\r\n" + "\r\n" + ".lista{\r\n" + "    background-color: aliceblue;\r\n"
					+ "    width: 80%;\r\n" + "}\r\n" + "\r\n" + ".table {\r\n" + "    width: 100%;\r\n"
					+ "    border-collapse: collapse;\r\n" + "    font-size: 16px;\r\n" + "    text-align: left;\r\n"
					+ "}\r\n" + "\r\n" + ".table th, .table td {\r\n" + "    padding: 10px;\r\n"
					+ "    border-bottom: 1px solid #ddd;\r\n" + "}\r\n" + "\r\n" + ".table th {\r\n"
					+ "    font-weight: bold;\r\n" + "}\r\n" + "\r\n" + ".table td:last-child {\r\n"
					+ "    text-align: center;\r\n" + "}\r\n" + "\r\n" + ".btn-delete {\r\n"
					+ "    padding: 3px 7px;\r\n" + "    background-color: #e74c3c;\r\n" + "    color: #fff;\r\n"
					+ "    border: none;\r\n" + "    border-radius: 5px;\r\n" + "    cursor: pointer;\r\n" + "}\r\n"
					+ "\r\n" + ".btn-desblock{\r\n" + "    padding: 3px 7px;\r\n" + "    background-color: #39a11f;\r\n"
					+ "    color: #fff;\r\n" + "    border: none;\r\n" + "    border-radius: 5px;\r\n"
					+ "    cursor: pointer;\r\n" + "}\r\n" + "\r\n" + "\r\n" + ".btn-confitm{\r\n"
					+ "    padding: 3px 7px;\r\n" + "    background-color: #39a11f;\r\n" + "    color: #fff;\r\n"
					+ "    border: none;\r\n" + "    border-radius: 5px;\r\n" + "    cursor: pointer;\r\n"
					+ "    height: 6vh;\r\n" + "}\r\n" + "\r\n" + ".btn-confirmed:hover{\r\n"
					+ "    background-color: #2a7c16;\r\n" + "}\r\n" + "\r\n" + ".btn-confitm:hover{\r\n"
					+ "    background-color: #2a7c16;\r\n" + "}\r\n" + "\r\n" + "\r\n" + ".sta{\r\n"
					+ "    width: 100%;\r\n" + "    text-align: center;\r\n" + "    color: white;\r\n" + "}\r\n"
					+ "\r\n" + "\r\n" + "#bntPagar{\r\n" + "    position: absolute;\r\n" + "    right: 20%;\r\n"
					+ "    top: 16%;\r\n" + "    height: 55px;\r\n" + "    width: 120px;\r\n"
					+ "    border-radius: 15px;\r\n" + "    background-color: #39a11f;\r\n" + "    border: 4px;\r\n"
					+ "    transition: all 0.3s ease-in-out;\r\n" + "    cursor: pointer;\r\n"
					+ "    font-size: 20px;\r\n" + "    font-weight: bold;\r\n" + "}\r\n" + "\r\n"
					+ "#bntPagar:hover{\r\n" + "    background-color: #195709;\r\n" + "}</style>");
			response.getWriter().append("<meta charset=\"UTF-8\"/>");
			response.getWriter().append("</head>");
			response.getWriter().append("<body>");
			// body
			response.getWriter().append("<div class='main'>");
			response.getWriter().append("<div class='lista'>");
			response.getWriter().append("<table class=\"table\">");
			response.getWriter().append("<thead>");
			// tr
			response.getWriter().append("<th>");
			response.getWriter().append("<th>Nome</th>");
			response.getWriter().append("<th>Cursos</th>");
			response.getWriter().append("<th>Dia</th>");
			response.getWriter().append("</th>");

			response.getWriter().append("</thead>");

			Hora(request, response);
			itens(request, response);
			Nomes(request, response);

			for (int i = 0; i < Nomes.size(); i++) {
				if (Nomes.get(i) == null) {

				} else {
					response.getWriter().append("<tr>");
					response.getWriter().append(Nomes.get(i));
					response.getWriter().append(curso.get(i));
					response.getWriter().append(hora.get(i));
					response.getWriter().append("<td><a href = 'dell?key=" + i + "'><button>Deletar</button></a></td>");
					response.getWriter().append("</tr>");
				}
			}
			response.getWriter().append("<tbody>");
			response.getWriter().append("</tbody>");

			response.getWriter().append("</table>");
			response.getWriter().append("</div>");
			response.getWriter().append("</div>");
			// fim body
			response.getWriter().append("</body>");
			response.getWriter().append("</html>");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected void itens(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<String> curso = new ArrayList<>();
		List<String> dados = new ArrayList<>();
		String cursos = "";

		for (int i = 0; i < i + 1; i++) {
			if (request.getParameter("diciplina" + i) == null) {
				break;
			} else {
				curso.add(request.getParameter("diciplina" + i));
			}
		}

		cr.setCursos(curso.toString());
		dados = cr.getCursos();
		for (int i = 0; i < dados.size(); i++) {
			cursos = "<td>" + dados.get(i) + "</td>";

		}

		this.curso.add(cursos);

	}

	protected void Hora(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String hr = "<td>" + request.getParameter("dia0") + "-" + request.getParameter("horario0") + "/"
				+ request.getParameter("horarioMIn0") + "</td";
		hora.add(hr);
	}

	protected void Nomes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String aux = "<td>" + nome + "</td>";
		cord.setNome(nome);
		this.Nomes.add(aux);
	}
}
