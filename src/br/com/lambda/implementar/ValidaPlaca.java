package br.com.lambda.implementar;

//anotação fixa a inteface como funcional dando erro caso alterem fora do padrão
@FunctionalInterface
public interface ValidaPlaca<T> {
    
   boolean valida(T t);
   
   default String teste(){
       return "teste de método default {:-)";
   }
   default Float soma(Float x, Float y){
       return x + y;
   }
}
