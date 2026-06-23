package Array;

import java.util.Scanner;

public class CheckSortedArray {

    boolean check(int[] arr)
    {   boolean flag=true;
        if(arr.length==0)
        {
            flag=false;
            return flag;
        }

        int j=1;
        for(int i=0 ;i<arr.length-1;i++)
        {
            flag= arr[i]< arr[j];
            if(j>=i)j++;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n ; i++){
            arr[i] = input.nextInt();
        }

        CheckSortedArray obj = new CheckSortedArray();
        System.out.println( obj.check(arr));


    }
}
