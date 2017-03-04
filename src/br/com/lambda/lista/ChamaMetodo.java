package br.com.lambda.lista;

import br.com.lambda.objeto.Usuario;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ChamaMetodo {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("ze",100);
        Usuario u2 = new Usuario("Veia",250);
        Usuario u3 = new Usuario("Bicho",500);
        Usuario u4 = new Usuario("Animal",500);

        List<Usuario> lista = Arrays.asList(u1, u2, u3, u4);
        System.out.println("Antes de ser moderador");
        lista.forEach(u -> System.out.println(u.getNome() + "-" + u.isModerador()));

        //Tornando todos usuario da lista moderadores
        System.out.println("Depois de ser moderador");
        lista.forEach(Usuario::tornaModerador);
        lista.forEach(u -> System.out.println(u.getNome() + "-" + u.isModerador()));
        
        //Comparação mais elaborada primeiro pelos pontos(maior) em caso de empate pelo nome
        lista.sort(Comparator.comparingInt(Usuario::getPontos).reversed().thenComparing(Usuario::getNome));
        lista.forEach((usuario) -> System.out.println(usuario.getNome()));
    }

}
