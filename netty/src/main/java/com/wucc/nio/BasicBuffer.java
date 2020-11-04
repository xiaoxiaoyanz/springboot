package com.wucc.nio;

import java.nio.IntBuffer;

public class BasicBuffer {
    public static void main(String[] args) {
        //创建一个buffer
        IntBuffer intBuffer = IntBuffer.allocate(5);

       /* intBuffer.put(10);
        intBuffer.put(11);
        intBuffer.put(12);
        intBuffer.put(13);
        intBuffer.put(14);*/

        for(int i = 0;i<intBuffer.capacity();i++){
            intBuffer.put(i*2);
        }

        intBuffer.flip();
        while (intBuffer.hasRemaining()){
            System.out.println(intBuffer.get());
        }

    }
}
