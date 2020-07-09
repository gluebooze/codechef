import java.util.*;
import java.lang.Math;
class chefstr1{
    public static void main(String[] args) throws Exception{
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int sum =0;
                int n = sc.nextInt();
                int a[] = new int[n];
                a[0] = sc.nextInt();
                for(int i=1;i<n;i++){
                    a[i] = sc.nextInt();
                    sum += Math.abs(a[i-1]-a[i])-1;
                }
                System.out.println(sum);
                
            }
            sc.close();
        }catch(Exception e){
            return;
        }
    }
}