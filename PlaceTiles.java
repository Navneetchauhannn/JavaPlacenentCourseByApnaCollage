public class PlaceTiles {
    public static int TotalWaysToPlaceTiles(int n, int m) {

        if (n == m) {
            return 2; // 2 ways -> 1.place all tiles vertically 2. place all tiles horizonatlly
        }
        if (n < m) {
            return 1; // place all tiles horizonatally
        }
        // place vertically -> remaing height is n-m
        int vartically = TotalWaysToPlaceTiles(n-m, m);

        // place hotizontally -> remaining hight is n-1
        int hotizontally = TotalWaysToPlaceTiles(n-1, m);

        return vartically + hotizontally;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        // find total numbers of ways to fit 1xm size of tiles into nxm size of area
        System.out.println(TotalWaysToPlaceTiles(n, m));
    }
}
