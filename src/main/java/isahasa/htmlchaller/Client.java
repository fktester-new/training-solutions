package isahasa.htmlchaller;

public class Client {

    private Channel channel;

    public Client(Channel channel) {
        this.channel = channel;
    }

    public int writeToChannel(TextSource data){
        return channel.writeByte(data.getPlainText().getBytes());
    }
}
