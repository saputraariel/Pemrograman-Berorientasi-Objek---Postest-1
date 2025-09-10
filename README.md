# Pemrograman Berorientasi Objek Postest-1

## Tema : Manajemen Alat Musik Tradisional


Nama : Mohamad Ariel Saputra D Loi

Kelas : Sistem Informasi C-24

## Import Library

ArrayList - untuk membuat struktur data dinamis berupa list

Scanner - untuk membaca input dari pengguna

## Penjelasan Program

<img width="971" height="121" alt="image" src="https://github.com/user-attachments/assets/623714c0-6289-4180-99cb-45aa62171689" />

Scanner input = new Scanner(System.in); dipakai untuk menerima masukan dari keyboard, jadi program bisa mengetahui apa yang diketik pengguna. yang kedua ArrayList<String> alatMusik = new ArrayList<>(); adalah wadah fleksibel untuk menyimpan daftar kata atau teks, misalnya nama-nama alat musik, yang bisa bertambah atau berkurang sesuai kebutuhan (bisa diubah ubah)


<img width="884" height="189" alt="image" src="https://github.com/user-attachments/assets/f253ebaa-dba9-4900-acf5-08c29a49f255" />

Menambahkan Data Alat2 Musik Tradisional dengan menggunakan variabel alatMsuik yang sudh kita buat dalam bentuk data string menggunakan ArrayList sebelumnya

<img width="888" height="330" alt="image" src="https://github.com/user-attachments/assets/dc43052b-2b7c-4f73-9279-db07bd78dd7d" />

Membuat Variable pilihan. lalu mengeluarkan output untuk pilihan Menu awal di dalam sistem dengan menggunakan System.out.println("");. dan di akhir ada di siapkan untuk menginput pilihan dari menu yang akan dipilih oleh
pengguna

<img width="957" height="234" alt="image" src="https://github.com/user-attachments/assets/5bf854ac-d58c-4469-be4a-a956f7e108dd" />

dan untuk pilihan menu yang pertama ada menu "Menambah Alat Musik", Pertama dia akan memunculkan input untuk nama alast musik lalu asal daerah musik tersebut. setelah selesai program akan balik lagi ke bagoann menu karena sebelumnya sudh menerapkan perulangan agar program tidak berhenti kecuali pengguna memilih pilihan menu keluar

<img width="862" height="281" alt="image" src="https://github.com/user-attachments/assets/a96d03a1-49cc-4cb8-b522-710f1e3969b9" />

Potongan kode pada gambar di atas adalah bagian dari menu pilihan menampilkan daftar alat musik tradisional. Saat pengguna memilih menu nomor 2, program akan menuliskan judul "Daftar Alat Musik Tradisional:". Setelah itu, ada pengecekan dengan if (alatMusik.isEmpty()) untuk memastikan apakah daftar masih kosong atau sudah ada isinya. Kalau kosong, program akan menampilkan teks "(Belum ada data)". Namun kalau sudah ada data, program akan melakukan perulangan for dari indeks 0 sampai jumlah data di dalam alatMusik, lalu menuliskan setiap item dengan format nomor urut diikuti nama alat musik yang tersimpan. Setelah semua data ditampilkan, program menutup dengan menuliskan pesan *"== Data berhasil ditampilkan! ==".

<img width="867" height="476" alt="image" src="https://github.com/user-attachments/assets/013fa003-5a86-4c1c-be47-0de442095438" />

Untuk menu pilihan nomor 3 bagian ini adalah menu mengubah data alat musik. Saat pengguna memilih menu nomor 3, program akan lebih dulu menampilkan daftar alat musik yang sudah ada dengan nomor urut. Setelah itu, program meminta pengguna untuk memilih nomor alat musik yang ingin diubah. Nomor yang dimasukkan kemudian disesuaikan dengan indeks ArrayList (karena indeks dimulai dari nol, maka ada pengurangan satu). Jika nomor yang dipilih valid, program akan meminta pengguna mengetikkan nama baru dan daerah baru untuk menggantikan data lama. Data lama pada posisi tersebut kemudian diperbarui menggunakan alatMusik.set(), dan program menampilkan pesan bahwa alat musik berhasil diubah. Jika nomor yang dimasukkan tidak sesuai dengan data yang ada, maka program akan menampilkan pesan "Nomor tidak valid!"

<img width="876" height="486" alt="image" src="https://github.com/user-attachments/assets/dd505e1b-45ef-4591-b818-437abfd5ca08" />

Potongan kode ini adalah bagian dari menu menghapus data alat musik. Jika pengguna memilih menu nomor 4, program akan menampilkan seluruh daftar alat musik dengan nomor urut. Setelah itu, pengguna diminta memasukkan nomor alat musik yang ingin dihapus. Nomor tersebut dikurangi satu agar sesuai dengan indeks ArrayList. Jika nomor yang dimasukkan valid (masih dalam rentang daftar), maka data alat musik pada posisi tersebut akan dihapus dengan perintah alatMusik.remove(), lalu program menampilkan pesan "✔ Alat musik berhasil dihapus!". Namun, jika nomor yang dimasukkan tidak sesuai, program akan memberikan peringatan dengan pesan "Nomor tidak valid!".

menu pilihan ke-5, di mana program menampilkan pesan "Anda berhasil log out", serta bagian else yang menampilkan "Pilihan tidak valid, coba lagi!" bila pengguna memasukkan angka menu yang tidak tersedia.

<img width="594" height="122" alt="image" src="https://github.com/user-attachments/assets/4dda1b3c-fd3f-453d-9cf2-d5c8e5ed25aa" />

While !=5 digunakan untuk jika nilai inputan bukan 5 yaitu logout maka program tidak akan berhenti dan akan kembali ke pilihan menu

## Alur Program

1. Bagian Menu

Di bagian menu ini bisa Menuju ke 5 arah (Menambah alat musik, melihat alat musik, meng update alat musik, menghapus alat musik)

<img width="703" height="188" alt="image" src="https://github.com/user-attachments/assets/bc1d77ee-6a7c-43c3-bc4f-ef91306d4d43" />

2. Bagian Menambah alat musik

Dibgain Menambah alat musik ini, memasukan nama alat musik lalu daerah alat musik tersebut. jika sudh selesai maka akaan kembali otomatis kembali ke Bagian Menu



