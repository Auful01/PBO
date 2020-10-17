<h1>| LAPORAN JOBSHEET 7/PRAKTIKUM </h1>

<blockquote> PERCOBAAN 1 </blockquote>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet7/PRAKTIKUM/img/coba1.jpeg" width=500px>
<blockquote> PERTANYAAN </blockquote>
<ol>
  <li>Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas!</li>
  <p> Jawab:<ul>
      <li>Super Class: Karyawan</li>
      <li>Subclass: Manager, Staff</li>
    </ul></p>
  <li>Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?</li>
  <p> Jawab: extends</p>
  <li>Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!</li>
    <p> Jawab:<ul>
      <li>attribut class: tunjangan</li>
      <li>atrribut inheritance: nama, alamat, umur, jenis kelamin, gaji</li>
    </ul></p>
  <li>Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class Manager!<br>
    System.out.println("Total Gaji      : " + (super.gaji+tunjangan));
    </li>
    <p>Jawab: <br> Hierarchical inheritance, karena memiliki satu subclass dengan tingkatan yang sama</p>
</ol><br>

<blockquote> PERCOBAAN 2 </blockquote>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet7/PRAKTIKUM/img/coba2.jpeg" width=500px>
<blockquote> PERTANYAAN </blockquote>
<ol>
  <li>Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?</li>
  <p>Jawab:<ul>
             <li>Single inheritance = manager</li>
            <li>Multilevel = Staff</li>
          </ul></p>
  <li>Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Staff!</li>
  <p>Jawab:<ul>
  <li>attribut StaffHarian = jmlJamKerja</li>
  <li>attribut StaffTetap = golongan, asuransi</li>
  <li>Attribut yang diturunkan = nama, alamat, jk , umur, gaji, potongan, lembur</li>
    </ul></p>
  <li>Apakah fungsi potongan program berikut pada class StaffHarian<br>
    super(nama,alamat,jk,umur,gaji,lembur,potongan);
    </li>
    <p>Jawab:<br>Untuk memanggil konstruktor pada class super yaitu konstruktor class Staff</p>
  <li>Apakah fungsi potongan program berikut pada class StaffHarian<br>
    super.tampilDataStaff();
    </li>
    <p>Jawab:<br>4.	Untuk memanggil method tampilDataStaff pada Superclass</p>
  <li>Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap
    <br>System.out.println("Gaji Bersih   :"+(gaji+lembur-potongan-asuransi));<br>
Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji, lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur, dan potongan?</li>
  <p>Jawab:<br>Karena Class StaffTetap merupakan turunan dari Class Staff yang memiliki attribut gaji, potongan, dan lembur, dan juga memiliki access modifier berupa publik</p>
  </ol>
  <br>
<blockquote> TUGAS </blockquote>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet7/PRAKTIKUM/img/tugas.jpeg" width=500px>

