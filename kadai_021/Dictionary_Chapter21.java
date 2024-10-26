package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> dictinary = new HashMap<String,String>();
	
	public void add() {
		dictinary.put("apple","りんご");
		dictinary.put("peach","桃");
		dictinary.put("banana","バナナ");
		dictinary.put("lemon","レモン");
		dictinary.put("pear","梨");
		dictinary.put("kiwi","キウィ");
		dictinary.put("strawberry","いちご");
		dictinary.put("grape","ぶどう");
		dictinary.put("muscat","マスカット");
		dictinary.put("cherry","さくらんぼ");
	}
	
	public void search(String word) {
        if (dictinary.containsKey(word)) {
            System.out.println(word + "の意味は" + dictinary.get(word));
        } else {
            System.out.println(word + "は辞書に存在しません");
        }
	}
	
	
	
}
