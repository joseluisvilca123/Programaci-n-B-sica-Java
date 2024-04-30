
package estructuradatos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EstructuraDatos {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean salir =false;
        try{
        while (!salir){
            System.out.println("Estructura de datos");
            System.out.println("1.- Array");
            System.out.println("2.- ArrayList");
            System.out.println("3.- HashMap");
            System.out.println("4.- Salir");
            
            System.out.print("Ingrese una opcion: ");
            int opcion = scanner.nextInt();
            
            
            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido a la ED Array");
                    int[] edades = {12,40,30,50,7,5,60,70,100};
                    String[] nombres = {"Daniel","Marcos","Diego","Ariel"};
                    
                    //Longitud del Array
                    System.out.println("Longitud edades: "+ edades.length);
                    System.out.println("Longitud nombres"+ nombres.length);
                    
                    //Cambiar un valor
                    edades[1] = 38;
                    nombres[3] = "David";
                    System.out.println("Nuevo dato edad: " + edades[1]);
                    System.out.println("Nuevo dato nombre: " + nombres[3]);
                    
                    //Convertir un array a String
                    System.out.println(Arrays.toString(edades));
                    System.out.println(Arrays.toString(nombres));
                    
                    //Clonar
                    int[] edadesClon = edades.clone();
                    System.out.println("Array clonado. " + Arrays.toString(edadesClon));
                    break;
                    
                case 2:
                    System.out.println("Bienvenido a ArrayList");
                    
                    ArrayList<String> ListaNombres = new ArrayList<>();
                    
                    //Agregar ddatos a la lista
                    ListaNombres.add("David");
                    ListaNombres.add("Marco");
                    ListaNombres.add("Julio");
                    
                    //Longitud de la lista
                    System.out.println("Tamaño de la lista: " + ListaNombres.size());
                    
                    //Remover un elemento de la lista
                    ListaNombres.remove(2);
                    
                    //Obtener un elemnto de la lista
                    //ListaNombres.get(2);
                    
                    System.out.println("Elemento Obtenido: " + ListaNombres.remove(2) + ListaNombres.get(1) );
                    
                    //Comprovar si la lista esta vacia
                    System.out.println("Lista vacia: " + ListaNombres.isEmpty());
                    
                    //Comprobar si un elemento existe
                    System.out.println("Existe: " + ListaNombres.contains("David"));
                    break;
                    
                case 3:
                    System.out.println("Bienvenido a HashMap");
                    
                    Map<String,Integer> edades1 = new HashMap<>();
                    
                    //Insertando data
                    edades1.put("Jose",20);
                    edades1.put("Marco",12);
                    edades1.put("Javier",60);
                    edades1.put("Pedro",50);
                    
                    //Eliminar un Dato
                    edades1.remove("Pedro");
                    
                    //Recuperar un Valor
                    System.out.println("Edad Jose: " +edades1.get("Jose"));
                   
                    //Longitud del Mapa
                    edades1.size();
                    
                    //Imprimir las llaves (key)
                    for(String Key : edades1.keySet()){
                        System.out.println("Llaves: "+Key);
                    }
                    
                    
                    
                    //Imprimir los valores (value)
      
                    for(Integer Values : edades1.values()){
                        System.out.println("Valores: "+Values);
                    }
                    
                    //Imprimir las Llaves y los valores 
                    for(Map.Entry<String,Integer> lv : edades1.entrySet()){
                        System.out.println(" Llave: " +lv.getKey() + " Valor: "+ lv.getValue());
                    }
                    
                    break;

                    
                default:
                    System.out.println("Elija una opcion Válida");
            }
            
        }
                
    }catch (Exception ex){
            System.out.println("Debe ingresar un numero entero "+ ex.getMessage());  
    }
    scanner.close(); 
}
    
}
