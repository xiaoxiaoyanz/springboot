package com.wucc.lesson0.fanxing.interfacecommon;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;

public interface Ontype extends Type, GenericDeclaration {
	default String getString(){
		return getTypeName();
	}
}
