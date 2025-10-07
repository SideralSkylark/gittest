public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }

        String newstuff = "some shiny new stuff";
    }
}
