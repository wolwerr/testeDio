package org.example;

//        the goal of this exercise is to find the endpoint node of simple network.
//        in this simple network, each node is linked to at most one outgoing node in a one way forward direction.
//        Implement method findNetworkEndpoint(stratNodeId, fromIds, toIds) wich should return the last node id of the network found when strating from the node with id stratNodeId and following the links of the network.
//        in the above example, the endpoint node when starting from node #2(or any other node) is node #5
//        fromIds and toIds are two arrays of the same lenght whch describe the one-way links of network (fromIds[i] is linked to toIds[i]. in the exemple above, fromIds is:
//        [1,7,3,,4,2,6,9]
//        and toIds is:
//        [3,3,4,6,6,9,5]
//        in case you run into a loop when traversing teh network, the method should return the id of the last node traversed before closing the loop
//        constraints:
//
//        constraints:
//        0<nunmber of links < 10000
//        A node cannot be directly linked to itself

import java.util.*;

public class NetworkEndpointFinder {
    public static int findNetworkEndpoint(int startNodeId, int[] fromIds, int[] toIds) {
        // Build the network adjacency list
        Map<Integer, Integer> network = new HashMap<>();
        for (int i = 0; i < fromIds.length; i++) {
            if (fromIds[i] != toIds[i]) {
                network.put(fromIds[i], toIds[i]);
            }
        }

        // Perform a depth-first search to traverse the network
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(startNodeId);
        while (!stack.isEmpty()) {
            int nodeId = stack.pop();
            if (visited.contains(nodeId)) {
                // Loop detected, return the last node traversed
                return nodeId;
            }
            visited.add(nodeId);
            Integer nextNode = network.get(nodeId);
            if (nextNode == null) {
                // Reached the endpoint, return the last node traversed
                return nodeId;
            }
            stack.push(nextNode);
        }

        // Network is empty or start node is not in the network
        return -1;
    }
}
