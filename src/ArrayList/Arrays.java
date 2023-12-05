package ArrayList;

import java.util.ArrayList;

public class Arrays {
    public static void Executar() {
        //declarando um array list
        ArrayList<Integer> idades = new ArrayList<Integer>();
        // adicionando valores
        idades.add(18);
        idades.add(23);
        idades.add(24);
        idades.add(35);
        //removendo valores
        idades.remove(0);
        //pegando valores
        idades.get(1);
        //retornando o tamanho do array
        idades.size();
    }
}
