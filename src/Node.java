/**
 * Created by Marcus on 9/9/2018.
 */
public class Node {
    String state;
    Node parentNode;
    int action;

    public Node(String state, Node parentNode, int action) {
        this.state = state;
        this.parentNode = parentNode;
        this.action = action;
    }
}
