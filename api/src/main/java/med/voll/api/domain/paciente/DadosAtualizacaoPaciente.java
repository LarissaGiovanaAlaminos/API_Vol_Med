package med.voll.api.domain.paciente;

import med.voll.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;


public record DadosAtualizacaoPaciente(

        @NotNull
        Long id,
        String cpf,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
