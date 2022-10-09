public class DiamondsCard extends Card{
    public DiamondsCard(String value) {
        super(value, "♦");
    }


    public static Card[] prepareDiamonds()
    {
        Card diamonds[] =new DiamondsCard[13];

        for (int i=0; i< 13; i++)
        {
            if (i==0)
                diamonds[0]= new DiamondsCard("A");
            else
            if(i==10)
                diamonds[i]= new DiamondsCard("J");
            else
            if(i==11)
                diamonds[i]= new DiamondsCard("Q");

            else if(i==12)
                diamonds[i]= new DiamondsCard("K");
            else
                diamonds[i]=new DiamondsCard(Integer.toString(i+1));

        }

        return diamonds;

    }


}
