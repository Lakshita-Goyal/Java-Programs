public class LeftPascal 
{
    public static void main(String[] args)
    {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                System.out.print("");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=1;i<=n-1;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("");
            }
            for(int k=0;k<n-i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
