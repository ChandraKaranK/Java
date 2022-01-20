package Assignment;

public class Vampire {

    int test_even(int num)
    {
        String number = String.valueOf(num);
        int l = number.length();
        if(l%2!=0) {
            num =num*10;
        }
        return num;
    }

    public void calc_vampires(int num)
    {
        int cnt=0;
        int number = num;
        while(cnt>100)
        {
            num = test_even(number);


        }
    }
    public static void main(String args[])
    {
        Vampire v = new Vampire();
        int num = 1260;
        v.calc_vampires(num);
    }
}
