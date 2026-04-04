package codemigaki;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * コンソールからの入力を扱うクラス。
 */
public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * コンソールから文字列を1行読み取る。
     * 
     * @return 読み取った文字列。
     * 
     * @throws NoSuchElementException 入力が必要なタイミングで入力しなかった場合。
     * @throws IllegalStateException  コンソールがクローズされている場合。
     */
    public static String getString() throws NoSuchElementException, IllegalStateException {
        return scanner.nextLine();
    }

    /**
     * コンソールから整数を1つ読み取る。
     * 
     * @return 読み取った整数。
     * 
     * @throws InputMismatchException 入力内容が整数として不正な場合。
     * @throws NoSuchElementException 入力が必要なタイミングで入力しなかった場合。
     * @throws IllegalStateException  コンソールがクローズされている場合。
     */
    public static int getInt() throws InputMismatchException, NoSuchElementException, IllegalStateException {
        int n = scanner.nextInt();
        scanner.nextLine(); // nextInt()は改行を拾わないので、ここで改行を読み捨てておく。
        return n;
    }
}
