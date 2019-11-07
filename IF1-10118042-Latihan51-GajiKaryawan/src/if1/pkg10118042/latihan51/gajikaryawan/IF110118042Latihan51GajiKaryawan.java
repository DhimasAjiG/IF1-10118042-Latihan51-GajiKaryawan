
package if1.pkg10118042.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk menghitung Gaji Karyawan
 */
public class IF110118042Latihan51GajiKaryawan {

   
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Karyawan kar = new Karyawan();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK \t: ");
        kar.setNik(scn1.next());
        System.out.print("Masukkan Nama \t: ");
        kar.setNama(scn2.nextLine());
        System.out.print("Masukkan Golongan (1/2/3/) : ");
        kar.setGolongan(scn1.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        kar.setJabatan(scn1.next());
        System.out.print("Masukkan Jumlah Kehadiran \t: ");
        kar.setJmlKehadiran(scn1.nextInt());

        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK \t\t: "+kar.getNik());
        System.out.println("Nama \t\t: "+kar.getNama());
        System.out.println("Golongan \t: "+kar.getGolongan());
        System.out.println("Jabatan \t: "+kar.getJabatan());

        System.out.println("\nTUNJANGAN GOLONGAN \t\t: "+kar.tunjanganGolongan());
        System.out.println("TUNJANGAN JABATAN \t\t: "+kar.tunjanganJabatan());
        System.out.println("TUNJANGAN KEHADIRAN \t: "+kar.tunjanganKehadiran());

        System.out.println("\nGAJI TOTAL : "+kar.totalGaji());
    }
    
}
