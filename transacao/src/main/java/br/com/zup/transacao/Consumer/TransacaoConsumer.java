package br.com.zup.transacao.Consumer;

import br.com.zup.transacao.transacao.Transacao;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoConsumer {

    @NotBlank
    private String id;
    @NotNull
    private BigDecimal valor;
    @NotNull
    private EstabelecimentoConsumer estabelecimento;
    @NotNull
    private CartaoConsumer cartao;
    @NotNull
    private LocalDateTime efetivadaEm;

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoConsumer getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoConsumer getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public Transacao toTransacao() {
        return new Transacao(this.id, this.valor, this.estabelecimento.toEstabelecimento(), this.cartao.toCartao(), this.efetivadaEm);
    }
}
