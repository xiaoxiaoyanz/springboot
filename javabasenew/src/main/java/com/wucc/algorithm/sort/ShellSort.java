package com.wucc.algorithm.sort;

import java.util.Arrays;

/**
 * <p>
 *希尔排序
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-15 09:09
 */
public class ShellSort {

	public static void shellSort(int[] array){
		int length = array.length;
		//分组
		for(int i = length/2;i > 0;i/=2){
			//对每一组进行插入排序
			for(int j = i ;j< length;j++){
				int insert = array[j];
				int k = j - i;
				for(;k>=0&&insert<array[k];k-=i){
					array[k+i] = array[k];
				}
				array[k+i] = insert;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = new int[]{12,2345,234,435,234,45,23,45,234,45,67,87,45,8,456,6,45};
		shellSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void shellsort01(int[] array){
		int length = array.length;

		for(int i = length/2;i>0;i++){

			for(int j = i;j<length;j++){
				int insert = array[j];
				int k = j - i;
				for(;k>=0&&array[k]>insert;k-=i){
					array[k+i] = array[k];
				}
				array[k+i] = insert;
			}
		}
	}
}
