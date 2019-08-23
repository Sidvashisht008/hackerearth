import java.util.Scanner;
class prime{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=0,j=0;
        for(i=2;i<=n;i++)
        {
            int flag=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
