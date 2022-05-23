package me.dio.academia.academiadigital.service.impl;

import me.dio.academia.academiadigital.entity.Aluno;
import me.dio.academia.academiadigital.entity.AvaliacaoFisica;
import me.dio.academia.academiadigital.entity.form.AlunoForm;
import me.dio.academia.academiadigital.entity.form.AlunoUpdateForm;
import me.dio.academia.academiadigital.repository.AlunoRepository;
import me.dio.academia.academiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setBairro(form.getBairro());
        aluno.setCpf(form.getCpf());
        aluno.setDataDeNascimento(form.getDataDeNascimento());
        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return repository.getById(id);
    }

    @Override
    public List<Aluno> getAll(String nome) {
        if( nome == null){
            return repository.findAll();
        }
        else{
            return repository.findByNome(nome);
        }
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm form) {

        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacoes();
    }


}
