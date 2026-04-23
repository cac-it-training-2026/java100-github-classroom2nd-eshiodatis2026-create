/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題7  水量を表示する
 *
 * ロボット内の残水量を戻り値として返すメソッドを追加します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Rさん：
 *  でもこれランダムに水を入れた時にロボット内の水量がわかりませんね。
 *
 *  G博士：
 *  そう言えばそうじゃな。よし、ちょっと待っとれ。
 *
 *  G博士：
 *  ......出来た！現在の水量を表示する機能じゃ。
 *
 *  「ガ～ピィーガ～、ゲンザイノスイリョウハ【※残水量】リットルデス。」
 *
 *  Rさん：
 *  なんか雑音が気になりますが、一応出来てますね。
 *
 */

package lesson05.challenge07;

//ここに問題6で作成したクラスに次の条件を足したクラスを作成してください。
//メソッド名：getWater(引数なし、戻り値int、
//現在の水量(フィールドwaterの値)を戻り値として返す)
class Robot {
	int energy;
	String name;
	int water;

	void pumpWater() {
		System.out.println("水を" + water + "リットルだけ出しました。");
	}

	void randomWater() {
		water = (int) (Math.random() * 9) + 1;//0から始まるから、＋1をして1～9にする。
		//		Math.random() * 9 → 0.0〜8.999…
		//		(int) → 0〜8
		//		+ 1 → 1〜9

	}

	void setWater(int water) {
		this.water = water;
	}

	void makeOmelet(int eggNum, int butterNum) {
		int madeOmelet1 = eggNum / 2;//整数除算。余りは切り捨てで商だけ出力
		int madeOmelet2 = butterNum / 5;

		if (madeOmelet1 > madeOmelet2) {
			System.out.println(madeOmelet2 + "人分のオムレツを作成しました。");

		} else {
			System.out.println(madeOmelet1 + "人分のオムレツを作成しました。");
		} //実際に作れる人数は少ない方に制限される
	}

	int getWater() {
		return water;
	}
}

public class RobotMaker {

	public static void main(String[] args) {

		System.out.println("Rさん：");
		System.out.println("でもこれランダムに水を入れた時にロボット内の水量がわかりませんね。\n");
		System.out.println("G博士：");
		System.out.println("そう言えばそうじゃな。よし、ちょっと待っとれ。\n");
		System.out.println("G博士：");
		System.out.println("......出来た！現在の水量を表示する機能じゃ。\n");

		//ここでRobotクラスのインスタンスを作り、
		//（インスタンス名はrobot）
		//randomWaterを実行する。
		//getWaterを実行する。
		Robot robot = new Robot();
		robot.randomWater();
		int water = robot.getWater();
		System.out.println("「ガ～ピィーガ～、ゲンザイノスイリョウハ" + water + "リットルデス。」\n");

		System.out.println("Rさん：");
		System.out.println("なんか雑音が気になりますが、一応出来てますね。\n");
	}

}
