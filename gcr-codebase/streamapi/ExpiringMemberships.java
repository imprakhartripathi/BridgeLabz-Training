package streamapi;

import java.time.LocalDate;
import java.util.List;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}

public class ExpiringMemberships {

    public static void main(String[] args) {

        List<Member> members = List.of(
                new Member("Aman", LocalDate.now().plusDays(15)),
                new Member("Riya", LocalDate.now().plusDays(40))
        );

        members.stream()
                .filter(m -> m.expiryDate.isBefore(LocalDate.now().plusDays(30)))
                .forEach(m -> System.out.println(m.name));
    }
}
