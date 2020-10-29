package chap16;
//ファイルをコピーする

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        FileReadWrite r = new FileReadWrite();
        r.dataInOut();
    }

    void dataInOut() {   //一文字ずつコピー
        int c;

        try (FileReader filein = new FileReader("Hello.java"); //入力ストリーム
             FileWriter fileout = new FileWriter("Back.java");) //出力ストリーム
        {
            while ((c = filein.read()) != -1) {//ファイルの最後まで1文字読み、
                fileout.write(c);       //それを書き出す
            }
        } catch (IOException error) {
            System.out.println("IOエラー発生");
        }
    }
}


