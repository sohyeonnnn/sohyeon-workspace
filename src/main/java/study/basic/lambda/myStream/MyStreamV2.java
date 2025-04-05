package study.basic.lambda.myStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV2 {
    private List<Integer> internalList;

    private MyStreamV2(List<Integer> internalList) {
        this.internalList = internalList;
    }

    //static factory
    public static MyStreamV2 of(List<Integer> internalList) {
        return new MyStreamV2(internalList);
    }

    public MyStreamV2 filter (Predicate<Integer> filter) {
        List<Integer> filteredList = new ArrayList<>();
        for(Integer element : internalList){
            if(filter.test(element)){
                filteredList.add(element);
            }
        }
        return new MyStreamV2(filteredList);
    }

    public MyStreamV2 map (Function<Integer, Integer> mapper){
        List<Integer> mappedList = new ArrayList<>();
        for(Integer element : internalList){
            mappedList.add(mapper.apply(element));
        }
        return new MyStreamV2(mappedList);
    }

    public List<Integer> toList(){
        return internalList;
    }
}
