package algorithm.sort;

import java.util.Arrays;

/**
 * <p>
 *快速排序
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-21 13:53
 */
public class QuickSort {

	public static void quickSort(int[] array,int low,int high){
		if(low < high){
			int j =partition(array,low,high);
			quickSort(array,low,j-1);
			quickSort(array,j+1,high);
		}
	}

	private static int partition(int[] array, int low, int high) {
		int i = low;
		int j = high + 1;

		int v = array[low];
		while (true){
			while (array[++i]<v){
				if(i == high){
					break;
				}
			}
			while ((array[--j]>v)){
				if(j == low){
					break;
				}
			}

			if(i >= j){
				break;
			}
			swap(array, i, j);
		}
		swap(array,low,j);
		return j;
	}

	private static void swap(int[] array, int i, int j) {

		int temp = array[i];
		array[j] = array[i];
		array[i] = temp;
	}

	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,43,23,123,34,6,4,23,12,456,234345};
		quickSort(array,0,array.length - 1);
		System.out.println(Arrays.toString(array));
	}
}
