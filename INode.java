package com.bl.assignment;

public interface INode<T> {
	public void setKey(T key);
	public T getKey();
	public void setNext(INode<T> node);
	public INode<T> getNext();

}
