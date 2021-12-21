
package javaexample112recordsinrandomaccessfile;


public class TestArray {
    
    public static String[] names = new String[] {"Anna", "Samuel", "Ivar", "Emanuela"};
    
    public static int[] ages = new int[] {20, 32, 35, 18};
    
    public static int nameLength = 10;
    
    public static int InitialArrayLength = names.length;
            
            
    //==========================================================================
    
    public static void ShowStringArrayIntArray(String[] names, int[] ages) {
        
        System.out.println("Persons and their ages....");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + ages[i]);
        }
    }
    
    //==========================================================================
    
        
    private static String SetStringLength(String str, int length) {
        
        StringBuilder sb = new StringBuilder(str);
        
        for (int i = str.length(); i < length; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }
    
    public static String[] SetStringLengthForAllStringArrayItems(String[] array, int length) {
        String[] res = new String[array.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = SetStringLength(array[i], length);
        }
        return res;
    }
    
    //==========================================================================
}
