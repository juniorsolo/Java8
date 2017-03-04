
package br.com.lambda.lista;

import br.com.lambda.objeto.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveLista {


    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("F", 100));
        lista.add(new Usuario("A", 600));
        lista.add(new Usuario("B", 500));
        
        /* Criando predicado com ele removemos da lista o que retornar true
        */
        
        Predicate<Usuario> removeUsuario = (Usuario u) -> u.getPontos() > 500 ;
        
        lista.removeIf(removeUsuario);
        
        lista.forEach( u -> System.out.println(u.getPontos()));
    }
    
}
