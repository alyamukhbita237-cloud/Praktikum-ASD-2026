|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020152|
| Nama |  Alya Mukhbita Larassati |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/alyamukhbita237-cloud/Praktikum-ASD-2026.git

# JOBSHEET XII DOUBLE LINKED LIST

## Percobaan 1

Hasil Run :
```java
==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih Menu : 2
Masukkan NIM      : 123005
Masukkan Nama     : Harry
Masukkan Kelas    : 1A
Masukkan IPK      : 3.76

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih Menu : 3
Masukkan NIM yang dicari : 123005
Masukkan data baru : 
Masukkan NIM      : 123010
Masukkan Nama     : Potter
Masukkan Kelas    : 1B
Masukkan IPK      : 3.55
Data berhasil disisipkan setelah NIM 123005

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih Menu : 6
NIM        : 123005
Nama     : Harry
Kelas    : 1A
IPK      : 3.76
NIM        : 123010
Nama     : Potter
Kelas    : 1B
IPK      : 3.55

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih Menu : 0
Program Selesai.
```

### 12.2.3 Pertanyaan

1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan
Double Linked List!
- Single Linked List memiliki satu pointer (next) sehingga traversal hanya dapat dilakukan dari depan ke belakang dan penggunaan memorinya lebih hemat. Double Linked List memiliki dua pointer (next dan prev) sehingga traversal dapat dilakukan dua arah, memudahkan operasi penyisipan dan penghapusan node, tetapi membutuhkan memori yang lebih besar.

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi
masing-masing atribut tersebut pada proses traversal dan manipulasi node!
- next digunakan untuk menunjuk ke node berikutnya sehingga memungkinkan traversal maju (head → tail) dan membantu proses penyisipan atau penghapusan node.
- prev digunakan untuk menunjuk ke node sebelumnya sehingga memungkinkan traversal mundur (tail → head) serta mempermudah manipulasi node tanpa harus mencari node sebelumnya terlebih dahulu.

3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut
terhadap kondisi awal linked list!
-  Konstruktor DoubleLinkedList berfungsi untuk menyiapkan linked list dalam keadaan kosong dengan mengatur head dan tail menjadi null. Inisialisasi ini penting agar operasi seperti penambahan, penghapusan, dan pengecekan kondisi kosong dapat berjalan dengan benar tanpa menyebabkan error.

4. Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?
- head dan tail harus menunjuk ke node yang sama ketika linked list kosong karena node yang baru ditambahkan menjadi satu-satunya node, sehingga berperan sebagai node pertama sekaligus node terakhir dalam linked list.

5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika
tidak terdapat data pada linked list!
```java

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih Menu : 6
Linked List masih kosong.
```
method print sudah menampilkan pesan linked list masih kosong

6. Modifikasi kode program dengan menambahkan method printReverse() untuk
menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail
menuju head!
```java

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan Data Terbalik
0. Keluar
Pilih Menu : 1
Masukkan NIM      : 123
Masukkan Nama     : alya
Masukkan Kelas    : 1f
Masukkan IPK      : 3.9

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan Data Terbalik
0. Keluar
Pilih Menu : 2
Masukkan NIM      : 125
Masukkan Nama     : stepen
Masukkan Kelas    : 1f
Masukkan IPK      : 3.89

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan Data Terbalik
0. Keluar
Pilih Menu : 7
Data dari tail ke head:
NIM        : 125
Nama     : stepen
Kelas    : 1f
IPK      : 3.89
NIM        : 123
Nama     : alya
Kelas    : 1f
IPK      : 3.9

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan Data Terbalik
0. Keluar
Pilih Menu : 0
Program Selesai.
```
kode program modif :
```java
public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        System.out.println("Data dari tail ke head:");

        Node03 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }
```

