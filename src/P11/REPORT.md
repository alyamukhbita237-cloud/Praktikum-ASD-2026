|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020152|
| Nama |  Alya Mukhbita Larassati |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/alyamukhbita237-cloud/Praktikum-ASD-2026.git

# JOBSHEET XI LINKED LIST

## 2.1 Pembuatan Single Link List

Hasil Run :
```java
Linked List kosong
Isi Linked List:
Dirga           21212203        4D      3.6

Isi Linked List:
Dirga           21212203        4D      3.6
Alvaro          24212200        1A      4.0

Isi Linked List:
Dirga           21212203        4D      3.6
Cintia          22212202        3C      3.5
Bimon           23212201        2B      3.8
Alvaro          24212200        1A      4.0
```

### 2.1.2 Pertanyaan

1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
- karena pada saat method sll.print(); dipanggil pertama kali, objek SingleLinkedList masih belum memiliki data. Saat objek dibuat, nilai head dan tail masih null, sehingga ketika method isEmpty() dipanggil akan mengembalikan nilai true, karena linked list masih kosong, maka muncul output Linked List Kosong

2. Jelaskan kegunaan variable temp secara umum pada setiap method!
- variabel temp digunakan sebagai pointer sementara untuk menelusuri node pada linked list tanpa mengubah posisi head.

3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!
- Hasil Run
```java
Masukkan jumlah mahasiswa: 2

Data Mahasiswa ke- 1
NIM   : 123
Nama  : alya
Kelas : 1f
IPK   : 3.8
Isi Linked List:
alya            123     1f      3.8


Data Mahasiswa ke- 2
NIM   : 124
Nama  : stepen
Kelas : 1f
IPK   : 3.7
Isi Linked List:
alya            123     1f      3.8
stepen          124     1f      3.7
```

## 2.2 Modifikasi Elemen pada Single Linked List

Hasil Run:
```java
data index 1 : 
cintia          125     1f      3.5
data mahasiswa an Bimon berada pada index : 2

Isi Linked List:
cintia          125     1f      3.5
bimon           125     1f      3.8

Isi Linked List:
bimon           125     1f      3.8
```

### 2.2.3 Pertanyaan

1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
- Keyword break digunakan untuk menghentikan proses perulangan setelah data yang dicari berhasil ditemukan dan dihapus. Jika break tidak digunakan, perulangan akan tetap berjalan meskipun data sudah berhasil dihapus.
2. Jelaskan kegunaan kode dibawah pada method remove
```java
temp.next = temp.next.next;
if (temp.next == null){
    tail = temp;
}
```
- temp.next = temp.next.next, digunakan untuk melewati node yang akan dihapus. tail = temp, digunakan untuk memperbarui node terakhir jika node yang dihapus adalah tail.

# Tugas 
```java
=================================
      MENU ANTRIAN MAHASISWA     
=================================
1. Tambah Antrian
2. Panggil Antrian
3. Tampilkan Antrian
4. Tampilkan Antrian Depan
5. Tampilkan Antrian Belakang
6. Jumlah Antrian
7. Kosongkan Antrian
0. Keluar
=================================
Pilih menu : 1

--- Tambah Antrian ---
Masukkan NIM  : 2541
Masukkan Nama : ALya
Mahasiswa berhasil ditambahkan!

=================================
      MENU ANTRIAN MAHASISWA     
=================================
1. Tambah Antrian
2. Panggil Antrian
3. Tampilkan Antrian
4. Tampilkan Antrian Depan
5. Tampilkan Antrian Belakang
6. Jumlah Antrian
7. Kosongkan Antrian
0. Keluar
=================================
Pilih menu : 1

--- Tambah Antrian ---
Masukkan NIM  : 1256
Masukkan Nama : laras
Mahasiswa berhasil ditambahkan!

=================================
      MENU ANTRIAN MAHASISWA     
=================================
1. Tambah Antrian
2. Panggil Antrian
3. Tampilkan Antrian
4. Tampilkan Antrian Depan
5. Tampilkan Antrian Belakang
6. Jumlah Antrian
7. Kosongkan Antrian
0. Keluar
=================================
Pilih menu : 2

--- Panggil Antrian ---
Dipanggil : 
ALya            2541

=================================
      MENU ANTRIAN MAHASISWA     
=================================
1. Tambah Antrian
2. Panggil Antrian
3. Tampilkan Antrian
4. Tampilkan Antrian Depan
5. Tampilkan Antrian Belakang
6. Jumlah Antrian
7. Kosongkan Antrian
0. Keluar
=================================
Pilih menu : 1

--- Tambah Antrian ---
Masukkan NIM  : 198
Masukkan Nama : cindy
Mahasiswa berhasil ditambahkan!

=================================
      MENU ANTRIAN MAHASISWA     
=================================
1. Tambah Antrian
2. Panggil Antrian
3. Tampilkan Antrian
4. Tampilkan Antrian Depan
5. Tampilkan Antrian Belakang
6. Jumlah Antrian
7. Kosongkan Antrian
0. Keluar
=================================
Pilih menu : 3

--- Daftar Antrian ---
laras           1256
cindy           198

=================================
      MENU ANTRIAN MAHASISWA     
=================================
1. Tambah Antrian
2. Panggil Antrian
3. Tampilkan Antrian
4. Tampilkan Antrian Depan
5. Tampilkan Antrian Belakang
6. Jumlah Antrian
7. Kosongkan Antrian
0. Keluar
=================================
Pilih menu : 4

--- Antrian Terdepan ---
laras           1256

=================================
      MENU ANTRIAN MAHASISWA     
=================================
1. Tambah Antrian
2. Panggil Antrian
3. Tampilkan Antrian
4. Tampilkan Antrian Depan
5. Tampilkan Antrian Belakang
6. Jumlah Antrian
7. Kosongkan Antrian
0. Keluar
=================================
Pilih menu : 5

--- Antrian Terakhir ---
cindy           198

=================================
      MENU ANTRIAN MAHASISWA     
=================================
1. Tambah Antrian
2. Panggil Antrian
3. Tampilkan Antrian
4. Tampilkan Antrian Depan
5. Tampilkan Antrian Belakang
6. Jumlah Antrian
7. Kosongkan Antrian
0. Keluar
=================================
Pilih menu : 6

Jumlah mahasiswa mengantre : 2

=================================
      MENU ANTRIAN MAHASISWA     
=================================
1. Tambah Antrian
2. Panggil Antrian
3. Tampilkan Antrian
4. Tampilkan Antrian Depan
5. Tampilkan Antrian Belakang
6. Jumlah Antrian
7. Kosongkan Antrian
0. Keluar
=================================
Pilih menu : 7

Antrian berhasil dikosongkan

=================================
      MENU ANTRIAN MAHASISWA     
=================================
1. Tambah Antrian
2. Panggil Antrian
3. Tampilkan Antrian
4. Tampilkan Antrian Depan
5. Tampilkan Antrian Belakang
6. Jumlah Antrian
7. Kosongkan Antrian
0. Keluar
=================================
Pilih menu : 0

Program selesai
```