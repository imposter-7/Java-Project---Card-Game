import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        BufferedWriter output;
        Scanner scanner = new Scanner(System.in);
        List<Card> deck = SingleDeck.getInstance();
        Card[] twentyOneCards = prepareTwentyOneCards(deck);

        System.out.println();


        Stack stack = new Stack();

        for (int j=0; j<twentyOneCards.length;j++)
        {
            stack.push(twentyOneCards[j]);
        }

        try {
            output= new BufferedWriter (new OutputStreamWriter(new FileOutputStream(String.valueOf(System.currentTimeMillis()), false)));

            Queue queue1 = new Queue();
            Queue queue2 = new Queue();
            Queue queue3 = new Queue();


            // we will repeat it for 3 times
            for (int i = 0; i < 3; i++) {
                output.write(String.valueOf(stack));

                queue1.fillQueues(queue1, queue2, queue3, stack);

                output.write(String.valueOf(queue1));
                output.write(String.valueOf(queue2));
                output.write(String.valueOf(queue3));

                queue1.printQueues(queue1, queue2, queue3);
                selectColumn(queue1, queue2, queue3, stack);
            }


            for (int i = 0; i < 10; i++)
                stack.pop();
            Object result = stack.pop();
            System.out.println("This is your Card : " +result);

            output.write(String.valueOf(result));
        }
        catch (IOException e)
        {
            System.out.println("Error writing to a file ");
        }
    }

    //-------------------------needed functions------------------------------------



    public  static void selectColumn(Queue queue1,Queue queue2,Queue queue3,Stack stack)
    {
        //this function is for asking the user about the column that contains his card, then collect the cards from the floor

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a card and keep it in your mind.\n In which column does your card exist? Enter 'L' if it's in the left column \t 'M' if it's in the middle column \t 'R' if it's in the right column ");
        String column = scanner.next();

        while (!column.trim().toLowerCase().equals("r") && !column.trim().toLowerCase().equals("l") && !column.trim().toLowerCase().equals("m")  )
        {
            System.out.println("Invalid input. Please enter 'L' if it's in the left column \t 'M' if it's in the middle column \t 'R' if it's in the right column");
            column = scanner.next();
        }


       if (column.trim().toLowerCase().equals("r"))
          stack= collectCards(queue1,queue3,queue2,stack);

       else
           if (column.trim().toLowerCase().equals("l"))
               stack= collectCards(queue2,queue1,queue3,stack);

       else
           if (column.trim().toLowerCase().equals("m"))
             stack= collectCards(queue1,queue2,queue3,stack);

    }
    public static Stack collectCards(Queue left,Queue mid,Queue right,Stack stack)
   {
       //this function collects cards from the floor

       Iterator<Card> iterator1 = left.qList.iterator();
       Iterator<Card> iterator2 = mid.qList.iterator();
       Iterator<Card> iterator3 = right.qList.iterator();

       for (int i=0 ; i<7 ; i++)
       {
           stack.push(left.deQ());
       }
       for (int i=7 ; i<14 ; i++)
       {
           stack.push(mid.deQ());
       }
       for (int i=14 ; i<21 ; i++)
       {
           stack.push(right.deQ());
       }

       return stack;


    }



    public static Card[] prepareTwentyOneCards(List deck)
    {
        // this function is to choose 21 cards from the deck

        Random random = new Random();
        Card[] TwentyOneCards = new Card[21];

        // this makes no repetition in the 21Card
        for (int i=0 ; i<TwentyOneCards.length; i++) {
            int index = random.nextInt(deck.size());
            if(i==0)
            {
                TwentyOneCards[i]= (Card) deck.get(index);
            }
            else
            {
                for(int j=0; j<i;j++)
                {
                    while (TwentyOneCards[j].equals( (Card)deck.get(index) ) == true)
                    {
                         index = random.nextInt(deck.size());
                    }
                    TwentyOneCards[i]= (Card) deck.get(index);

                }
            }

        }
        return TwentyOneCards;
    }


}