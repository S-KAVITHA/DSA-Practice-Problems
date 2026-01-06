package com.stackqueue;

import java.util.ArrayList;
import java.util.List;
//1441. Build an Array With Stack Operations

public class BuildArrWithStk {
	public List<String> buildArray(int[] target, int n) {
	       List<String> list = new ArrayList<>();
	     int count = 1;
	        
	        int index=0,i=1;
	        while(i<=n && index<target.length){
	            list.add("Push");
	            if(target[index]==i){
	                index++;
	            }else{
	                list.add("Pop");
	            }
	            i++;
	        }
	        return list;
	    }
}
