|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020152|
| Nama |  Alya Mukhbita Larassati |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/alyamukhbita237-cloud/Praktikum-ASD-2026.git

# JOBSHEET IX STACK

## 2.1 Percobaan 1: Mahasiswa Mengumpulkan Tugas

Hasil Run :
``` java
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 1
Nama    : Dila
NIM     : 1001
Kelas   : 1A
Tugas Dila berhasil dikumpulkan

Menu :
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 1
Nama    : Erik
NIM     : 1002
Kelas   : 1B
Tugas Erik berhasil dikumpulkan

Menu :
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 3
Tugas terakhir dikumpulkan oleh Erik

Menu :
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 1
Nama    : Tika
NIM     : 1003
Kelas   : 1C
Tugas Tika berhasil dikumpulkan

Menu :
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 4
Daftar semua tugas 
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B
Tika    1003    1C


Menu :
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai Tugas Tika adalah 87

Menu :
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B


Menu :
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 5
Pilihan tidak valid.
```
### 2.1.3 Pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi
hasil percobaan! Bagian mana yang perlu diperbaiki?
- bagian method print pada perulangan diganti jadi 
```java
yang sebelumnya
for (int i = 0; i <= top; i++)
diganti jadi
for (int i = top; i >= 0; i--)

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 1
Nama    : dila
NIM     : 1001
Kelas   : 1A
Tugas dila berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 1   
Nama    : erik
NIM     : 1002
Kelas   : 1B
Tugas erik berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 1
Nama    : tika
NIM     : 1003
Kelas   : 1C
Tugas tika berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 4
Daftar semua tugas 
Nama    NIM     Kelas 
tika    1003    1C
erik    1002    1B
dila    1001    1A
 

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 2
Menilai tugas dari tika
Masukkan nilai (0-100): 87
Nilai Tugas tika adalah 87

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 4
Daftar semua tugas 
Nama    NIM     Kelas 
erik    1002    1B
dila    1001    1A
 

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 5
Pilihan tidak valid. 
```
2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan
kode programnya!
- ada 5 data yang dapat ditampung, yaitu pada potongan kode program
```java
 StackTugasMahasiswa03 stack = new StackTugasMahasiswa03(5);
```
3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut
dihapus, apa dampaknya?
- karena untuk melakukan pengecekan kondisi untuk memastikan apakah stack masih mempunyai ruang sebelum menambahkan data baru. jika tidak ada kondisi if-else maka yg terjadi yaitu akan terjadi error array index out of bounds.

4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga
pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi
lihat tugas terbawah!
- dilakukan modifikasi pada class MahasiswaDemo03 dan class StackTugasMahasiswa03 yaitu penambahan kode berikut,
```java
public Mahasiswa03 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
case 5:
    Mahasiswa03 m = stack.peekBottom();
        if (m != null) {
            System.out.println("Tugas pertama dikumpulkan oleh "+m.nama);
        }
    break;
```
### sehingga output yg dihasilkan yaitu sebagai berikut
```java
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
Pilih : 1
Nama    : dila
NIM     : 1001
Kelas   : 1f
Tugas dila berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
Pilih : 1
Nama    : erik
NIM     : 1002
Kelas   : 1f
Tugas erik berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
Pilih : 1
Nama    : tika
NIM     : 1003
Kelas   : 1f
Tugas tika berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
Pilih : 3
Tugas terakhir dikumpulkan oleh tika

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
Pilih : 5
Tugas pertama dikumpulkan oleh dila

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
Pilih : 6
Pilihan tidak valid.
```
5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat
ini, serta tambahkan operasi menunya!
- ditambahkan method count pada class StackTugasMahasiswa03 dan penambahan case pada class MahasiswaDemo03
```java
public int count(){
    return top + 1;
}
case 6:
    System.out.println("Jumlah tugas yang sudah terkumpul : " + stack.count());
break;

```
### sehingga hasil running nya seperti dibawah ini
```java
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 1
Nama    : dila
NIM     : 1001
Kelas   : 1f
Tugas dila berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 1
Nama    : erik
NIM     : 1002
Kelas   : 1f
Tugas erik berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 1
Nama    : tika
NIM     : 1003
Kelas   : 1f
Tugas tika berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 6
Jumlah tugas yang sudah terkumpul : 3

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 7
Pilihan tidak valid. 
```
6. Commit dan push kode program ke Github

## 2.2 Percobaan 2: Konversi Nilai Tugas ke Biner 

Hasil Running :

```java
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 1
Nama    : dila
NIM     : 1001
Kelas   : 1f
Tugas dila berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 1
Nama    : erik
NIM     : 1002
Kelas   : 1f
Tugas erik berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 1
Nama    : tika
NIM     : 1003
Kelas   : 1f
Tugas tika berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 2
Menilai tugas dari tika
Masukkan nilai (0-100): 87
Nilai Tugas tika adalah 87
Nilai Biner Tugas: 1010111

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 7
Pilihan tidak valid.
```
### 2.2.3 Pertanyaan

1. Jelaskan alur kerja dari method konversiDesimalKeBiner!
- method konversiDesimalKeBiner bekerja dengan cara membagi bilangan desimal secara berulang dengan 2 dan menyimpan sisa pembagian ke dalam stack. karena stack bersifat LIFO, saat data diambil kembali menggunakan operasi pop, urutan sisa menjadi terbalik sehingga menghasilkan representasi bilangan biner yang benar.
2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0),
bagaimana hasilnya? Jelaskan alasannya!
- akan terjadi error karena variabel kode tidak pernah di deklarasikan, kecuali variabel kode menggantikan variabel nilai, hasilnya akan tetap sama

