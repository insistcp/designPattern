package createPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cp
 * data  2019/4/3.
 * description
 */
public class Main1 {
    public List<Integer> add(int limitWord, List<List<Integer>> text) {
        int wlen = text.size();
        if (wlen < 1) {
            return null;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0;i<text.size();i++) {
            List<Integer> line = text.get(i);
            int tlen = line.size();
            if (tlen >= limitWord) {
                List<Integer> extra = new ArrayList<>();
                for (int j = 0;j<limitWord;j++) {
                    res.add(line.get(j));
                }
                for (int j = limitWord;j < tlen;j++) {
                    extra.add(line.get(j));
                }
                text.add(extra);
            } else {
                for (int j = 0;j<tlen;j++) {
                    res.add(line.get(j));
                }
            }
        }
        return res;
    }
    // [[2,5,6,7,9,5,7],[1,7,4,3,4]]
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(9);
        list1.add(5);
        list1.add(7);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(7);
        list2.add(4);
        list2.add(3);
        list2.add(4);
        List<List<Integer>> txt  = new ArrayList<List<Integer>>();
        txt.add(list1);
        txt.add(list2);
        Main1 main = new Main1();
        List<Integer> res = main.add(3,txt);

            for (int t: res) {
                System.out.print(t+" ");
            }
            System.out.println();
        }

}

