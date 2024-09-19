package handson3;


public class latihanForEach {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int num : numbers) {
            if (num % 3 == 0) { //jika num habis dibagi 3,lewati
                continue;
            }
            if (num > 15) { //jika num lebih dari 15,berhenti
                break;
            }
            System.out.println(num);
        }
    }
}