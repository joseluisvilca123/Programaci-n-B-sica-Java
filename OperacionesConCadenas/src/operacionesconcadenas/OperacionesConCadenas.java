
package operacionesconcadenas;

public class OperacionesConCadenas {

    public static void main(String[] args) {
        String Nombres = "Jose Luis";
        String Apellidos = " Vilca Salas";
        
        //Concatenar
        String NombreCompleto = Nombres + Apellidos ;
        
        System.out.println("El nombre completo es: "+ NombreCompleto);
        
        //Mayusculas
        String NombreCompleto1 = Nombres + Apellidos ;
        System.out.println("El nombre completo es: " + NombreCompleto1.toUpperCase());
        
        //Minusculas
        String NombreCompleto2 = Nombres + Apellidos ;
        System.out.println("El nombre completo es: " + NombreCompleto2.toLowerCase());
        
        //Contar cadenas
        String NombreCompleto3 = Nombres + Apellidos ;
        System.out.println("La cantidad de caracteres es: " + NombreCompleto3.length());
        
        //cortar una cadena
        String NombreCompleto4 = Nombres + Apellidos ;
        //["Jose","Luis","Vilca","Salas"]
        String[] NombreCortado = NombreCompleto4.split(" ");
        //for (int i = 0; i < NombreCompleto4.length() ; i++){
         //   System.out.println(NombreCortado[i]);
       // }
        
        for(String nombre : NombreCortado){
            System.out.println(nombre);
        }
        
        //System.out.println("Nombre Cortado: " + NombreCortado);
        
        
        //Equals
        boolean comparacion = Nombres.equals(Apellidos);
        System.out.println("Comparacion: "+comparacion);
        
        //Interpolacion de variables
        String n = "Jose";
        String a ="Vilca";
        int e = 50;
        
        String mensaje = String.format("Mi nombre es: %s y mi apellido es: %s y tengo: %d años",n,a,e );
        System.out.println(mensaje);
      
    }
    
}
