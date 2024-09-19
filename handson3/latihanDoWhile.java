package handson3;


public class latihanDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 3 == 0) { //jika i habis dibagi 3,lewati
                i++;
                continue;
            }
            if (i > 15) { //jika i lebih dari 15, berhenti
                break;
            }
            System.out.println(i);
            i++;
        } while (i <= 20);
    }
}