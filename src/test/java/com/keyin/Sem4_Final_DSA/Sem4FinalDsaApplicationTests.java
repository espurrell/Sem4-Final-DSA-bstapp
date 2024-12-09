package com.keyin.Sem4_Final_DSA;

import com.keyin.Sem4_Final_DSA.service.TreeService;
import com.keyin.Sem4_Final_DSA.trees.BinaryNode;
import com.keyin.Sem4_Final_DSA.trees.BinaryNodeConverter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.keyin.Sem4_Final_DSA.repository.TreeRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Sem4FinalDsaApplicationTests {

	@Autowired
	TreeRepository repository;

	@Autowired
	TreeService binarySearchTreeService;

	@Test
	void contextLoads() {
		assertNotNull(repository);
		assertNotNull(binarySearchTreeService);
	}

	@Test
	void getBinarySearchTreeByIdReturnsBinarySearchTree() {
		int id = 101;

		BinarySearchTree tree = binarySearchTreeService.getBinarySearchTreeById(id);

		assertNotNull(tree, "Tree should not be null");
		assertEquals(id, tree.getId(), "Tree ID should match the requested ID");
		assertInstanceOf(BinarySearchTree.class, tree, "Returned object should be a BinarySearchTree");
	}

	@Test
	void createBinarySearchTreeReturnsBalancedSearchTree() {
		List<Integer> integerList = new ArrayList<>();
		integerList.add(8);
		integerList.add(4);
		integerList.add(16);

		BinarySearchTree binaryTree = binarySearchTreeService.createBinarySearchTree(integerList);

		assertNotNull(binaryTree, "Tree should not be null");
		assertEquals(8, binaryTree.getRoot().getValue(), "Root value should be 8");
		assertEquals(4, binaryTree.getRoot().getLeftChild().getValue(), "Left child value should be 4");
		assertEquals(16, binaryTree.getRoot().getRightChild().getValue(), "Right child value should be 16");
	}

	@Test
	void getAllTreesReturnsArrayListOfBinarySearchTrees() {
		var allTrees = binarySearchTreeService.getAllTrees();

		assertNotNull(allTrees, "Tree list should not be null");
		assertInstanceOf(ArrayList.class, allTrees, "Result should be an ArrayList");

		for (BinarySearchTree binaryTree : allTrees) {
			assertInstanceOf(BinarySearchTree.class, binaryTree, "Each element should be a BinarySearchTree");
		}
	}
}

