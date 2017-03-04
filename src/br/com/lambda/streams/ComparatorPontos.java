package br.com.lambda.streams;

import br.com.lambda.objeto.Usuario;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorPontos {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("ze",100);
        Usuario u2 = new Usuario("Veia",250);
        Usuario u3 = new Usuario("Bicho",500);
        Usuario u4 = new Usuario("Animal",500);
        
        List<Usuario> lista = Arrays.asList(u1,u2,u3,u4);
        //Ordenando por maior pontuação
        lista.sort(Comparator.comparing(Usuario::getPontos).reversed());
        //Tornando moderador os 2 primeiros da lista, iniciando do 0 e terminando no 2
        lista.subList(0,2).forEach(Usuario::tornaModerador);
        
        lista.forEach(System.out::println);
    }
    
}
