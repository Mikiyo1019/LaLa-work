package ex3;
public class Ex3_6 {
    public static void main (String[] args) {
        System.out.println("数当てゲーム");
        int ans = new java.util.Random().nextInt(9) + 1;
        //System.out.println("com:" + ans);
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "回目:com" + ans + ":0～9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num == ans) {
                System.out.println("アタリ!");
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}