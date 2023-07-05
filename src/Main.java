import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Öğrenci Sistemine Hoş Geldiniz!\nLütfen yapmak istediğiniz işlemi seçin:");
        System.out.println("1.Not Ekle\n2.Not Sil");

        //Map oluşturma.
        Map<Integer, Double> grades = new HashMap<Integer, Double>();
        grades.put(143, 92.4);
        grades.put(56, 90.5);

        //Kullanıcıdan işlem alma.
        while(true) {
            System.out.print("İşlem: ");
            int selection = scanner.nextInt();

            if(selection == 1) {
                System.out.println("Öğrenci numarası giriniz: ");
                int id = scanner.nextInt();
                System.out.println("Öğrencinin notunu giriniz: ");
                double grade = scanner.nextDouble();
                grades.put(id, grade);
            }
            else if (selection == 2) {
                System.out.println("Notunun silinmesini istediğiniz öğrencinin numarasını yazınız: ");
                int id = scanner.nextInt();
                grades.remove(id);
            }
            else {
                System.out.println("Lütfen geçerli bir işlem numarası giriniz.");
                continue;
            }
        }
    }
}