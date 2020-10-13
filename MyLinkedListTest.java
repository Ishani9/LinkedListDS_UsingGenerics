package com.bl.assignment;

import org.junit.Test;
import org.junit.Assert;

public class MyLinkedListTest{

	@Test
	public void  givenNumber_WhenAdded_ShouldReturnHeadTail() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.add(myFirstNode);
		Assert.assertTrue(myLinkList.getHead().equals(myFirstNode) && myLinkList.getTail().equals(myFirstNode));
	}

	//UC 2
	@Test
	public void given3Numbers_WhenAdded_ShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.add(myFirstNode);
		myLinkList.add(mySecondNode);
		myLinkList.add(myThirdNode);
		myLinkList.printLinkList();
		Assert.assertTrue(myLinkList.getHead().equals(myThirdNode) && myLinkList.getTail() == myFirstNode && myFirstNode.getNext() == null
				&& myThirdNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myFirstNode));
	}
	
	// UC 3
	@Test
	public void given3Numbers_WhenAppended_ShouldBeAddedToBottom() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.append(myFirstNode);
		myLinkList.append(mySecondNode);
		myLinkList.append(myThirdNode);
		myLinkList.printLinkList();
		Assert.assertTrue(myLinkList.getHead().equals(myFirstNode) && myLinkList.getTail() == myThirdNode && myFirstNode.getNext() == mySecondNode
				&& myThirdNode.getNext() == null && mySecondNode.getNext().equals(myThirdNode));
	}
	
	// UC 4
	@Test
	public void given2Numbers_WhenInserted_ShouldBeAddedInBetween() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.add(myFirstNode);
		myLinkList.add(myThirdNode);
		myLinkList.insert(myThirdNode, mySecondNode);
		myLinkList.printLinkList();
		Assert.assertTrue(myLinkList.getHead().equals(myThirdNode) && myLinkList.getTail() == myFirstNode && myFirstNode.getNext() == null
				&& myThirdNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myFirstNode));
	}
	
	//UC 5
	@Test
	public void given3Numbers_WhenDeletedFirst_ShouldDeleteFirst() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.append(myFirstNode);
		myLinkList.append(mySecondNode);
		myLinkList.append(myThirdNode);
		myLinkList.pop();
		myLinkList.printLinkList();
		Assert.assertTrue(myLinkList.getHead().equals(mySecondNode) && myLinkList.getTail() == myThirdNode
				&& myThirdNode.getNext() == null && mySecondNode.getNext().equals(myThirdNode));
	}
	
	//UC 6
	@Test
	public void given3Numbers_WhenDeletedLast_ShouldDeleteLast() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.append(myFirstNode);
		myLinkList.append(mySecondNode);
		myLinkList.append(myThirdNode);
		myLinkList.popLast();
		myLinkList.printLinkList();
		Assert.assertTrue(myLinkList.getHead().equals(myFirstNode)  && myLinkList.getTail() == mySecondNode
				&& myFirstNode.getNext() == mySecondNode);
	}
	
	///UC 7
	@Test
	public void given3Numbers_WhenSearchMethod_ShouldReturnElement() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.append(myFirstNode);
		myLinkList.append(mySecondNode);
		myLinkList.append(myThirdNode);
		Assert.assertEquals(myLinkList.search(30) , mySecondNode);
	}
	
	//UC 8
	@Test
	public void insertAfterMethodCalled_shouldInsert_afterGivenElement() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myFourthNode = new MyNode<>(40);
		MyLinkedList myLinkList = new MyLinkedList();
		myLinkList.append(myFirstNode);
		myLinkList.append(mySecondNode);
		myLinkList.append(myThirdNode);
		myLinkList.insertAfter(30, myFourthNode);
		myLinkList.printLinkList();
		Assert.assertTrue(mySecondNode.getNext().equals(myFourthNode));
	}
	

}