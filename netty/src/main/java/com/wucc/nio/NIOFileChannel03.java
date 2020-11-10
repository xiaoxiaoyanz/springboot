package com.wucc.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileChannel03 {

    public static void main(String[] args) throws IOException {


        File file = new File("d:\\0001.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel = fileInputStream.getChannel();



        FileOutputStream fileOutputStream = new FileOutputStream("d:\\0002.txt");
        FileChannel channel1 = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        while (true){
            byteBuffer.clear();
            int read = channel.read(byteBuffer);
            if (read == -1){
                break;
            }
            byteBuffer.flip();
            channel1.write(byteBuffer);
        }


        fileOutputStream.close();
        fileInputStream.close();


    }
}
