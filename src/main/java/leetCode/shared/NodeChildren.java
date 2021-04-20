package leetCode.shared;

import java.util.List;

/**
 * @author Anna S. Almielka
 * 20.04.2021
 */

public class NodeChildren {

    public int val;
    public List<NodeChildren> children;

    public NodeChildren() {
    }

    public NodeChildren(int _val) {
        val = _val;
    }

    public NodeChildren(int _val, List<NodeChildren> _children) {
        val = _val;
        children = _children;
    }

}
