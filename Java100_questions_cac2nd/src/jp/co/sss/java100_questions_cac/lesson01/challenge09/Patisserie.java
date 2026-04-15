/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;
		int chocolatStock = 30;
		int pistacheStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.print("シトロン      >");
		String citronBuyCountStr = br.readLine();
		double citronBuyCount = Integer.parseInt(citronBuyCountStr);

		System.out.print("ショコラ      >");
		String chocolatBuyCountStr = br.readLine();
		double chocolatBuyCount = Integer.parseInt(chocolatBuyCountStr);

		System.out.print("ピスターシュ  >");
		String pistacheBuyCountStr = br.readLine();
		double pistacheBuyCount = Integer.parseInt(pistacheBuyCountStr);

		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolatBuyCount + "個");
		System.out.println("ピスターシュ " + pistacheBuyCount + "個");

		double totalBuyCount = citronBuyCount + chocolatBuyCount + pistacheBuyCount;
		int totalPrice = (int) (250 * citronBuyCount + 280 * chocolatBuyCount + 320 * pistacheBuyCount);

		System.out.println("\n8合計個数　　" + totalBuyCount + "個");
		System.out.println("合計金額　　" + totalPrice + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		citronStock = (int) (citronStock - citronBuyCount);
		chocolatStock = (int) (chocolatStock - chocolatBuyCount);
		pistacheStock = (int) (pistacheStock - pistacheBuyCount);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		int citronPer = (int) (250 * citronBuyCount / totalPrice * 100);
		int chocolatPer = (int) (280 * chocolatBuyCount / totalPrice * 100);
		int pistachePer = (int) (320 * pistacheBuyCount / totalPrice * 100);

		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n売上の割合");
		System.out.println("売上の合計　\\" + totalPrice);
		System.out.println("\n内訳");
		System.out.println("シトロン　　¥￥" + (int) (250 * citronBuyCount) + "・・・" + citronPer + "%");
		System.out.println("ショコラ　　\\" + (int) (280 * chocolatBuyCount) + "・・・" + chocolatPer + "%");
		System.out.println("ピスターシュ　　\\" + (int) (320 * pistacheBuyCount) + "・・・" + pistachePer + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！");
		System.out.println("シトロン・・・" + citronPer + "%");
		System.out.println("ショコラ・・・" + chocolatPer + "%");
		System.out.println("ピスターシュ・・・" + pistachePer + "%");
		System.out.println("\nが楽しめます！");
		System.out.println("値段は￥￥" + (totalPrice) / ((int) totalBuyCount / 10 * 10) + "です。");

	}

}
