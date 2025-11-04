import java.util.Scanner;
public class project1 {
    public static void main(String[] args) {
      Scanner ns = new Scanner(System.in);
      double Sdata;
      double PBobjek;
      double Bdata;
      double algoritmaP;
      double RPlunak;

      System.out.print("Program seleksi asistenD");
      System.out.print("masukan nilai mahasiswa: ");

      System.out.print("Masukan nilai Sdata: ");
      Sdata = ns.nextDouble();
      System.out.print("Masukan nilai PBobjek: ");
      PBobjek = ns.nextDouble();
      System.out.print("Masukan nilai Bdata: ");
      Bdata = ns.nextDouble();
      System.out.print("Masukan nilai algoritmaP: ");
      algoritmaP = ns.nextDouble();
      System.out.print("Masukan nilai RPlunak: ");
      RPlunak = ns.nextDouble();
      double totalNilai = (Sdata + PBobjek + Bdata + algoritmaP + RPlunak) / 5;
      System.out.println("Total nilai: " + totalNilai);

      



      
      
    }
}