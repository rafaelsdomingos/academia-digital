package me.dio.academia.academiadigital.service;

import me.dio.academia.academiadigital.entity.Matricula;
import me.dio.academia.academiadigital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);


}
