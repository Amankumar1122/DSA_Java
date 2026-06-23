package Array;

import java.util.Scanner;

public class SecondLargest {
    int Secondlargest(int[] a) {

        if (a == null || a.length == 0) {
            System.out.println("No element is in the array");

        }
        int largest=Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for (int i = 0; i <a.length ; i++) {

            if (a[i] > largest) {

                secondLargest = largest;
                largest = a[i];

            } else if (a[i] < largest && a[i] > secondLargest) {
                secondLargest = a[i];
            } else {
            }
        }
        return secondLargest;
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

        SecondLargest st=new SecondLargest();
        System.out.println("Second Largest element of the array is : " + st.Secondlargest(a));

    }
}
