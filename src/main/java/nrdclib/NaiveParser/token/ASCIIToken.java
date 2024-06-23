package nrdclib.NaiveParser.token;

/**
 * Represents a token that is an ASCII character
 */
public class ASCIIToken extends Token{
	private char value;
	private String type;
	
	/**
	 * Constructor for {@code ASCIIToken} class
	 * 
	 * @param String type
	 * @param char   value
	 */
	public ASCIIToken(String type, char value) {
		super(type, value);
		this.type = type;
		this.value = value;
	};
	
	/**
	 * Constructor for {@code ASCIIToken} class
	 * 
	 * @param char value
	 */
	public ASCIIToken(char value) {
		super(value);
		this.value = value;
		this.type = null;
	};
	
	/**
	 * Constructor for {@code ASCIIToken} class
	 */
	public ASCIIToken() {
		super();
		this.value = '\0';
		this.type = null;
	};

	/**
	 * Returns a String representation of the {@code ASCIIToken}
	 * 
	 * @return String
	 */
    public String toString() {
    	return "<T:" + type + ",v:\"" + value + "\">";
    };
    
    /**
     * Check if a given {@code ASCIIToken} is equal to this {@code ASCIIToken}
     * 
     * @param ASCIIToken token
     * @return boolean
     */
    public boolean equals(Token t) {
		return value == t.getValue();
	};
	
	/**
	 * Check if this {@code ASCIIToken} is a valid token.
	 * 
	 * @return boolean
	 */
	public boolean isValid() {
		return value != '\0';
    };

};
