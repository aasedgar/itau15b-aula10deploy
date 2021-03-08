package br.augusto.spring02.repository;

// INTERFACE para operar dentro do DB usando a superclasse CrudRepository sem precisar de nenhuma implementação

import org.springframework.data.repository.CrudRepository;

import br.augusto.spring02.model.Usuario;

// CRUD - Create Read Update Delete
public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
    public Usuario findByEmailAndSenha(String email, String senha);
    public Usuario findByEmailOrCpf(String email, String cpf);
}
