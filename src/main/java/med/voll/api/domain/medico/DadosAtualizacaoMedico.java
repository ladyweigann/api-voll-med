package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Endereco;

public record DadosAtualizacaoMedico(Long id, String nome, String telefone, Endereco endereco) {
}
