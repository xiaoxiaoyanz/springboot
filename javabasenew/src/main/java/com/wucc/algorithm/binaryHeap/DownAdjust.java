package com.wucc.algorithm.binaryHeap;

import java.util.Arrays;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-13 10:17
 */
public class DownAdjust {

	public static  void downAdjust(int[] array,int parentIndex,int length){
		int temp = array[parentIndex];
		int childIndex = parentIndex*2 + 1;
		while (childIndex < length){
			if ( childIndex + 1 < length && array[childIndex + 1] < array[childIndex]){
				childIndex++;
			}
			if(temp <= array[childIndex]){
				break;
			}
			array[parentIndex] = array[childIndex];
			parentIndex = childIndex;
			childIndex = 2*childIndex + 1;
		}
		array[parentIndex] = temp;
	}

	public  static void buildHeap(int[] array){
		for(int i = (array.length - 2)/2;i >= 0;i--){
			downAdjust(array,i,array.length);
		}
	}

	public static void main(String[] args) {
		int[] array = new int[]{3,545,23,12,45,34,23,123,12,5,35,65,45,2,4,0};
		buildHeap(array);
		System.out.println(Arrays.toString(array));
	}
}
