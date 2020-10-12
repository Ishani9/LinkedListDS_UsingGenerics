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

	@SuppressWarnings("rawtypes")
	public void printLinkList() {
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail)) {
				myNodes.append("->");
			}
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);

	}

}
