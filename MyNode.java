package com.bl.assignment;

public class MyNode<K> { 
	
	@SuppressWarnings("unused")
	private K key;
	@SuppressWarnings("rawtypes")
	private MyNode next;

	public MyNode(K key) { 
		
		this.key = key; 
		this.next = null;
	}
	
	@SuppressWarnings("rawtypes")
	public MyNode getNext() { 
		
		return next;
	}
	
	@SuppressWarnings("rawtypes")
	public void setNext (MyNode next) { 
		
		this.next = next;
	}
}