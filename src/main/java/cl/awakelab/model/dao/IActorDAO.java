package cl.awakelab.model.dao;

import cl.awakelab.model.dto.Actor;

import java.util.List;

public interface IActorDAO {
  public List<Actor> read();
  public Actor read(int id);
  public void create(Actor a);
  public void update(Actor a);
  public void delete(int id);
}
