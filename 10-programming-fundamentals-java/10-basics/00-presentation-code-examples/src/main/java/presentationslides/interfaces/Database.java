package presentationslides.interfaces;

public interface Database {

    boolean connect();
    boolean disconnect();
    boolean isConnected();
    void store(Data data);

}
