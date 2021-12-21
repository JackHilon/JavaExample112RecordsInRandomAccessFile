/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample112recordsinrandomaccessfile;

import java.io.File;
import java.io.RandomAccessFile;

/**
 *
 * @author marka
 */
public class Read {
    
    public static void RunWholeFile(File fil) {
        try{
            
            RandomAccessFile raf = new RandomAccessFile(fil, "r");
            
            String[] names = new String[TestArray.InitialArrayLength];
            int[] ages = new int[TestArray.InitialArrayLength];
            
            char charTemp;
            StringBuilder sb = null;
            
            for (int i = 0; i < TestArray.InitialArrayLength; i++) {
                
                sb = new StringBuilder();
                
                for (int j = 0; j < TestArray.nameLength; j++) {
                    charTemp = raf.readChar();
                    sb.append(charTemp);
                }// end-for
                
                // removing leading and trailing whitespace.
                names[i] = sb.toString().trim();
                
                ages[i] = raf.readInt();
            }// end-for
            
            System.out.println("Random Access File......");
            TestArray.ShowStringArrayIntArray(names, ages);
            
            // close
            raf.close();
        }// end-try
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    //==========================================================================
    
    
    
}
