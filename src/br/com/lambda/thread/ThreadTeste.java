package br.com.lambda.thread;

public class ThreadTeste {

    public static void main(String[] args) {
        
        /*Variavéis locais não podem ser alteradas se forem usadas no lambda*/
        final int numero = 5;

        new Thread(() -> {
            System.out.println(numero);
        }).start();
        
       // numero = 10; //aqui dá erro por causa do lambda
    }

}
