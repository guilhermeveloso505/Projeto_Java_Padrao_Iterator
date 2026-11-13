package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Conta implements Iterable<Cliente>{

    private List<Cliente> clientes = new ArrayList<Cliente>();

    public Conta(Cliente... clientes){ this.clientes = Arrays.asList(clientes); }

    @Override
    public Iterator<Cliente> iterator() {return clientes.iterator();}

}
