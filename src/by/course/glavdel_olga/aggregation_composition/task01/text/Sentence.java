package by.course.glavdel_olga.aggregation_composition.task01.text;

import java.util.Arrays;

public class Sentence {

	private Word[] word;

	Word word0 = new Word();

	public Sentence() {
		this.word = new Word[] { new Word() };
	}

	public Sentence(Word... word) {
		this.word = new Word[word.length];
		this.word = word;
	}

	public void printSentence(Sentence sentence) {

		for (int i = 0; i < sentence.getWord().length; i++) {

			word0.print(sentence.getWord()[i]);
		}
		System.out.println(". ");
	}

	public Sentence addWord(String word, Sentence sentence) {

		Word[] wordsNew = new Word[sentence.getWord().length + 1];

		for (int i = 0; i < sentence.getWord().length; i++) {

			wordsNew[i] = sentence.getWord()[i];
		}

		wordsNew[wordsNew.length - 1] = new Word(word);

		Sentence sentenceNew = new Sentence(wordsNew);

		return sentenceNew;
	}

	public Word[] getWord() {
		return word;
	}

	public void setWord(Word[] word) {
		this.word = word;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(word);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (!Arrays.equals(word, other.word))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [word=" + Arrays.toString(word) + "]";
	}

}
