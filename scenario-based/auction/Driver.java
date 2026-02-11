package auction;

import auction.bidding.*;

public class Driver {
    public static void main(String[] args) {

        AuctionItem item = new AuctionItem("Laptop");

        User u1 = new User("Alice");
        User u2 = new User("Bob");

        item.placeBid(u1, 1000);
        item.placeBid(u2, 1500);

        System.out.println("Highest Bid: " + item.getHighestBid());
    }
}
