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

## 16.3.1 Percobaan 2

Hasil Run:
```java
Banana Orange Watermelon Leci Salak 
[Banana, Orange, Watermelon, Leci, Salak]
Salak Leci Watermelon Orange Banana 
Melon Durian 
Melon Durian 
Melon Durian 
```

### 16.3.2 Pertanyaan Percobaan

1. Apakah perbedaan fungsi push() dan add() pada objek fruits?
- tidak ada perbedaan, fungsi push() dan add() pada objek fruits sama sama untuk menambahkan elemen ke akhir stack. Namun fungsi push() digunakan khusus untuk operasi stack, sedangkan fungsi add() adalah operasi umum koleksi. Pada objek Stack, keduanya dapat menambahkan elemen ke bagian akhir, tetapi push() lebih sesuai dengan konsep stack.

2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?
```java
Banana Orange Watermelon Leci Salak 
[Banana, Orange, Watermelon, Leci, Salak]
Salak Leci Watermelon Orange Banana 
```
- Jika baris 43 dan 44 dihapus, output setelah proses pop() tidak akan menampilkan data karena seluruh elemen sudah dikeluarkan dan stack menjadi kosong.

3. Jelaskan fungsi dari baris 46-49?
- baris 46-49 digunakan untuk menampilkan seluruh elemen dalam stack menggunakan objek iterator.

4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi?
Mengapa bisa demikian?
- Program akan error karena variabel bertipe List tidak mengenal method khusus milik Stack seperti push(), pop(), dan empty().

5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!
```java
Banana Orange Watermelon Leci Salak 
[Banana, Orange, Watermelon, Leci, Salak]
Salak Leci Watermelon Orange Banana 
Melon Strawberry 
Melon Strawberry 
Melon Strawberry 
```
6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!
```java
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");
        Collections.sort(fruits);
```



