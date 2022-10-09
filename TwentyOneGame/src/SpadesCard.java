public class SpadesCard extends Card{
    public SpadesCard(String value) {
        super(value, "♠");
    }
    public static Card[] prepareSpades()
    {
        Card spades[] =new SpadesCard[13];


        for (int i=0; i< 13; i++)
        {
            if (i==0)
                spades[0]= new SpadesCard("A");
            else
            if(i==10)
                spades[i]= new SpadesCard("J");
            else
            if(i==11)
                spades[i]= new SpadesCard("Q");

            else if(i==12)
                spades[i]= new SpadesCard("K");
            else
                spades[i]=new SpadesCard(Integer.toString(i+1));

        }


        return spades;

    }
}
