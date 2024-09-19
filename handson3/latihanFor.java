package handson3;


public class latihanFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) { //jika habis dibagi 3,lewati
                continue;
            }
            if (i > 15) { //jika lebih dari 15, berhenti
                break;
            }
            System.out.println(i);
        }
    }
}