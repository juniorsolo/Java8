package br.com.lambda.lista;

import br.com.lambda.objeto.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PercorreLista {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("Ryan");
        Usuario u2 = new Usuario("Cole");
        Usuario u3 = new Usuario("Bola");
        
        List<Usuario> lista = Arrays.asList(u1,u2,u3); // cria a lista imutável
        
        /*implementação de metodos da classe consumer antes e
        depois de cada nome, nesse exemplo.*/
        Consumer<Usuario> mostraMensagem = u -> 
                System.out.println("Antes de imprimir os nomes...");
        
        Consumer<Usuario> mostraNomes = u ->
                System.out.println(u.getNome());
 
        lista.forEach(mostraMensagem.andThen(mostraNomes));
        
    }
    
}
