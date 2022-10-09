import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleDeck {
    private static List<Card> instance = null;

    private SingleDeck() {
        if (instance==null)
            instance=new ArrayList<>();
    }
    
    public static List<Card> getInstance()
    {
        if (instance==null)
        {
            Card clubscards[] = ClubsCard.prepareClubs();
            Card heartsCards[] = HeartsCard.prepareHearts();
            Card diamondsCards[] = DiamondsCard.prepareDiamonds();
            Card spadesCards[] = SpadesCard.prepareSpades();

            instance= new ArrayList(Arrays.asList(clubscards));
            instance.addAll(Arrays.asList(heartsCards));
            instance.addAll(Arrays.asList(spadesCards));
            instance.addAll(Arrays.asList(diamondsCards));

        }
        return instance;
    }

}
