import controller.Controller;

public class main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createUser("Name", "LastName", "Patronymic");
    }
}
