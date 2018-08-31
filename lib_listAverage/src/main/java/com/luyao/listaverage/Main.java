package com.luyao.listaverage;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 描述：执行"java -jar moduleAppFactory.jar User -d [] -t ./"
 * -d:在app/build.gradle下添加依赖
 * -t:指定生成的目标目录，默认在当前目录下
 *
 * @author luyao
 * @date 2018/5/3
 */
public class Main {
    public static final String ENCODE_FORMAT = "utf-8";

    public static void main(String[] args) {
        String filePath = "F:\\fps_test_utils\\glide\\fps_list_duration.txt";
        int targetIndex = 11;
        for (int i = 0; i < args.length; i++) {
            filePath = args[0].trim();
            targetIndex = Integer.valueOf(args[1].trim());
        }
        BufferedReader bufReader = null;
        try {
            File file = new File(filePath);
            if (!file.exists() || !file.isFile()) {
                System.out.println("error! 需要修改的文件不存在: " + filePath);
                System.exit(-1);
            }
            bufReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), ENCODE_FORMAT));//数据流读取文件
            StringBuffer strBuffer = new StringBuffer();
            float sumNum = 0;
            int lineNum = 0;
            for (String temp = null; (temp = bufReader.readLine()) != null; temp = null) {
                String[] strings = temp.split("\\s+");
                float target = Float.valueOf(strings[targetIndex]);
                sumNum += target;
                lineNum++;
                System.out.println("num : " + target);
            }
            System.out.println("--------  average : " + (sumNum/lineNum) + "  |  num : " + lineNum + "  --------");
        } catch (IOException e) {
            System.out.println("IO异常！！！");
            e.printStackTrace();
        } finally {
            if (bufReader != null) {
                try {
                    bufReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
