package edu.web.api.repository;

import edu.web.api.handler.BusinessException;
import edu.web.api.model.Usuario;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if (usuario.getLogin()==null){
            throw new BusinessException("O campo login deve ser informado");
        }
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os Usuarios do Sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("roberto","password"));
        usuarios.add(new Usuario("carlos","teste222"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("roberto","password");
    }

    public Usuario findByName(String username){
        System.out.println("Imprimindo usuario "+username);
       return new Usuario("roberto","password");
    }

    public Usuario deleteById(Integer id){
        System.out.println("Recebendo valor "+id+" para exclusão");
        return new Usuario("teste", "teste");
    }
}
