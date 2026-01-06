package PracticePgms;

public class Callbyvalue{  
 int data=50;  
  
 void change(int data){  
	 data=data+100;
	 System.out.println("claculation "+ data );//changes will be in the local variable only  
  
 }
 
 public static void main(String args[]){  
   Callbyvalue op=new Callbyvalue();  
  
   System.out.println("before change "+op.data);  
   op.change(500);  
   System.out.println("after change "+op.data);  
  
 }  
}