
package br.com.lambda.foreach;

import br.com.lambda.objeto.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class PercorreListaTipos {
    public static void main(String[] args){
        Usuario u1 = new Usuario("Ryan");
        Usuario u2 = new Usuario("Felipe");
        Usuario u3 = new Usuario("Adriano");
        
        List<Usuario> list = Arrays.asList(u1,u2,u3); // cria a lista imutável
        
        
        /*Somente java 8 com expressão Lambda*/
        Consumer<Usuario> mostrador = (Usuario u) -> {
            System.out.println(u.getNome());
        };
        list.forEach(mostrador);
        System.out.println("");
        
        /*Com Lambda melhorado*/
        Consumer<Usuario> mostrador2 =  u -> {System.out.println(u.getNome());};
        list.forEach(mostrador2);
        System.out.println("");
        
        /*Caso o metodo tenha somente uma instrução poderá fica assim*/
        Consumer<Usuario> mostrador3 =  u -> System.out.println(u.getNome());
        list.forEach(mostrador3);
        System.out.println("");
        
        /*Melhor ainda*/
        list.forEach(u -> System.out.println(u.getNome()));
    }
}
