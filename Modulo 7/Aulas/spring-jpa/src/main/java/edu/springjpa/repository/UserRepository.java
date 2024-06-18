package edu.springjpa.repository;
import edu.springjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Herda os métodos do JpaRepository
public interface UserRepository extends JpaRepository<User, Integer> {
}
