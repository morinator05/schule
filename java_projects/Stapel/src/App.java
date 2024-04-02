public class App {
    public static void main(String[] args) throws Exception {

        Stapel s1 = new Stapel();

        s1.push(2);
        s1.push(3);

        System.out.println(s1.top());
        System.out.println(s1.pop());
        System.out.println(s1.top());

    }
}
