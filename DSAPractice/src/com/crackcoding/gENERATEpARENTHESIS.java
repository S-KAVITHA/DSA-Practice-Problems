package com.crackcoding;

public class gENERATEpARENTHESIS {
	private List<String> result;
	public List<String> generateParenthesis(int n) {
	    
	    result = new ArrayList<String>();
	    back("", 0, 0, n);
	    return result;
	}

	public void back(String str, int left, int right, int max) {
	    
	    if(right == max) {
	        result.add(str);
	        return;
	    }
	    
	    if(left < max) {
	        StringBuilder sb = new StringBuilder(str);
	        sb.append("(");
	        back(sb.toString(), left+1, right, max);
	    }
	    
	    if(left > right) {
	        StringBuilder sb = new StringBuilder(str);
	        sb.append(")");
	        back(sb.toString(), left, right+1, max);
	    }
	}
}
