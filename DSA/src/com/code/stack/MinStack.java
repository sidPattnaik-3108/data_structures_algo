package com.code.stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
	List<Integer> stack ;
	List<Integer> minStack;
	public MinStack() {
		stack = new ArrayList<>();
		minStack = new ArrayList<>();
		
	}
    
    public void push(int val) {
    	stack.add(val);
    	int min = val;
    	if(!minStack.isEmpty()) {
    		min = Math.min(minStack.get(minStack.size()-1), min);
    	}
    	minStack.add(min);
    }
    
    public void pop() {
    	if(!stack.isEmpty()) {
    		stack.remove(stack.size()-1);
    		minStack.remove(minStack.size()-1);
    	}
    }
    
    public int top() {
    	
    	if(!stack.isEmpty()) {
    		return stack.get(stack.size()-1);
    	}
    	return 0;
    }
    
    public int getMin() {
    	if(!minStack.isEmpty()) {
    		return minStack.get(minStack.size()-1);
    	}
    	return 0;
    }

}
