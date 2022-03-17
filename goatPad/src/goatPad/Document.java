package goatPad;

import java.util.ArrayList;

public class Document {

	ArrayList<String> inputs = new ArrayList<String>();
	String content = "";

	String copiedContent;

	public Document() {

	}

	/**
	 * returns highlighted string
	 * 
	 * @return
	 */
	public String getHighlight() {
		return content;
	}

	/**
	 * tracks last input to undo/re-do
	 * 
	 * @param file
	 * @return
	 */
	public String lastInput() {
		return inputs.get(inputs.size() - 1);
	}

	/**
	 * returns highlighted strings in an array
	 * 
	 * @return
	 */
	public String[] getHighlightAll() {
		return null;
	}

	public String[] getHighlightAll(boolean posInDropdown) {
		String[] strings = new String[3];
		strings[0] = "word";
		strings[1] = "word";
		strings[2] = "word";

		return strings;
	}

	/**
	 * clears document
	 */
	public void clear() {

	}

	/**
	 * returns all words in document
	 * 
	 * @return
	 */
	public String getAllType() {
		return content;
	}

	/**
	 * adds content to the document
	 * 
	 * @param string
	 */
	public void setContents(String string) {
		inputs.add(string);
		content += string;
	}

	/**
	 * highlights string between given coordinates (Pos)
	 * 
	 * @param x
	 * @param y
	 */
	public void highlightWords(Pos x, Pos y) {

	}

	public void Copypaste(String str) {
		this.copiedContent = str;
		content += str;
	}

	/**
	 * highlights and returns string between given coordinates (Pos)
	 * 
	 * @param x
	 * @param y
	 */
	public String highlightString(Pos x, Pos y) {
		// This is interesting: The x has an (x,y) and the y has an (x,y)
		return "BABAAA";
	}

	/**
	 * Sets document contents from a different documents
	 * 
	 * @param contents
	 */
	public void setContents(Document contents) {
		// TODO Auto-generated method stub

	}
}
