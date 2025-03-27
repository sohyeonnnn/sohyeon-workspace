package study.basic.nested.anonymous.ex1;

public class HelloLocalImpl {

    public void run(HelloIf helloIf) {

        System.out.println("Hello Start");
        helloIf.start();
        System.out.println("Hello End");

    }

}
