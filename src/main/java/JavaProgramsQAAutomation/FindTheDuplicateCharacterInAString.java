package JavaProgramsQAAutomation;

import java.util.HashMap;

public class FindTheDuplicateCharacterInAString {

	public static void main(String[] args) {
		String sentance="TESTER";
		char[] sen=sentance.toCharArray();
		int con=1;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<sen.length;i++) {
			if(!map.containsKey(sen[i])) {
			map.put(sen[i], con);
		}else {
			map.put(sen[i], map.get(sen[i])+1);
		}
		}
		for(char m:map.keySet()) {
			if(map.get(m)>1) {
			System.out.println("Repeated Character: "+m+" ,Value: "+map.get(m));
			}
		}

	}

}
