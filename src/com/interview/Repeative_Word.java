package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repeative_Word {

	public static void repeativeword() {
		String s = "god god here here here where";
		String[] words = s.split(" ");
		Map<String, Integer> wordmap = new HashMap<String, Integer>();
		for (String string : words) {
			if (wordmap.containsKey(string)) {
				Integer it = wordmap.get(string);
				wordmap.put(string, it +1); 
			} else {
				wordmap.put(string, 1);
			}

			}
			//System.out.println("List of duplicate words");
			Set<java.util.Map.Entry<String, Integer>> entrySet = wordmap.entrySet();
			for (java.util.Map.Entry<String, Integer> entry : entrySet) {
				if (entry.getValue() > 1) {
					String key = entry.getKey();
					Integer value = entry.getValue();
					System.out.println(key + "=" + value);

				}
			}
		}

	

	public static void main(String[] args) {
		repeativeword();

	}

}
