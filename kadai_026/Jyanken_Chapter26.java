package kadai_026;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		try {
			String input= scanner.next();
	      
			if (input.equals("r") || input.equals("p") || input.equals("s")  ) {
				System.out.println(input);
				return input;
			}
			else {
				System.out.println("rまたはpまたはsを入力してください。");
				return getMyChoice();
			}
		} finally {
			scanner.close();
		}
	}
	
	
	public String getRandom() {
		
		String[] hands = { "r", "p", "s" };
		
        // Randomクラスのインスタンスを生成
        Random random = new Random();
        
        double randomDouble  = random.nextDouble() * 3; 
        
        int number = (int) Math.floor(randomDouble);
        
        return hands[number];
	}
	
	
	public void playGame(String my , String your) {
		HashMap<String,String> role = new HashMap<String,String>();

		role.put("r","グー");
		role.put("s","チョキ");
		role.put("p","パー");
		
		System.out.println("自分の手は" + role.get(my) + ",対戦相手の手は" + role.get(your));
		
		if(my.equals(your)){
			System.out.println("あいこです");
		}
		else if((my.equals("r") && your.equals("p")) || 
				 (my.equals("s") && your.equals("r")) || 
				 (my.equals("p") && your.equals("s"))){
			System.out.println("自分の負けです");
		}
		else {
			System.out.println("自分の勝ちです");
		}
	}
}
