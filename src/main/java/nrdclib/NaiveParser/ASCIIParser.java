package nrdclib.NaiveParser;

import nrdclib.NaiveParser.token.ASCIITokenizer;
import nrdclib.NaiveParser.token.Token;
import nrdclib.NaiveParser.token.ASCIIToken;
import java.util.ArrayList;

/**
 * {@code ASCIIParser} is a class that represents a parser for ASCII characters. It is a subclass of {@code Parser}
 * and uses an {@code ASCIITokenizer} object to tokenize the input.
 * 
 * @authhor nrdc
 * @version 1.0
 * @since 1.0
 * @see Parser
 * @see ASCIITokenizer
 * @see ASCIIToken
 */
public class ASCIIParser extends Parser{
	/**
	 * Constructor for {@code ASCIIParser} class
	 */
	public ASCIIParser() {
        super(new ASCIITokenizer());
    };
    
	/**
	 * Constructor for {@code ASCIIParser} class
	 * 
	 * @param ASCIITokenizer tokenizer
	 */
    public ASCIIParser(ASCIITokenizer tokenizer) {
        super(tokenizer);
    };
    
    
    //	Program method
	ArrayList<ASCIIToken> run(String input) {
		setInput(input);
		parse();
		ArrayList<ASCIIToken> asciiTokens = new ArrayList<ASCIIToken>();
		for (Token token : getTokens()) {
			asciiTokens.add((ASCIIToken) token);
		};
		return asciiTokens;
	};
	
	
	//	Main method
	//	Usage: java ASCIIParser
	public static void main(String[] args) {
		ASCIIParser asciiParser 			= new ASCIIParser();
		String input 						= "Hello, World!";
		ArrayList<ASCIIToken> asciiTokens 	= asciiParser.run(input);
		
		for (ASCIIToken token : asciiTokens) {
			System.out.println(token.toString());
		};
	};
    
}
