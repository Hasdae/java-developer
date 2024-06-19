package edu.web.api.controller;

import edu.web.api.model.Usuario;
import edu.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/users/{username}") //determina que o caminho da URI é o parametro username e em seguida define onde está a variavel correspondente ao parametro usando a anotação @PathVariable
    public Usuario getOneUser(@PathVariable("username") String username){
        return repository.findByName(username);
    }

    @DeleteMapping("users/{id}")
    public void delete(@PathVariable("id") Integer id){
       repository.deleteById(id);
    }
    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){
        //A anotação @RequestBody converte os dados recebidos na requisição para o objeto destino
        repository.save(usuario);
    }
}
