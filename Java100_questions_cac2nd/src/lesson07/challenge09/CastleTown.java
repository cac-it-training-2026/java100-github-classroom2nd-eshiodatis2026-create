/**
 * 第7章 武士のお仕事
 *
 * 問題9  getClass()メソッドの利用
 *
 * 侍クラスのサブクラスをまとめて扱う。
 *
 * 要素数5の侍クラスの配列を用意し、
 * 藩士クラス、浪人クラスの何れかをランダムで代入します。
 * getClass()メソッドを使いそれぞれの要素に何のクラスの
 * オブジェクトが入ったか表示してください。
 * （藩士クラス、浪人クラスともに
 *   デフォルトコンストラクタを用意します）
 *
 * <実行例>
 * 5人の侍を配列に詰めます。
 *
 * 詰め終わりました。
 *
 * それぞれ表示してみます。
 *
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Retainer
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Retainer
 *
 */

package lesson07.challenge09;

class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

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
		System.out.println("5人の侍を配列に詰めます。\n");

		//ここに適切な処理を記述
		Samurai[] samuraiArray = new Samurai[5];
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 10) % 2;
			if (num == 0) {
				samuraiArray[i] = new Retainer();
			} else {
				samuraiArray[i] = new Ronin();
			}
		}

		System.out.println("詰め終わりました。\n");
		System.out.println("それぞれ表示してみます。\n");

		//ここに適切な処理を記述
		for (int i = 0; i < 5; i++) {
			System.out.println(samuraiArray[i].getClass());

		}

	}
}
