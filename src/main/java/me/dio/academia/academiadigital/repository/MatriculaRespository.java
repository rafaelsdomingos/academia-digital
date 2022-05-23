package me.dio.academia.academiadigital.repository;

import me.dio.academia.academiadigital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRespository extends JpaRepository<Matricula, Long>{

}
