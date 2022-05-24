package ex3;
public class Ex3_3 {
    public static void main (String[] args) {
        int isHungry = 0;
        String food = "スープ";
        System.out.println("こんにちは");
        //String msg = (isHungry == 0) ? "お腹がいっぱいです" : "はらぺこです";
        if (isHungry == 0) {
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです" + food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");
    }
}