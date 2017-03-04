package br.com.lambda.implementar;


public class InterfaceFuncional {
   public static void main(String[] args){
       
       /*Intefaces com um único metodo são chamandas de interfaces funcionais*/
       Runnable r = () ->{
         for(int i=0;i < 10 ;i++){
             System.out.print(i);
         }   
       };
       new Thread(r).start();
     
       /*pode ser usado assim tbm*/
       new Thread(() -> {
           System.out.println("    ");
           for(int i=0;i < 10 ;i++){
             System.out.print(i);
         } 
       }
       ).start();
       
   } ;
   
}
