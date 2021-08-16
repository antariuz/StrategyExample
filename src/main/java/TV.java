import model.Channel;

public class TV {
    private Channel channel;

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void showChannel(){
        channel.broadcast();
    }
}
