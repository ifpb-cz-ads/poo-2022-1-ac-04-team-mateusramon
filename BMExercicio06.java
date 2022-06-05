import java.util.Scanner;
public class BMExercicio06 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int dia=1;
        while(dia!=0){
        System.out.println("Inrome um numero inteiro entre 1 e 7 : ");
        
        dia = sc.nextInt();

        
        if(dia>7 || dia<1){
                System.out.println("este numero nao esta entre 1 e 7");
            } else if(dia == 1){
                System.out.println("he domingo");
            } else if(dia==2){
                System.out.println("he segunda-feira");
            } else if(dia==3){
                System.out.println("he terca-feira");
            } else if(dia==4){
                System.out.println("he quarta-feira");
            } else if(dia==5){
                System.out.println("he quinta-feira");
            } else if(dia==6){
                System.out.println("he sexta-feira");
            } else if(dia==7){
                System.out.println("he sabado");
            }
        }
    }
}