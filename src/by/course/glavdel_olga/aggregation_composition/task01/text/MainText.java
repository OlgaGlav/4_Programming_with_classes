package by.course.glavdel_olga.aggregation_composition.task01.text;

// Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль текст,
//заголовок текста

public class MainText {

	public static void main(String[] args) {

		Word word1 = new Word("каждый");
		Word word2 = new Word("охотник");
		Word word3 = new Word("желает");
		Word word4 = new Word("знать");
		Word word5 = new Word("где");
		Word word6 = new Word("сидит");
		Word word7 = new Word("фазан");
		
		Word word8 = new Word("эта");
		Word word9 = new Word("считалка");
		Word word10 = new Word("поможет");
		Word word11 = new Word("выучить");
		Word word12 = new Word("цвета");
		Word word13 = new Word("радуги");

		Sentence sentence1 = new Sentence(word1, word2, word3, word4, word5, word6, word7);
		Sentence sentence2 = new Sentence(word8, word9, word10, word11, word12, word13);

		Text text = new Text("Считалочка", sentence1, sentence2);

		Logic logic = new Logic();

		logic.printHeading(text);

		logic.printText(text);

		logic.addWord("dvnfdjvndf", text);

	}

}
