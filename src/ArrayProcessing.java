import java.util.Scanner;
/*
    Find the sum of the elements of an array
    Find the mean (average) of the elements of an array.
 */
public class ArrayProcessing {
    public static void main(String[] args)
    {
        int n, sum = 0, avg = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];

            avg = sum / n;
        }
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+avg);
    }
}
