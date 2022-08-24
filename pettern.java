public class pettern {
    public static void holorectangle(int n,int m)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                if(i==1||i==n||j==1||j==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void halfPiramind(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hlafnumberpiramind(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void hlafnumberpiramind1(int n)
    {
        int count=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
    public static void halfPiramindof01(int n)
    {
        int count=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(count%2==0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        holorectangle(4, 4);
        System.out.println();
        halfPiramind(4);
        System.out.println();
        hlafnumberpiramind(4);
        System.out.println();
        hlafnumberpiramind1(4);
        halfPiramindof01(4);
    }
}
