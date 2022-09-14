public class NoLowerAlphaException extends  Exception 
{
		public NoLowerAlphaException(String errormessage, Throwable err)
		{
			super(errormessage,err);
		}
}