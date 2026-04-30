/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題11 Stringクラス③（indexOf）
 *
 * 宇宙船が次の目的地γ星に到着しました。
 * γ星は不思議な星です。γ星人たちは
 * 名前に数字が入っているものを珍重しています。
 * 例えば、「アリナミン5」は大事にしていますが
 * 「アリナミンEX」は大事にしていません。
 *
 * γ星人クラスGammalianを新たに作成してください。
 * GammalianはString型フィールドitem、boolean型フィールドisGood
 * を持ち、メソッドsetItem()で登録します。setItem()は文字列中に
 * 数字が含まれていれば、isGoodをtrueにした後にitemに登録し、
 * 含まれていなければ、isGoodをfalseにした後に登録します。
 *
 * <実行例1>
 *
 * γ星人にアイテムを渡してください＞TanquerayNo.10
 *
 * γ星人：
 * こんな良いものをもらっていいガンマか！
 * ゆっくりしていくガンマ。
 *
 * <実行例2>
 *
 * γ星人にアイテムを渡してください＞orange
 *
 * γ星人：
 * ...ありがとガンマ。
 * ぶぶ漬けでもいかがガンマか？
 *
 */

package lesson06.challenge11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにGammalianクラスを記述する
class Gammalian {
	private String item;
	private boolean isGood;//もらったアイテムがいいものがどうか

	public String getItem() {//アイテム名を取得するためのメソッド
		return item;
	}

	public void setItem(String item) {//アイテム名を設定する、いいアイテムかどうか判定する
		boolean isHit = false;//数字が含まれているかどうかの判定フラグ、最初は含まれていないと仮定
		for (int i = 0; i < 10; i++) {
			if (item.indexOf(Integer.toString(i)) != -1) {//indexOfが－1でなければ含まれている
				isHit = true;//数字が見つかったらtrue
				break;
			}
		}
		if (isHit) {
			isGood = true;
		} else {
			isGood = false;//数字を含んでいればいいアイテム、含まなければ普通のアイテム（γ星人は数字が好きという設定）
		}
		this.item = item;

	}

	public boolean isGood() {
		return isGood;
	}

	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("γ星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Gammalian gammalian = new Gammalian();
		gammalian.setItem(present);

		boolean isGood = false;//判定結果を受け取る変数を用意

		//ここに適切な処理を記述する
		isGood = gammalian.isGood();//γ星人の判定結果を取得

		System.out.println("\nγ星人：");
		if (isGood) {
			System.out.println("こんな良いものをもらっていいガンマか！");
			System.out.println("ゆっくりしていくガンマ。");
		} else {
			System.out.println("...ありがとガンマ。");
			System.out.println("ぶぶ漬けでもいかがガンマか？");
		}
	}
}
