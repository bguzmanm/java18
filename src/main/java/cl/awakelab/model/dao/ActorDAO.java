package cl.awakelab.model.dao;

import cl.awakelab.model.con.DataBase;
import cl.awakelab.model.dto.Actor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ActorDAO implements IActorDAO{

  @Override
  public List<Actor> read() {
    List<Actor> actorList = new ArrayList<Actor>();

    try {

      Connection cnn = DataBase.getConnection();
      Statement statement = cnn.createStatement();
      ResultSet resultSet = statement.executeQuery("select actor_id, first_name, last_name from actor");
      while (resultSet.next()){
        actorList.add(mapping(resultSet));
      }

    } catch (SQLException e){
      System.out.println("Error en leer todos");
      e.printStackTrace();
    }

    return actorList;
  }

  @Override
  public Actor read(int id) {
    return null;
  }

  @Override
  public void create(Actor a) {

  }

  @Override
  public void update(Actor a) {

  }

  @Override
  public void delete(int id) {

  }

  private Actor mapping(ResultSet resultSet) throws SQLException {
    /*Actor a = new Actor();
    a.setId(resultSet.getInt("actor_id"));
    a.setFirstName(resultSet.getString("first_name"));
    a.setLastName(resultSet.getString("last_name"));
    return a;*/

    return new Actor(
            resultSet.getInt("actor_id"),
            resultSet.getString("first_name"),
            resultSet.getString("last_name"));

  }
}
