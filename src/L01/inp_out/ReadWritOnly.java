package L01.inp_out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//import java.io.*;
public class ReadWritOnly {
    public static void writeFile(String fileName) {
        //		try write to the file
        try {
        /**public FileWriter(String fileName, boolean append) throws IOException
         Constructs a FileWriter object given a file name with a boolean
         indicating whether or not to append the data written.
         Parameters: fileName - String The system-dependent filename.
         append - boolean if true, then data will be written to the end
         of the file rather than the beginning.
         FileWriter is meant for writing streams of characters.
         For writing streams of raw bytes, consider using a FileOutputStream.

         */
            FileWriter fw = new FileWriter(fileName, false);
            PrintWriter outs = new PrintWriter(fw);
            outs.println("the first string: java, C++ ");
            outs.println("the second string: geometria analitit");
            outs.close();
            fw.close();
        } catch (IOException ex) {
            System.out.print("Error writing file\n" + ex);
        }
    }

    public static void readFile(String fileName) {
        //		 try read from the file
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String str;
            str = br.readLine();
            System.out.println(0 + ") " + str);
            for (int i = 1; str != null; i = i + 1) {
                str = br.readLine();
                if (str != null) {
                    System.out.println(i + ") " + str);
                }
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            System.out.print("Error reading file\n" + ex);
            System.exit(2);
        }
    }

    public static void consoleRead() {
        BufferedReader keyboard;
        String s = new String();
        keyboard = new BufferedReader(new InputStreamReader(System.in));
        while (!s.equals("exit")) {
            System.out.println("get line");
            try {
                s = keyboard.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("error");
            }
            System.out.println(s);
        }
        System.out.println("bye-bye");
    }

    public static void main(String[] args) {
        String name = "MyFile.txt";
        writeFile(name);
        readFile(name);
        //consoleRead();
    }
}
