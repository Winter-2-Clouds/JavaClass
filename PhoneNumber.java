public class PhoneNumber 
{
    private int areaCode;
    private int sevenDigits;

    PhoneNumber(int areaCode, int sevenDigits)
    {
        this.areaCode = areaCode;
        this.sevenDigits = sevenDigits;
    }

    PhoneNumber(int number)
    {
        String nnumberStr = Integer.toString(number);
        String areaCodeStr = numberStr.substring(0,3);
        String sevenDigStr = numberStr.substring(3, numberStr.substring);

        areaCode= Integer.parseInt()
    }

    PhoneNumber(int )
}
