package com.ycf.sort;
/**
 * 选择排序
 * 思想：首先在未排序序列中找到最小元素，存放到排序序列的起始位置，然后，
 * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列起始位置。以此类推，直到所有元素均排序完毕。
 * 具体做法是：选择最小的元素与未排序部分的首部交换，使得序列的前面为有序。  
 * @author yan gui
 *
 */
public class SelectSort {

	public int[] sort(int[] target){
		int k;
		for (int i = 0; i < target.length; i++) {
			k=i;
			for (int j = i+1; j < target.length; j++) {
				if(target[j]<=target[k]){
					k=j;
				}
			}
			if(k!=i){
				int temp=target[i];
				target[i]=target[k];
				target[k]=temp;
			}
		}
		return target;
	}
	

}
