package Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] nums= new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the number of element to be rotated from right");
        int k = sc.nextInt();

        while(k>0)
        {

            for(int i=nums.length-1;i>0;i--)
            {
                int c=nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=c;
            }
            k--;
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
