
package javaexample112recordsinrandomaccessfile;

import java.io.File;
import java.io.RandomAccessFile;


public class Write {
    
    
    public static void Run(File fil, String[] array, int[] vector) {
        
        try{
            
            RandomAccessFile raf = new RandomAccessFile(fil, "rw");
            
            // make all names in array with the same length
            String[] names = TestArray.SetStringLengthForAllStringArrayItems(array, TestArray.nameLength);
            
            // writing....
            for (int i = 0; i < names.length; i++) {
                raf.writeChars(names[i]);
                raf.writeInt(vector[i]);
            }
            
            // close
            raf.close();
            
            System.out.println("Writing completed....");
            
        }// end-try
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    //==========================================================================
    
    public static void RunOneIntValue(File fil, long position, int val) {
        
        try{
            RandomAccessFile raf = new RandomAccessFile(fil, "rw");
            
            // place pointer at pos
            raf.seek(position);
            
            // writing
            raf.writeInt(val);
            
            // close
            raf.close();
            
            //
            System.out.println("Writing completed....");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
