package edu.springjpa;

import edu.springjpa.model.User;
import edu.springjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
    User user = new User();
    user.setName("Roberto");
    user.setUsername("robertinho");
    user.setPassword("12345678");

    repository.save(user); //método herdado para salvar os dados no banco de dados

        for(User u : repository.findAll()){ //foreach para imprimir todos os usuarios dentro da tabela
            System.out.println(u);
        }
    }
}
