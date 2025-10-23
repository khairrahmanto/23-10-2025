public class rayhewan {
    public static void main(String[] args) {
        String[] Hewan = {"Kucing", "Anjing", "Kelinci", "Hamster", "Burung", "Ikan", "Kura-kura"};
        System.err.println("nama hewan ");
        for (int i = 0; i < Hewan.length ; i+=1) {
            System.out.println ( (i + 1) + ". " + Hewan[i]);
        }
    }
}
