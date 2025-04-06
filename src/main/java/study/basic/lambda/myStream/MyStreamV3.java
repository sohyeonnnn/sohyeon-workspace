package study.basic.lambda.myStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV3<T> {
    private List<T> internalList;

    private MyStreamV3(List<T> internalList) {
        this.internalList = internalList;
    }

    //static factory
    public static <T>MyStreamV3<T> of(List<T> internalList) {
        return new MyStreamV3(internalList);
    }

    public MyStreamV3<T> filter (Predicate<T> filter) {
        List<T> filteredList = new ArrayList<>();
        for(T element : internalList){
            if(filter.test(element)){
                filteredList.add(element);
            }
        }
        return MyStreamV3.of(filteredList);
    }

    public <R>MyStreamV3<R> map (Function<T, R> mapper){
        List<R> mappedList = new ArrayList<>();
        for(T element : internalList){
            mappedList.add(mapper.apply(element));
        }
        return MyStreamV3.of(mappedList);
    }

    public List<T> toList(){
        return internalList;
    }

    public void forEach(Consumer<T> consumer){
        for(T element : internalList){
            consumer.accept(element);
        }
    }
}
