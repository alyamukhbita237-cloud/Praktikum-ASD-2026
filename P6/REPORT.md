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



