package builder;

import builder.User.Builder;

public class Main {

    public static void main(String[] args) {
        User user = new Builder()
                .username("Oveis")
                .email("oveis@example.com")
                .age(25)
                .address("Tehran")
                .build();

        System.out.println(user);
    }
}