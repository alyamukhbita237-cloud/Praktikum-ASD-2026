|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020152|
| Nama |  Alya Mukhbita Larassati |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/alyamukhbita237-cloud/Praktikum-ASD-2026.git

# JOBSHEET PERTEMUAN 5 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

## 5.2 Praktikum 1 - Mengimplementasikan Sorting menggunakan object

Hasil Run :
```java
Data awal 1
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20 

Data awal 2
30 20 2 8 14 
Data sudah diurutkan dengan SELECTION SORT (ASC)
2 8 14 20 30 

Data awal 3
40 10 4 9 3 
Data sudah diurutkan dengan INSERTION SORT (ASC)
3 4 9 10 40 
```
### 5.2.5 Pertanyaan!
1.  Jelaskan fungsi kode program berikut
```java
if (data[j - 1] > data[j]) {
temp = data[j];
data[j] = data[j - 1];
data[j - 1] = temp;
}
```
- kode diatas berfungsi untuk menukar kedua elemen bersebelahan untuk mengurutkan data

2.  Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
```java
for (int i = 0; i < jumData - 1; i++) {
        int min = i;
        for (int j = i + 1; j < jumData; j++) {
            if (data[j] < data[min]) {
                min = j;
            }
        }
```

3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan
```java
while (j>=0 && data[j]>temp)
```
- selama j lebih besar atau sama dengan 0 dan data [j] lebih besar dari temp maka program akan dijalankan yaitu digeser ke sebelah kanan

4. . Pada Insertion sort, apakah tujuan dari perintah
```java
data[j+1] = data [j]
```
- untuk menggeser elemen ke sebelah kanan dan memberi ruang untuk menyisipkan nilai untuk membantu proses pengurutan nilai

## Praktikum 2- (Sorting Menggunakan Array of Object)

Hasil Run :
```java
Data mahasiswa sebelum sorting: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
-----------------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
-----------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
-----------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
-----------------------------
```

### 5.3.4 Pertanyaan
1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
```java
  for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {}}
```
a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
- Karena setelah n-1 tahap, semua data sudah pasti terurut

b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
- Karena setiap tahap elemen terbesar akan menggelembung ke posisi paling akhir, jadi bagian belakang tidak perlu dicek lagi

c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
- perulangan i akan berlangsung selama 49 kali yaitu 0 sampai 48
2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad)
yang terdiri dari nim, nama, kelas, dan ipk!
```java
Masukkan jumlah mahasiswa: 3
Data mahasiswa ke- 1
NIM : 8683
Nama : alya
Kelas : 1F
IPK : 3.6

Data mahasiswa ke- 2
NIM : 9726
Nama : cindy
Kelas : 1F
IPK : 3.8

Data mahasiswa ke- 3
NIM : 6384
Nama : athia
Kelas : 1F
IPK : 3.9

Data mahasiswa sebelum sorting:
Nama: alya
NIM: 8683
Kelas: 1F
IPK: 3.6
-----------------------------
Nama: cindy
NIM: 9726
Kelas: 1F
IPK: 3.8
-----------------------------
Nama: athia
NIM: 6384
Kelas: 1F
IPK: 3.9
-----------------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama: athia
NIM: 6384
Kelas: 1F
IPK: 3.9
-----------------------------
Nama: cindy
NIM: 9726
Kelas: 1F
IPK: 3.8
-----------------------------
Nama: alya
NIM: 8683
Kelas: 1F
IPK: 3.6
-----------------------------
```

## Praktikum 3 - 5.3.5 Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)

- Verifikasi Hasil Percobaan
``` java
Masukkan jumlah mahasiswa: 5
Data mahasiswa ke- 1
NIM : 123
Nama : ali
Kelas : 2b
IPK : 3.9
--------------------
Data mahasiswa ke- 2
NIM : 124
Nama : ila
Kelas : 2b
IPK : 3.1
--------------------
Data mahasiswa ke- 3
NIM : 125
Nama : agus
Kelas : 2b
IPK : 3.6
--------------------
Data mahasiswa ke- 4
NIM : 126
Nama : tika
Kelas : 2b
IPK : 3.3
--------------------
Data mahasiswa ke- 5
NIM : 127
Nama : udin
Kelas : 2b
IPK : 3.2
--------------------
Data yang sudah terurut menggunakan SELECTION SORT (ASC)
Nama: ila
NIM: 124
Kelas: 2b
IPK: 3.1
-----------------------------
Nama: udin
NIM: 127
Kelas: 2b
IPK: 3.2
-----------------------------
Nama: tika
NIM: 126
Kelas: 2b
IPK: 3.3
-----------------------------
Nama: agus
NIM: 125
Kelas: 2b
IPK: 3.6
-----------------------------
Nama: ali
NIM: 123
Kelas: 2b
IPK: 3.9
-----------------------------

### 5.3.7 Pertanyaan
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
```java
int idxMin = i;
    for (int j = i+1; j < listMhs.length; j++) {
        if (listMhs[j].ipk < listMhs[idxMin].ipk) {
            idxMin = j;
            }
        }
```
Untuk apakah proses tersebut, jelaskan!
- untuk mencari posisi index nilai IPK terkecil pada bagian array yang belum terurut

## Praktikum 4 - 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

- Verifikasi Hasil Percobaan
```java
Masukkan jumlah mahasiswa: 5
Data mahasiswa ke- 1
NIM : 111
Nama : ayu
Kelas : 2c
IPK : 3.7
--------------------
Data mahasiswa ke- 2
NIM : 222
Nama : dika
Kelas : 2c
IPK : 3.0
--------------------
Data mahasiswa ke- 3
NIM : 333
Nama : ila
Kelas : 2c
IPK : 3.8
--------------------
Data mahasiswa ke- 4
NIM : 444
Nama : susi
Kelas : 2c
IPK : 3.1
--------------------
Data mahasiswa ke- 5
NIM : 555
Nama : yayuk
Kelas : 2c
IPK : 3.4
--------------------
Data yang sudah terurut menggunakan INSERTION SORT (ASC)
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
-----------------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
-----------------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
-----------------------------
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
-----------------------------
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
-----------------------------
```
### 5.4.3 Pertanyaan

Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara descending
- Kode Program
```java
void insertionSortDescending(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa03 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs [j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }
```
- Hasil Running
```java
Masukkan jumlah mahasiswa: 3
Data mahasiswa ke- 1
NIM : 7532 
Nama : alya
Kelas : 1F
IPK : 3.7
--------------------
Data mahasiswa ke- 2
NIM : 7425
Nama : cindy
Kelas : 1F
IPK : 3.6
--------------------
Data mahasiswa ke- 3
NIM : 7825
Nama : athia
Kelas : 1F
IPK : 3.8
--------------------
Data yang sudah terurut menggunakan INSERTION SORT (DESC)
Nama: athia
NIM: 7825
Kelas: 1F
IPK: 3.8
-----------------------------
Nama: alya
NIM: 7532
Kelas: 1F
IPK: 3.7
-----------------------------
Nama: cindy
NIM: 7425
Kelas: 1F
IPK: 3.6
-----------------------------
```
## Latihan Praktikum
- Hasil Running
```java
=== MENU ===
1. Tambah Data
2. Tampil Data
3. Sorting ASC
4. Sorting DSC
5. Insertion Sort
0. Keluar

Pilih: 1
Kode : 7426
Nama : alya
Jenis Kelamin Laki-Laki? (Y/N) : n
Usia : 37

=== MENU ===
1. Tambah Data
2. Tampil Data
3. Sorting ASC
4. Sorting DSC
5. Insertion Sort
0. Keluar

Pilih: 1
Kode : 4873
Nama : cindy
Jenis Kelamin Laki-Laki? (Y/N) : n
Usia : 39

=== MENU ===
1. Tambah Data
2. Tampil Data
3. Sorting ASC
4. Sorting DSC
5. Insertion Sort
0. Keluar

Pilih: 1
Kode : 76239
Nama : latif
Jenis Kelamin Laki-Laki? (Y/N) : y
Usia : 40

=== MENU ===
1. Tambah Data
2. Tampil Data
3. Sorting ASC
4. Sorting DSC
5. Insertion Sort
0. Keluar

Pilih: 2
Kode: 7426
Nama: alya
Jenis Kelamin Laki-laki ? : false
Usia: 37
-----------------------
Kode: 4873
Nama: cindy
Jenis Kelamin Laki-laki ? : false
Usia: 39
-----------------------
Kode: 76239
Nama: latif
Jenis Kelamin Laki-laki ? : true
Usia: 40
-----------------------

=== MENU ===
1. Tambah Data
2. Tampil Data
3. Sorting ASC
4. Sorting DSC
5. Insertion Sort
0. Keluar

Pilih: 3
Data diurutkan ASC
Kode: 7426
Nama: alya
Jenis Kelamin Laki-laki ? : false
Usia: 37
-----------------------
Kode: 4873
Nama: cindy
Jenis Kelamin Laki-laki ? : false
Usia: 39
-----------------------
Kode: 76239
Nama: latif
Jenis Kelamin Laki-laki ? : true
Usia: 40
-----------------------

=== MENU ===
1. Tambah Data
2. Tampil Data
3. Sorting ASC
4. Sorting DSC
5. Insertion Sort
0. Keluar

Pilih: 4
Data diurutkan DSC
Kode: 76239
Nama: latif
Jenis Kelamin Laki-laki ? : true
Usia: 40
-----------------------
Kode: 4873
Nama: cindy
Jenis Kelamin Laki-laki ? : false
Usia: 39
-----------------------
Kode: 7426
Nama: alya
Jenis Kelamin Laki-laki ? : false
Usia: 37
-----------------------

=== MENU ===
1. Tambah Data
2. Tampil Data
3. Sorting ASC
4. Sorting DSC
5. Insertion Sort
0. Keluar

Pilih: 5
Data diurutkan Insertion
Kode: 76239
Nama: latif
Jenis Kelamin Laki-laki ? : true
Usia: 40
-----------------------
Kode: 4873
Nama: cindy
Jenis Kelamin Laki-laki ? : false
Usia: 39
-----------------------
Kode: 7426
Nama: alya
Jenis Kelamin Laki-laki ? : false
Usia: 37
-----------------------

=== MENU ===
1. Tambah Data
2. Tampil Data
3. Sorting ASC
4. Sorting DSC
5. Insertion Sort
0. Keluar

Pilih: 0
Keluar Program !
```




