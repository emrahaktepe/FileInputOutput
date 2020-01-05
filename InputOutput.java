package com.First;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {



        try {
            File file = new File("Cars.txt");
//            Scanner scan = new Scanner(file);
//
//            List<String> list = new ArrayList();
//            while (scan.hasNextLine()) {
//                list.add(scan.nextLine());
//            }
//            System.out.println(list);

            //  This way the file is created from zero deleting the info already in it
//

            BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
            PrintWriter print = new PrintWriter(out);
            print.println();
            print.println("TOGG");
            print.close();

        } catch (FileNotFoundException e)   {
            System.out.println("File does not exist!");
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }


    }
}
