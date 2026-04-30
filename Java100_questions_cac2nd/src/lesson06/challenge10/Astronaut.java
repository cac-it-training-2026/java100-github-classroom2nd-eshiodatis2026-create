/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題10 Stringクラス②（length、subString）
 *
 * 宇宙船が次の目的地β星に到着しました。
 * β星は不思議な星です。β星人たちは
 * 自分の持物を必ず5文字以内で表記します。
 * 例えば、「apple」は「apple」のまま使いますが、
 * 「orange」は「orang」に変更して使います。
 *
 * β星人クラスBetalianを新たに作成してください。
 * BetalianはString型フィールドitemを持ち、
 * メソッドsetItem()で登録します。setItem()は
 * 5文字以上ある名前については、6文字目以降を削ってから
 * itemに登録します。
 *
 * <実行例>
 *
 * β星人にアイテムを渡してください＞orange
 *
 * β星人：
 * ありがとうベータ！
 * このorang大事にするベータ。
 *
 */

package lesson06.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにBetalianクラスを記述する
class Betalian {
	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		if (item.length() > 5) {
			item = item.substring(0, 5);//文字列itemの先頭0番目から5文字目の直前まで切り出す

		}
		this.item = item;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("β星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Betalian betalian = new Betalian();
		betalian.setItem(present);

		String item = null;//空箱用意

		//ここに適切な処理を記述する
		item = betalian.getItem();

		System.out.println("\nβ星人：");
		System.out.println("ありがとうベータ！");
		System.out.println("この" + item + "大事にするベータ。");
	}
}
