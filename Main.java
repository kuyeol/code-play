import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);
   
    static int factorial(int n) {
        // Function to calculate factorial of n
        int f;

        for (f = 1; n > 1; n--) {
            f *= n;
        }
        return f;
    }

    static int ncr(int n, int r) {
        // Calculating nCr
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    public static void main(String args[]) {
                        Scanner in=new Scanner(System.in);
                int size,i;
                System.out.println("enter size of array");
                size=in.nextInt();
                int arr[]=new int[size];
                System.out.println("enter values in the array");
                for(i=0;i<size;i++)
                {
                        arr[i]=in.nextInt();
                }
                int temp;
                for(i=0;i<size/2;i++)
                {
                        //swapping elements to obtain reversed array
                        temp=arr[i];
                        arr[i]=arr[size-i-1];
                        arr[size-i-1]=temp;
                }
                System.out.println("array after reversing is");
                for(i=0;i<size;i++)
                {
                        System.out.print(arr[i]+" ");
                }
    }
}
