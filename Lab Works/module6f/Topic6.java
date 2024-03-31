package module6f;

import java.awt.Point;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class Topic6 {
    public static void main(String[] args) {
        int[] nums = InitiaArray();
        System.out.print("Initial Array: ");
        printArray(nums);
        nums = SortArray(nums);
        System.out.print("After Sorting: ");
        printArray(nums);
    }

    public static void printArray(int[] nums) {
        for(int i=0;i<nums.length;i++)
            System.out.print(" "+nums[i]);
        System.out.println("");
    }

    public static int [] InitiaArray(){
        return new int [] {3,1,2,4,5};
    }

    public static int[] SortArray(int [] nums){
        return new int [] {1,2,3,4,5};
    }

}

