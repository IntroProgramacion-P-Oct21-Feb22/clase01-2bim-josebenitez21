/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
    
        for (int i = 1; i <= 5; i++) {
                
            System.out.printf("%d\n", i);//1\n//2\n
                                         

            for (int j = 1; j <= 3; j++) {
                System.out.printf("%d ", i*j);//1*1=1
                                              //1*2=2
                                              //1*3=3
                                              //2*1=2
                                              //2*2=4
                                              //2*3=6
            
            
            
            }                            
            System.out.printf("\n-------------\n");
        }
    }
}
