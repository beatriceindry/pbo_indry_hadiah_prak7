import java.util.Scanner;
public class hadiahPrak7{
	public static void main(String[] args){
		polimorphisme a = new polimorphisme();
		BlokkA b = new BlokkA();
		BlokkB c = new BlokkB();
		boolean loop = true;
		
		Scanner input = new Scanner(System.in);
		int tipe;
		
		a.hasil();
		System.out.print("Tipe yang dipilih = ");
		tipe = input.nextInt();
		
		while(loop){
			switch(tipe){
				case 1 :	b.hasill();
							System.out.println("Nama = "+a.nama);
							System.out.println("Alamat = "+a.alamat);
							System.out.println("Harga Bayar = "+b.hargabayar);
							System.out.println("Bayar = "+b.bayar);
							System.out.println("Kembalian = "+b.kembalian);
						loop = false;
						break;
				
				case 2 :	c.hasilll();
							System.out.println("Nama = "+a.nama);
							System.out.println("Alamat = "+a.alamat);
							System.out.println("Harga Bayar = "+c.hargabayar);
							System.out.println("Bayar = "+c.bayar);
							System.out.println("Kembalian = "+c.kembalian);
						loop = false;
						break;
				default:System.out.println("Tipe yang anda masukkan salah. Silahkan masukkan tipe dengan benar!");
			}
			break;
		}
	}
}