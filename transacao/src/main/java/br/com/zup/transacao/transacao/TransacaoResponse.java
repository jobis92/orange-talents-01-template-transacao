package br.com.zup.transacao.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponse {


    private Long id;
    private String IdtransacaoId;
    private BigDecimal valor;
    private EstabelecimentoResponse estabelecimento;
    private CartaoResponse cartao;
    private LocalDateTime efetivadaEm;

    public TransacaoResponse(Long id, String IdtransacaoId, BigDecimal valor, EstabelecimentoResponse estabelecimento, CartaoResponse cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.IdtransacaoId = IdtransacaoId;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public Long getId() {
        return id;
    }

    public String getIdtransacaoId() {
        return IdtransacaoId;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoResponse getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoResponse getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
