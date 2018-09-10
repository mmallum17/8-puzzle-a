import java.util.LinkedList;

/**
 * Created by Marcus on 9/9/2018.
 */
public class EightPuzzleSolver {

    private static Node goalNode = null;
    private static final String GOAL_STATE = "012345678";
    private static final int SOLUTION = 0;
    private static final int FAILURE = 1;
    private static final int DOWN = 0;
    private static final int RIGHT = 1;
    private static final int LEFT = 2;
    private static final int UP = 3;
    private static LinkedList<String> exploredStates = new LinkedList<String>();

    public static void main(String[] args) {
        String initialState = "142358670";
        aStarSearch(initialState);
    }

    private static int aStarSearch(String initialState) {
        Node node = new Node(initialState, null, -1);
        int result = -1;
        LinkedList<Node> fringe = new LinkedList<Node>();
        fringe.add(node);

        while(result == -1) {
            if(fringe.isEmpty()) {
                result = FAILURE;
            }
            node = removeOptimalNode(fringe);
            exploredStates.add(node.state);
            if(node.state.equals(GOAL_STATE)) {
                goalNode = node;
                result = SOLUTION;
            }
            LinkedList<Node> successors = getSuccessors(node);
            fringe.addAll(successors);
        }

        return result;
    }

    private static Node removeOptimalNode(LinkedList<Node> fringe) {

    }

    private static LinkedList<Node> getSuccessors(Node node) {

    }
}
