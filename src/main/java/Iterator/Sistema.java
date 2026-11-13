package Iterator;

import java.util.Iterator;

public class Sistema {

    public static Integer contarClientesCadastradosSistema(Conta conta) {
        int quantidade = 0;
        for (Cliente cliente : conta) {
            if (cliente.isCadastrado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contaTotalClientesConta(Conta conta) {
        int quantidade = 0;
        for(Iterator a = conta.iterator(); a.hasNext();) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
