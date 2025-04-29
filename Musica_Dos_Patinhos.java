

/**
 *
 * @author Nilton Sousa
 */

import java.util.Scanner;

public class Musica_Dos_Patinhos {
    public static void main(String[]args){
        
        Scanner input=new Scanner(System.in);
        
        int quantidadePatinhos, maxPatinhos;
       
        
        System.out.println("Música dos patinhos da xuxa");
        System.out.println("Digite quantos patinhos deseja que cante");
        quantidadePatinhos=input.nextInt();
        maxPatinhos=quantidadePatinhos;
        
        for(int i=quantidadePatinhos;i>0;i--){
            System.out.println(i + " Patinhos foram passear \nalém das montanhas para brincar \na mamãe gritou ");
            for(int j=0;j<4;j++){
                System.out.println("quack");
            }
            quantidadePatinhos--;
            if(quantidadePatinhos>0){
                System.out.println("mais só " + quantidadePatinhos + " Patinhos voltaram de lá ");
            }
            else{
                System.out.println(" mais nenhum patinho voltou de lá ");
                System.out.println(" a mamãe patinha foi procurar \nalém das montanhas, na beira do mar \na mamãe gritou ");
                for(int j=0;j<4;j++){
                    System.out.println("quack");
                }
                System.out.println("e os " + maxPatinhos + " Patinhos voltaram de lá " );
            }
        }
        
        input.close();
    }
}
