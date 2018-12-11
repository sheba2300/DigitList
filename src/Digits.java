import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        String numString = String.valueOf(num);
        for(int x = 0; x<numString.length();x++)
        {
            digitList.add(Integer.valueOf(numString.substring(x,x+1)));
        }
    }
    public boolean isStrictlyIncreasing()
    {
        for(int x = 1; x<digitList.size();x++)
        {
            if(digitList.get(x) <= digitList.get(x-1))
            {
                return false;
            }
        }
        return true;
    }
    public ArrayList getDigitList()
    {
        return digitList;
    }
}
