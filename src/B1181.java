import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class B1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        int num = sc.nextInt();
        int max = 0;

        for (int i = 0; i < num; i++) {
            String word = sc.next();
            if (!list.contains(word)) {
                list.add(word);
            }
            if (max < word.length()) {
                max = word.length();
            }
        }

        Collections.sort(list);

        for(int i = 1; i <= max; i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(j).length() == i){
                    System.out.println(list.get(j));
                }
            }
        }

    }
}
