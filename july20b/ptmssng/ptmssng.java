import java.util.Scanner;
public class ptmssng {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a ,b;
            int x=0,y=0;
            for(int i=0;i<(4*n-1);i++){
                a = sc.nextInt();
                b = sc.nextInt();
                x ^= a;
                y ^= b;
            }
            System.out.println(x+" "+y);
        }
        sc.close();
    }
}