package edu.springjpa.model;


import jakarta.persistence.*;

@Entity
@Table(name = "usuario")//Transforma a classe em uma entidade para corresponder a entidade no banco de dados
public class User {
    @Id // determina qual atributo será correspondente ao ID no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Determina que o atributo será gerenciado de forma automatica no bando de dados com a estratégia de identificação
    @Column(name = "user_id") // Descreve que no banco de dados essa coluna é chamada de user_id e não de "id" como esta declarado o atributo
    private Integer id;
    @Column(length = 50, nullable = false) // Determina que o atributo name tem tamanho maximo 50 e não pode ser nulo
    private String name;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
