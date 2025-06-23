package chapter08.Phone;

// 아래 callPhone/receivePhone 구현해야 오류 안나는데, 첫 생성 후 오류 났을 떄 우클릭 > 메서드 구현 눌러서 빠르게 구현가능함.
public class TelePhone implements Phone {

    @Override
    public void callPhone(String phoneNumber) {

    }

    @Override
    public void receivePhone(String phoneNumber) {

    }

    public void answeringMachine(String message){
        System.out.println("Telephone message: "+message);
    }
}
