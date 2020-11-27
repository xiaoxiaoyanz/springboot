package com.wucc.lesson0.fanxing;



import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-25 16:54
 */
public class Demo02<K,V> {

   public void m1(Demo02<K,V> demo02){
	   System.out.println(demo02.getClass());
   }

	public static void main(String[] args){
		System.out.println("=======================");
		Demo02<String,Integer> demo02 = new Demo02<>();
		demo02.m1(demo02);

	}


}
