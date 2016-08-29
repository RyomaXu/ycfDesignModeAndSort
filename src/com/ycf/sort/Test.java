package com.ycf.sort;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		int[] nums={1,5,6,3,9999,6,88,5,33,22,111};
		System.out.println("-------------冒泡排序--------------------------");
		BubbleSort bubbleSort=new BubbleSort();
		bubbleSort.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("-------------插入排序--------------------------");
		InsertSort insertSort=new InsertSort();
		insertSort.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("-------------合并排序--------------------------");
		MergeSort mergeSort=new MergeSort();
		mergeSort.sort(nums,0,nums.length-1);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("-------------快速排序--------------------------");
		QuickSort quickSort=new QuickSort();
		quickSort.sort(nums,0,nums.length-1);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("-------------选择排序--------------------------");
		SelectSort selectSort=new SelectSort();
		selectSort.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
