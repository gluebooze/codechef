import java.util.Scanner;
class crdgame{
    public static void main(String[] args) throws Exception{
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt() , ch=0, mo=0;
                long a[][] = new long[n][2];
                for(int i = 0;i<n;i++){
                    int ch1=0,mo1=0;
                    a[i][0] = sc.nextLong();
                    a[i][1] = sc.nextLong();
                    do{
                        ch1 += a[i][0]%10;
                        a[i][0] = a[i][0]/10;
                    }while(a[i][0]!=0);

                    do{
                        mo1 += a[i][1]%10;
                        a[i][1] = a[i][1]/10;
                    }while(a[i][1]!=0);

                    if(ch1 > mo1)
                        ch += 1;
                    else if(ch1 < mo1)
                        mo += 1;
                    else{
                        ch+=1;
                        mo+=1;
                    }
                }
                if(ch==mo)
                    System.out.println(2+" "+ch);
                else if(mo>ch)
                    System.out.println(1+" "+mo);
                else
                    System.out.println(0+" "+ch);

            }
            sc.close();
        }
        catch(Exception e){
            return;
        }  
    }
}