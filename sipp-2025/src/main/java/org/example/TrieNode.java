//package org.example;
//public class TrieNode {
//        public TrieNode(){
//
//        }
//    public void insert(String word){
//        TrieNode node= root;
//        for(char c: word.toCharArray()){
//            int index = c - 'a';
//            if(node.children[index]==null)
//                node.children[index]=new TrieNode();
//            node =node.children[index];
//        }
//        node.isEndOfWord = true;
//    }
//
//
//    public boolean search(String word){
//        TrieNode node =root;
//        for(char c: word.toCharArray()){
//            int index = c - 'a';
//            if(node.children[index]==null){
//                return false;
//            }
//            node= node.children[index];
//        }
//        return node.isEndOfWord;
//    }
//}
