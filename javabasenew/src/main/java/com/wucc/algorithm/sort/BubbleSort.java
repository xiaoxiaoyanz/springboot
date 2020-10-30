package com.wucc.algorithm.sort;

import java.util.Arrays;

/**
 * <p>
 * 冒泡排序
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-13 10:45
 */
public class BubbleSort {

	/*
	* 时间复杂度:O(n2)
	* 是稳定性的
	* */
	public static void bubbleSort(int[] array){
		int length = array.length;
		for (int i = 0;i< length - 1;i++){
			for(int j = 0; j < length - 1 - i;j++){
				if(array[j] > array[j+1]){
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}

		}
	}

	public static void main(String[] args) {
		int[] array = new int[]{1,234,34,23423,234,456,2,23,654,34,567,34,456,34,56,67,5,34};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}
