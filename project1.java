import java.util.Scanner;
public class project1 {
    public static void main(String[] args) {
      Scanner ns = new Scanner(System.in);
      System.out.println("Selamat datang di program seleksi asistenD");
      System.out.println("Apakah anda layak menjadi asistenD? (ya/tidak)");
      int Sdata;
      int PBobjek;
      int Bdata;
      int algoritmaP;
      int RPlunak;

      System.out.print("Program seleksi asistenD");
      System.out.print("masukan nilai mahasiswa: ");
      String confirm = ns.nextLine();

      System.out.print("Masukan nilai Sdata: ");
      Sdata = ns.nextInt();
      System.out.print("Masukan nilai PBobjek: ");
      PBobjek = ns.nextInt();
      System.out.print("Masukan nilai Bdata: ");
      Bdata = ns.nextInt();
      System.out.print("Masukan nilai algoritmaP: ");
      algoritmaP = ns.nextInt();
      System.out.print("Masukan nilai RPlunak: ");
      RPlunak = ns.nextInt();
      double totalNilai = (Sdata + PBobjek + Bdata + algoritmaP + RPlunak) / 5;
      System.out.println("Total nilai: " + totalNilai);

      if (confirm.toLowerCase().equals("ya")) {
        System.out.println("menu: ");
            System.out.println("1. Sdata");
            System.out.println("2. PBobjek");     
            System.out.println("3. Bdata");
            System.out.println("4. algoritmaP");
            System.out.println("5. RPlunak");
            System.out.println("masukan pilihan anda: ");    
            int pilihan = ns.nextInt(); 

            switch (pilihan) {






              
            }

            

            
             




            

            

            

      }

      
      
      

      



      
      
    }
}