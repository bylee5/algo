package sort;

public class Qsort3 {
    private int[] x;
    public Qsort3(int[] x){
        this.x = x;
    }

    public void swap(int l, int u){
        int tmp = x[l];
        x[l] = x[u];
        x[u] = tmp;
    }

    public void qsort3(int l, int u){
        if(l >= u)
            return;
        int t = x[l];
        int i = l;
        int j = u + 1;

        while(true){
            do i++; while(i <= u && x[i] < t);
            do j--; while(x[j] > t);
            if(i > j)
                break;
            swap(i, j);
        }
        swap(l, j);
        qsort3(l, j-1);
        qsort3(j + 1, u);
    }
    public int[] getQsort() {
        return x;
    }
}
