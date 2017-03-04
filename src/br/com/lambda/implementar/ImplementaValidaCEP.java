
package br.com.lambda.implementar;

public class ImplementaValidaCEP{

    public static void main(String[] args) {
     
        ValidaCEP<String> validaCEP = valor -> valor.matches("[0-9]{5}-[0-9]{3}");  
        
        System.out.println(validaCEP.valida("06823-500"));
    }
    
}
