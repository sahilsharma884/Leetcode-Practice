package com.leetcode._692;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class SolutionTest {
	
	private Solution solutionObject;
	
	@BeforeAll
	void createSolutionObject() {
		solutionObject = new Solution();
	}

	@Test
	void testSample1() {
		String[] words = {"i","love","leetcode","i","love","coding"};
		int k = 2;
		List<String> expected = Arrays.asList("i","love");
		List<String> actual = solutionObject.topKFrequent(words, k);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testSample2() {
		String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
		int k=4;
		List<String> expected = Arrays.asList("the","is","sunny","day");
		List<String> actual = solutionObject.topKFrequent(words, k);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testSample3() {
		String[] words = {"i","love","leetcode","i","love","coding"};
		int k = 3;
		List<String> expected = Arrays.asList("i","love","coding");
		List<String> actual = solutionObject.topKFrequent(words, k);
		Assertions.assertEquals(expected, actual);
	}
	
}
