package com.example.app.service;

import java.util.List;

/**
 * @author Administrator
 * @Description
 * @date 11:21
 */

public class test2 {







    class Node {
        public int val;
        public List<test.Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<test.Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
