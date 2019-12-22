import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of bricks:");
        int bricks = sc.nextInt();
        int rounds=0;
        int sum=0;
        do
        {
            rounds++;
            sum=sum+rounds*3;
        }while(sum<bricks);
        if(bricks>sum-2*rounds)
        {
            System.out.print("Motu");
        }
        else
        {
            System.out.print("Patlu");
        }
    }
}