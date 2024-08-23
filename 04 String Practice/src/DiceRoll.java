public class DiceRoll {
    public int diceRoll(){
        return (int) Math.ceil(Math.random() * 6);
    }

    public static void main(String[] args) {
        DiceRoll roll10Times = new DiceRoll();
        for (int i = 0; i < 10; i++) {
            System.out.println(roll10Times.diceRoll());
        }
    }
}