package test.DP02;

/**
 * Created by putin on 2016/7/7.
 */
public class SenderFactory {
    public Sender produceMailSender (){
       return new MailSender();
    }
    public Sender produceSmaSender (){
        return new SmsSender();
    }
}
