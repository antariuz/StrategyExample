import model.impl.BBCChannel;
import model.impl.CNNChannel;
import model.impl.HBOChannel;

public class StrategyExample {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.setChannel(new CNNChannel());
        tv.showChannel();
        tv.setChannel(new HBOChannel());
        tv.showChannel();
        tv.setChannel(new BBCChannel());
        tv.showChannel();
    }
}
