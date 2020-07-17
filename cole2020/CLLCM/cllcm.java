import java.util.*;
class cllcm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a,flag=0;
            for(int i = 0;i<n;i++){
                a = sc.nextInt();
                if(a%2==0){
                    flag = 1;
                }
            }
            if(flag==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}