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
            System.out.println("Predikat: " + predikat);
        
         if (confirm.toLowerCase().equals("ya")) {
            System.out.println("menu: ");
            System.out.println("1. Sdata");
            System.out.println("2. PBobjek");     
            System.out.println("3. Bdata");
            System.out.println("4. algoritmaP");
            System.out.println("5. RPlunak");
            System.out.println("masukan pilihan anda: ");    
            int pilihan = ns.nextInt(); 

            System.out.println("IPK Sederhana: " + ipksederhana);

            switch (pilihan) {
                case 1:
                if (Sdata >= 75)
                            System.out.println("Mahasiswa eligible menjadi Asisten Dosen Struktur Data.");
                        else
                            System.out.println("Belum memenuhi syarat.");
                        break;
                case 2:
                        if (PBobjek >= 75)
                            System.out.println("Mahasiswa eligible menjadi Asisten Dosen PBO.");
                        else
                            System.out.println("Belum memenuhi syarat.");
                        break;
                case 3:
                        if (Bdata >= 75)
                            System.out.println("Mahasiswa eligible menjadi Asisten Dosen Basis Data.");
                        else
                            System.out.println("Belum memenuhi syarat.");
                        break;
                case 4:
                        if (algoritmaP >= 75)
                            System.out.println("Mahasiswa eligible menjadi Asisten Dosen Algoritma dan Pemrograman.");
                        else
                            System.out.println("Belum memenuhi syarat.");
                        break;
                case 5:
                        if (RPlunak >= 75)
                            System.out.println("Mahasiswa eligible menjadi Asisten Dosen Rekayasa Perangkat Lunak.");
                        else
                            System.out.println("Belum memenuhi syarat.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                    


                
            }
            

       
        

            
              
              
              

              







            }

            

            
             




            

            

            

      }

      
      
      

      



      
      
    }
