UTS Pemrograman Berorientasi Obyek 1
•	Mata Kuliah: Pemrograman Berorientasi Obyek 1
•	Dosen Pengampu: Muhammad Ikhwan Fathulloh
Profil
•	Nama: Yeremia Adrianto Simarmata
•	NIM: 23552011227
•	Studi Kasus: Sistem Manajemen Restoran
Judul Studi Kasus
Sistem Manajemen Restoran
Penjelasan Studi Kasus
Sistem Manajemen Restoran ini dirancang untuk membantu pemilik restoran mengelola menu, pesanan, dan pembayaran. Sistem ini mengimplementasikan fitur seperti:
1.	Pengelolaan Menu:
•	Menu dibagi menjadi dua jenis utama: makanan dan minuman.
•	Setiap item menu memiliki atribut seperti nama, harga, dan atribut khusus (topping untuk makanan, ukuran untuk minuman).
2.	Pengelolaan Pesanan:
•	Pelanggan dapat memilih makanan dan minuman dari menu.
•	Sistem akan menghitung total harga pesanan berdasarkan item yang dipilih, termasuk pengaruh topping atau ukuran.
3.	Laporan Penjualan:
•	Sistem mampu menampilkan daftar pesanan saat ini beserta total harga yang harus dibayar.


Penjelasan 4 Pilar OOP dalam Studi Kasus
1. Inheritance
•  MakananUtama dan Minuman mewarisi atribut dan metode dari MenuItem.
•  Contoh: Semua item memiliki nama, harga, dan harus mengimplementasikan hitungHarga().

.2. Encapsulation
• Data seperti nama, harga, ukuran, dan topping disembunyikan di dalam kelas masing-masing.
• Akses ke data ini hanya dilakukan melalui getter dan setter, sehingga data aman dari modifikasi langsung yang tidak diinginkan.

3. Polymorphism
•  MakananUtama dan Minuman mewarisi atribut dan metode dari MenuItem.
•  Contoh: Semua item memiliki nama, harga, dan harus mengimplementasikan hitungHarga().
4. Abstract
•  MenuItem adalah kelas abstrak yang mendefinisikan kerangka umum untuk semua item menu.
•  Setiap item menu (makanan dan minuman) mengimplementasikan cara perhitungan harga dan persiapan yang spesifik.
Demo Proyek
•	Github: https://github.com/JerryMata/UTS_PBO1_23-K-TIF-A_23552011227/tree/main
•	GDrive: https://drive.google.com/file/d/19ma51PMfmJPgJBwNnRct0kjr6tr2hXH5/view?usp=sharing 

