package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExerciseRunner {

    public static void main(String[] args) {

        // getting word count
        // to get character count use split("") - without space inside
        String sentence = "This is great great news dad dad mom is great";
        String[] sentenceArray = sentence.split(" ");
        //System.out.print(sentenceArray);
        Map<String, Integer> map = new HashMap<>();
        for(int i  = 0 ; i < sentenceArray.length; i++) {
                Integer val = map.get(sentenceArray[i]);
                if(map.containsKey(sentenceArray[i])) {
                    map.put(sentenceArray[i], (val + 1) );
                } else {       
                    map.put(sentenceArray[i], 1);
                }
        }

        for(String key: map.keySet()) {
            System.out.println(key +" - " + map.get(key));
        }
    }
}
