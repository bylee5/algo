package 승지니어.day34;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    public class WordCnt {
        String word;
        int cnt;
        public WordCnt(String word) {
            this.word = word;
            this.cnt =  1 ;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, WordCnt> map = new HashMap<>();
        for(String word : words) {
            if(map.containsKey(word)) {
                map.get(word).cnt++;
            } else {
                map.put(word, new WordCnt(word));
            }
        }

        //min heap, k개: 항상 top k frequent element를 오름차순으로 가지고 있음
        //ex: 3,4,5 -> pq, new elem: 6
        //evict 3, insert 6
        PriorityQueue<WordCnt> pq = new PriorityQueue<>(k, (a, b) -> a.cnt-b.cnt != 0 ? a.cnt-b.cnt : b.word.compareTo(a.word));

        for(WordCnt wordCnt : map.values()) {
            pq.offer(wordCnt);
            if(pq.size() > k) pq.poll();
        }

        List<String> ret = new ArrayList<>();

        while(!pq.isEmpty()) {
            ret.add(0, pq.poll().word);
        }

        return ret;
    }
}
