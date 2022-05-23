package me.dio.academia.academiadigital.service;

import me.dio.academia.academiadigital.entity.Aluno;
import me.dio.academia.academiadigital.entity.AvaliacaoFisica;
import me.dio.academia.academiadigital.entity.form.AlunoForm;
import me.dio.academia.academiadigital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll(String nome);

    Aluno update(Long id, AlunoUpdateForm form);

    void delete(Long id);


    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
