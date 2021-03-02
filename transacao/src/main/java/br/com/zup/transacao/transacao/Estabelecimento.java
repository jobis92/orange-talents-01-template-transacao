package br.com.zup.transacao.transacao;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String cidade;

    @NotBlank
    private String endereco;

    @OneToMany(mappedBy = "estabelecimento")
    private Set<Transacao> transacao = new HashSet<>();


    @Deprecated
    public Estabelecimento(){}

    public Estabelecimento(@NotBlank String nome, @NotBlank String cidade, @NotBlank String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public EstabelecimentoResponse toEstabelecimentoResponse() {
        return new EstabelecimentoResponse(this.nome, this.cidade, this.endereco);
    }


}

