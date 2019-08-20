/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author necha
 */
import java.util.Scanner;
public class MenghitungSuhu {
    public static void main(String[] args){
        //deklarasi
        double  Celcius, Fahrenheit;
        
        //membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        //input
        System.out.println("== Program hitung suhu celcius ke fahrenheit ==");
        System.out.print("Input C: ");
        Celcius = baca.nextDouble();
        
        //proses
        Fahrenheit = Double.valueOf(( Celcius * 9/5) + 32);

        //output
        System.out.println("Fahrenheit = " + Fahrenheit);
       
    }
    
}
