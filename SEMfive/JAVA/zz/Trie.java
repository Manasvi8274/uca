package semfive.java.zz;
class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        // Assuming lowercase English letters
        children = new TrieNode[26]; 
        isEndOfWord = false;
    }
}

// Class Trie
public class Trie {
    // Main Method
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("world");
        System.out.println();

        // Demonstrate search and startsWith
        System.out.println(trie.search("hello"));  // true
        System.out.println(trie.search("world"));  // true
        System.out.println(trie.search("hi"));     // false
        System.out.println(trie.startsWith("hell")); // true
    }
    private TrieNode root;

    // Constructor
    public Trie() {
        root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        if (word == null || word.isEmpty()) return;
        word = word.toLowerCase();
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        if (word == null || word.isEmpty()) return false;
        word = word.toLowerCase();
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfWord;
    }

    // Check if a given prefix exists in the Trie
    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.isEmpty()) return false;
        prefix = prefix.toLowerCase();
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    
}
