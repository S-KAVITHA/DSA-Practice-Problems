package com.crackcoding;

public class TopKWords {
	//692. Top K Frequent Words. Words of same frequency only should be sorted.
	
	 public List<String> topKFrequent(String[] words, int k) {
	     
	        List<String> result = new ArrayList<>();
		        HashMap<String,Integer> map = new HashMap<>();
		        int maxfreq = 0;
		        
		        for (String word:words){
		            int freq = map.getOrDefault(word,0)+1;
		            
		            map.put(word,freq);
		            maxfreq = Math.max(maxfreq,freq);
		            
		        }
	        
	        List<String>[] bucket = new ArrayList[maxfreq+1];
	        
	        for(Map.Entry<String, Integer> m : map.entrySet()){
	            int freq = m.getValue();
	            
	            if (bucket[freq] == null)
	                bucket[freq] = new ArrayList<>();
	              bucket[freq].add( m.getKey());
	        }
	        
	        List<String> res = new ArrayList(); int j=0;
	        for (int i= bucket.length -1 ; i >= 0;i--){
	            if (bucket[i] != null){
	            	
	            	//Words of same frequency only should be sorted. dont do sort of filal res 
	            	// becoz it sorts entire array. words with high frequency shd come first.
	                 Collections.sort(bucket[i]);
	                for (String n: bucket[i]){
	                    res.add(n); j++;
	                     if (j == k){  
	                       System.out.println(res); 
		               
	                          System.out.println(res);
	         return res;}
	                }
	            }
	        }
	       
	         return res;
	    }
}
