package algorithms.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/add-and-search-word-data-structure-design
 */
public class WordDictionary {

    TrieNode root;
    
    /** Initialize your data structure here. */
    public WordDictionary() {
        this.root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode current = this.root;
        
        for (int i = 0; i < word.length(); i++) {
            
            char c = word.charAt(i);
            
            if (!current.containsKey(c)) {
                current.addKey(c, new TrieNode());
            }
            
            current = current.getNode(c);
        }
        
        current.setIsWord();
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return searchRec(word, this.root);
    }
    
    private boolean searchRec(String word, TrieNode node) {
        
        TrieNode current = node;

        boolean found = false;
        
        for (int i = 0; i < word.length(); i++) {
            
            char c = word.charAt(i);
            
            if (c != '.') {

                current =  current.getNode(c);
                
                if (current == null)
                    return false;

            } else {
                
                Iterator<TrieNode> nodes = current.getValues().iterator();

                if (!nodes.hasNext())
                    return false;
                
                while (nodes.hasNext() && !found) {
                    current = nodes.next();
                    found = searchRec(word.substring(i + 1), current);
                }
                if (found)
                    break;
            }
        }
        
        return current.isWord() || found;
        
    }
    
    
    private class TrieNode {

        private boolean isWord;
        private Map<Character, TrieNode> children;

        public TrieNode() {
            children = new HashMap<>();
        }

        public TrieNode getNode(char key) {
            return children.get(key);
        }

        public boolean containsKey(char key) {
            return children.get(key) != null;
        }

        public void addKey(char key, TrieNode node) {
            children.put(key, node);
        }

        public void setIsWord() {
            this.isWord = true;
        }

        public boolean isWord() {
            return this.isWord;
        }

        public boolean isEmpty() {
            return children.isEmpty();
        }
        
        public List<TrieNode> getValues() {
            return new ArrayList<>(children.values());
        }
    }

    // private static class TrieNode{
    //     boolean isWord;
    //     TrieNode[] children;
    //     TrieNode(){
    //         isWord = false;
    //         children = new TrieNode[26]; 
    //     }
    // }
    // TrieNode root;
    // /** Initialize your data structure here. */
    // public WordDictionary() {
    //     root = new TrieNode();
    // }
    
    // /** Adds a word into the data structure. */
    // public void addWord(String word) {
    //     TrieNode node = root;
    //     for (int i = 0; i < word.length(); i++){
    //         int j = word.charAt(i) - 'a';
    //         if (node.children[j] == null){
    //             node.children[j] = new TrieNode();
    //         }
    //         node = node.children[j];
    //     }
    //     node.isWord = true;
    // }
    
    // /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    // public boolean search(String word) {
    //    return dfs(word, root, 0);
    // }
    
    // private boolean dfs(String word, TrieNode node, int index){
    //     if (index == word.length()){
    //         return node.isWord;
    //     }
    //     if (word.charAt(index) == '.'){
    //         for (TrieNode temp : node.children){
    //             if (temp != null && dfs(word, temp, index + 1)) return true;
    //         }
    //         return false;
    //     } else {
    //         int i = word.charAt(index) - 'a';
    //         TrieNode temp = node.children[i];
    //         return temp != null && dfs(word, temp, index + 1);
    //     }
    // }

}