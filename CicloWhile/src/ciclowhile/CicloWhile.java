
package ciclowhile;

import java.util.Scanner;

public class CicloWhile {

    public static void main(String[] args) {
        boolean salir = true;
        Scanner scanner = new Scanner (System.in);
        
        while(salir){
        
    
            System.out.println("========================================");
            System.out.println("Bienvenido a ...");
            System.out.println("1.- Saludar");
            System.out.println("2.- Despedirse");
            System.out.println("3.- Cobrar");
            System.out.println("4.- Escapar");
            System.out.println("5.- Salir");
            System.out.println("========================================");


            int Opcion = scanner.nextInt();

            switch (Opcion) {
                case 1:
                    System.out.println("Buenos Días");
                    break;

                    case 2:
                        int[] Numeros = {1,2,3,4,5};
                    Object [] NumerosLetras= {12, "Jose", 123.21, true, "Luis"};
                    //for(Object nl : NumerosLetras){
                      //  System.out.println(nl);
                    //}
                    
                    for (int n=0; n <Numeros.length;n++) {
                        System.out.println(Numeros[n]); 
                        if(Numeros[n] == 2 && Numeros[n] == 3){
                            System.out.println("Se encontro un numero 2");
                        }
                        else{
                            System.out.println("No se encontro un numero 2");
                        }
                        
                    }
                    
                    //System.out.println("Chau ... Vuelva Pronto");
                    break;

                    case 3:                    
                    System.out.println("Quiero que me pagues");
                    break;

                    case 4:
                    System.out.println("Se escapo...");
                    break;

                    case 5:
                    salir = false;    
                    System.out.println("Gracias por usar nuestro Menú");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
                }
            }
            
        }
    
    }
    

