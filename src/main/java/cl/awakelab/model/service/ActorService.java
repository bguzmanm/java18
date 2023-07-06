package cl.awakelab.model.service;

import cl.awakelab.model.dao.ActorDAO;
import cl.awakelab.model.dto.Actor;

import java.util.List;

public class ActorService {

  private ActorDAO dao = new ActorDAO();

  public List<Actor> findAll(){
    return dao.read();
  }

}
