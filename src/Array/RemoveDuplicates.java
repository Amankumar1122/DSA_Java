package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        ArrayList<Integer> al =new ArrayList<Integer>();
        for(int i=0 ;i<n;i++)
        {
            if(al.contains(arr[i]))
            {
                continue;
            }
            else {
                al.add(arr[i]);
            }
        }
        Collections.sort(al);
        System.out.println(al);
    }
}
