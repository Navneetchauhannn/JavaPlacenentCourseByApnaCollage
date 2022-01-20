public class InviteGuest {

    // Question statement
    // want to invite n numbers of guest in party as single or pair of 2
    public static int TotalNoOfWays(int n) {

        if (n <= 1) { // for n =2 in pair function call for n=0 so need to return 1
            return 1;
        }

        // single
        int single = TotalNoOfWays(n-1);

        // pair
        int pair = (n-1) * TotalNoOfWays(n-2);

        return single+pair;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(TotalNoOfWays(n));
    }
}
