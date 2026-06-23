package Array;

import java.util.Scanner;

public class LargestElement {
    int Largest(int[] a)
    {   int largest=a[1];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = input.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        LargestElement l = new LargestElement();
        System.out.println("The largest element in the array is : "+l.Largest(a));
    }
}
