package me.dio.academia.academiadigital.entity.form;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

    @NotNull(message = "preencha o campo corretamente")
    @Positive(message = "o Id do aluno precisa ser positivo")
    private Long alunoId;
}
