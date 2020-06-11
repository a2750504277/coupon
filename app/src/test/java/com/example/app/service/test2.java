package com.example.app.service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrator
 * @Description
 * @date 11:12
 */

public class test2 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    @Test
    public void levelOrder() {
        Node root =new Node();
        root.val=3;
        List<Node> f=new ArrayList<>();
        List<Node> f1=new ArrayList<>();
        Node node1=new Node();
        node1.val=5;
        Node node11=new Node();
        node11.val=12;
        Node node12=new Node();
        node12.val=21;
        Node node13=new Node();
        node13.val=25;
        f1.add(node11);
        f1.add(node12);
        f1.add(node13);
        node1.children=f1;
        Node node2=new Node();
        node2.val=12;
        Node node3=new Node();
        node3.val=40;
        f.add(node1);
        f.add(node2);
        f.add(node3);
        root.children=f;
        List<List<Integer>> nodes=new ArrayList<List<Integer>>();
        List<Integer> childNode=null;
        if(root==null){
           // return null;
        }
        LinkedList<Node> queue=new LinkedList<Node>();
        childNode=new ArrayList<Integer>();
        queue.add(root);
        childNode.add(queue.getFirst().val);
        nodes.add(childNode);
        while(!queue.isEmpty()){
            childNode=new ArrayList<Integer>();
            Node node=queue.poll();
            if(node.children!=null){
                for(int i=0;i<node.children.size();i++){
                    queue.add(node.children.get(i));
                    childNode.add(node.children.get(i).val);
                }
                nodes.add(childNode);
            }
            //    System.out.println(node.val);


        }


        System.out.println(nodes.toString());
    }
}
