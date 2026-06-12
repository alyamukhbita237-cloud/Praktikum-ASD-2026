|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020152|
| Nama |  Alya Mukhbita Larassati |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/alyamukhbita237-cloud/Praktikum-ASD-2026.git

# Case Method 2
### Hasil Run Case Method Sistem Antrian :

```java
=============================================
        SISTEM ANTRIAN ROYAL DELISH
=============================================
1. Tambah Antrian
2. Cetak Antrian
3. Hapus Antrian dan Pesan
4. Laporan Pesanan
0. Keluar
=============================================
Pilih Menu : 1
Antrian sudah ditambahkan
=============================================
        SISTEM ANTRIAN ROYAL DELISH
=============================================
1. Tambah Antrian
2. Cetak Antrian
3. Hapus Antrian dan Pesan
4. Laporan Pesanan
0. Keluar
=============================================
Pilih Menu : 2
=============================================
        Daftar Antrian Pembeli
=============================================
No Antrian       Nama    No HP
1               Ainra           0822450000
2               Danra           0822245111
3               Sanri           0822452222
4               Vania           0822453333
=============================================
        SISTEM ANTRIAN ROYAL DELISH
=============================================
1. Tambah Antrian
2. Cetak Antrian
3. Hapus Antrian dan Pesan
4. Laporan Pesanan
0. Keluar
=============================================
Pilih Menu : 3
Kode Pesanan  : 123
Nama Pesanan  : Es Teler
Harga         : 6000
Ainra telah memesan Es Teler
=============================================
        SISTEM ANTRIAN ROYAL DELISH
=============================================
1. Tambah Antrian
2. Cetak Antrian
3. Hapus Antrian dan Pesan
4. Laporan Pesanan
0. Keluar
=============================================
Pilih Menu : 3
Kode Pesanan  : 124
Nama Pesanan  : Bakso
Harga         : 7000
Danra telah memesan Bakso
=============================================
        SISTEM ANTRIAN ROYAL DELISH
=============================================
1. Tambah Antrian
2. Cetak Antrian
3. Hapus Antrian dan Pesan
4. Laporan Pesanan
0. Keluar
=============================================
Pilih Menu : 4
=================================================
        LAPORAN PESANAN (URUT NAMA PESANAN)
=================================================
Kode Pesanan     Nama Pesanan    Harga
124             Bakso           7000
123             Es Teler                6000
=============================================
        SISTEM ANTRIAN ROYAL DELISH
=============================================
1. Tambah Antrian
2. Cetak Antrian
3. Hapus Antrian dan Pesan
4. Laporan Pesanan
0. Keluar
=============================================
Pilih Menu : 0
Program selesai.
```

## Kuis 2 Modifikasi CM Soal A
- Penambahan Class DLLRekap03, NodeRekap03, Rekap03, dan penambahan pada method main SistemAntrianMain03
- Pembuatan class DLLRekap untuk method digunakan untuk menampilkan hasil rekap, mengurutkan menu terbanyak serta penambahan atau update menu 
- Pembuatan class NodeRekap untuk menginisialisasi variabel Rekap03 dan NodeRekap03 untuk menyimpan data dan node 
- Pembuatan class Rekap03 untuk menyimpan nama menu yang dipesan dan jumlah pesanan tiap menu
- Memodifikasi pada class main untuk untuk menampilkan hasil rekap pada tiap menu dari hasil penambahan 3 class diatas 
Hasil Run :
```java
=============================================
        SISTEM ANTRIAN ROYAL DELISH
=============================================
1. Tambah Antrian
2. Cetak Antrian
3. Hapus Antrian dan Pesan
4. Laporan Pesanan
5. Rekap Pesanan Tiap Menu 
0. Keluar
=============================================
Pilih Menu : 3
Kode Pesanan  : 124
Nama Pesanan  : bakso
Harga         : 9000
Danra telah memesan bakso
=============================================
        SISTEM ANTRIAN ROYAL DELISH
=============================================
1. Tambah Antrian
2. Cetak Antrian
3. Hapus Antrian dan Pesan
4. Laporan Pesanan
5. Rekap Pesanan Tiap Menu 
0. Keluar
=============================================
Pilih Menu : 3
Kode Pesanan  : 125
Nama Pesanan  : es teler
Harga         : 7000
Sanri telah memesan es teler
=============================================
        SISTEM ANTRIAN ROYAL DELISH
=============================================
1. Tambah Antrian
2. Cetak Antrian
3. Hapus Antrian dan Pesan
4. Laporan Pesanan
5. Rekap Pesanan Tiap Menu 
0. Keluar
=============================================
Pilih Menu : 4
=================================================
        LAPORAN PESANAN (URUT NAMA PESANAN)
=================================================
Kode Pesanan     Nama Pesanan    Harga
124             bakso           9000
125             es teler                7000
123             es teler                7000
=============================================
        SISTEM ANTRIAN ROYAL DELISH
=============================================
1. Tambah Antrian
2. Cetak Antrian
3. Hapus Antrian dan Pesan
4. Laporan Pesanan
5. Rekap Pesanan Tiap Menu 
0. Keluar
=============================================
Pilih Menu : 5
=================================
        REKAP MENU PESANAN 
=================================
Nama Menu            Jumlah
es teler             2
bakso                1
=============================================
        SISTEM ANTRIAN ROYAL DELISH
=============================================
1. Tambah Antrian
2. Cetak Antrian
3. Hapus Antrian dan Pesan
4. Laporan Pesanan
5. Rekap Pesanan Tiap Menu 
0. Keluar
=============================================
Pilih Menu : 0
Program selesai.
```