package com.ycf.sort;
/**
 * 插入排序
 * 思想：每次选择一个元素K插入到之前已排好序的部分A[1…i]中，
 * 插入过程中K依次由后向前与A[1…i]中的元素进行比较。若发现发现A[x]>=K,
 * 则将K插入到A[x]的后面，插入前需要移动元素。
 * @author yan gui
 *
 */
public class InsertSort {
	
	public int[] sort(int[] target){
		 int temp;
		for (int i = 0; i < target.length; i++) {
			temp=target[i];
			int j=i-1;
			while(j>0 && target[j]>temp){
				target[j+1]=target[j];
				j--;
			}
			target[j+1]=temp;
		}
		
		return target;
	}


}
