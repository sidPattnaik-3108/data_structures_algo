package com.code.fundamentals.arraylist;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable{

	private static final int DEFAULT_CAPACITY = 10;
	
	private static final Object[] EMPTY_ELEMENTDATA = {};
	
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};  
	
	transient Object[] elementData;
	
	private int size;
	
	
	
	public ArrayList(int initialCapacity) {
		if(initialCapacity > 0) {
			this.elementData = new Object[initialCapacity];
		} else if(initialCapacity == 0) {
			this.elementData = EMPTY_ELEMENTDATA;
		} else {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
	}

	public ArrayList() {
		this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}
	
	public ArrayList(Collection<? extends E> c) {
		Object[] a = c.toArray();
		if((size = a.length)!=0) {
			if(c.getClass() == ArrayList.class) {
				elementData = a;
			} else {
				elementData = Arrays.copyOf(a, size, Object[].class);
			}
		} else {
			elementData = EMPTY_ELEMENTDATA;
		}
	}
	
	public void trimToSize() {
		modCount++;
		if (size < elementData.length) {
			elementData = (size == 0) 
				? EMPTY_ELEMENTDATA 
				: Arrays.copyOf(elementData, size);
		}
	}
	
	private void ensureCapacity(int minCapacity) {
		if(minCapacity > elementData.length
			&& !(elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
				&& minCapacity <= DEFAULT_CAPACITY)){
			modCount++;
			grow(minCapacity);
		}
		
	}

	private Object[] grow(int minCapacity) {
		int oldCapacity = elementData.length;
		if(oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
			int newCapacity = minCapacity - oldCapacity; /* minimum growth */
			return elementData = Arrays.copyOf(elementData, newCapacity);
		} else {
			return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
		}
		
	}
	
	private Object[] grow() {
		return grow(size+1);
	}

	public E get(int index) {
		return elementData(index);
	}

	@SuppressWarnings("unchecked")
	E elementData(int index) {
		// TODO Auto-generated method stub
		return (E) elementData[index];
	}

	@Override
	public int size() {
		return size;
	}
}
