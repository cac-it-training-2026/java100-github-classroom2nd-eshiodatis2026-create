/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題15 メソッドに参照渡し
 *
 * 地球に帰ってきました。
 * 帰路さまざまな障害を乗り越えて来ましたので、
 * 宇宙船がかなりの損傷を受けています。
 * ドックに預けて修理をしてもらいましょう。
 *
 * 宇宙船クラス（Spaceship）にダメージ(damage)とsetter、getterを記述し、
 * ドッククラス（Dock）にメソッドpublic void repairShip(Spaceship ship)
 * を記述してください。
 * メソッドrepairShip(Spaceship ship)は引数shipのダメージを0にします。
 *
 * <実行例>
 *
 * 宇宙飛行士：
 * やっとのことで帰ってきたけど、損傷がひどいな。
 * 修理に出そう。
 *
 * ダメージを入力してください＞200
 *
 * 現在のダメージ：200
 *
 * 宇宙飛行士：
 * よし！ドックから戻ってきたぞ！
 *
 * 現在のダメージ：0
 *
 */

package lesson06.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにSpaceshipクラスを記述する
class Spaceship {
	private int damage;

	/**
	 * @return damage
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * @param damage セットする damage
	 */
	public void setDamage(int damage) {
		this.damage = damage;//クラスのフィールド（宇宙船が持っている）＝メソッドの引数（外から渡された値）
		//引数のdamageを、宇宙船のdamageに代入している
	}

}

//ここにDockクラスを記述する
class Dock {
	public void repairShip(Spaceship ship) {//(型　変数名)
		ship.setDamage(0);

	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.println("宇宙飛行士：");
		System.out.println("やっとのことで帰ってきたけど、損傷がひどいな。");
		System.out.println("修理に出そう。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ダメージを入力してください＞");
		String damageStr = br.readLine();
		int damage = Integer.parseInt(damageStr);

		System.out.println("\n現在のダメージ：" + damage);

		//ここに適切な処理を記述する
		Spaceship spaceship = new Spaceship();
		spaceship.setDamage(damage);//実行クラスdamage変数
		//実行クラスのdamage→setDamageの引数damage→this.damage（宇宙船のイメージ）

		Dock dock = new Dock();
		dock.repairShip(spaceship);

		System.out.println("\n宇宙飛行士：");
		System.out.println("よし！ドックから戻ってきたぞ！\n");

		//ここに適切な処理を記述する
		damage = spaceship.getDamage();

		System.out.println("現在のダメージ：" + damage);
	}
}
