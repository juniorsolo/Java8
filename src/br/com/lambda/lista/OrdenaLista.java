package br.com.lambda.lista;

import br.com.lambda.objeto.Usuario;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;

public class OrdenaLista {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Ryan",100);
        Usuario user2 = new Usuario("Cole",300);
        Usuario user3 = new Usuario("Bolo",122);
        Usuario user4 = new Usuario("Bola",400);
        
        List<Usuario> lista = Arrays.asList(user1,user2,user3,user4); // cria a lista imutável
        
        // Também funciona com uma lista mutável
        /*
        List<Usuario> lista = new ArrayList<>();
        lista.add(user4);
        lista.add(user3);
        lista.add(user2);
        lista.add(user1);
        */
             
        //1 forma Cria o comparator com lambda
        //Comparator<Usuario> comparator = (u1,u2) -> u1.getNome().compareTo(u2.getNome());
              
        //2 forma  pode ser implementado um uma unica linha pela Collections
        //Collections.sort(lista, (u1,u2) -> u1.getNome().compareTo(u2.getNome()));
        
        //3 forma Podemos ordenar pela propria lista.
        //lista.sort((u1,u2) -> u1.getNome().compareTo(u2.getNome()));
        
        //4 forma ordenar usando o metodo statico da classe
        //lista.sort(comparing(u -> u.getNome()));
        
        
        //Passando o comparator no sort
        lista.sort(Comparator.comparing(u -> u.getNome()));
        
        lista.forEach(u -> System.out.println(u.getNome()));
        
        // usando o exemplo acima para comparar integer
        lista.sort(Comparator.comparingInt(u -> u.getPontos()));
        lista.forEach(u -> System.out.println(u.getPontos()));
        
    }

}
