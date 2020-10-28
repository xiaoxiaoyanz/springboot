package algorithm.sort;

import java.util.Arrays;

/**
 * <p>
 *归并排序
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-20 10:53
 */
public class MergeSort {

	public static void mergeSort(int[] array,int[] temp,int left,int right){
		if(left < right){
			int center = (left + right)/2;
			mergeSort(array,temp,left,center);
			mergeSort(array,temp,center+1,right);
			merge(array,temp,left,center,right);
		}
	}

	private static void merge(int[] array, int[] temp, int left, int center, int right) {
		int i = left;
		int j = center + 1;
		//两个有序数组如何进行合并
		for(int k = left;k <= right;k++){
			if( i > center){
				temp[k] =array[j++];
			}else if(j > right){
				temp[k] =array[i++];
			}else if(array[i] < array[j]){
				temp[k] =array[i++];
			}else{
				temp[k] =array[j++];
			}
		}
		for (int k = left;k<= right;k++){
			array[k] = temp[k];
		}
	}

	public static void main(String[] args) {
		int[] array = new int[]{12,34,234,3245,23,3,657,567,43,43,443,567,234,657};
		int[] temp = new int[array.length];
		mergeSort(array,temp,0,array.length -1);
		System.out.println(Arrays.toString(array));

		int[] array01 = new int[]{5,8,2,9};
		int[] temp01 = new int[array01.length];
		int center = (0+ array01.length - 1)/2;
		merge01(array01,temp01,0,center, array01.length-1);
		System.out.println(Arrays.toString(array01));
	}


	public static void merge01(int[] array,int[] temp,int left,int center,int right){
		int i = left;
		int j = center + 1;
		for(int k = left;k<=right;k++){
			if(i > center){
				temp[k] = array[j++];
			}else if(j > right){
				temp[k] = array[i++];
			}else if(array[i] < array[j]){
				temp[k] = array[i++];
			}else{
				temp[k] = array[j++];
			}
		}
		for (int k = left;k<=right;k++){
			array[k] = temp[k];
		}
	}

}
