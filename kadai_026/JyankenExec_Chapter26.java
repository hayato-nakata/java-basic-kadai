package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		
		Jyanken_Chapter26 jyan = new Jyanken_Chapter26();
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String mychoice = jyan.getMyChoice();
		String yourchoice =jyan.getRandom();
		jyan.playGame(mychoice,yourchoice);

	}

}
