//package com.example.stringencryption.leetcode;
//
//import java.util.LinkedList;
//
//public class DeductCyclic {
//    // you can also use imports, for example:
//// import java.util.*;
//
//// you can write to stdout for debugging purposes, e.g.
//// System.out.println("this is a debug message");
//
//    class Solution {
//        static class Graph {
//            int vertex;
//            LinkedList<Integer>[] adjList;
//
//            Graph(int vertex) {
//                this.vertex = vertex;
//                adjList = new LinkedList[vertex];
//                for (int i = 0; i < vertex; i++) {
//                    adjList[i] = new LinkedList<>();
//                }
//            }
//
//            public void addEgde(int src, int dest) {
//                adjList[src].addFirst(dest);
//            }
//
//            public boolean isCycleExistInGraph() {
//                boolean visitednode[] = new boolean[vertex];
//                boolean recursiveArray[] = new boolean[vertex];
//
//                for (int i = 0; i < vertex; i++) {
//                    if (isCycleExist(i, visitednode, recursiveArray))
//                        return true;
//                }
//                return false;
//            }
//
//            public boolean isCycleExist(int vertex, boolean[] visitednode, boolean[] recursiveArray) {
//                visitednode[vertex] = true;
//                recursiveArray[vertex] = true;
//
//                for (int i = 0; i < adjList[vertex].size(); i++) {
//                    int adjVertex = adjList[vertex].get(i);
//                    if (!visitednode[adjVertex] && isCycleExist(adjVertex, visitednode, recursiveArray)) {
//                        return true;
//                    } else if (recursiveArray[adjVertex])
//                        return true;
//                }
//
//                recursiveArray[vertex] = false;
//                return false;
//            }
//
//
//        }
//    }
//
//
//    public static boolean solution(int[] A, int[] B) {
//        // Implement your solution here
//        return boolean result = directedgraph
//    }
//}
//}
//
//        int ans=A[0];
//        for(int i=0;i<A.length;i++){
//        if(A[i]<ans){
//        ans=A[i];
//        }
//        }