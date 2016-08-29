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
    
}
