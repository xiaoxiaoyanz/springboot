package algorithm.binaryHeap;

import java.util.Arrays;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-13 09:58
 */
public class UpAdjustHeap {

	/*
	* 只会上浮以childIndex这条线
	* */
	public static void upAdjustHeap(int[] array){
		int childIndex = array.length - 1;
		int parentIndex = (childIndex - 1)/2;

		int temp = array[childIndex];
		while (childIndex > 0 && temp < array[parentIndex]){
			array[childIndex] = array[parentIndex];
			childIndex = parentIndex;
			parentIndex = (parentIndex - 1)/2;
		}
		array[childIndex] = temp;
	}

	public static void main(String[] args) {
		int[] array = new int[] {1,3,2,6,5,7,8,9,10,0};
		upAdjustHeap(array);
		System.out.println(Arrays.toString(array));
	}
}
