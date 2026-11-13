package Iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {

    @Test
    void deveContarAlunosAtivosCurso() {
        Conta conta = new Conta(
                new Cliente("Marco", true),
                new Cliente("Antonio", true),
                new Cliente("Jose", false),
                new Cliente("Maria", true)
        );
        assertEquals(3, Sistema.contarClientesCadastradosSistema(conta));
    }

    @Test
    void deveContarTotalClientesConta() {
        Conta conta = new Conta(
                new Cliente("Marco", true),
                new Cliente("Antonio", true),
                new Cliente("Jose", false),
                new Cliente("Maria", true)
        );
        assertEquals(4, Sistema.contaTotalClientesConta(conta));
    }

}