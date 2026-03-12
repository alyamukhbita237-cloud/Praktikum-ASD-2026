|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020152|
| Nama |  Alya Mukhbita Larassati |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/alyamukhbita237-cloud/Praktikum-ASD-2026.git

# Jobsheet 5 BRUTE FORCE DAN DIVIDE CONQUER

### 5.2 Percobaan 1 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

Hasil Run :
```java
Masukkan nilai: 5
Nilai faktorial 5 menggunakan BF: 120
Nilai faktorial 5 menggunakan DC: 120
```

### 5.2.1 Pertanyaan Percobaan 1
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
perbedaan bagian kode pada penggunaan if dan else!
    - if digunakan untuk menentukan kondisi agar rekursi berhenti, sedangkan else digunakan untuk melakukan proses pembagian masalah (divide) dan memanggil fungsi kembali

2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan
for? Buktikan!
    - ya, memungkinkan. perulangan pada method faktorialBF() tidak harus menggunakan for, tetapi juga bisa menggunakan while atau do-while. 

    ``` java
    int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto *i;
            i++;
        }
        return fakto;
    
    Masukkan nilai: 5
    Nilai faktorial 5 menggunakan BF: 120
    Nilai faktorial 5 menggunakan DC: 120
    ```

3.  Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
    - fakto *= i; menghitung faktorial dengan menggunakan perulangan, operator *= berfungsi untuk mengalikan nilai variabel dengan nilai lain lalu menyimpannya kembali ke variabel tsb. sedangkan fakto = n * faktorialDC(n-1); menghitung faktorial dengan rekursi (divide and conquer), nilai n dikalikan dengan hasil dari pemanggilan fungsi faktorialDC (n-1)

4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!
    - method faktorialBF () menghitung faktorial dengan perkalian berulang menggunakan perulangan (loop) dari 1 sampai n. sedangkan faktorialDC() menghitung faktorial dengan memanggil fungsi secara rekursif dari n hingga mencapai kondisi dasar, lalu hasilnya dikalikan kembali sampai ke nilai awal

### 5.3 Percobaan 2 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer

Hasil Run :

``` java
Masukkan jumlah elemen: 3
Masukkan nilai basis elemen ke- 1: 2
Masukkan nilai pangkat elemen ke- 1: 3
Masukkan nilai basis elemen ke- 2: 4
Masukkan nilai pangkat elemen ke- 2: 5
Masukkan nilai basis elemen ke- 3: 6
Masukkan nilai pangkat elemen ke- 3: 7
HASIL PANGKAT BRUTEFORCE:
2^3: 8
4^5: 1024
6^7: 279936
HASIL PANGKAT DIVIDE AND CONQUER:
2^3: 8
4^5: 1024
6^7: 279936
```

### 5.3.1 Pertanyaan




