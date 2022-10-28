# Tugas PBO Pertemuan 5

Nama: Muhammad Dhaffa Ardhana Rianto Putra

NIM: 312110029

Kelas: TI.21.C.2


Disini saya akan menunjukkan tutorial membuat enkapsulasi

## Buat file dan kode Java

- Buat file dengan nama bebas dengan ekstensi file `.java`
- Tulis kode java seperti berikut

```
public class PersonPBO2 {
	public static void main(String[] args) {
	
	}
}
```

- Untuk membuat objek constructor, buat file di folder yang sama dengan nama `Person2.java`
- Tulis kode java seperti berikut

```
public class Person2 {
	String nama;
	String jenisKelamin;
	int umur;
}
```

- Lalu buat enkapsulasi sebagai berikut

```
public void setNama(String nama) {
	this.nama = nama; }

public String getNama() {
	return this.nama; }

public void setJenisKelamin(String jenisKelamin) {
	this.jenisKelamin = jenisKelamin; }

public String getJenisKelamin() {
	return this.jenisKelamin; }

public void setUmur(int umur) {
	this.umur = umur; }

public int getUmur() {
	return this.umur; }
```

- Di dalam file diawal, tambahkan kode didalam `main()` dengan kode sebagai berikut, untuk menambahkan objek baru dari objek constructor yang sudah dibuat

```
Person2 antonn = new Person2();
```

- Gunakan enkapsulasi yang sudah dibuat di awal mengunakan `set...()` untuk membuat objek

```
antonn.setNama("Anton Kelelawar");
antonn.setJenisKelamin("Laki-laki");
antonn.setUmur(21);
```

- Print hasil dengan menggunakan enkapsulasi `get...()` seperti berikut

```
System.out.println("Nama saya " + antonn.getNama());
System.out.println("Saya " + antonn.getJenisKelamin());
System.out.println("Umur saya " + antonn.umur);
```

- Lakukan hal yang sama pada `rikoo` namun dengan nama Riko
- Print juga hasil untuk Riko
- Save semua file
- Buka cmd (Command Prompt)
- Pergi menuju folder yang sudah dibuat dengan menggunakan `cd ...`
- Lalu eksekusi dengan mengetik

```
javac PersonPBO2.java
```

dan

```
javac Person2.java
```

- Jika berhasil dan tidak ada error, ketik

```
java TugasSaya
```

- Tampilan nya akan seperti ini

```
Nama saya Anton Kelelawar
Saya Laki-laki
Umur saya 21

Nama saya Riko Palembang
Saya Laki-laki
Umur saya 25
```

[Klik disini untuk melihat Hasil screenshot](https://raw.githubusercontent.com/dhaffaardhana2002/Praktikum2/master/img/personpbo2-pict.png)

___
Terima kasih untuk membaca tutorial saya. Tak lupa juga untuk dosen saya dan teman-teman saya yang sudah membantu saya.
