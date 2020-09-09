<h3> TUGAS PRAKTIKUM JOBSHEET 1 </h3>

<h4><blockquote>Gambar laptop</blockquote></h4>
<p>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet1/Tugas%20praktikum/img/laptop.jpg"  width="350">
</p>

<blockquote> Class Laptop.java </blockquote>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet1/Tugas%20praktikum/img/class%20Laptop.png" width="550">

<blockquote>Penjelasan </blockquote>
<p> Pada class laptop ini kami hanya memilih 2 attribut sesuai perintah dalam jobsheet, yaitu merek dan ram <br>
    ,serta memiliki 3 method, diantaranya, setMerek() untuk menentukan merek, setRam() untuk set besar ram() ,<br> dan info() untuk mencetak info
    </p>
    
<table border=1>
  <tr>
    <td align="center">Laptop.java</td>
   </tr>
     <tr>
        <td>
          -merek: String<br>
          -ram: int
        </td>
   </tr>
   <tr>
      <td>
        +setMerek(newMerk: String): void<br>
        +setRam(newVal: int): int<br>
        +info(): void
      </td>
   </tr>
   
</table>

<h4><blockquote>Gambar Televisi</blockquote></h4>
<p>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet1/Tugas%20praktikum/img/samsung.jpg"  width="350">
</p>

<blockquote> Class Televisi.java </blockquote>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet1/Tugas%20praktikum/img/class%20Televisi.png" width="550">

<blockquote>Penjelasan </blockquote>
<p> Pada class Televisi ini kami memilih 2 attribut sesuai perintah dalam jobsheet, yaitu merek dan sizeLayar <br>
    ,serta memiliki 3 method, diantaranya, setMerek() untuk menentukan merek, setLayar() untuk set Ukuran layar ,<br> dan info() untuk mencetak info
    </p>
    
<table border=1>
  <tr>
    <td align="center">Televisi.java</td>
   </tr>
     <tr>
        <td>
          -merek: String<br>
          -sizeLayar: int
        </td>
   </tr>
   <tr>
      <td>
        +setMerek(newMerk: String): void<br>
        +setLayar(newVal: int): int<br>
        +info(): void
      </td>
   </tr>
</table>

//========================

<blockquote> Class Mobil </blockquote>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet1/Tugas%20praktikum/img/class%20Mobil.png" width="550">

<blockquote>Penjelasan </blockquote>
<p>  Class Mobil.java ini merupakan Class induk atau pewaris dari Class inheritancenya yakni class MobilSport.java dan MobilVan.java,<br>
      dimana pada class ini terdapat 2 attribut, merek dan gear. Serta memiliki 3 method setMerk(), setGear() ,dan info().
      <br>
     method setMerk() untuk menentukan merek, setGear() untuk set Gear mobil ,dan method info() untuk mencetak info.
    </p>
    
<table border=1>
  <tr>
    <td align="center">Mobil.java</td>
   </tr>
     <tr>
        <td>
          -merek: String<br>
          -gear: int
        </td>
   </tr>
   <tr>
      <td>
        +setMerk(newMerek: String): void<br>
        +setGear(newVal: int): int<br>
        +info(): void
      </td>
   </tr>
</table>

//==========================

<h4><blockquote>Gambar Mobil Sport</blockquote></h4>
<p>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet1/Tugas%20praktikum/img/supra.jpg"  width="350">
</p>

<blockquote> Class MobilSport.java </blockquote>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet1/Tugas%20praktikum/img/class%20MobilSport.png" width="550">

<blockquote>Penjelasan </blockquote>
<p> Pada class MobilSport inimerupakan <i>class inheritance</i> dari class induk <b> Mobil.java </b> kami memilih 3 attribut diantaranya 2 attribut <b>class induk</b> dan<br>
    1 class dari inheritance pada class ini, yaitu merek, gear, dan engineType. Serta memiliki 4 method, diantaranya, 3 method class induk dan 1 method khusus class ini, 
     1 method dari class khusus ini merupakan submethod dari class induk, jadi bisa dikatakan hanya memiliki 3 method <br><br>
     method setMerek untuk menentukan merek, setGear() untuk set Gear mobil sport tersebut, 1 method dari class ini yakni <br>
     setEngineType untuk menentukan tipe Mesin, dan methof printInfo() untuk mencetak info yang digabungkan dengan method info menggunakan objek <i>super</i>.info()
    </p>
    
<table border=1>
  <tr>
    <td align="center">MobilSport.java</td>
   </tr>
     <tr>
        <td>
          -engineType: String<br>
        </td>
   </tr>
   <tr>
      <td>
        +setEngineType(newVal: String): void<br>
        +printInfo(): void
      </td>
   </tr>
</table>

//=================================

<h4><blockquote>Gambar Mobil Van</blockquote></h4>
<p>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet1/Tugas%20praktikum/img/alphard.jpg"  width="350">
</p>

<blockquote> Class Mobilvan.java </blockquote>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet1/Tugas%20praktikum/img/class%20MobilVan.png" width="550">

<blockquote>Penjelasan </blockquote>
<p> Pada class MobilVan ini merupakan <i>class inheritance</i> dari class induk <b> Mobil.java </b> kami memilih 3 attribut diantaranya 2 attribut <b>class induk</b> dan <br>
1 class dari inheritance pada class ini, yaitu merek, gear, dan passangerCap. Serta memiliki 4 method, diantaranya, 3 method class induk dan 1 method khusus class ini, 
     1 method dari class khusus ini merupakan submethod dari class induk, jadi bisa dikatakan hanya memiliki 3 method <br><br>
     method setMerek untuk menentukan merek, setGear() untuk set Gear mobil Van tersebut, 1 method dari class ini yakni <br>
     setPassanger untuk menentukan daya angkut penumpang, dan method printInfo() untuk mencetak info yang digabungkan dengan method info menggunakan objek <i>super</i>.info()
    </p>
    
<table border=1>
  <tr>
    <td align="center">MobilVan.java</td>
   </tr>
     <tr>
        <td>
          -passangerCap: int<br>
        </td>
   </tr>
   <tr>
      <td>
        +setPassanger(newVal: int): int<br>
        +printInfo(): void
      </td>
   </tr>
</table>

// ==============================================

<h1>Class TugasMain</h1>

<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet1/Tugas%20praktikum/img/class%20TugasMain.png">

<blockquote>Penjelasan</blockquote>
<p>
  Class ini merupakan MainClass atau Class utama untuk menjalankan program tadi agar menghasilkan sebuah output. untuk menjalankannya,<br>
  kami melakukan pembuatan objek atau instansiasi dari class diatas, kemudian kami melakukan pemanggilan method dari objek kemudian melakukan<br>
  penginisialisasian untuk mengisi nilai dari objek. kemudian program dijalankan
  </p>
  
  <blockquote>OUTPUT</blockquote>
  <img src="https://github.com/Auful01/PBO/blob/master/Jobsheet1/Tugas%20praktikum/img/Output.png" width=500px>
  
  

