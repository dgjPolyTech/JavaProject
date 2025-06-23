package chapter08.Phone;

public class PhoneTest {
    public static void main(String[] args) {
        TelePhone telephone = new TelePhone();
        FeaturePhone featurePhone = new FeaturePhone();
        SmartPhone smartPhone = new SmartPhone();

        telephone.answeringMachine("지금은 전화를 받을 수 없습니다.");
        telephone.callPhone("010-1111-1234");
        telephone.receivePhone("010-2222-1234");

        featurePhone.sendSMS("010-3333-5678", "인터페이스를 배우고 있습니다.");

//        smartPhone.installApp("카카오톡");
    }
}
