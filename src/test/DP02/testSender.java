package test.DP02;

/**
 * Created by putin on 2016/7/7.
 */
public class testSender {
    public static void main(String args[]){
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produceSmaSender();
        sender.Send();
    }
}
