package leetcode_75_days.day_6;

import leetcode_75_days.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreePreorderTraversal {
    public List<Integer> preorder(Node root) {

        List<Integer> result = new ArrayList<Integer>();

        if (root == null) return result;

        Stack<Node> stackNodes = new Stack<>();
        stackNodes.push(root);

        while (!stackNodes.isEmpty()) {

            Node node = stackNodes.pop();
            result.add(node.val);

            for (int i = node.children.size() - 1; i >= 0; i--) {
                Node child = node.children.get(i);
                stackNodes.push(child);
            }
        }

        return result;
    }
}
