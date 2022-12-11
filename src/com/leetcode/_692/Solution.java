package com.leetcode._692;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Solution {
	public List<String> topKFrequent(String[] words, int k) {
		List<String> result = new ArrayList<>();
		Map<String, Integer> eachWordOccurrence = new TreeMap<>();
		int countOccurrence;

		for (String word : words) {
			if (eachWordOccurrence.get(word) != null) {
				countOccurrence = eachWordOccurrence.get(word);
				eachWordOccurrence.put(word, countOccurrence + 1);
			} else {
				eachWordOccurrence.put(word, 1);
			}
		}

		//System.out.println(eachWordOccurrence);

		Set<String> keys = eachWordOccurrence.keySet();
		Iterator<String> keysItr = keys.iterator();

		while (keysItr.hasNext()) {			
			if (result.isEmpty())
				result.add(keysItr.next());
			else {
				int topValue = eachWordOccurrence.get(result.get(0));
				String currentKey = keysItr.next();
				int currentValue = eachWordOccurrence.get(currentKey);

				if (topValue < currentValue)
					result.add(0, currentKey);
				else {
					boolean flag = false;
					for (int i = 1; i < k & i < result.size(); i++) {
						int listIndexValue = eachWordOccurrence.get(result.get(i));
						if (listIndexValue < currentValue) {
							result.add(i, currentKey);
							flag = true;
							break;
						}

					}
					if(!flag)
						result.add(currentKey);
				}
				//System.out.println(result);
			}
		}

		return result.subList(0, k);
	}
}
