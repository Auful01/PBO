<h1>| LAPORAN JOBSHEET 11</h1>

<blockquote>PERTANYAAN PERCOBAAN 1</blockquote>
<ol>
<li>Class apa sajakah yang merupakan turunan dari class Employee?<br></li>
jawab : <br>
terdapat 2 class yaitu intershipemployee dan permanentemployee.
<li>Class apa sajakah yang implements ke interface Payable?<br></li>
jawab : <br>
terdapat 2 class yaitu electricitybill dan permanentemployee.
<li>Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi
dengan objek pEmp (merupakan objek dari class PermanentEmployee)
dan objek iEmp (merupakan objek dari class
InternshipEmploye) ? <br></li>
jawab : <br>
karena employee memiliki turunan class intershipemployee dan permanentemployee sehingga bisa di isi dengan objek tersebut.
<li>Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi
denganobjekpEmp (merupakan objek dari class
PermanentEmployee) dan objek eBill (merupakan objek dari class
ElectricityBill) ?<br></li>
jawab : <br>
karena interface pada payable digunakan di 2 class tersebut sehingga p bisa di isi objeck dari class Permanentemployee dan electricitybill. 
<li>Coba tambahkan sintaks:
<br>p = iEmp;
<br>e = eBill;<br>
pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang
menyebabkan error?<br></li>
jawab : <br>
karena p harus memakai interface payable sedangkan employe tidak menggunakan interface tersebut dan untuk e error di sebabkan employe tidak mewarisi class electricitybill.
<li>Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!<br></li>
jawab : <br>
ketika ada suatu objek yang dideklarasikan dari
super class, maka objek tersebut bisa diinstansiasi sebagai objek dari sub
class. 
</ol>
<br>
<blockquote>PERTANYAAN PERCOBAAN 2</blockquote>
<ol>
<li>Perhatikan class Tester2 di atas, mengapa pemanggilan
e.getEmployeeInfo() pada baris 8 dan
pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?<br></li>
jawab : <br>
karena employee 2 sudah di instansiasikan objek ke pEmp atau permanent employe sehingga pemanggilan sama dengan pEmp.
<li>Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai
pemanggilan method virtual (virtual method invication), sedangkan
pEmp.getEmployeeInfo() tidak?<br></li>
jawab : <br>
karena e.getEmployeeinfo() memanggil overidding method dari suatu objek polimorfisme dari class permanentemploye.
<li>Jadi apakah yang dimaksud dari virtual method invocation? Mengapa
disebut virtual?<br></li>
jawab : <br>
Disebut virtual karena antara method yang dikenali
oleh compiler dan method yang dijalankan oleh JVM berbeda. 
</ol>
<br>
<blockquote>PERTANYAAN PERCOBAAN 3</blockquote>
<ol>
<li>Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objekobjek dengan tipe yang berbeda, yaitu objek pEmp (objek dari
PermanentEmployee) dan objek iEmp (objek dari
InternshipEmployee) ?<br></li>
jawab : <br>
karena employee mewarisi class permanentemploye dan intershipemployee sehingga bisa dimasukan ke dalam array sesuai index yang di inginkan.
<li>Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek
dengan tipe yang berbeda, yaitu objek pEmp (objek dari
PermanentEmployee) dan objek eBill (objek dari
ElectricityBilling) ?<br></li>
jawab : <br>
karena payable mewarisi class electricitybill dan permanentemployee sehingga bisa dimasukan ke dalam array sesuai index yang di inginkan.
<li>Perhatikan baris ke-10, mengapa terjadi error?<br></li>
jawab : <br>
karena ebill dari class electricitybill tidak mewarisi class dari employe sehingga tidak bisa di instansiasikan objek.
</ol>
<br>

<blockquote>PERTANYAAN PERCOBAAN 4</blockquote>
<ol>
<li>Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa
pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan,
padahal jika diperhatikan method pay() yang ada di dalam class Owner
memiliki argument/parameter bertipe Payable?<br></li>
jawab : <br>
Jika diperhatikan lebih detil eBill merupakan objek dari
ElectricityBill dan pEmp merupakan objek dari
PermanentEmployee?
tetap bisa dilakukan karena interface paybale digunakan diclass electricitybill dan permanentemployee.
<li>Jadi apakah tujuan membuat argument bertipe Payable pada method
pay() yang ada di dalam class Owner?<br></li>
jawab : <br>
agar bisa diberikan nilai class yang menggunakan interface dari payable.
<li>Coba pada baris terakhir method main() yang ada di dalam class
Tester4 ditambahkan perintah ow.pay(iEmp);
Mengapa terjadi error?<br></li>
jawab : <br>
karena ow.pay memiliki parameter payable dan intershipemploye tidak menggunakan interface payable sehingga tidak bisa di instasiasikan objek.
<li>Perhatikan class Owner, diperlukan untuk apakah sintaks p
instanceof ElectricityBill pada baris ke-6 ?<br></li>
jawab : <br>
p digunakan untuk mengecek apakah suatu objek
merupakan hasil instansiasi dari suatu class tertentu.
<li>Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek
disana (ElectricityBill eb = (ElectricityBill) p)
diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke
dalam objek eb yang bertipe ElectricityBill ? <br></li>
jawab : <br>
digunakan untuk mengubah tipe dari suatu objek eb class electricitybill ke p paybel. Jika ada suatu
objek dari subclass kemudian tipenya diubah ke superclass, maka hal ini
termasuk ke upcasting.
</ol>
<h3>TUGAS</h3>

<blockquote>Output</blockquote>
<img src="https://github.com/Auful01/PBO/blob/master/Jobsheet11/tugas.png" width=500px>
