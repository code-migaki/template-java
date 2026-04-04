package codemigaki.practice0;

import codemigaki.Input;

/**
 * 課題0
 * 
 * 2つの整数を入力させ、合計を表示する。
 * 
 */
public class Practice {
    /**
     * 課題のエントリーポイント。
     */
    public void run() {
        System.out.println("1つめの数は？");
        int n1 = Input.getInt();

        System.out.println("2つめの数は？");
        int n2 = Input.getInt();

        int sum = n1 + n2;

        System.out.println("合計：" + sum);
    }
}
