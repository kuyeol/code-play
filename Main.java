import java.util.Scanner;

public class Main {

    
    public static void main(String args[]) {

       
        Scanner in=new Scanner(System.in);
             //input to array size declare       
                int size;  
                System.out.println("enter size of array : ");
                size=in.nextInt();
        
                int arr[]=new int[size];
        
                System.out.println("enter values in the array :");
                int i;   
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
                    System.out.print(arr[i]+temp);
                }
                System.out.println("array after reversing is :\n");
                for(i=0;i<size;i++)
                {
                        System.out.print(" > "+arr[i]);
                    
                }
    System.out.println("\n\n Done! ");
    }
}
