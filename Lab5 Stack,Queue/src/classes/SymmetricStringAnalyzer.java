package classes;

public class SymmetricStringAnalyzer {
	private String s; 
	public SymmetricStringAnalyzer(String s) {
		this.s = s; 
	}

	/**
	 * Determines if the string s is symmetric
	 * @return true if it is; false, otherwise. 
	 */
	public boolean isValidContent() { 

		LLStack<Character> stack = new LLStack<>();
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(Character.isLetter(c))
				if(Character.isUpperCase(c))
					stack.push(c);
				else 
					if(stack.isEmpty())
						return false;
					else
					{
						char t = s.charAt(0);
						if(t== Character.toUpperCase(c))
							stack.pop();
						else return false;

					}
			else return false;
		}
		return true;
	}

	public String toString() { 
		return s; 
	}

	public String parenthesizedExpression() 
			throws StringIsNotSymmetricException 
	{
		// ADD MISSING CODE
		if(!isValidContent())
			throw new StringIsNotSymmetricException();
		else 
		{
			LLStack<Character> stack = new LLStack<>();
			//hacer aqui lo de parentesis de a libreta.

		}

		return null;  // need to change if necessary....
	}

}
