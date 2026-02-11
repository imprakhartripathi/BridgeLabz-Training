package auction.bidding;

import java.util.*;

public class AuctionItem {

    private String itemName;
    private TreeMap<User, Double> bids = new TreeMap<>();

    public AuctionItem(String itemName) {
        this.itemName = itemName;
    }

    public void placeBid(User user, double amount) {

        double highest = getHighestBid();

        if (amount <= highest) {
            throw new InvalidBidException("Bid must be higher than current highest bid");
        }

        bids.put(user, amount);
    }

    public double getHighestBid() {
        return bids.values().stream().max(Double::compare).orElse(0.0);
    }
}
