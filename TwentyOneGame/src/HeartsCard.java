public class HeartsCard extends Card{
    public HeartsCard(String value) {
        super(value, "♥");
    }
    public static Card[] prepareHearts()
    {
        Card hearts[] =new HeartsCard[13];

        for (int i=0; i< 13; i++)
        {
            if (i==0)
                hearts[0]= new HeartsCard("A");
            else
            if(i==10)
                hearts[i]= new HeartsCard("J");
            else
            if(i==11)
                hearts[i]= new HeartsCard("Q");

            else if(i==12)
                hearts[i]= new HeartsCard("K");
            else
                hearts[i]=new HeartsCard(Integer.toString(i+1));

        }

        return hearts;

    }

}
