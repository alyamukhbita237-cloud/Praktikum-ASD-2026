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
Masukkan jumlah mahasiswa: 5
Masukkan Data Mahasiswa ke- 1
NIM   : 111
Nama  : adi
Kelas : 2
IPK   : 3.1
--------------------
Masukkan Data Mahasiswa ke- 2
NIM   : 222
Nama  : ila
Kelas : 2
IPK   : 3.2
--------------------
Masukkan Data Mahasiswa ke- 3
NIM   : 333
Nama  : lia
Kelas : 2
IPK   : 3.3
--------------------
Masukkan Data Mahasiswa ke- 4
NIM   : 444
Nama  : susi
Kelas : 2
IPK   : 3.5
--------------------
Masukkan Data Mahasiswa ke- 5
NIM   : 555
Nama  : anita 
Kelas : 2
IPK   : 3.7
--------------------
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.1
-----------------------------
Nama: ila
NIM: 222
Kelas: 2
IPK: 3.2
-----------------------------
Nama: lia
NIM: 333
Kelas: 2
IPK: 3.3
-----------------------------
Nama: susi
NIM: 444
Kelas: 2
IPK: 3.5
-----------------------------
Nama: anita
NIM: 555
Kelas: 2
IPK: 3.7
-----------------------------
----------------------------------
menggunakan binary search
----------------------------------
data mahasiswa dengan IPK : 3.7 ditemukan pada indeks 4
nim      : 555
nama     : anita
kelas    : 2
ipk      : 3.7
```
### 6.3.3. Pertanyaan

1. Tunjukkan pada kode program yang mana proses divide dijalankan!
```java
mid = (left + right) / 2;
```

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
```java
return findBinarySearch(cari, left, mid - 1);
return findBinarySearch(cari, mid+1, right);
```

3. Apa fungsi left, right, dan mid?
- left untuk menunjukkan batas kiri dari data yang sedang dicari, right untuk menunjukkan batas kanan dari data yg dicari, mid untuk menunjukkan posisi tengah dari data

4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian?
- program tetap dapat berjalan jika menggunakan sequential search karena tidak membutuhkan data terurut. Namun, jika menggunakan binary search, data harus diurutkan terlebih dahulu, jika tidak maka hasil pencarian bisa tidak akurat.

5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen
yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka
ubahlah kode program binary seach agar hasilnya sesuai
- tidak sesuai
```java
int findBinarySearch(double cari, int left, int right) {
    int mid;
    if (right >= left) {
        mid = (left + right) / 2;
        if (cari == listMhs[mid].ipk) {
            return (mid);
        } else if (listMhs[mid].ipk < cari) {
            return findBinarySearch(cari, left, mid - 1);
        } else {
            return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
```

6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam
array.
- binary search menyatakan data tidak ditemukan ketika batas pencarian sudah tidak valid, yaitu saat nilai left lebih besar dari right. Hal ini menunjukkan bahwa seluruh bagian array yang mungkin sudah diperiksa dan tidak ditemukan nilai yang dicari.

7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan
dari keyboard.
```java
Masukkan jumlah mahasiswa: 5
Masukkan Data Mahasiswa ke- 1
NIM   : 111
Nama  : adi
Kelas : 2
IPK   : 3.1
--------------------
Masukkan Data Mahasiswa ke- 2
NIM   : 222
Nama  : ila
Kelas : 2
IPK   : 3.2
--------------------
Masukkan Data Mahasiswa ke- 3
NIM   : 333
Nama  : lia
Kelas : 2
IPK   : 3.3
--------------------
Masukkan Data Mahasiswa ke- 4
NIM   : 444
Nama  : susi
Kelas : 2
IPK   : 3.5
--------------------
Masukkan Data Mahasiswa ke- 5
NIM   : 555
Nama  : anita 
Kelas : 2
IPK   : 3.7
--------------------
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.1
-----------------------------
Nama: ila
NIM: 222
Kelas: 2
IPK: 3.2
-----------------------------
Nama: lia
NIM: 333
Kelas: 2
IPK: 3.3
-----------------------------
Nama: susi
NIM: 444
Kelas: 2
IPK: 3.5
-----------------------------
Nama: anita
NIM: 555
Kelas: 2
IPK: 3.7
-----------------------------
```



