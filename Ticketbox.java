public class Ticketbox {
    public Ticketbox() { // 생성자

    }

    public static void main(String[] args) { // 메인
        Ticketbox ticketbox = new Ticketbox();
        System.out.println(ticketbox.getHello());
    }

    public String getHello() {
        return "Hello World";
    }
}
