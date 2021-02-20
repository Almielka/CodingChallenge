package leetCode.listNode;

import leetCode.shared.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anna S. Almielka
 */

public class CopyRandomList {

    /**
     * 138.Copy List with Random Pointer
     *
     * A linked list of length n is given such that each node contains an additional random pointer,
     * which could point to any node in the list, or null.
     *
     * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes,
     * where each new node has its value set to the value of its corresponding original node.
     * Both the next and random pointer of the new nodes should point to new nodes in the copied list
     * such that the pointers in the original list and copied list represent the same list state.
     * None of the pointers in the new list should point to nodes in the original list.
     *
     * @param head a linked list
     * @return deep copy of the list
     */
    // Time complexity: O(n)
    // Space complexity: O(n)
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> map = new HashMap<>();
        Node node = head;
        while (node != null) {
            map.put(node, new Node(node.val));
            node = node.next;
        }

        map.forEach((k,v) -> {
            // key node, value copyNode
            // v.next need assign value of copyNode map.get(k.next)
            v.next = map.get(k.next);
            v.random = map.get(k.random);
        });

        return map.get(head);
    }

}
