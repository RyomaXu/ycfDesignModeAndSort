package com.ycf.sort;
/**
 * 归并排序
 * 思想：多次将两个或两个以上的有序表合并成一个新的有序表，核心在于先分解，再合并。
 * 其基本思路就是将数组分成二组A，B，如果这二组组内的数据都是有序的，
 * 那么就可以很方便的将这二组数据进行排序：可以将A，B组各自再分成二组。
 * 依次类推，当分出来的小组只有一个数据时，可以认为这个小组组内已经达到了有序，
 * 然后再合并相邻的二个小组就可以了。这样通过先递归的分解数列，再合并数列就完成了归并排序。
 * @author yan gui
 *
 */
public class MergeSort {
	/**
	 * @param target  目标数组
	 * @param low     第一个数字下标
	 * @param high    最后一个数字下标
	 * @return 排序好的数组
	 */
    public int[] sort(int[] target,int low,int high){
    	int middle;
    	if(low<high){
    		middle=(low+high)/2;
    		sort(target,low,middle);
    		sort(target,middle+1,high);
    		merge(target,low,middle,high);
    	}
    	return target;
    }

    /**
     * 归并排序中的合并算法
     * @param target  目标数组
     * @param low     第一个数字下标
     * @param middle  中间数字下标
     * @param high    最后一个数字下标
     */
	private void merge(int[] target, int low, int middle, int high) {
	    //临时存放的数组
		int[] nums=new int[target.length];
		//分为两个数组，第一个数组int[low...middle+1],第二个数组int[middle+1..high+1]
        for (int i = low, j=middle+1,k=0; k <= (high-low); k++) {
			//第一个数组结束，临时存放数组的值就交给第二数组
        	if(i==middle+1){
				nums[k]=target[j++];
				continue;
			}
        	//第二个数组结束，临时存放数组的值就交给第一数组
        	if(j==high+1){
        		nums[k]=target[i++];
        		continue;
        	}
        	//如果第一个数组的值比第二个组小，就将第一个数组的值存放在临时数组中，
        	//反之将第二个数组的值存放在临时数组中
        	if(target[i]<=target[j]){
        		nums[k]=target[i++];
        	}else{
        		nums[k]=target[j++];
        	}
		}
        
        //将临时数组的值传给原来的数组
        for (int i = low,j=0; i <= high; i++,j++) {
			target[i]=nums[j];
		}
		
	}
    
	
	public static void main(String[] args) {
			int[] nums={1,5,6,3,9999,6,88,33,22,111};
			MergeSort mergeSort=new MergeSort();
			mergeSort.sort(nums,0,nums.length-1);
			for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
	}
    
}
