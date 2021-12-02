package cl.twk.proyectos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.twk.proyectos.model.Authority;

@Repository
public interface IAuthorityRepo extends CrudRepository<Authority, Long> {

}
