package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(
        
		@NotBlank(message="O nome é obrigatório")
        String nome,
        @NotBlank(message="O email é obrigatório")
        @Email(message="Formato do email é inválido")
        String email,
        @NotBlank(message="Telefone é obrigatório")
        String telefone,
        @NotBlank(message="CRM é obrigatório")
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull(message = "{especialidade.obrigatoria}")
        Especialidade especialidade,
        @NotNull(message="O endereço é obrigatório")
        @Valid
        DadosEndereco endereco) {
}
