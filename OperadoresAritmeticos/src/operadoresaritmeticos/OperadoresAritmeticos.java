package operadoresaritmeticos;
import java.lang.Math;
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int variableUno = 50;
        int variableDos = 20;
        
        //Incremento
        //variableUno = variableUno + 1;
        variableUno ++;
        System.out.println("Incremento: "+variableUno);
        
        //Decremento
        //variableDos = variableDos -1;
        variableDos -- ;
        System.out.println("Decremento: "+variableDos);
        
        double suma = variableUno + variableDos;
        double resta = variableUno - variableDos;
        double multiplicacion = variableUno * variableDos;
        double division = variableUno / variableDos;
        double modulo = variableUno % variableDos;
        
        
        System.out.println("La suma de variableUno y la variableDos : "+suma);
        System.out.println("La resta de variableUno y la variableDos : "+resta);
        System.out.println("La multiplicacion de variableUno y la variableDos : "+multiplicacion);
        System.out.println("La division de variableUno y la variableDos : "+division);
        System.out.println("El modulo de variableUno y la variableDos : "+modulo);
        
    }
    
}
