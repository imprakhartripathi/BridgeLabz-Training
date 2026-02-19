package subscription.service;

import subscription.model.User;
import subscription.strategy.DiscountStrategy;
import subscription.exp.PaymentDeclinedException;

import java.time.LocalDate;
import java.util.List;

public class SubscriptionService {

    private List<User> users;

    public SubscriptionService(List<User> users) {
        this.users = users;
    }

    public void autoRenew(DiscountStrategy strategy)
            throws PaymentDeclinedException {

        for (User user : users) {

            if (user.isActive()
                    && user.getExpiryDate().isBefore(LocalDate.now())) {

                double finalAmount =
                        strategy.applyDiscount(user.getSubscriptionFee());

                if (finalAmount <= 0) {
                    throw new PaymentDeclinedException(
                            "Payment failed for user: " + user.getName());
                }

                user.setExpiryDate(LocalDate.now().plusMonths(1));
                System.out.println("Subscription renewed for "
                        + user.getName()
                        + " | Amount Paid: " + finalAmount);
            }
        }
    }

    public void showExpiredUsers() {
        users.stream()
                .filter(u -> u.getExpiryDate().isBefore(LocalDate.now()))
                .forEach(u -> {
                    u.setActive(false);
                    System.out.println("Expired: " + u.getName());
                });
    }
}