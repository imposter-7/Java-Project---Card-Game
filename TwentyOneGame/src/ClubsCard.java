public class ClubsCard extends Card{
    public ClubsCard(String value) {
        super(value, "♣");
    }

    public static Card[] prepareClubs()
    {
        Card clubs[] =new ClubsCard[13];

        for (int i=0; i< 13; i++)
        {
            if (i==0)
                clubs[0]= new ClubsCard("A");
            else
            if(i==10)
                clubs[i]= new ClubsCard("J");
            else
            if(i==11)
                clubs[i]= new ClubsCard("Q");

            else if(i==12)
                clubs[i]= new ClubsCard("K");
            else
                clubs[i]=new ClubsCard(Integer.toString(i+1));

        }

        return clubs;

    }


}
