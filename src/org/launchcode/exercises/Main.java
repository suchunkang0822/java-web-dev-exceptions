package org.launchcode.exercises;

import org.launchcode.Temperature.Temperature;
import org.launchcode.Temperature.TemperatureException;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
//        Divide(4,2);
//        Divide(4,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println(CheckFileExtension("adsfasdf"));

    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        try{
            System.out.println(x/y);
        }catch(ArithmeticException e){
            e.printStackTrace();
    }
    }

    public static int CheckFileExtension(String fileName)
    {
        try{
            if(fileName == null){
                throw new TemperatureException("The file name is null");
            }else if(fileName.isEmpty()){
                throw new TemperatureException("The file name is empty");
            }
        }catch(TemperatureException e){
            e.printStackTrace();
            return -1;
        }
        if(fileName.substring(fileName.length()-5).equals(".java")){
            return 1;
        }
        return 0;
    }

}
