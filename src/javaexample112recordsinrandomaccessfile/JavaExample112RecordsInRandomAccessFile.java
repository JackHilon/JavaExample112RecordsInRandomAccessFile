
package javaexample112recordsinrandomaccessfile;

import java.io.File;


public class JavaExample112RecordsInRandomAccessFile {

    
    public static void main(String[] args) {
        
        
        File fil = myHelper.CreateFile("myWorkingFolder", "myRandomAccessFil.dat");
        
        try{
            
            TestArray.ShowStringArrayIntArray(TestArray.names, TestArray.ages);
            
            Write.Run(fil, TestArray.names, TestArray.ages);
            
            //------------------------------------------------------------------
            
            // write at place the pointer in front of age in the third record
            long pos = 2 * (10 * 2 + 4) + 10 * 2;
            int value = 36;
            Write.RunOneIntValue(fil, pos, value);
            
            //------------------------------------------------------------------
            
            // read file
            Read.RunWholeFile(fil);
            
            //------------------------------------------------------------------
            
            myHelper.DeleteFile(fil);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}
