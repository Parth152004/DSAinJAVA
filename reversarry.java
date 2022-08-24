import java.util.*;

public class reversarry {
    public static void reversarry(int arr[])
    {
        for(int i=0; i<arr.length/2; i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
    public static void display(int arr[])
    {
        for(int i=0;  i<arr.length; i++)
        {
            System.out.print(arr[i]+ " " );
        }
        System.out.println();
    }
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a arry length");
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter a arry elements");
        for(int i=0; i<length; i++)
        {
            arr[i]=sc.nextInt();
        }
        reversarry(arr);
        display(arr);
    }
}
