package singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient(){}

    public static SocketClient getInstance(){
        if (socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connet() {
        System.out.println("connet");
    }


}