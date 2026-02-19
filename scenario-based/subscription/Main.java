package subscription;

import subscription.model.User;
import subscription.service.SubscriptionService;
import subscription.strategy.FestivalDiscount;
import subscription.exp.PaymentDeclinedException;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        User u1 = new User("Rahul",
                LocalDate.now().minusDays(1), 500);

        User u2 = new User("Neha",
                LocalDate.now().plusDays(5), 500);

        SubscriptionService service =
                new SubscriptionService(Arrays.asList(u1, u2));

        service.showExpiredUsers();

        try {
            service.autoRenew(new FestivalDiscount());
        } catch (PaymentDeclinedException e) {
            System.out.println(e.getMessage());
        }
    }
}