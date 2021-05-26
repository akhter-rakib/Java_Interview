package coding_hub.hackerrank;

import java.util.ArrayList;
import java.util.List;

/*https://www.hackerrank.com/challenges/compare-the-triplets/problem?fbclid=IwAR3Ry78UkhOjQaRIKgi-oMbHnWc_TS_gRlb8s1Mb91toaVwYBtbHuYTsk2Y*/
public class ComparetheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0, bobs = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice += 1;
            } else if (a.get(i) < b.get(i)) {
                bobs += 1;
            }
        }
        result.add(alice);
        result.add(bobs);
        return result;
    }

    public static void main(String[] args) {

    }
}
