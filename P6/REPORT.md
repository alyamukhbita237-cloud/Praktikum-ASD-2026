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





