package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
    }

    public void atualizarDados(Endereco enderecoAtualizado) {
        if(enderecoAtualizado.getLogradouro() != null) {
            this.logradouro = enderecoAtualizado.getLogradouro();
        }
        if(enderecoAtualizado.getBairro() != null) {
            this.bairro = enderecoAtualizado.getBairro();
        }
        if(enderecoAtualizado.getNumero() != null) {
            this.numero = enderecoAtualizado.getNumero();
        }
        if(enderecoAtualizado.getComplemento() != null) {
            this.complemento = enderecoAtualizado.getComplemento();
        }
        if(enderecoAtualizado.getCidade() != null) {
            this.cidade = enderecoAtualizado.getCidade();
        }
        if(enderecoAtualizado.getUf() != null) {
            this.uf = enderecoAtualizado.getUf();
        }
    }
}
