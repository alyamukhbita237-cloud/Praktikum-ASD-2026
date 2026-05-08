|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020152|
| Nama |  Alya Mukhbita Larassati |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/alyamukhbita237-cloud/Praktikum-ASD-2026.git

# JOBSHEET XI LINKED LIST

## 2.1 Pembuatan Single Link List

Hasil Run :
```java
Linked List kosong
Isi Linked List:
Dirga           21212203        4D      3.6

Isi Linked List:
Dirga           21212203        4D      3.6
Alvaro          24212200        1A      4.0

Isi Linked List:
Dirga           21212203        4D      3.6
Cintia          22212202        3C      3.5
Bimon           23212201        2B      3.8
Alvaro          24212200        1A      4.0
```

### 2.1.2 Pertanyaan

1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
- karena pada saat method sll.print(); dipanggil pertama kali, objek SingleLinkedList masih belum memiliki data. Saat objek dibuat, nilai head dan tail masih null, sehingga ketika method isEmpty() dipanggil akan mengembalikan nilai true, karena linked list masih kosong, maka muncul output Linked List Kosong

2. Jelaskan kegunaan variable temp secara umum pada setiap method!
- variabel temp digunakan sebagai pointer sementara untuk menelusuri node pada linked list tanpa mengubah posisi head.

3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!
-