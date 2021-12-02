package cl.twk.proyectos.repository;

import org.springframework.data.repository.CrudRepository;

import cl.twk.proyectos.model.User;

public interface IUserRepo extends CrudRepository<User, Long>{

	User findByUsername(String username);

}
