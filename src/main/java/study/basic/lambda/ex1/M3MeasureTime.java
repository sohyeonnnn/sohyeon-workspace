package study.basic.lambda.ex1;

import study.basic.lambda.Procedure;

import java.util.Arrays;
import java.util.Date;

public class M3MeasureTime {

    public static void measureTime(Procedure procedure)
    {
        long start = System.nanoTime();
        procedure.run();
        long end = System.nanoTime();
        System.out.println("실행 시간 : "+(end-start)+"ns");
        System.out.println();

    }


    public static void main(String[] args) {
        measureTime( () -> {
            int n=100;
            int sum =0;
            for(int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("1부터 "+n+"까지의 합] 결과 : "+sum);
        });

        measureTime( () -> {
            int intArr[] = {4,3,2,1};
            System.out.println("원본 배열 : "+ Arrays.toString(intArr));
            Arrays.sort(intArr);
            System.out.println("배열 정렬: "+ Arrays.toString(intArr));
        });
    }
}