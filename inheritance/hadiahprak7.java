public class hadiahprak7{
	public static void main(String[] args){
		BlokA supobj = new BlokA();
		BlokB subobj = new BlokB();
		
		supobj.hasil();
		subobj.hasill();
		System.out.println("Nama = "+supobj.nama);
		System.out.println("Alamat = "+supobj.alamat);
		System.out.println("Harga Bayar = "+subobj.hargabayar);
		System.out.println("Bayar = "+subobj.bayar);
		System.out.println("Kembalian = "+subobj.kembalian);
	}
}