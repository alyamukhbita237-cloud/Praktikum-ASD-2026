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

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
    - pangkatBF() menghitung perpangkatan dengan cara perkalian berulang menggunakan perulangan (loop) dari 1 sampai nilai pangkat. setiap iterasi mengalikan nilai basis dengan hasil sebelumnya sampai pangkat tercapai.
    - pangkatDC() menghitung perpangkatan dengan cara membagi masalah menjadi lebih kecil menggunakan rekursi. nilai pangkat dibagi menjadi setengah (n/2), kemudian hasilnya dikalikan kembali hingga mendapatkan hasil akhir.

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
    - Ya sudah ada
    ``` java
    return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
    return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
    ```

3.  Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan
dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat,
apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa
jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method
pangkatBF() yang tanpa parameter?

    - method pangkatBF() bisa dibuat tanpa parameter karena nilai yang diperlukan sudah tersedia dalam atribut nilai dan pangkat pada class Pangkat, sehingga method dapat langsung menggunakan atribut tersebut.

    ``` java
    perubahan di method pangkatBF()
    int pangkatBF (){
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = hasil*nilai;
        }
        return hasil;
    }
    perubahan di MainPangkat
    System.out.println(p.nilai+ "^"+p.pangkat+": "+p.pangkatBF());
    ```

4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
    - method pangkatBF() bekerja dengan cara mengalikan nilai basis secara berulang menggunakan perulangan sampai jumlah perkalian sesuai dengan nilai pangkat. sedangkan pangkatDC() bekerja dengan cara membagi perhitungan pangkat menjadi bagian yang lebih kecil menggunakan rekursi, kemudian menggabungkan kembali hasilnya sampai mendapatkan hasil akhir.

### 5.4 Percobaan 3 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

Hasil Run :

``` java
Masukkan jumlah elemen: 5
Masukkan keuntungan ke- 1: 10
Masukkan keuntungan ke- 2: 20
Masukkan keuntungan ke- 3: 30
Masukkan keuntungan ke- 4: 40
Masukkan keuntungan ke- 5: 50
Total keuntungan menggunakan Bruterforce: 150.0
Total keuntungan menggunakan Divide and Conquer: 150.0
```

### 5.4.1 Pertanyaan
1. Kenapa dibutuhkan variable mid pada method TotalDC()?
    - variabel mid digunakan untuk menentukan titik tengah data agar proses dapat dibagi menjadi dua bagian dalam algoritma Divide and Conquer

2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
    - statement tersebut digunakan untuk menghitung total bagian kiri dan kanan array secara rekursif sebelum digabungkan menjadi total akhir.

3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?
    - diperlukan untuk menggabungkan hasil perhitungan dari dua bagian array yang telah diproses secara rekursif

4. Apakah base case dari totalDC()?
    - base case dari totalDC() adalah ketika l == r, karena pada kondisi ini array hanya memiliki satu elemen sehingga tidak perlu dibagi lagi.

5. Tarik Kesimpulan tentang cara kerja totalDC()
    - method totalDC() bekerja dengan cara membagi array menjadi dua bagian menggunakan titik tengah (mid), kemudian menghitung total masing-masing bagian secara rekursif hingga mencapai base case. setelah itu, hasil dari bagian kiri (lsum) dan kana (rsum) digabungkan dengan penjumlahan untuk mendapatkan total keseluruhan.

### 5.5 Tugas

Hasil Run :

``` java
Masukkan jumlah mahasiswa: 8

Data Mahasiswa ke- 1
Nama          : ahmad
NIM           : 220101001
Tahun Masuk   : 2022
Nilai UTS     : 78
Nilai UAS     : 82

Data Mahasiswa ke- 2
Nama          : budi
NIM           : 220101002
Tahun Masuk   : 2022
Nilai UTS     : 85
Nilai UAS     : 88

Data Mahasiswa ke- 3
Nama          : cindy
NIM           : 220101003
Tahun Masuk   : 2021
Nilai UTS     : 90
Nilai UAS     : 87

Data Mahasiswa ke- 4
Nama          : dian
NIM           : 220101004
Tahun Masuk   : 2021
Nilai UTS     : 76
Nilai UAS     : 79

Data Mahasiswa ke- 5
Nama          : eko
NIM           : 220101005
Tahun Masuk   : 2023
Nilai UTS     : 92
Nilai UAS     : 95

Data Mahasiswa ke- 6
Nama          : fajar
NIM           : 220101006
Tahun Masuk   : 2020
Nilai UTS     : 88
Nilai UAS     : 85

Data Mahasiswa ke- 7
Nama          : gina
NIM           : 220101007
Tahun Masuk   : 2023
Nilai UTS     : 80
Nilai UAS     : 83

Data Mahasiswa ke- 8
Nama          : hadi
NIM           : 220101008
Tahun Masuk   : 2020
Nilai UTS     : 82
Nilai UAS     : 84

=== HASIL PERHITUNGAN ===
UTS Tertinggi : 92.0
UTS Terendah : 90.0
Rata-rata UAS : 85.375
```







