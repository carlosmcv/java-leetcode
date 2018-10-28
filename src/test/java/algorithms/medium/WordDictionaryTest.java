package algorithms.medium;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class WordDictionaryTest {

    private WordDictionary wordDictionary;

    @Before
    public void initDictionary() {
        wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
    }

    @Test
    public void test1() {
        assertFalse(wordDictionary.search("pad"));
        assertTrue(wordDictionary.search("bad"));
    }

    @Test
    public void test2() {
        assertTrue(wordDictionary.search(".ad"));
    }

    @Test
    public void test3() {
        assertTrue(wordDictionary.search("b.."));
    }

    @Test
    public void test4() {
        assertTrue(wordDictionary.search("b.d"));
    }

    @Test
    public void test5() {
        assertFalse(wordDictionary.search("b.x"));
    }

    @Test
    public void test6() {
        wordDictionary = new WordDictionary();
        wordDictionary.addWord("a");
        wordDictionary.addWord("a");

        assertTrue(wordDictionary.search("."));
        assertTrue(wordDictionary.search("a"));
        assertFalse(wordDictionary.search("aa"));
        assertFalse(wordDictionary.search(".a"));
        assertFalse(wordDictionary.search("a."));
    }

    @Test
    public void test7() {
        wordDictionary = new WordDictionary();
        wordDictionary.addWord("at");
        wordDictionary.addWord("and");
        wordDictionary.addWord("an");
        wordDictionary.addWord("add");        
        
        assertFalse(wordDictionary.search("a"));
        assertFalse(wordDictionary.search(".at"));

        wordDictionary.addWord("bat");

        assertTrue(wordDictionary.search(".at"));
        assertTrue(wordDictionary.search("an."));
        assertFalse(wordDictionary.search("a.d."));
        assertFalse(wordDictionary.search("b."));
        assertTrue(wordDictionary.search("a.d"));
        assertFalse(wordDictionary.search("."));
    }
}