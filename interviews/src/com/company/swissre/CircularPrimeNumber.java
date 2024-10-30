package com.company.swissre;

import java.util.ArrayList;
import java.util.List;

public class CircularPrimeNumber {

	public static void main(String[] args) {
		int sum = 400;
		int start = 4;
		int end = 30;
		List<Integer> primeList = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				primeList.add(i);
			}
		}
		System.out.println(primeList);
		int primeSum = 0;
		for (Integer p : primeList) {
			primeSum += p;
		}
		System.out.println(primeSum);
		findPrime(sum, primeList, primeSum);
	}

	private static void findPrime(int sum, List<Integer> primeList, int primeSum) {
		int diff = sum - primeSum;
		if(diff > primeSum) {
			findPrime(diff, primeList, primeSum);
		}
		for(Integer p : primeList) {
			if(diff-p<0) {
				System.out.println(p);
				break;
			} 
			diff -=p;
		}
	}

	private static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
