package br.com.lambda.streams;

import br.com.lambda.objeto.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("ze", 100);
        Usuario u2 = new Usuario("Veia", 250);
        Usuario u3 = new Usuario("Bicho", 500);
        Usuario u4 = new Usuario("Animal", 500);

        List<Usuario> lista = Arrays.asList(u1, u2, u3, u4);

        // o stream não altera o estado da coleção que o driou, ele retorna uma nova
        lista.stream().filter(u -> u.getPontos() > 100);
        // a lista aparecerá da mesma forma em que foi criada
        lista.forEach(System.out::println);

        System.out.println("\nNova lista\n");

        ///Para pegar o retorno deve criar um novo Stream
        Stream<Usuario> stream = lista.stream().filter(u -> u.getPontos() > 100);
        stream.forEach(System.out::println);

        System.out.println("\n");
        // Ou fazer assim sem pegar o retorno do Stream
        lista.stream().filter(u -> u.getPontos() > 100).forEach(System.out::println);

        System.out.println("\n Acima de 300 pontos vira moderadores \n");
        
        //ou para tornar todos moderadores
        lista.stream().filter(u -> u.getPontos() > 300).forEach(Usuario::tornaModerador);
        lista.forEach(System.out::println);
  
        System.out.println("\n Filtrando a lista por moderadores \n"); 
        
        lista.stream().filter(Usuario::isModerador).forEach(System.out::println);
        
    }

}
