import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

	class PasswordCheckerUtility 
	{
	public PasswordCheckerUtility() 
	{
	}
	public void comparePasswords(String password, String passwordConfirm) throws UnmatchedException
	{
	if (!comparePasswordsWithReturn(password, passwordConfirm))
	{
	throw new UnmatchedException("The password and the confirm password do not match");
	}
	}
	public boolean comparePasswordsWithReturn(String password,String passwordConfirm) 
	{
	if (password.equals(passwordConfirm)) 
	{
	return true;
	}
	return false;
	}
	public ArrayList<String> getInvalidPasswords(ArrayList<String>passwords) 
	{
	ArrayList <String> invalidPasswords = new ArrayList<>();
	for (String password : passwords) 
	{
	try 
	{
	isValidPassword(password);
	} catch (Exception e) 
	{
	invalidPasswords.add(password + " : " + e.getMessage());
	}
	}
	return invalidPasswords;
	}
	public boolean isWeakPassword(String password) throws Exception 
	{
	throw new WeakPasswordException("The password is to weak.", null);
	}
	public boolean hasBetweenSixAndNineChars(String password) 
	{
	if (password.length() >= 6 && password.length() <= 9) 
	{
	return true;
	}
	return false;
	}
	public boolean hasDigit(String password) throws NoDigitException
	{
	char[] characters = password.toCharArray();
	for(char c : characters) 
	{
	if(Character.isDigit(c)) 
	{
	return true;
	}
	}
	throw new NoDigitException("Password must have at least 1 numeric character.", null);
	}
	public boolean hasLowerAlpha(String password) throws NoLowerAlphaException 
	{
	char[] characters = password.toCharArray();
	for(char c : characters) 
	{
	if(Character.isLowerCase(c)) 
	{
	return true;
	}
	}
	throw new NoLowerAlphaException("Password must have at least 1 lowercase alphabetic character.", null);
	}
	public boolean hasSameCharInSequence(String password) throws InvalidSequenceException 
	{
	char[] characters = password.toCharArray();
	for (int i = 0; i < characters.length; i++) 
	{
	Character c = characters[i];
	if (i >= 3) 
	{
	if (c.equals(characters[i-1]) && c.equals(characters[i-2])) 
	{
	throw new InvalidSequenceException("Password must have no more than 2 of the same character in a sequence.", null);
	}
	}}
	return false;
	}
	public boolean hasSpecialChar(String password) throws NoSpecialCharacterException
	{
	String specialCharactersString = "..!@#$%&*()'+,-./:;<=>?[]^_`{|}";
	char[] characters = password.toCharArray();
	for(char c : characters) 
	{
	if(specialCharactersString.contains(Character.toString(c))) 
	{
	return true;
	}
	}
	throw new NoSpecialCharacterException("Password must have at least 1 special character.", null);
	}
	public boolean hasUpperAlpha(String password) throws NoUpperAlphaException 
	{
	char[] characters = password.toCharArray();
	for(char c : characters) 
	{
	if(Character.isUpperCase(c)) 
	{
	return true;
	}
	}
	throw new NoUpperAlphaException("Password must have at least 1 uppercase alphabetic character,", null);
	}
	public boolean isValidLength(String password) throws LengthException 
	{
	if (password.length() > 6) 
	{
	return true;
	}
	throw new LengthException("Password must be at least 6 or more characters long.");
	}
	public boolean isValidPassword(String password)
	throws LengthException,NoUpperAlphaException,NoLowerAlphaException,NoDigitException,NoSpecialCharacterException,InvalidSequenceException 
	{
	try 
	{
	isValidLength(password);
	}
	catch (LengthException e) {
	throw new LengthException(e.getMessage());
	}
	try 
	{
	hasUpperAlpha(password);
	}
	finally
	{
		
	}
	try 
	{
	hasLowerAlpha(password);
	}
	catch (NoLowerAlphaException e4)
	{
	throw new NoLowerAlphaException(e4.getMessage(), e4);
	}
	try 
	{
	hasDigit(password);
	}
	catch (NoDigitException e3) 
	{
	throw new NoDigitException(e3.getMessage(), e3);
	}
	try 
	{
	hasSpecialChar(password);
	} 
	catch (NoSpecialCharacterException e2) 
	{
	throw new NoSpecialCharacterException(e2.getMessage(), e2);
	}
	try 
	{
	hasSameCharInSequence(password);
	} catch (InvalidSequenceException e1) 
	{
	throw new InvalidSequenceException(e1.getMessage(), e1);
	}
	return true;
	}	
}
