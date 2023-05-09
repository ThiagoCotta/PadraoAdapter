import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarPesoPratoCliente() {
        Cliente cliente = new Cliente();
        cliente.setPrato(1200f);

        assertEquals(1200f, cliente.getPrato());
    }

    @Test
    void deveRetornarValorPratoCliente() {
        Cliente cliente = new Cliente();
        cliente.setPrato(1500);

        assertEquals(24.000002f, cliente.getValor());
    }
}