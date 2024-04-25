
package operacionesdecomparacion;


public class OperacionesDeComparacion {

    public static void main(String[] args) {
       int num1 = 6;
       int num2 = 5;
       
       if (num1 < num2){
           System.out.println("El numero: " +num1+ " > " +num2);
           
       }
       else if (num1 == num2){
          System.out.println("El numero: " +num1+ " == " +num2); 
       }
       
       else if (num1 < num2){
          System.out.println("El numero: " +num1+ " < " +num2);
    }
       
       else if (num1 <= num2){
          System.out.println("El numero: " +num1+ " <= " +num2);
    }
       
       else if (num1 >= num2){
          System.out.println("El numero: " +num1+ " >= " +num2);
    }
       else if (num1 != num2){
          System.out.println("El numero: " +num1+ " != " +num2);
    }
    
    }
}
