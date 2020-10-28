package algorithm.sort;

import java.util.Arrays;

/**
 * <p>
 *选择排序
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-17 14:23
 */
public class SelectSort {

	public static void selectSort(int[] array){
		int length = array.length;
		for(int i = 0;i<length - 1;i++){
			int minIndex = i;
            for(int j = i+1; j < length ; j++){
                 if(array[j]<array[minIndex]){
                 	minIndex = j;
				 }
			}
           swap(array,minIndex,i);
		}
	}

	private static void swap(int[] array, int minIndex, int i) {
		int temp = array[minIndex];
		array[minIndex] = array[i];
		array[i] =temp;
	}

	public static void main(String[] args) {
		int[] array = new int[]{12,34,34,5,567,768,56,34,34,56,3};
		selectSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void selectSort01(int[] array){
		int length = array.length;
		for(int i = 0;i < length - 1;i++){
			int minIndex = i;
			for(int j = i + 1;j<length;j++){
				if (array[j] < array[i]){
					minIndex = j;
				}
			}
			if (minIndex != i){
				swap(array,minIndex,i);
			}

		}
	}



}
