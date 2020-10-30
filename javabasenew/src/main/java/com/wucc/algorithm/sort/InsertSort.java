package com.wucc.algorithm.sort;

import java.util.Arrays;

/**
 * <p>
 *插入排序
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-14 13:26
 */
public class InsertSort {

	public static void insertSort(int[] array){
		int length = array.length;
		for (int i = 1;i< length;i++ ){
			int temp = array[i];
			int j =i-1;

			for (;j>=0&&array[j]>temp;j--){
				array[j+1] = array[j];
			}
			array[j+1] = temp;

		}
	}

	public static void main(String[] args) {
		int[] array = new int[]{23,34,45,45,567,56,2,354,234,234,5,34,546,345};
		insertSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void insertSort01(int[] array){
		int length = array.length;
		for(int i = 1;i<length;i++){
			int insert = array[i];
			int j = i - 1;
			for(;j>=0&&array[j]>insert;j--){
				array[j+1] =array[j];
			}
			array[j+1] =insert;
		}

	}

}
