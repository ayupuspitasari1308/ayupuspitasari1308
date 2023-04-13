/*
Nama Program : Meja.java
Nama         : Ayu puspita Sari
NIM          : 22323010
*/

public class Meja//Nama class dari program yang kita buat jadi program ini diberi nama Meja
{//membuka steatment untuk membuat perintah class
	public int kaki_meja ()//membuat perintah class yang bernama kaki_meja dengan tipe data integer
	{//membuka steatment untuk membuat perintah input nilai kaki_meja
        return 70;//memberikan nilai balikkan pada kaki_meja bernilai 70
    }//menutup steatment perintah menginputkan nilai kaki_meja
    public int alas_meja()//membuat perintah class yang bernama alas_meja dengan tipe data integer
    {//membuka steatment untuk membuat perintah input nilai alas_meja
        return 120;//memberikan nilai balikkan pada alas_meja bernilai 120
    }//menutup steatment perintah menginputkan nilai alas_meja
    public static void main (String [] args)//sebuah method untuk menjalankan program yang memiliki nilai balikkan dan memiliki arguments
    {//membuka steatment untuk membuat perintah setelah perintah ini
       Meja baru=new Meja();//membuat variabel baru dengan program Meja baru menjadi new Meja
       int kaki=baru.kaki_meja();//mendeklarasikan variabel kaki dengan memanggil variabel Meja dengan menambahkan baru.class kaki_meja dengan tipe data intejer
       int alas_meja=baru.alas_meja();//mendeklarasikan variabel alas_meja dengan memanggil variabel Meja dengan menambahkan baru.class alas_meja dengan tipe data intejer

       System.out.println(kaki*alas_meja);//untuk menampilkan output ke monitor hasil dari operasi aritmatika dari kaki*alas_meja
    }//menutup stetatment perintah yang diatas
}//menutup steatment perintah dalam membuat perintah class