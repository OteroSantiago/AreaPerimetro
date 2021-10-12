/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetro;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class AreaPerimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce la base del rectángulo (en cms):" );
        int base = ent.nextInt() ;
        System.out.println("Introduce el perímetro del rectángulo (en cms):" );
        int altura = ent.nextInt();
        if(base>altura){
            System.out.println("La base es mayor");
        }else{
            System.out.println("El perimetro es mayor");
        }
        int area;
        int perimetro;
        
        area= base + altura;
        perimetro=(base + altura)*(base + altura);
        
        System.out.println("El área del rectángulo es: "+area);
        System.out.println("El perimetro del rectángulo es: "+perimetro);
        
    }
    
}
