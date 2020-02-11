package book.interviews.ch8;

public class PermutationsP245 {
    private boolean[] used;
    private StringBuffer out = new StringBuffer();
    private final String in;

    public PermutationsP245(final String str) {
        in = str;
        used = new boolean[in.length()];
    }

    public void permute() {
        if(out.length() == in.length()) {
            System.out.println(out);
            return;
        }
        for(int i = 0; i < in.length(); ++i) {
            if(used[i]) continue;
            out.append(in.charAt(i));
            used[i] = true;
            permute();
            used[i] = false;
            out.setLength(out.length() - 1);
        }
    }

    public String toString() {
        return out.toString();
    }
}
