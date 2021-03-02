package br.com.zup.transacao.Consumer;

import br.com.zup.transacao.transacao.Cartao;

import javax.validation.constraints.NotBlank;

public class CartaoConsumer {
    @NotBlank
    private String id;
    @NotBlank
    private String email;

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Cartao toCartao() {
        return new Cartao(this.id, this.email);
    }
}
