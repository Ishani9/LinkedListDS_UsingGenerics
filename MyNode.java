package com.bl.assignment;

public class MyNode<K extends Comparable<K>> implements INode <K> { 
	
	private K key;
	@SuppressWarnings("rawtypes")
	private INode next;

	public MyNode(K key) { 
		
		this.key = key; 
		this.next = null;
	}
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}


	@SuppressWarnings("unchecked")
	public INode<K> getNext() { 
		
		return next;
	}
	
	public void setNext (INode<K> next) { 
		
		this.next = next;
	}
}