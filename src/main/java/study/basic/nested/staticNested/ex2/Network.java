package study.basic.nested.staticNested.ex2;

public class Network {
    public void sendMessage(String txt) {
        NetworkMessage networkMessage = new NetworkMessage(txt);
        networkMessage.print();
    }

    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print(){
            System.out.println();
        }
    }

}
