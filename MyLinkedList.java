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
