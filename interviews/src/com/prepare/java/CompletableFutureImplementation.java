package com.prepare.java;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureImplementation {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> testString = CompletableFuture.supplyAsync(() -> {
			return "Hello";
		});
		System.out.println(testString.get());
		
		CompletableFuture<String> t1 = CompletableFuture.supplyAsync(()->"Test");
		CompletableFuture<String> t2 = CompletableFuture.supplyAsync(()->"Async");
		CompletableFuture<String> combined = t1.thenCombine(t2, (m1, m2)->m1+" "+m2);
		System.out.println(combined.get());
		
		CompletableFuture<Integer> testInteger = CompletableFuture.supplyAsync(()->10/0).exceptionally(ex->0);
		System.out.println(testInteger.get());
		
	}
	
}
