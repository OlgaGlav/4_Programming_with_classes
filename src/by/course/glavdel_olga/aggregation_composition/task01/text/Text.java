package by.course.glavdel_olga.aggregation_composition.task01.text;

import java.util.Arrays;

public class Text {

	private Sentence[] sentence;
	private String heading;

	Sentence sent = new Sentence();

	public Text() {
		this.sentence = new Sentence[] { new Sentence() };
		this.heading = "";
	}

	public Text(Sentence[] sentence) {
		this.sentence = new Sentence[sentence.length];
		this.sentence = sentence;
		this.heading = "";
	}

	public Text(String heading, Sentence... sentence) {
		super();
		this.sentence = new Sentence[sentence.length];
		this.sentence = sentence;
		this.heading = heading;
	}

	public void printText(Text text) {
		for (int i = 0; i < text.getSentence().length; i++) {
			sent.printSentence(text.getSentence()[i]);
		}
	}

	public Text addWord(String word, int numberSentence, Text text) {

		Sentence[] sentencesNew = new Sentence[numberSentence + 1];

		if (numberSentence < text.getSentence().length) {

			sentencesNew = copySentence(0, numberSentence, sentencesNew, text);
			
			sentencesNew[numberSentence] = sent.addWord(word, text.getSentence()[numberSentence]);

			sentencesNew = copySentence(numberSentence + 1, sentencesNew.length, sentencesNew, text);

		} else {

			copySentence(0, text.getSentence().length, sentencesNew, text);

			sentencesNew[numberSentence] = new Sentence(new Word(word));
		}

		text = new Text(text.getHeading(), sentencesNew);

		return text;
	}

	private Sentence[] copySentence(int begin, int end, Sentence[] sentencesNew, Text text) {

		for (int i = begin; i < end; i++) {

			sentencesNew[i] = text.getSentence()[i];
		}
		return sentencesNew;
	}

	public Sentence[] getSentence() {
		return sentence;
	}

	public void setSentence(Sentence[] sentence) {
		this.sentence = sentence;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((heading == null) ? 0 : heading.hashCode());
		result = prime * result + Arrays.hashCode(sentence);
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
		Text other = (Text) obj;
		if (heading == null) {
			if (other.heading != null)
				return false;
		} else if (!heading.equals(other.heading))
			return false;
		if (!Arrays.equals(sentence, other.sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [sentence=" + Arrays.toString(sentence) + ", heading=" + heading + "]";
	}

}
