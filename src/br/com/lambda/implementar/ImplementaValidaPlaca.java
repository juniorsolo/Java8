package br.com.lambda.implementar;

public class ImplementaValidaPlaca {

    public static void main(String[] args) {

        ValidaPlaca<String> validaPlaca = valor -> valor.matches("[A-Z]{3}-[0-9]{4}");
        
        System.out.println(validaPlaca.valida("EXK-0634"));
        System.out.println(validaPlaca.teste());
        System.out.println(validaPlaca.soma(12F, 120F));
    }
    
}
