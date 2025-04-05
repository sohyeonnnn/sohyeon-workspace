package study.basic.lambda.myStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV1 {
    private List<Integer> internalList;

    public MyStreamV1(List<Integer> internalList) {
        this.internalList = internalList;
    }

    public MyStreamV1 filter (Predicate<Integer> filter) {
        List<Integer> filteredList = new ArrayList<>();
        for(Integer element : internalList){
            if(filter.test(element)){
                filteredList.add(element);
            }
        }
        return new MyStreamV1(filteredList);
    }

    public MyStreamV1 map (Function<Integer, Integer> mapper){
        List<Integer> mappedList = new ArrayList<>();
        for(Integer element : internalList){
            mappedList.add(mapper.apply(element));
        }
        return new MyStreamV1(mappedList);
    }

    public List<Integer> toList(){
        return internalList;
    }
}
