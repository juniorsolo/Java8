package br.com.lambda.streams;

import br.com.lambda.objeto.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectorsExemplo {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("ze", 100);
        Usuario u2 = new Usuario("Veia", 250);
        Usuario u3 = new Usuario("Bicho", 430);
        Usuario u4 = new Usuario("Animal", 500);

        List<Usuario> lista = Arrays.asList(u1, u2, u3, u4);
        List<Usuario> maisQue100 = new ArrayList<>();

        //Para pegar elementos de uma lista com Stream
        // 1 forma
        //lista.stream().filter(u -> u.getPontos() > 100).forEach(u -> maisQue100.add(u));
        // 2 forma com variação lambda simplificando a sintaxe
        lista.stream().filter(u -> u.getPontos() > 100).forEach(maisQue100::add);

        maisQue100.forEach(System.out::println);
        /*
           ### Como retorna um stream para adicionar em uma lista podemos fazer
           assim ###
        
            Supplier<ArrayList<Usuario>> supplier = ArrayList::new;
            BiConsumer<ArrayList<Usuario>, Usuario> accumulator = ArrayList::add;
            BiConsumer<ArrayList<Usuario>, ArrayList<Usuario>> combiner = ArrayList::addAll;
            List<Usuario> maisQue100 = lista.stream().filter(u -> u.getPontos() > 100).collect(supplier, accumulator, combiner);
        
       
           Ao invés de criar suplier ,acumulator e combiner e depois usar
           podemos usar assim
         */
        // ########  Usando COLLECTOR   #######
        // 1 forma
        List<Usuario> novaMaisQue100 = lista.stream().filter(u -> u.getPontos() > 100).collect(Collectors.toList());
        System.out.println("\n    Usando Collector");
        novaMaisQue100.forEach(System.out::println);

        /*
          Há ainda no método toCollection, que permite que você escolha a implementação
          que será devolvida no final da coleta:
         */
        System.out.println("\nImprimindo set de Usuario");
        
        Set<Usuario> set = lista.stream().collect(Collectors.toCollection(HashSet::new));
        set.forEach(System.out::println);

        // Obtendo lista de pontos
        
        List<Integer> pontos = lista.stream().map(Usuario::getPontos).collect(Collectors.toList());
        pontos.forEach(System.out::println);
        
        // Para evitar outoboxing
        IntStream stream = lista.stream().mapToInt(Usuario::getPontos);
        
        // Pontuação Média
        // Se o orElse não for usado pode dar erro caso a lista esteja vazia.

        double pontuacaoMedia = lista.stream().mapToInt(Usuario::getPontos).average().orElse(0);
        System.out.println("\nPontuação média: " + pontuacaoMedia);
        
        // retornando uma exceção
         pontuacaoMedia = lista.stream().mapToInt(Usuario::getPontos).average().orElseThrow(IllegalStateException::new);
        
        
    }

}
