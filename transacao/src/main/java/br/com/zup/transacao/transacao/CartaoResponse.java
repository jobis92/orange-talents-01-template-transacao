package br.com.zup.transacao.transacao;

public class CartaoResponse {

    private String id;
    private String email;

    public CartaoResponse(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}