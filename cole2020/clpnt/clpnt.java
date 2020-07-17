import java.util.Scanner;
import  java.util.Arrays;
class clpnt{
    public static void main(String[] args) throws Exception{
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int[] a = new int[n];
                
                for(int i = 0;i<n;i++)
                    a[i] = sc.nextInt();
                Arrays.sort(a);
                int q = sc.nextInt();
                int[][] x = new int[q][2];
                for(int i = 0;i<q;i++){
                    for(int j =0;j<2;j++)
                        x[i][j] = sc.nextInt();
                    int k = n-1;
                    int res = calcu(a,k,x[i][0],x[i][1]);
                    System.out.println(res);
                }
            }
            sc.close();
        }catch(Exception e){
            return;
        }
    }
    public static int calcu(int[] a,int k,int x,int y){
        if(k<0)
            return 0;
        int sum = x+y-a[k];
        if(sum == 0)
            return -1;
        else if(sum < 0)
            return (calcu(a,(k-1),x,y));
        else
            return sum;


    }
}





