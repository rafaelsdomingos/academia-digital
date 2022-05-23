package me.dio.academia.academiadigital.repository;

import me.dio.academia.academiadigital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long > {

        /**
         *
         * @param nome nome referencia um nome para buscar no banco de dados
         * @return lista dos alunos que contem nome semelhante ao passado no parâmetro.
         */

        @Query("FROM Aluno WHERE lower(nome) LIKE lower(concat('%',:nome, '%'))")
        List<Aluno> findByNome(String nome);
}
