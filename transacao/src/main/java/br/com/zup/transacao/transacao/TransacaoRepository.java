package br.com.zup.transacao.transacao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao,Long> {

    List<Transacao> findTop10ByCartao_IdCartaoOrderByIdDesc(String id);

}
