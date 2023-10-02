package chapter2.item9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchExample {
    public static void main(String[] args) throws IOException {
        FileInputStream is = null;
        BufferedInputStream bis = null;
        try {
            is = new FileInputStream("/Users/yuseon/study/test.txt");
            bis = new BufferedInputStream(is);

            int n = -1;
            while ((n = bis.read()) != -1) {
                System.out.print((char) n);
            }
        }finally {
            if (is != null) {
                is.close();
            }

            if (bis != null) {
                bis.close();
            }
        }
    }
}
