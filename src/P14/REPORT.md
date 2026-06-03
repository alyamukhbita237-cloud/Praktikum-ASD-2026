|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020152|
| Nama |  Alya Mukhbita Larassati |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/alyamukhbita237-cloud/Praktikum-ASD-2026.git

# JOBSHEET 14 Tree

## 14.2.1 Percobaan 1

Hasil Run :
```java
Daftar semua mahasiswa (in order traversal) : 
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: D IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

Pencarian data mahasiswa: 
Cari mahasiswa dengan ipk: 3.54 : Ditemukan
Cari mahasiswa dengan ipk: 3.22 : Tidak ditemukan

Daftar semua mahasiswa setelah penambahan 3 mahasiswa: 
InOrder Traversal: 
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: D IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

PreOrder Traversal: 
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: D IPK: 3.54
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

PostOrder Traversal: 
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160220 Nama: Dewi Kelas: D IPK: 3.54
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57

Penghapusan data mahasiswa
Jika 2 anak, current = 
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal): 
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: D IPK: 3.54
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
```

### 14.2.2 Pertanyaan Percobaan

1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding
binary tree biasa?
- karena setiap node memiliki aturan khusus, yaitu nilai pada subtree kiri selalu lebih kecil dari node induk, dan nilai pada subtree kanan selalu lebih besar. Dengan aturan ini, saat mencari suatu data, kita dapat langsung menentukan apakah harus bergerak ke kiri atau ke kanan tanpa memeriksa seluruh node.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
- atribut left dan right digunakan untuk menyimpan referensi (alamat) ke node anak kiri dan node anak kanan.

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
- atribut root digunakan untuk menyimpan referensi ke node akar (root node), yaitu node pertama atau node paling atas pada struktur binary tree. 

b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
- Ketika objek tree pertama kali dibuat dan belum memiliki node apa pun, nilai root adalah null.

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
- proses yang akan terjadi yaitu proses pengecekan root, pembuatan node baru, kemudian node tersebut ditetapkan sebagai root tree karena belum ada node lain di dalam tree.

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan
secara detil untuk apa baris program tersebut?
- baris program tersebut berfungsi untuk menentukan posisi Node baru (newNode) berdasarkan nilai IPK mahasiswa. Dengan melakukan pengecekan untuk membandingkan IPK mahasiswa yang akan ditambahkan dengan IPK pada node saat ini, jika IPK lebih kecil maka node harus ditempatkan di subtree sebelah kiri. jika tidak, node akan ditempatkan di subtree kanan.

6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua
anak. Bagaimana method getSuccessor() membantu dalam proses ini?
- Saat menghapus node yang memiliki dua anak, method delete() menggunakan getSuccessor() untuk mencari node terkecil pada subtree kanan. Node successor tersebut kemudian menggantikan posisi node yang dihapus sehingga urutan data pada Binary Search Tree tetap terjaga. Method getSuccessor() membantu dengan mencari successor, melepaskannya dari posisi lama, dan menyesuaikan hubungan antar node sebelum successor ditempatkan pada posisi node yang dihapus.


