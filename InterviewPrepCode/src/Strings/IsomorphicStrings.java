package Strings;

import java.util.HashMap;

public class IsomorphicStrings {
	
	public boolean isIsomorphic(String s, String t) {
	    if(s==null||t==null)
	        return false;
	 
	    if(s.length()!=t.length())
	        return false;
	 
	    HashMap<Character, Character> map = new HashMap<Character, Character>();
	 
	 
	    for(int i=0; i<s.length(); i++){
	        char c1 = s.charAt(i);
	        char c2 = t.charAt(i);
	 
	        if(map.containsKey(c1)){
	            if(map.get(c1)!=c2)// if not consistant with previous ones
	                return false;
	        }else{
	            if(map.containsValue(c2)) //if c2 is already being mapped
	                return false;
	            map.put(c1, c2);
	        }
	    }
	 
	    return true;
	}

	public static void main(String[] args){
		IsomorphicStrings a = new IsomorphicStrings();
		System.out.println(a.isIsomorphic("abc", "egg"));
		
		
		
	}
}
