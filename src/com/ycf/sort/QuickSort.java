package com.ycf.sort;
/**
 * 快速排序
 * 思想：它是由冒泡排序改进而来的。在待排序的n个记录中任取一个记录(通常取第一个记录),
 * 把该记录放入适当位置后,数据序列被此记录划分成两部分。所有关键字比该记录关键字小的记录
 * 放置在前一部分,所有比它大的记录放置在后一部分,并把该记录排在这两部分的中间(称为该记录归位),
 * 这个过程称作一趟快速排序。
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





}
