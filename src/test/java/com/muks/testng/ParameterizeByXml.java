package com.muks.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.*;

/**
 * Created by mukthar.ahmed on 4/16/16.
 */
public class ParameterizeByXml {

    @Test
    @Parameters(value="number")
    public void parameterIntTest(int number) {
        System.out.println("Parameterized Number is : " + number);
    }


    @Test
    @Parameters({ "dbconfig", "poolsize" })
    public void createConnection(String dbconfig, int poolsize) {

        System.out.println("dbconfig : " + dbconfig);
        System.out.println("poolsize : " + poolsize);


        String file = ParameterizeByXml.class.getClassLoader().getResource(dbconfig).getFile();
        System.out.println("# File = "+ file);

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)) );

            System.out.println("# Reading config file:");
            String line;
            while ( (line = bufferedReader.readLine()) != null) {
                System.out.println("# Line = " + line);
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
