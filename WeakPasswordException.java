public class WeakPasswordException extends  Exception 
{
		public WeakPasswordException(String errormessage, Throwable err)
		{
			super(errormessage,err);
		}
}