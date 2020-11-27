package com.wucc.lesson0.fanxing;

import com.wucc.lesson0.fanxing.type.Demo01;
import com.wucc.lesson0.fanxing.type.Demo02;
import com.wucc.lesson0.fanxing.type.DemoInter01;
import com.wucc.lesson0.fanxing.type.DemoInter02;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-25 14:56
 */
public class FanXing <T1,T2 extends Integer,T3 extends DemoInter02 & DemoInter01>{

	public <T1,t2 extends Integer,T3 extends DemoInter02 & DemoInter01> T3 test01(T1 t1,T2 t2,T3 t3,String s){

		return t3;


	}
}
