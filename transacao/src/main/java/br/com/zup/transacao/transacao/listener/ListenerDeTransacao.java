package br.com.zup.transacao.transacao.listener;

import br.com.zup.transacao.Consumer.TransacaoConsumer;
import br.com.zup.transacao.transacao.Transacao;
import br.com.zup.transacao.transacao.TransacaoRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
class TransacaoListener {

    private TransacaoRepository transacaoRepository;

    public TransacaoListener(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }


    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void consumirTransacao(TransacaoConsumer consumer) {
        Transacao transacao = consumer.toTransacao();
        this.transacaoRepository.save(transacao);
    }
}
