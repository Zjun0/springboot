package com.zj.springboot.common.utils;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author: zj
 * @date: ${date}
 */
public class MyUtil {
    private MyUtil() {
        throw new AssertionError();
    }

    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T clone(T obj) throws Exception {

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bout);
        oos.writeObject(obj);

        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bin);
        return (T) ois.readObject();

        // 说明：调用ByteArrayInputStream或ByteArrayOutputStream对象的close方法没有任何意义
        // 这两个基于内存的流只要垃圾回收器清理对象就能够释放资源，这一点不同于对外部资源（如文件流）的释放
    }

    /**
     * 统计给定文件中给定字符串的出现次数
     * @param filsname 文件名
     * @param word 字符串
     * @return 字符串在文件中出现的次数
     */
    public static int countWordInFile(String filsname, String word){
        int counter = 0;
        try (FileReader fr = new FileReader(filsname)){
            try(BufferedReader  br = new BufferedReader(fr)){
                String line = null;
                while((line = br.readLine())!= null){
                    int index = -1;
                    while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0){
                        counter++;
                        line = line.substring(index + word.length());
                    }
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return counter;
    }

    /**
     * 编程实现文件拷贝
     * @param source
     * @param target
     * @throws IOException
     */
    public static void fileCopy(String source, String target)throws IOException{
        try(InputStream in = new FileInputStream(source)){
            try(OutputStream out = new FileOutputStream(target)) {
                byte[] buffer = new byte[4096];
                int bytesToRead;
                while ((bytesToRead = in.read(buffer)) != -1){
                    out.write(buffer,0 ,bytesToRead);
                }
            }
        }
    }

    /**
     * 编程实现文件拷贝
     * @param source
     * @param target
     * @throws IOException
     */
    public static void fileCopyNIO(String source,String target)throws IOException{
        try(FileInputStream in = new FileInputStream(source)){
            try(FileOutputStream out = new FileOutputStream(target)){
                FileChannel inChannel = in.getChannel();
                FileChannel outChannel = out.getChannel();
                ByteBuffer buffer = ByteBuffer.allocate(4096);
                while (inChannel.read(buffer)!=-1){
                    buffer.flip();
                    outChannel.write(buffer);
                    buffer.clear();
                }
            }
        }
    }
}
