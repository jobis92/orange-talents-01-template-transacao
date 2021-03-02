package br.com.zup.transacao.transacao;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String idCartao;

    @Email
    @NotBlank
    private String email;


    public Cartao(@NotBlank String idCartao, @NotBlank String email) {
        this.idCartao = idCartao;
        this.email = email;
    }

    public CartaoResponse toCartaoResponse() {
        return new CartaoResponse(this.idCartao, this.email);
    }

}
