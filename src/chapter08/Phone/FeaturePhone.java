package chapter08.Phone;

public class FeaturePhone implements Phone {
    @Override
    public void callPhone(String phoneNumber) {

    }

    @Override
    public void receivePhone(String phoneNumber) {

    }

    public void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending SMS to  "+phoneNumber);
        System.out.println(message);
    }

    public void receiveSMS(String phoneNumber, String message) {
        System.out.println("Receiving SMS from  "+phoneNumber);
        System.out.println(message);
    }
}
