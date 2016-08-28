package com.ycf.sort;
/**
 * 快速排序
 * @author yan gui
 *
 */
public class QuickSort {

	/**
	 * @param target 目标数组
	 * @param low 第一个下标
	 * @param high 最后一个下标：数组长度-1
	 * @return 排序好的数组
	 */
	public int[] sort(int[] target,int low,int high){
		if(low<high){
			int standard=target[low];//选取基准值
			int temp=0;//用于下面两数字交换的中间值
			int i=low,j=high;
			do{
				while(i<high && target[i]<standard)
					i++;
				while(j>low && target[j]>standard)
					j--;
				if(i<=j){
					temp=target[j];
					target[j]=target[i];
					target[i]=temp;
					i++;
					j--;
				}
			}while(i<=j);
			if(i<high)
				sort(target,i,high);
			if(j>low)
				sort(target,low,j);
		}
		return target;
	}




	public static void main(String[] args) {
		int[] nums={1,5,6,3,88,33,22,111};
		QuickSort quickSort=new QuickSort();
		quickSort.sort(nums,0,nums.length-1);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
