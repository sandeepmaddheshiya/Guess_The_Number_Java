import java.util.*;

public class Guess_The_Number {
    public static void main(String[] args) {
        Random r=new Random();
        int c=r.nextInt(50);
        System.out.println("Guess a no. in between 1 to 50, You've three lives");        
        Scanner sc=new Scanner(System.in);
        
        int l=3;
        while(l>=1){
            int n=sc.nextInt();
            if(n==c){
                System.out.println("congratulations! You've correctly guessed the number");
                System.out.println("Life remaining:"+l);
                break;
            }
            else if(n>c){
                System.out.println("The number is too high ");
                l=l-1;
                System.out.println("Life remaining:"+l);
            }
            else if(n<c){
                System.out.println("The number is too low");
                l=l-1;
                System.out.println("Life remaining:"+l);
            }
            else{
                System.out.println("Please enter a valid number");
            }
        }
        if(l<1){
            System.out.println("You Lose");
            System.out.println("Life remaining:"+l);
        }
    }
}
