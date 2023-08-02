package com.jap.ballad;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ballad {
    public String readPoemFromAFile(String fileName){
       // Write the logic to read from a file
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);

            int i = 0;
            String s =" ";
            while ((i=fileInputStream.read())!=-1)
            {
                char a =(char)i;
                s = s.concat(String.valueOf(a));
            }
            return s.replaceAll("\r","");
        }
        catch (IOException e)
        {
            return String.valueOf(e);
        }

    }
}
