/**
 * Created by Marcus on 9/9/2018.
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

    private void setCost(int depth) {
        cost = 0;

        for(int i = 1; i <= 8; i++) {
            if (state.charAt(i) != 48 + i) {
                cost++;
            }
        }
        cost += depth;
    }
}
