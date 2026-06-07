|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020152|
| Nama |  Alya Mukhbita Larassati |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/alyamukhbita237-cloud/Praktikum-ASD-2026.git

# JOBSHEET 16 COLLECTION

## 16.2.1 Percobaan 1

Hasil Run:
```java
Elemen 0: 1 total elemen: 4 elemen terakhir: Cireng
Elemen 0: 2 total elemen: 4 elemen terakhir: 4
Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
```

### 16.2.3. Pertanyaan Percobaan

1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah
Arraylist?
- karena pada kode tersebut digunakan tanpa generic type. Akibatnya, ArrayList dapat menyimpan objek dari berbagai tipe data karena secara default semua elemen dianggap sebagai turunan dari kelas Object.
2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe
tertentu!
- 
```java
List<Integer> l = new ArrayList();
```
3. Ubah kode pada baris kode 38 menjadi seperti ini
- 
```java
LinkedList<String> names = new LinkedList<>();
```
4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya
- 
```java
names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());
```
5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
- setelah push("Mei-mei") dijalankan, data "Mei-mei" langsung masuk ke urutan pertama. Jumlah elemen bertambah dari 5 menjadi 6, sedangkan elemen terakhir tetap "Al-Qarni". Ini menunjukkan bahwa method push() menambahkan data di bagian depan LinkedList.
```java
Elemen 0: Mei-mei total elemen: 6 elemen terakhir: Al-Qarni
Names: [Mei-mei, Noureen, Akhleema, Shannum, Uwais, Al-Qarni]
```

