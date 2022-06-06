import java.util.Scanner;
public class BMExercicio07 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x;
        int y=2;
        System.out.println("Informe um numero :");
        x = sc.nextInt();
        while(y!=1){
            if(x%2==0){
                y=x/2;
                x=y;
            } else{
        
                y=3*x+1;
                x=y;
            }
            System.out.println(""+y);
        }
    }
}