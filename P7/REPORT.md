|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020152|
| Nama |  Alya Mukhbita Larassati |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/alyamukhbita237-cloud/Praktikum-ASD-2026.git

# JOBSHEET VI SEARCHING

## 6.2 Searching/ Pencarian Menggunakan Algoritma Sequential Search

Hasil Run :
```java
Masukkan jumlah mahasiswa: 3
Masukkan Data Mahasiswa ke- 1
NIM   : 6427 
Nama  : alya
Kelas : 1f
IPK   : 3.9
--------------------
Masukkan Data Mahasiswa ke- 2
NIM   : 3264
Nama  : cindy
Kelas : 1f
IPK   : 3.7
--------------------
Masukkan Data Mahasiswa ke- 3
NIM   : 4837
Nama  : latif
Kelas : 1f
IPK   : 3.8
Nama: alya
NIM: 6427
Kelas: 1f
IPK: 3.9
-----------------------------
Nama: cindy
NIM: 3264
Kelas: 1f
IPK: 3.7
-----------------------------
Nama: latif
NIM: 4837
Kelas: 1f
IPK: 3.8
-----------------------------
------------------------------------
Pencarian data
------------------------------------
masukkan ipk mahasiswa yang dicari:
IPK : 3.8
menggunakan sequential searching
data mahasiswa dengan IPK : 3.8 ditemukan pada indeks 2
nim      : 4837
nama     : latif
kelas    : 1f
ipk      : 3.8
```
### 6.2.3. Pertanyaan

1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class
MahasiswaBerprestasi!
- metod tampilDataSearch digunakan untuk menampilkan seluruh isi data mahasiswa yang ipk nya dicari, sedangkan metod tampilPosisi digunakan untuk menampilkan posisi index ipk yang sedang dicari

2. Jelaskan fungsi break pada kode program di bawah ini!
```java
if (listMhs[j].ipk==cari) {
    posisi = j;
    break;
}
```
- untuk menghentikan proses pencarian yang dilakukan

3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
- untuk menunjukkan dimana posisi data yang dicari ditemukan dalam array

4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang
dibuat di atas akan menampilkan data ke berapa? Jelaskan.
- akan menampilkan data yang lebih dahulu kita isi datanya, karena ketika sudah ketemu program dirancang dengan break jadi langsung berhenti pencariannya

5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari
kode di atas?
- data yang muncul jadinya data terakhir yang kita masukkan, bukan data awal

## 6.3. Searching/ Pencarian Menggunakan Algoritma Binary Search

Hasil Run
```java

```



