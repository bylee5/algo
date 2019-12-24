package toby;

import java.util.Arrays;
import java.util.List;

//toby's double dispatch example
public class Day1 {
    interface Post {
        void postOn(SNS sns);
    }
    static class Text implements Post {
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }
    static class Picture implements Post {
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }
    interface SNS {
        void post(Text text);
        void post(Picture picture);
    }

    static class Facebook implements SNS {
        public void post(Text text) {
            System.out.println("text-facebook");
        }
        public void post(Picture picture) {
            System.out.println("picture-facebook");
        }
    }

    static class Twiter implements SNS {
        public void post(Text text) {
            System.out.println("text-twiter");
        }
        public void post(Picture picture) {
            System.out.println("picture-twiter");
        }
    }

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(), new Twiter());

        posts.forEach(p -> sns.forEach((SNS s) -> p.postOn(s)));

        String s = "s";
        String ss = (String) s;

        System.out.println(s);
        System.out.println(ss);
        

    }
}
