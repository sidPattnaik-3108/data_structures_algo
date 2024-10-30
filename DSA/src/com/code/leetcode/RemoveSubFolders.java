package com.code.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RemoveSubFolders {

	public static void main(String[] args) {
		RemoveSubFolders solution = new RemoveSubFolders();
		String[] folder = { "/a", "/a/b", "/c/d", "/c/d/e", "/c/f" };
		System.out.println(solution.removeSubfolders(folder));
	}

	public List<String> removeSubfolders(String[] folder) {
		List<String> list = new ArrayList<>();
		Arrays.sort(folder);
		list.add(folder[0]);
		for(int i = 1; i<folder.length;i++) {
			String prev = list.get(list.size()-1)+"/";
			if(!folder[i].startsWith(prev)) {
				list.add(folder[i]);
			}
		}

		return list;
	}
}
