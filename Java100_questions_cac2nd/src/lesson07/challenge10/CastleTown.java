/**
 * 第7章 武士のお仕事
 *
 * 問題10  抽象クラス
 *
 * 抽象クラス、抽象メソッドを作る。
 *
 * 侍クラスのwork()メソッドを抽象化してください。
 *
 * <実行例>
 * 侍は働きます。
 *
 * 具体的に言うと藩士は年貢を取り立てます。
 *
 * 藩士1：
 * 年貢を取り立てるよ～。
 *
 * 具体的に言うと浪人は傘張りをします。
 *
 * 浪人1：
 * 傘張るよ～。
 *
 */

package lesson07.challenge10;

//ここにSamuraiクラスを記述
abstract class Samurai {

	protected String name;

	void fight() {
		System.out.println("");
	}

	abstract void work();
}

//ここにRetainerクラスを記述
class Retainer extends Samurai {
	protected String domain;

	/**
	 * @param domain
	 */
	public Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	public Retainer() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	@Override
	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	@Override
	public String toString() {//toStringはStringを返すメソッド。
		//オブジェクトクラスにもともと存在している。
		//自分で書くことでオーバーライド（再定義する）
		return "拙者は〇△□藩士、" + name + "ともうす。";
	}

	//equalsメソッドはオブジェクトクラスに元からある。
	//渡されたオブジェクトと自分自身が等しいかどうかを判定する
	@Override
	public boolean equals(Object object) {
		boolean isMatch;//is○○は慣習で使っている。○○であるか？判定結果を入れる変数宣言
		Retainer retainer = (Retainer) object;//引数obujectをRetainer型にキャスト
		if (this.domain.equals(retainer.domain)) {//this.domeinとretainer.domainの文字列が同じか比較
			isMatch = true;
		} else {
			isMatch = false;
		}
		return isMatch;//判定結果を呼び出し元に返す

	}
}

//ここにRoninクラスを記述
class Ronin extends Samurai {

	public Ronin() {
	}

	public Ronin(String name) {
		this.name = name;
	}

	void convered() {
		System.out.println("傘張りするよ～。");
	}

	@Override
	void work() {
		System.out.println("傘張るよ～。");
	}

	@Override
	public String toString() {
		return "拙者は武州〇△□村の浪人" + name + "ともうす";
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("侍は働きます。");

		System.out.println("\n具体的に言うと藩士は年貢を取り立てます。\n");

		System.out.println("藩士1：");

		//ここに適切な処理を記述
		Retainer retainer1 = new Retainer();
		retainer1.work();

		System.out.println("\n具体的に言うと浪人は傘張りをします。\n");

		System.out.println("浪人1：");

		//ここに適切な処理を記述
		Ronin ronin = new Ronin();
		ronin.work();

	}
}
