package 해커랭크.day6;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static int jumpingOnClouds(int[] c) {
        int res = 0;
        // 1. all path find
        // 2. min path find

        List<Integer> l = new ArrayList<Integer>();
        for(int i = 0; i < c.length; i++) {
            if(c[i] == 0) {
                l.add(i);
            }
        }

        int post = 0;
        int current = 0;
        for(int i = 0; i < l.size(); i++){
            current = l.get(i) - post;

            if(i+1 == l.size()) {
                res++;
                break;
            }

            if(current == 0) {
                post = l.get(i);
            } else if (current == 2) {
                res++;
                post = l.get(i);
            } else if(current == 1){
                int tmp = l.get(i+1) - l.get(i);
                if(tmp == 1) {
                    continue;
                }
                res++;
                post = l.get(i);
            }
        }

        return res;
    }
}
