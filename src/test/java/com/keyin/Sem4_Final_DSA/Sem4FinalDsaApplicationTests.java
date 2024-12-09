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
class Sem4FinalDsaApplicationTests<BinarySearchTree> {

	@Autowired
	TreeRepository repository;

	@Autowired
	TreeService binarySearchTreeService;

	@Test
	void contextLoads() {

	}

	@Test
	void getBinarySearchTreeByIdReturnsBinarySearchTree() {
		int id = 101;

		BinarySearchTree tree = binarySearchTreeService.getBinarySearchTreeById(id);

		assertNotNull(tree);
		assertEquals(id, tree.getId());
		assertInstanceOf(BinarySearchTree.class, tree);
	}

	@Test
	void createBinarySearchTreeReturnsBalancedSearchTree() {
		List<Integer> integerList = new ArrayList<>();
		integerList.add(8);
		integerList.add(4);
		integerList.add(16);

		BinarySearchTree BinaryTree = binarySearchTreeService.createBinarySearchTree(integerList);


		assertNotNull(binaryTree);
		assertEquals(8, binaryTree.getRoot().value);
		assertEquals(4, binaryTree.getRoot().getLeftChild().value);
		assertEquals(16, binarytree.getRoot().getRightChild().value);
	}

	@Test
	void getAllTreesReturnsArrayListOfBinarySearchTrees() {
		assertInstanceOf(ArrayList.class, binarySearchTreeService.getAllTrees());

		for (BinarySearchTree binaryTree : binarySearchTreeService.getAllTrees()) {
			assertInstanceOf(BinarySearchTree.class, binaryTree);

		}
	}
}






}
