package me.dio.academia.academiadigital.service.impl;

import me.dio.academia.academiadigital.entity.Aluno;
import me.dio.academia.academiadigital.entity.Matricula;
import me.dio.academia.academiadigital.entity.form.MatriculaForm;
import me.dio.academia.academiadigital.repository.AlunoRepository;
import me.dio.academia.academiadigital.repository.MatriculaRespository;
import me.dio.academia.academiadigital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRespository repository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public List<Matricula> getAll() {
        return repository.findAll();
    }


    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        matricula.setAluno(aluno);
        return repository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return repository.findById(id).get();
    }



    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
