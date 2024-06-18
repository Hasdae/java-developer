package edu.springjpa.repository;
import edu.springjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> { //Herda os métodos do JpaRepository
}
