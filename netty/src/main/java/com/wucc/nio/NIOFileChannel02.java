package com.wucc.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileChannel02 {

    public static void main(String[] args) throws IOException {
       /* String str = "cccc,haha";
        //创建一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\0001.txt");*/

        File file = new File("d:\\0001.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel = fileInputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate((int)file.length());
        /*byteBuffer.put(str.getBytes());

        byteBuffer.flip();*/

        channel.read(byteBuffer);

        System.out.println(new String(byteBuffer.array()));



        fileInputStream.close();

    }
}
