package pertemuan5new;

import java.util.Scanner;

public class latihan17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input gaji pokok dan status pernikahan
        System.out.println("=========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = input.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = input.next();
        
        // Menghitung tunjangan
        double tunjangan = (status.equalsIgnoreCase("Menikah")) ? 0.35 * gajiPokok : 0;
        
        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;
        
        // Output hasil
        System.out.println("\n====Hasil Perhitungan Gaji Anda====");
        System.out.println("Gaji Pokok\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t: Rp " + tunjangan);
        System.out.println("Total Gaji\t: Rp " + totalGaji);
        System.out.println("(Developed by : [Tiara Aulia])");
        
        input.close();
    }
}

