package src.is.hi.cms5.hbv202g.ass3.backend;
import static java.util.Locale.ENGLISH;
import static java.util.Locale.GERMAN;

public class Greeter {

	private Language language = Language.ENGLISH;

	public void setEnglish() {
		language = Language.ENGLISH;
	}

	public void setGerman() {
		language = Language.GERMAN;
	}

	public String greet() {
		switch (language) {
		case ENGLISH:
			return "Hello world!";
		case GERMAN:
			return "Hallo Welt!";
		default:
			return "UNKOWN LANGUAGE";
		}
	}
}