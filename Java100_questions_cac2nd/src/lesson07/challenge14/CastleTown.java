/**
 * 第7章 武士のお仕事
 *
 * 問題14 複数のインターフェースを実装する
 *
 * 勘定奉行インタフェース、文化人インターフェースを実装する。
 *
 * 藩士クラスに勘定奉行インターフェースと文化人インターフェースを
 * 実装してください。
 *
 * <実行例>
 * 藩士1：
 * 藩の資産を計算するよ～。
 * 茶道を嗜むよ～。
 *
 */

package lesson07.challenge14;

//ここにIChiefTreasurerインターフェースを記述
interface ICiefTreasurer {
	void figure();
}

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
class Retainer extends Samurai implements ICelebrity, ICiefTreasurer {
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

	//ここに適切な処理を記述;
	@Override
	public void learn() {
		System.out.println("茶道を嗜むよ～。");

	}

	@Override
	public void figure() {
		System.out.println("藩の資産の計算するよ～。");

	}

}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");
		Retainer retainer = new Retainer();
		retainer.figure();
		retainer.learn();
	}
}
