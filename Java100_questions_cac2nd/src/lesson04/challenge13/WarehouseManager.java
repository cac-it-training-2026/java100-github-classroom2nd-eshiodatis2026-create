/**
 * 第4章 倉庫番のお仕事
 *
 * 問題13 あいさつロボット
 *
 * XO商事では来客対応用にあいさつロボット「MISAKI○」を
 * 中古で購入しました。
 * しかし残念なことに前のオーナーが寿司屋だったらしく
 * MISAKI○には寿司屋用のあいさつ音声しか入っていません。
 *
 * そこでYさんは、MISAKI○の音声を録音し直すことにしました。
 * 音声のパターンは全部で三つあり、それぞれ
 *
 * 1...お客様が来社された時のあいさつ
 * 2...ご用件をうかがう際のあいさつ
 * 3...お客様がお帰りになる時のあいさつ
 *
 * となっています。
 * ただし、三つのパターンのうち、
 * 変更できるパターンは一つだけです。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Yさん：
 *  まず、MISAKI○の今の状態を確かめようかな。
 *
 *  あいさつパターン1...「へい！らっしゃい！！」
 *
 *  あいさつパターン2...「何にしますか！今日は活きのいいコハダが入ってますよ」
 *
 *  あいさつパターン3...「まいどあり！！またどうぞ」
 *
 *  Yさん：
 *  うわぁ～。どれか変更しよう。
 *
 *  どのパターンを変更しますか＞2
 *
 *  あいさつを吹き込んでください＞ご用件をお伺い致します。
 *
 *  Yさん：
 *  よし。もう一度確かめてみよう。
 *
 *  あいさつパターン1...「へい！らっしゃい！！」
 *
 *  あいさつパターン2...「ご用件をお伺い致します。」
 *
 *  あいさつパターン3...「まいどあり！！またどうぞ」
 *
 *  Yさん：
 *  まあ少しはマシになったかな。
 *
 */

package lesson04.challenge13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarehouseManager {

	public static void main(String[] args) throws IOException {

		//配列の宣言および初期化処理を記述する
		String[] grettingArray = { "へい！らっしゃい！！", "何にしますか！今日は活きのいいコハダが入ってますよ", "まいどあり！！またどうぞ" };

		System.out.println("Yさん：");
		System.out.println("まず、MISAKI○の今の状態を確かめようかな。\n");

		//三つのあいさつパターンの出力処理を記述する
		System.out.println("あいさつパターン1・・・" + grettingArray[0]);
		System.out.println("あいさつパターン２・・・" + grettingArray[1]);
		System.out.println("あいさつパターン３・・・" + grettingArray[2]);

		System.out.println("Yさん：");
		System.out.println("うわぁ～。どれか変更しよう。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//入力処理および入力値の代入処理
		System.out.println("どのパターンを変更しますか＞");
		String numStr = br.readLine();
		int num = Integer.parseInt(numStr) - 1;//ユーザ入力：1～3、配列のIndex；0～2

		System.out.println("あいさつを吹き込んでください＞ご用件をお伺いします。");
		String aisatu = br.readLine();

		grettingArray[num] = aisatu;//吹き込まれたあいさつをパターンに代入

		System.out.println("\nYさん：");
		System.out.println("よし。もう一度確かめてみよう。\n");

		//三つのあいさつパターンの出力処理を記述する
		System.out.println("あいさつパターン１・・・" + grettingArray[0]);
		System.out.println("あいさつパターン２・・・" + grettingArray[1]);
		System.out.println("あいさつパターン３・・・" + grettingArray[2]);

		System.out.println("Yさん：");
		System.out.println("まあ少しはマシになったかな。");
	}
}
