package it.alessia.sito.repository;

import org.springframework.data.repository.CrudRepository;

import it.alessia.sito.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
