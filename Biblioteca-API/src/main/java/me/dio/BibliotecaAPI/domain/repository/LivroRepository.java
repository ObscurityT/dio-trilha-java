package me.dio.BibliotecaAPI.domain.repository;

import me.dio.BibliotecaAPI.domain.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByAutor(String autor);

    List<Livro> findByAno(int ano);
}
