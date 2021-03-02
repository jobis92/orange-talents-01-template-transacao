package br.com.zup.transacao.controller;

import br.com.zup.transacao.transacao.Transacao;
import br.com.zup.transacao.transacao.TransacaoRepository;
import br.com.zup.transacao.transacao.TransacaoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("cartoes")
public class TransacaoController {

    private final TransacaoRepository transacaoRepository;

    public TransacaoController(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @GetMapping("/{id}/transacoes")
    public ResponseEntity<List<TransacaoResponse>> consultar(@PathVariable String id) {
        List<Transacao> transacoes = transacaoRepository.findTop10ByCartao_IdCartaoOrderByIdDesc(id);
        List<TransacaoResponse> responses =
                transacoes
                        .stream()
                        .map(t -> new TransacaoResponse(t.getId(), t.getIdTransacao(), t.getValor(), t.getEstabelecimento().toEstabelecimentoResponse(), t.getCartao().toCartaoResponse(), t.getEfetivadaEm())).collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }
}