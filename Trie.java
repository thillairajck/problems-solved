class TrieNode{
    TrieNode[] child=new TrieNode[26];
    boolean isendofword=false;
}
public class Trie{
    private  TrieNode root;
    public Trie(){
        root=new TrieNode();
    }
    public void insert(String word){
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(current.child[index]==null){
                current.child[index]=new TrieNode();
            }
            current=current.child[index];
        }
        current.isendofword =true;
    }
    public boolean search(String word){
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(current.child[index]==null){
                return false;
            }
            current=current.child[index];
        }
        return current.isendofword;
    }
    public boolean startwith(String prefix){
        TrieNode current=root;
        for(int i=0;i<prefix.length();i++){
            int index=prefix.charAt(i)-'a';
            if(current.child[index]==null){
                return false;
            }
            current=current.child[index];
        }
        return true;
    }
    public static void main(String[] args) {
        Trie dictionary=new Trie();
        dictionary.insert("cat");
        dictionary.insert("car");
        dictionary.insert("vishwa");
        System.out.println(dictionary.search("cat"));
        System.out.println(dictionary.startwith("vish"));
    }
}
