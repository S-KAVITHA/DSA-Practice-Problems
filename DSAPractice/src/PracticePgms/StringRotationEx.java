package PracticePgms;


public class StringRotationEx {  
    public static boolean checkRotation(String st1, String st2) {  
        if (st1.length() != st2.length()) {  
            return false;  
        }  
        String st3 = st1 + st1;  
        System.out.println(st3);
        if (st3.contains(st2))  
            return true;  
        else  
            return false;  
    }  
   
    public static void main(String[] args) {  
        String str1 = "java";  
        String str2 = "vaja";  
        System.out.println("Checking if a string is rotation of another");  
        if (checkRotation(str1, str2)) {  
            System.out.println("Yes " + str2 + " is rotation of " + str1);  
        } else {  
            System.out.println("No " + str2 + " is not rotation of " + str1);  
        }  
    }  
}  