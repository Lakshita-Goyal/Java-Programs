public class KPattern {
    public static void main(String[] args)
    {
        int n=8;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            
        }

        for(int i=2;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
