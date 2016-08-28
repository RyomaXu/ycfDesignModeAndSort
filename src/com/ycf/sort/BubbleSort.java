package com.ycf.sort;
/**
 * 冒泡排序
 * @author yan gui
 *
 */
public class BubbleSort {
    public int[] sort(int[] target){
    	for(int i=0;i<target.length;i++){
    		for(int j=0;j<i;j++){
    			if(target[j]>target[i]){
    				//交换两个数的位置
    				int temp=target[j];
    				target[j]=target[i];
    				target[i]=temp;
    			}
    		}
    	}
    	return target;
    }
    
    public static void main(String[] args) {
		int[] nums={1,5,6,3,88,33};
		BubbleSort bubbleSort=new BubbleSort();
		bubbleSort.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
