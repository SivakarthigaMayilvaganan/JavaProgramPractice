package JavaProgramsQAAutomation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ConvertHashMapToArrayList {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("Siva", "manager");
		map.put("Karthiga", "Senior manager");
		map.put("roja", "SSE");
		map.put("raja", "SE");

		ArrayList<String> list = new ArrayList<String>(map.keySet());
		System.out.println("map Kays are:");
		for (String x : list) {
			System.out.println(x);
		}
		ArrayList<String> list2 = new ArrayList<String>(map.values());
		System.out.println("map values are:");
		for (String y : list2) {
			System.out.println(y);
		}
	}

}
