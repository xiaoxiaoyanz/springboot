package com.wucc.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-30 14:52
 */
public class No1TwoNumTotal {


	private final static Map<Integer,Integer> tempMap = new HashMap<Integer, Integer>(100);
	public static void main(String[] args) {

		int[] array = new int[]{12,34,465,12,123,456,234};
		int[] twoNumTotal = twoNumTotal(array, 24);
		System.out.println(Arrays.toString(twoNumTotal));

	}


	public static int[] twoNumTotal(int[] array,Integer target){
		int length = array.length;
		int i = 0;
		while (i<length){
			int value = target - array[i];
			if(tempMap.containsKey(value)){
				return new int[]{tempMap.get(value),i};
			}else {
				tempMap.put(array[i],i);
			}
			i++;
		}
		System.out.println("无匹配值");
		return new int[]{};

	}



}
