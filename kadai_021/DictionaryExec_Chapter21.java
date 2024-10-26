package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		
		dic.add();
		
        // 調べる単語の配列を作成
        String[] Array = {"apple", "banana", "grape", "orange"};

        // 配列の単語を繰り返し処理して辞書で調べる
        for (String word : Array) {
            dic.search(word);
        }

	}

}
