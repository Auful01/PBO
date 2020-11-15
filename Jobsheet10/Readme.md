<h1> | LAPORAN JOBSHEET 10 </h1>
<br>
<blockquote>PERTANYAAN PERCOBAAN 1</blockquote>
<ol>
  <li>Pada langkah ke 9, pada baris program ke 3 terdapat warning pada script tersebut.
    Jelaskan penyebab terjadinya hal tersebut ?<br>
    <b>Jawab</b>: penyebabnya karena class interface ICumlaude tidak digunakan ataupun tidak ada fungsi sama sekali <i>deadcode</i>
    </li>
  <li>Pada langkah ke 9, pada baris program ke 3. Apa yang terjadi jika script tersebut dihilangkan? Jelaskan menurut pemahaman anda.<br>
    <b>Jawab</b>: Tidak akan terjadi apa-apa karena merupakan <i>deadcode</i> atau tidak digunakan
   </li>
  <li>Mengapa pada langkah nomor 9 terjadi error? Jelaskan!<br>
    <b>Jawab</b>: Karena dari class Mahasiswa belum melakukan implements ke class interface ICumlaude
  </li>
  <li>Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian?<br>
    <b>Jawab</b>: terjadi error,karena bukan dalam bagian implementasi karena method kuliahDiKampus merupakan bagian dari class mahasiswa
   </li>
  <li>Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?<br>
    <b>Jawab</b>: tidak bisa karena bukan dalam bagian implementasi,karena method tersebut berada dalam class mahasiswa bukan kedalam method hasil implements
  </li>
  <li>Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi
class Program menjadi seperti berikut ini:<br>
  <b>Jawab</b>:<br>
  <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet10/IMG/1.png" width=500px>
</li>
    
</ol>

<blockquote>PERTANYAAN PERCOBAAN 2</blockquote>

<ol>
  <li>. Pada script code interface IBerprestasi, modifikasi script tersebut sesuai dengan gambar
        dibawah ini :<br>
        Dari perubahan script diatas, apa yang terjadi ? serta jelaskan alasannya (capture hasilnya)<br>
        <b>Jawab</b>: Akan terjadi Error, karena method abstract harus memiliki access modifier public agar bisa di override ataupun di implementasikan Class lain<br>
        <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet10/IMG/2.1.png" width=500px>
        </li>
  <li>Perhatikan script code dibawah ini :<br>
      Jelaskan menurut anda, mengapa hasil dari script code tersebut error ?<br>
       <b>Jawab</b>: Karena Class impelement tidak bisa diinstansiasi dan didalamnya merupakan method abstract
      </li>
  <li>Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan
menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait
pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat
mawapres pada objek sarjanaCumlaude.<br>
  <b>Jawab</b>:<br> 
  <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet10/IMG/2.3.png" width=500px>
</li>
 </ol>
 
 <blockquote>TUGAS</blockquote>
 <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet10/IMG/uml.png" width=500px>
 <p>Class diagram untuk pembuatan program Binatang</p>
 <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet10/IMG/3-1.png" width=500px>
 <p> Membuat Abstract class Binatang untuk diturunkan atau di override di class selanjutnya yang ingin dibuat</p>
 <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet10/IMG/3-3.png" width=500px>
 <p> Membuat interface Class IKarnivora yang berisi abstract method displayMakan()</p>
 <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet10/IMG/3-4.png" width=500px>
 <p> Membuat interface Class IHerbivora yang berisi abstract method displayMakan()</p>
 <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet10/IMG/3-2.png" width=500px>
 <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet10/IMG/3-5.png" width=500px>
 <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet10/IMG/3-6.png" width=500px>
 <p> Membuat class turunan untuk mengimplements dan override seluruh class interface dan abstract beserta methodnya yang sesuai dengan fakta, mulai dari Class Keledai yang mengimplementasikan 
    Class interface IHerbivora, Class Singa yang mengimplementasikan Class interface IKarnivora, dan Class Gorilla yang mengimplementasikan keduanya
  </p>
  <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet10/IMG/3-7.png" width=500px>
  <p>Membuat Main Class untuk menjalankan program tersebut</p>
  <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet10/IMG/tugas.png" width=500px>
  <p>Hasil dari program diatas</p>
  <hr>
  <p align="center"><b>COPYRIGHT&copy;MUHAMMAD AUFUL KIROM&trade;</b></p>
