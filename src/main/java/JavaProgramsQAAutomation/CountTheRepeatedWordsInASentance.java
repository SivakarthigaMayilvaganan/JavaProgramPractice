package JavaProgramsQAAutomation;

import java.util.HashMap;

public class CountTheRepeatedWordsInASentance {

	public static void main(String[] args) {
		String sentence="I am a Tester QA Automation Tester Tester";
		String[] sen=sentence.split(" ");
		int con=1;
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<sen.length;i++) {
			if(!map.containsKey(sen[i])) {
			map.put(sen[i], con);
		}else {
			map.put(sen[i], map.get(sen[i])+1);
		}
		}
		for(String m:map.keySet()) {
			if(map.get(m)>1) {
			System.out.println("Repeated Words: "+m+" ,Value: "+map.get(m));
			}
		}
	}

}
