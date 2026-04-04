package codemigaki;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import codemigaki.practice0.Practice;

/**
 * プログラムのエントリーポイント。
 */
public class Main {
    /**
     * プログラムのエントリーポイント。
     * 
     * @param args プログラムの起動引数。
     */
    public static void main(String[] args) {
        try {
            new Practice().run();
        } catch (InputMismatchException e) {
            // Scannerでの読み取りで入力内容が不正(「整数を期待しているのに小数が入力された」など)だと発生する。
            // 本研修では何もせずに終了する。
        } catch (NoSuchElementException e) {
            // Scannerでの読み取り中にCtrl+Zを押すと発生する。
            // 入力が必要なタイミングで入力しなかったので、本研修では何もせずに終了する。
        }
    }
}
