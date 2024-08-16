package JavaProgramsQAAutomation;

import java.util.LinkedHashMap;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String sentance="JAVA";
		char[] sen=sentance.toCharArray();
		int con=1;
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<sen.length;i++) {
			if(!map.containsKey(sen[i])) {
			map.put(sen[i], con);
		}else {
			map.put(sen[i], map.get(sen[i])+1);
		}
		}
		for(char m:map.keySet()) {
			if(map.get(m)==1) {
			System.out.println("Non Repeated Character: "+m);
			break;
			}
		}

	}

}
