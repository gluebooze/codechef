import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class layers {
    static void solve(long a[][],int n,int co){
        TreeMap<Long,Long> t =new TreeMap<>();
        long c[] =new long[co+1];
         for(int i=n-1;i>=0;i--){
             if(t.size()==0){
                 t.put(a[i][1],a[i][0]);
                 c[(int)a[i][2]]+= a[i][1]*a[i][0];
             }
             Map.Entry<Long,Long> prev = t.ceilingEntry(a[i][1]);
             if(prev == null || prev.getValue()< a[i][0]){
                 
                 if(prev==null)
                 prev=t.lastEntry();
                 
                 long area = a[i][0]*a[i][1];
                 long extraWidth = 0;
                 
                 do{
                     
                     area -= Math.min(prev.getKey(),a[i][1])*(Math.min(prev.getValue(),a[i][0])-extraWidth);
                     extraWidth = prev.getValue();
                     
                     if(prev.getKey()<=a[i][1] && prev.getValue()<=a[i][0])
                     t.remove(prev.getKey());
                     
                     
                     prev=t.lowerEntry(prev.getKey());
                 }
                 while(prev!=null && extraWidth < a[i][0] && prev.getValue()> extraWidth);
                 t.put(a[i][1],a[i][0]);
                 c[(int)a[i][2]] += area;
             }else
             c[(int)a[i][2]] += 0;
         }
         for(int i=1;i<=co;i++){
             System.out.print(c[i]+" ");
         }
         
     }
     public static void main (String[] args) throws java.lang.Exception
     {
         // your code goes here
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0){
             int n=sc.nextInt();
             int co=sc.nextInt();
             long a[][]=new long[n][3];
             for(int i=0;i<n;i++){
                 for(int j=0;j<3;j++){
                     a[i][j]=sc.nextInt();
                 }
                
             }
             
             solve(a,n,co);
         }
     }
}