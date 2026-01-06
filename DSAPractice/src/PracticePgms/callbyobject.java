package PracticePgms;

public class callbyobject{  
 int data=50;  
  
 void change(callbyobject op){  
 op.data=op.data+100;//changes will be in the instance variable  
 }  
     
    
 public static void main(String args[]){  
   callbyobject op=new callbyobject();  
  
   System.out.println("before change "+op.data);  
   op.change(op);//passing object  
   System.out.println("after change "+op.data);  
  
 }  
}  