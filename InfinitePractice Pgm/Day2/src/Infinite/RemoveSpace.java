package Infinite;

public class RemoveSpace {
	
	public static void main(String[] args) {    
        
        String str1="Welcome to Java Programming";    
            
        //Removes the white spaces using regex    
        str1 = str1.replaceAll("\\s+", "");    
            
        System.out.println("String after removing all the white spaces : " + str1);    
    }    

}
