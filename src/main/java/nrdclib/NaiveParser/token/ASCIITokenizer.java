package nrdclib.NaiveParser.token;

import java.util.ArrayList;
import java.util.HashMap;

public class ASCIITokenizer extends Tokenizer {	
	public ASCIITokenizer() {
		super();
		setTokenTypes();
		setTokenRegex();
		setTokenTypesMap();
    };
    
    //    Initialization methods
	/**
	 * Set the token types for the {@code ASCIITokenizer}
	 */
    public void setTokenTypes() {
    	TOKEN_TYPES = new ArrayList<String>();
    	TOKEN_TYPES.add("LOWERCASE_CHAR");
    	TOKEN_TYPES.add("UPPERCASE_CHAR");
    	TOKEN_TYPES.add("DIGIT");
    	TOKEN_TYPES.add("SPECIAL_CHAR");
    	TOKEN_TYPES.add("SPACE");
    	TOKEN_TYPES.add("NEWLINE");
    	TOKEN_TYPES.add("INVALID");
    };
    
	/**
	 * Set the token regex for the {@code ASCIITokenizer}
	 */
	public void setTokenRegex() {
		TOKEN_REGEX = new HashMap<String, String>();
		TOKEN_REGEX.put("LOWERCASE_CHAR", "[a-z]");
		TOKEN_REGEX.put("UPPERCASE_CHAR", "[A-Z]");
		TOKEN_REGEX.put("DIGIT", "[0-9]");
		TOKEN_REGEX.put("SPECIAL_CHAR", "[^a-zA-Z0-9\\s]");
		TOKEN_REGEX.put("SPACE", "\\s");
		TOKEN_REGEX.put("NEWLINE", "\\n");
		TOKEN_REGEX.put("INVALID", ".");
	};

	/**
	 * Set the token types map for the {@code ASCIITokenizer}
	 */
	public void setTokenTypesMap() {
		TOKEN_TYPES_MAP = new HashMap<String, String>();
        TOKEN_TYPES_MAP.put("LOWERCASE_CHAR", "LOWERCASE_CHAR");
        TOKEN_TYPES_MAP.put("UPPERCASE_CHAR", "UPPERCASE_CHAR");
        TOKEN_TYPES_MAP.put("DIGIT", "DIGIT");
        TOKEN_TYPES_MAP.put("SPECIAL_CHAR", "SPECIAL_CHAR");
        TOKEN_TYPES_MAP.put("SPACE", "SPACE");
        TOKEN_TYPES_MAP.put("NEWLINE", "NEWLINE");
        TOKEN_TYPES_MAP.put("INVALID", "INVALID");
    };
	
    //    Setters
    /**
     * Set the current token for the {@code ASCIITokenizer}
     * 
     * @param ASCIIToken token
     * @return void
     */
    public void setCurrentToken(Token t) {
		currentToken = t;
	};
    
	/**
	 * Set the current type for the {@code ASCIITokenizer}
	 * 
	 * @param String type
	 * @return void
	 */
	public void setCurrentType() {
		if (currentToken == null) {
			currentType = null;
			return;
		}
		currentType = currentToken.getType();
	};
	
	/**
	 * Set the current value for the {@code ASCIITokenizer}
	 * 
	 * @param char value
	 * @return void
	 */
	public void setCurrentValue() {
		if (currentToken == null) {
			currentValue = '\0';
			return;
		}
		currentValue = currentToken.getValue();
    }

	
    
	// main
	public static void main(String[] args) {
		ASCIITokenizer tokenizer = new ASCIITokenizer();
		
		ArrayList<Token> Tokens = (ArrayList<Token>) tokenizer.tokenize("aA1! ahaha BabaS999");
		System.out.print(Tokens.size() + " tokens:\n\n");
		for (Token t : Tokens) {
			System.out.println(t);
		}
	}
	
}
