package com.bl.assignment;

public class MyLinkedList {
	
	@SuppressWarnings("rawtypes")
	private INode head;
	@SuppressWarnings("rawtypes")
	private INode tail;

	@SuppressWarnings("rawtypes")
	public INode getHead() {
		return head;
	}

	@SuppressWarnings("rawtypes")
	public void setHead(INode head) {
		this.head = head;
	}

	@SuppressWarnings("rawtypes")
	public INode getTail() {
		return tail;
	}

	@SuppressWarnings("rawtypes")
	public void setTail(INode tail) {
		this.tail = tail;
	}

	public MyLinkedList() {
		this.head = null;
	}
	
	/**
	 * UC 2
	 * 
	 * @param newNode
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void add(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} 
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);

		}
	}
	
	/**
	 * UC 3
	 * 
	 * @param newNode
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void append(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} 
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;

		}
	}
	
	/**
	 * UC 4
	 * 
	 * @param myNode
	 * @param newNode
	 */
	
	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	/**
	 * UC 5
	 * 
	 * @return
	 */
	
	@SuppressWarnings("rawtypes")
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	/**
	 * UC 6
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public INode popLast() {
		INode tempNode = head;
		while( !tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();	
		return tempNode;
	}
	
	/**
	 * UC 7
	 * 
	 * @param integer
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public INode search(Integer integer) {
		INode temp = head;
		while (!temp.getNext().equals(null)) {
			if (temp.getKey().equals(integer))
				break;
			temp = temp.getNext();
		}
		return temp;
	}
	
	/**
	 * UC 8
	 * 
	 * @param integer
	 * @param newNode
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void insertAfter(Integer integer, INode newNode) {
		INode tempNode = search(integer);
		newNode.setNext(tempNode.getNext());
		tempNode.setNext(newNode);
	}
	
	/**
	 * UC 9
	 * 
	 * @param myNode
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public INode popSpecific(INode myNode) {
		INode tempNode1 = head;
		INode tempNode2 = head;
		while(!tempNode1.getKey().equals(myNode.getKey()) && !tempNode2.equals(tail)) {
			tempNode2 = tempNode1;
			tempNode1 = tempNode1.getNext();
		}
		tempNode2.setNext(tempNode1.getNext());
		return head;
	}
	
	public int size() {
		int count = 0;
		INode node = head;
		while(node.getNext() != null) {
			count++;
			node = node.getNext();
		}
		if(node.equals(tail)) {
			count++;
		}
		return count;
	}
	

	@SuppressWarnings("rawtypes")
	public void printLinkList() {
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail)) {
				myNodes.append(" -> ");
			}
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);

	}

}
