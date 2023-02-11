package designPattern.builderPattern;

public class BuilderDemo {
    public static void main(String[] args) {

        User user = new User.UserBuilder("John", "Doe")
                .age(20)
                .address("123 Main St.")
                .phone("555-555-5555")
                .build();

        User.UserBuilder userBuilder  = new User.UserBuilder("Atequer", "Rahman");
        User user1 = userBuilder
                .age(33)
                .address("456 Kamal Khan Road.")
                .phone("01921422164")
                .build();

        System.out.println(user);
        System.out.println(user1);
    }
}
