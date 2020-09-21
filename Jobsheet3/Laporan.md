<h1>LAPORAN PRAKTIKUM PERCOBAAN</h1>
<br><br>
<blockquote>PRAKTIKUM 1</blockquote>
<h4>Output</h4>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet3/img/coba2.jpeg" width=500px>
<p>3.3	pertanyaan

1.	Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?

Jawab :karena kontakOn bernilai false
2.	Mengapat atribut kecepatan dan kontakOn diset private?

Jawab: Agar tidak bisa diakses class lain dan hanya bisa diakses class tersebut
3.	Ubah class Motor sehingga kecepatan maksimalnya adalah 100!

Jawab: 

  public void tambahKecepatan() {
  
        if(kontakOn == true){
        
            if(kecepatan >= 100){
            
                System.out.println("Kecepatan Maks");<br>
                
            }else{
            
                kecepatan+=5;
                
            }
            
        }else{
        
            System.out.println("Kecepatan tidak bisa ditambah karena mesin off");
            
        }
        
    }
   </p>
<br>
<blockquote>PRAKTIKUM 2</blockquote>
<h4>Output</h4>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet3/img/coba1.jpeg" width=500px>
<p>3.6 Pertanyaan – Percobaan 3 dan 4
1. Apa yang dimaksud getter dan setter?
  
Jawab : Getter adalah sebuah method yang digunakan untuk menangkap nilai suatu variabel(attribut), setter adalah sebuah method yang digunakan untuk mengatur/mengisi nilai suatu variabel(attribut)

2. Apa kegunaan dari method getSimpanan()?

Jawab : untuk mendapatkan/menangkap value dari attribut simpanan

3. Method apa yang digunakan untk menambah saldo?

Jawab : setor

4. Apa yand dimaksud konstruktor?

Jawab : Suatu method khusus yang namanya sama dengan nama classnya, dan dipakai ketika instansiasi objek baru

5. Sebutkan aturan dalam membuat konstruktor?

Jawab : namanya harus sama dengan nama Class, bisa memiliki parameter, dapat di overload

6. Apakah boleh konstruktor bertipe private?

Jawab : boleh, karena defaultnya constructor memiliki access modifier yang sama dengan class

7. Kapan menggunakan parameter dengan passsing parameter?

Jawab : ketika constructornya memiliki parameter

8. Apa perbedaan atribut class dan instansiasi atribut?

Jawab : attribut class adalah attribut biasa yang berada di suatu class, sedangkan instansiasi attribut merupakan proses membuat objek attribut baru dan ditandai dengan keyword New

9. Apa perbedaan class method dan instansiasi method?

Jawab : class method adalah suatu method yang berada di sautu class, instansiasi method merupakan proses pembuatan objek method yang diitandai dengna kata kunci News

</p>
Soal no 2. Tugas 
Jawab : Karena age max < 35 lebih dari itu maka diset 30
