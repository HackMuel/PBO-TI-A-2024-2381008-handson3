package handson3;


public class latihanWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i % 3 == 0) { //jika i habis dibagi 3,lewati
                i++;
                continue;
            }
            if (i > 15) { //jika i lebih dari 15, lewati
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}