package br.com.zup.transacao.Consumer;

import br.com.zup.transacao.transacao.Estabelecimento;

import javax.validation.constraints.NotBlank;

public class EstabelecimentoConsumer {

    @NotBlank
    private String nome;
    @NotBlank
    private String cidade;
    @NotBlank
    private String endereco;

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public Estabelecimento toEstabelecimento() {
        return new Estabelecimento(this.nome, this.cidade, this.endereco);
    }
}