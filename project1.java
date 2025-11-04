import java.util.Scanner;
public class project1 {
    public static void main(String[] args) {
      Scanner ns = new Scanner(System.in);
      System.out.println("Selamat datang di program seleksi asistenD");
      System.out.println("Apakah anda layak menjadi asistenD? (ya/tidak)");
      double Sdata;
      double PBobjek;
      double Bdata;
      double algoritmaP;
      double RPlunak;
      double nilai;
      double rataR;
      String predikat;
      

      System.out.print("Program seleksi asistenD");
      System.out.print("masukan nilai mahasiswa: ");
      String confirm = ns.nextLine();

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

      System.out.println("\n=== HASIL PENILAIAN ===");
      System.out.println("NilaiR");

        double ipksederhana = (totalNilai / 100) * 4;
      if (totalNilai >= 3.75) {
            predikat = "A (Sangat Baik)";

        } else if (ipksederhana >= 3.50) {
            predikat = "AB (Baik Sekali)";

        } else if (ipksederhana >= 3.00) {
            predikat = "B (Baik)";

        } else if (ipksederhana >= 2.50) {
            predikat = "BC (Cukup)";
            
        } else {
            predikat = "C (Tidak memenuhi)";
        }

        
         if (confirm.toLowerCase().equals("ya")) {
            System.out.println("menu: ");
            System.out.println("1. Sdata");
            System.out.println("2. PBobjek");     
            System.out.println("3. Bdata");
            System.out.println("4. algoritmaP");
            System.out.println("5. RPlunak");
            System.out.println("masukan pilihan anda: ");    
            int pilihan = ns.nextInt(); 

            
              
              
              

              







            }

            

            
             




            

            

            

      }

      
      
      

      



      
      
    }
}