package com.wucc.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileChannel01 {

    public static void main(String[] args) throws IOException {
        String str = "cccc,haha";
        //创建一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\0001.txt");
        FileChannel channel = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put(str.getBytes());

        byteBuffer.flip();

        channel.write(byteBuffer);
        fileOutputStream.close();

    }
}
