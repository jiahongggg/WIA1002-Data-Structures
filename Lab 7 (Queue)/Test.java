import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        MyQueue<String> queueShare = new MyQueue<>();   //Queue to keep track of share available
        MyQueue<String> queuePrice = new MyQueue<>();   //Queue to record to buying price
        //Instead of creating 2 separate queues, students can opt to create single queue using subclass or struct which consists of share and price
        //CapitalGainLoss to keep track of Capital Gain or Loss
        int CapitalGainLoss = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String query = sc.nextLine();
            if (query.isEmpty()) { // check if we need to exit out
                // break only if 0 or nothing is entered, this means we don't want to run the loop anymore
                break;
            } else {
                // Based on the formatting, divide the information to several parts
                String[] parts = query.split(" ");
                String BuySell = parts[0];
                String NoOfShare = parts[1];
                String Price = parts[4].replace("$", "");

                // If the first word of the input is sell...
                if ("Sell".equalsIgnoreCase(BuySell)) {
                    int ShareForSell = Integer.parseInt(NoOfShare);     //Quantity of Shares to be sold
                    int RemainingShareInQueue = 0;                      //Remaining Share in the queue after being sold

                    do {
                        if (!queueShare.isEmpty())  //if the shares are available...
                        {
                            int share = Integer.parseInt(queueShare.dequeue()); //Get the first available share to be sold from queue
                            int price = Integer.parseInt(queuePrice.dequeue()); //Get the price of the first available share to be sold from queue

                            if (share >= ShareForSell) //if there is sufficient share-to-be-sold in the dequeued value
                            {
                                //Calculate the capital gain or loss
                                CapitalGainLoss = CapitalGainLoss + ShareForSell * (Integer.parseInt(Price) - price);
                                //Calculate the remaining share after being sold
                                //Then put it back into the queue by using ReplaceQueue function
                                RemainingShareInQueue = share - ShareForSell;
                                if (RemainingShareInQueue > 0) {
                                    ReplaceQueue(queueShare, RemainingShareInQueue);
                                    ReplaceQueue(queuePrice, price);
                                }
                            } else //insufficient shares in the dequeued value
                            {
                                //Calculate capital gain or loss
                                CapitalGainLoss = CapitalGainLoss + share * (Integer.parseInt(Price) - price);
                            }

                            System.out.println("Total Capital Gain / Loss: " + CapitalGainLoss);
                            //LeftOverShare = LeftOverShare - share;
                            ShareForSell = ShareForSell - share;
                            //System.out.println(LeftOverShare);
                        } else {
                            System.out.println("No shares to sell!");
                            ShareForSell = 0;
                        }
                    } while (ShareForSell > 0);

                } else {
                    System.out.println("Buying now...");
                    queueShare.enqueue(NoOfShare);
                    queuePrice.enqueue(Price);
                }
                //display for checking purposes
                System.out.println("Queue for Share: " + queueShare);
                System.out.println("Queue for Price: " + queuePrice);
            }
        } while (true);

        System.out.println("Final Capital Gain / Loss: " + CapitalGainLoss);
    }

    public static void ReplaceQueue(MyQueue<String> queue, int Remains) {
        MyQueue<String> queueTemp = new MyQueue<>();
        queueTemp.enqueue(Integer.toString(Remains));
        while (!queue.isEmpty()) {
            queueTemp.enqueue(queue.dequeue());
        }
        while (!queueTemp.isEmpty()) {
            queue.enqueue(queueTemp.dequeue());
        }
    }
}
