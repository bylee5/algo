package 승지니어.day34;

import junit.framework.TestCase;

public class TopKFrequentWordsTest extends TestCase {
    public void testTopKFrequentWords() {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;

        TopKFrequentWords t = new TopKFrequentWords();
        System.out.println(t.topKFrequent(words, k));
    }
}
