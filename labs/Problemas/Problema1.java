package Problemas;
import java.util.*;

public class Problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine().toLowerCase();

        int i = 0;
        int numCual = 0;
        int numComo = 0;

        while(i < cadena.length() - 3){
            if( "como".equals(cadena.substring(i, i + 4)) ){
                numComo += 1;
            }
            if( "cual".equals(cadena.substring(i, i + 4)) ){
                numCual += 1;
            }
            i += 1;
        }

        if(numCual == numComo) {
            System.out.println("Igual cantidad");
        }else{
            System.out.println("Distinta cantidad");
        }
    }
}


