package test.DP01;

/**
 * Created by putin on 2016/7/7.
 */
public class SenderFactory {
    public Sender produce (String type){
        if ("mail".equals(type)){
            return new MailSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("请输入正确的类型！");
            return null;
        }
    }
}
