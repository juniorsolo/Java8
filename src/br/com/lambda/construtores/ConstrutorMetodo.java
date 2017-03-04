package br.com.lambda.construtores;

import br.com.lambda.objeto.Usuario;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;

public class ConstrutorMetodo {

    public static void main(String[] args) {

        //Exemplo de construtor chamando metodo default
        Supplier<Usuario> criaUsuarioDefault = Usuario::new;
        Usuario u1 = criaUsuarioDefault.get();

        //Exemplo de construtor passando 1 parametro
        Function<String, Usuario> criaUsuarioNome = Usuario::new;
        Usuario u2 = criaUsuarioNome.apply("Rodrigo");
        System.out.println(u2.getNome());

        //Exemplo de construtor passando 2 parametro
        BiFunction<String, Integer, Usuario> criaUsuarioNomePonto = Usuario::new;
        Usuario u3 = criaUsuarioNomePonto.apply("Fabiana", 200);
        System.out.println(u3.getNome() + " " + u3.getPontos());

        BiFunction<Integer, Integer, Integer> max = Math::max;
        ToIntBiFunction<Integer, Integer> max2 = Math::max;
        IntBinaryOperator max3 = Math::max;
        System.out.println(max.apply(8, 2));
        System.out.println(max2.applyAsInt(8, 2));
        System.out.println(max3.applyAsInt(8, 2));
        
    }

}
