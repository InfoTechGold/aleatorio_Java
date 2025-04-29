/**
 *
 * @author Nilton Sousa
 */

import java.util.Scanner;
public class musicaDosElefantes {
    public static void main(String[]args){
        
        Scanner input=new Scanner(System.in);
        
        int quantidadeElefantes,elefante;
        
        System.out.println(" Música dos elefantes da galinha pintadinha ");
        System.out.println(" digite até quantos deseja que conte os elefantes ");
        quantidadeElefantes=input.nextInt();
        
        
        
        for(int i=1;i<=quantidadeElefantes;i+=2){
            System.out.println(i + " Elefante incomoda muita gente");
            elefante=i+1;
            System.out.println(elefante + " Elefante");
            for(int j=1;j<=elefante;j++){
                if(j<elefante)System.out.println(" incomodam");
                else System.out.println(" incomodam muito mais");
                
            }
        }
        
        
    }
}
