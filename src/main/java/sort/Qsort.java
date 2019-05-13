package sort;

public class Qsort {
    private int[] x;
    public Qsort(int[] x){
        this.x = x;
    }

    public void swap(int l, int u){
        int tmp = x[l];
        x[l] = x[u];
        x[u] = tmp;
    }

    public void qsort1(int l, int u){
        if(l >= u)
            return;
        int m = l;
        for(int i = l + 1; i <= u; i++){
            if(x[i] < x[l]){
                swap(++m, i);
            }
        }
        swap(l, m);
        qsort1(l, m-1);
        qsort1(m+1, u);
    }
    public int[] getQsort() {
        return x;
    }
}
