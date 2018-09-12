/**
 * The Node class represents a state in the 8-puzzle problem.
 * It holds the state, parent node, action, depth, and cost.
 *
 * File: Node.java
 * Author: Marcus Mallum
 * Date: 9/11/2018
 */
public class Node {
    String state;
    Node parentNode;
    int action;
    int depth;
    int cost;

    public Node(String state, Node parentNode, int action, int depth) {
        this.state = state;
        this.parentNode = parentNode;
        this.action = action;
        this.depth = depth;
        setCost(depth);
    }

   /**
    * Method: setCost
    * Purpose: Calculate and set the cost of the node
    * Parameters: int, the depth of the node
    * Return value: void
    */
    private void setCost(int depth) {
        cost = 0;

        // Heuristic function
        for(int i = 1; i <= 8; i++) {
            if (state.charAt(i) != 48 + i) {
                cost++;
            }
        }
        // Growth function
        cost += depth;
    }
}
