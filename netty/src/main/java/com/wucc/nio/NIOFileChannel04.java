package com.wucc.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class NIOFileChannel04 {

    public static void main(String[] args) throws IOException {


        File file = new File("d:\\wucc.jpg");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel = fileInputStream.getChannel();



        FileOutputStream fileOutputStream = new FileOutputStream("d:\\wucc01.jpg");
        FileChannel channel1 = fileOutputStream.getChannel();

        channel1.transferFrom(channel,0,channel.size());

//        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
//
//        while (true){
//            byteBuffer.clear();
//            int read = channel.read(byteBuffer);
//            if (read == -1){
//                break;
//            }
//            byteBuffer.flip();
//            channel1.write(byteBuffer);
//        }


        fileOutputStream.close();
        fileInputStream.close();


    }
}
