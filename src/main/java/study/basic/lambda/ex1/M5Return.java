package study.basic.lambda.ex1;

import study.basic.lambda.MyFunction;

public class M5Return {

    public static MyFunction getOperation(String operator)
    {
        if(operator.equals("add")){
            return (a,b) -> { return a+b;};
        } else if(operator.equals("sub")){
            return (a,b) -> { return a-b;};
        } else {
            return (a,b)->0;}
    }


    public static void main(String[] args) {
        System.out.println("add : "+getOperation("add").apply(1,2));
        System.out.println("sub : "+getOperation("sub").apply(1,2));
        System.out.println("?? : "+getOperation("xxx").apply(1,2));
    }
}