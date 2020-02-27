import java.io.*;
import java.util.*;

/*
Problem Statement:
Given an array (not sorted) with a sum value:-> find if the array contain any pair which equals to the sum.

*/
public class Main {
	
	public static void main(String...args) {

		int[] array1 = {1, 2, 3, 9};
		int[] array2 = {1, 2, 3, 4, 4};
		int[] array3 = {};
		int[] array4 = {-1, -2, 3, 9};
		int[] array5 = null;
		int[] array6 = {11, 22, 23, 39};

		int sum = 8;

		System.out.println(hasPairWithSum(array1,sum));
		System.out.println(hasPairWithSum(array1,sum));
		System.out.println(hasPairWithSum(array1,sum));
		System.out.println(hasPairWithSum(array1,sum));
		System.out.println(hasPairWithSum(array1,sum));
		System.out.println(hasPairWithSum(array1,sum));
	}

	public static boolean hasPairWithSum(int[] arr, int sum) {

			Set<Integer> comp = new HashSet<Integer>();

			if(arr == null) return false;

			for(int i = 0; i < arr.length; i++) {

				if(comp.contains(arr[i])) {

					return true;
				}
				else{

					comp.add(sum - arr[i]);
				}

			}
			return false;
	}
}