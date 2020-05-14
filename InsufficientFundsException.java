class InsufficientFundsException extends Exception
{
public InsufficientFundsException()
{

}
@override
public String getMessage()
{
return "Insufficient Funds in the Acount";
}
}