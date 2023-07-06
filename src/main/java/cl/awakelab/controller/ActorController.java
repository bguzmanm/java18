package cl.awakelab.controller;

import cl.awakelab.model.dto.Actor;
import cl.awakelab.model.service.ActorService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ActorController extends HttpServlet {

  private static final long serialVersionUID = 1L;
ActorService service = new ActorService();
  public ActorController() {
    super();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    List<Actor> actors = service.findAll();

    req.setAttribute("actors", actors);

    getServletContext().getRequestDispatcher("/views/actorList.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    super.doPost(req, resp);
  }
}
