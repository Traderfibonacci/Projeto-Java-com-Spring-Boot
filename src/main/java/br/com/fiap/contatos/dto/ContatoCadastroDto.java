package br.com.fiap.contatos.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record ContatoCadastroDto(
        Long id,

        @NotBlank (message = "Nome do contato é obrigatório!")
        String nome,

        @NotBlank(message = "E-mail é Obrigatório!")
        @Email(message = "O e-mail está com formato Inválido!")
        String email,

        @NotBlank(message = "A senha é obrigatória!")
        @Size(min = 6, max = 10, message="A senha deve conter entre 6 e 10 caracteres.")
        String senha,

        @NotNull(message = "Data de nascimento é obrigatória!")
        LocalDate dataNascimento
) {
}
