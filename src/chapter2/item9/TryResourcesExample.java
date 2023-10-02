package chapter2.item9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TryResourcesExample {
    public static void main(String[] args) {
        try (
            FileInputStream is = new FileInputStream("/Users/yuseon/study/test.txt");
            BufferedInputStream bis = new BufferedInputStream(is);
        ){
            int n = -1;
            while ((n = bis.read()) != -1) {
                System.out.print((char) n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
