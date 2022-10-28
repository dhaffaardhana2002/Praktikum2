public class PersonPBO2 {
	public static void main(String[] args) {
		Person2 antonn = new Person2();

		antonn.setNama("Anton Kelelawar");
		antonn.setJenisKelamin("Laki-laki");
		antonn.setUmur(21);

		System.out.println("Nama saya " + antonn.getNama());
		System.out.println("Saya " + antonn.getJenisKelamin());
		System.out.println("Umur saya " + antonn.umur);


		Person2 rikoo = new Person2();

		rikoo.setNama("Riko Palembang");
		rikoo.setJenisKelamin("Laki-laki");
		rikoo.setUmur(25);

		System.out.println("\nNama saya " + rikoo.getNama());
		System.out.println("Saya " + rikoo.getJenisKelamin());
		System.out.println("Umur saya " + rikoo.getUmur());
	}
}