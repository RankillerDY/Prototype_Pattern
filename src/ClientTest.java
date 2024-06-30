import model.User;

public class ClientTest {
    public static void main(String[] args) {
        User user1 = new User("Đinh Gia Bảo", "baoit2002@gmail.com", 22);
        User user2 = user1.clone();

        user2.setEmail("dinhbao.it.work@gmail.com");
        System.out.println(user1.toString());
        System.out.println("-----------------");
        System.out.println(user2.toString());
    }
}