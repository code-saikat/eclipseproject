package com.leetcode.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class CourceSchedule {

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		if(prerequisites.length == 0) return true;
		boolean complete = false;
		List<ArrayList<Integer>> graph = new ArrayList<>(); 
		int[] indegree = new int[numCourses];
		Queue<Integer> queue = new LinkedList<>(); // queue 
		//This will be used for initialise the directed graph
		for(int i=0;i<numCourses;i++)
			graph.add(new ArrayList<Integer>());
		for(int j = 0;j<prerequisites.length;j++) {
			int cource = prerequisites[j][0];
			int dependent = prerequisites[j][1];
			graph.get(dependent).add(cource);
			indegree[cource]++; // determine dependent for each course
		}
		
		System.out.println(graph);
		for(int k=0;k<indegree.length;k++) 
			if(indegree[k]==0) queue.add(k);
		int count=0;
		while(!queue.isEmpty()) {
			int course = queue.poll();
			List<Integer> list = graph.get(course);
			for(int c:list) {
				if(indegree[c]>0) {
					indegree[c]--;
					if(indegree[c]==0) queue.add(c);
				}
			}
			count++;
		}
		
		if(count == numCourses) complete=true;
		
		return complete;
	}

	public static void main(String[] args) {
		// https://leetcode.com/problems/course-schedule/submissions/
		CourceSchedule schedule = new CourceSchedule();
		System.out.println(schedule.canFinish(4,new int[][]{{1,0},{0,1}}));

	}

}
