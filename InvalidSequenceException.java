public class InvalidSequenceException extends  Exception 
{
		public InvalidSequenceException(String errormessage, Throwable err)
		{
			super(errormessage,err);
		}
}