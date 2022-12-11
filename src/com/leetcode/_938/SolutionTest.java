package com.leetcode._938;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class SolutionTest {

	private Solution solutionObject;
	private TreeNode root;

	@BeforeAll
	void setUpBeforeClass() throws Exception {
		solutionObject = new Solution();
	}

	@AfterAll
	void tearDownAfterClass() throws Exception {
		solutionObject = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		root = null;
	}

	@AfterEach
	void tearDown() throws Exception {
		root = null;
	}

	@Test
	void testSample1() {
		Integer[] vals = { 10, 5, 15, 3, 7, null, 18 };

		for (Integer val : vals)
			if (val != null)
				root = Main.insertElementsInBST(root, val);

		Assertions.assertEquals(32, solutionObject.rangeSumBST(root, 6, 15));

	}

	@Test
	void testSample2() {
		Integer[] vals = { 10, 5, 15, 3, 7, 13, 18, 1, null, 6 };

		for (Integer val : vals)
			if (val != null)
				root = Main.insertElementsInBST(root, val);

		Assertions.assertEquals(23, solutionObject.rangeSumBST(root, 6, 10));

	}

}
