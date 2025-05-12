package chapter06;

public class forTestArray {
    public static void main(String[] args) {
        String[][] teamArray = {
                {"A1", "A2", "A3", "A4"},
                {"B1", "B2", "B3"},
                {"C1", "C2", "C3", "C4"},
                {"D1", "D2"},
                {"E1", "E2", "E3"}};

        for(int i = 0; i < teamArray.length; i++){
            System.out.print(i+1+"팀: ");
            for(int j = 0; j < teamArray[i].length; j++){
                System.out.print(teamArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
