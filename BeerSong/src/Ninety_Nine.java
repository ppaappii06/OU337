/**
 * Created by Matt on 1/30/2016.
 */
public class Ninety_Nine
{
    public void Ninety_Nine_Bottles(){

        int bottles = 99;

        for(int i = bottles; i > 0; i--)
        {
            int minus = (i - 1);
            String word;
            if(i == 1 || minus == 1){
                word = "bottle";
            }
            else{
                word = "bottles";
            }
            System.out.println(i + word + " of beer on the word, " + i + word + " of beer");
            System.out.println("take one down, pass it around," + minus + word + " on the wall");
        }
    }
}
