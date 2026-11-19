import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntregaTest {
    @Test
    void deveRetornarPrecoEncomenda()
    {
        Entrega entrega = new Entrega();

        Pedido pedido1 = new Pedido("Pedido1");
        Produto produto11 = new Produto("Livro1",50);
        Produto produto12 = new Produto("Livro2", 55);
        pedido1.addCaixa(produto11);
        pedido1.addCaixa(produto12);

        Pedido pedido2 = new Pedido("Pedido2");
        Produto produto21 = new Produto("Caderno",10);
        Produto produto22 = new Produto("Caneta", 5);
        pedido2.addCaixa(produto21);
        pedido2.addCaixa(produto22);

        Pedido pedido3 = new Pedido("Pedido3");
        Produto produto31 = new Produto("Livro3",50);
        pedido3.addCaixa(produto31);
        pedido3.addCaixa(pedido2);

        Pedido pedidoTotal = new Pedido("Total");
        pedidoTotal.addCaixa(pedido1);
        pedidoTotal.addCaixa(pedido3);

        entrega.setEncomenda(pedidoTotal);

        assertEquals(170, entrega.getPrecoEncomenda());
    }
}
