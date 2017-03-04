package br.com.lambda.lista;

import br.com.lambda.objeto.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ReferenciaMetodo {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("Ryan",222);
        Usuario u2 = new Usuario("Felipe",100);
        Usuario u3 = new Usuario("Adriano",50);
        
        List<Usuario> list = Arrays.asList(u1,u2,u3);
        
        //Ambos os metodos são equivalentes
        Consumer<Usuario> consumer1 = Usuario::tornaModerador;
        Consumer<Usuario> consumer2 = u -> u.tornaModerador();
        
        // Outra maneira de fazer foreach com println
        // caso a classe usuario nao tenha o toString sobreecrito
        // iria imprimir apenas o valor objeto ex: @f12345a
        list.forEach(System.out::println);
        
        
    }
    
}
