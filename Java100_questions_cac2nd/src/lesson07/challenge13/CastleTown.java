/**
 * 第7章 武士のお仕事
 *
 * 問題13 インターフェース②
 *
 * 文化人インターフェースを作る。
 *
 * 抽象メソッドlearn()を持つ文化人インターフェースICelebrityを
 * 作成し、藩士クラスと浪人クラスにそれぞれ実装し、<実行例>と
 * 同じメッセージを表示してください。
 *
 * <実行例>
 * 藩士1：
 * 茶道を嗜むよ～。
 *
 * 浪人1：
 * 塾を開くよ～。
 *
 *
 */

package lesson07.challenge13;

//ここにICelebrityインターフェースを記述
interface ICelebrity {
	void learn();
}

//ここにSamuraiクラスを記述
abstract class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	abstract void work();
}

//ここにRetainerクラスを記述
class Retainer extends Samurai implements ICelebrity {
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

	@Override
	public void learn() {
		System.out.println("茶道を嗜むよ～。");

	}
}

//ここにRoninクラスを記述
class Ronin extends Samurai implements ICelebrity {

	public Ronin() {
	}

	public Ronin(String name) {
		this.name = name;
	}

	void covered() {
		System.out.println("傘張りするよ～。");
	}

	@Override
	void work() {
		System.out.println("傘張るよ～。");
	}

	@Override
	public String toString() {
		return "拙者は武州〇△□村の浪人" + name + "ともうす。";
	}

	@Override
	public void learn() {
		System.out.println("塾を開くよ～");
	}

}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		//ここに適切な処理を記述
		Retainer retainer = new Retainer();
		retainer.learn();

		System.out.println("\n浪人1：");

		//ここに適切な処理を記述
		Ronin ronin = new Ronin();
		ronin.learn();

	}
}
