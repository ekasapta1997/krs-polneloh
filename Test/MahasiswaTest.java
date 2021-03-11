package Test;

import Model.ModelMahasiswa;

public class MahasiswaTest {
    public static void main(String [] args){
        ModelMahasiswa mhs = new ModelMahasiswa(null, null);
        
        //Test 1 - panjang nim harus 7
        String hasilEkspestasi = "Panjang NIM harus 7!";
        if(mhs.setNim("12345678") == hasilEkspestasi){
            System.out.println("Test 1 - Berhasil");
        }else{
            System.out.println("Test 1 - Gagal");
        }
        
        //Test 2 - NIM ga boleh kosong
        String hasilEkspestasi2 = "NIM tidak boleh kosong!";
        if(mhs.setNim("") == hasilEkspestasi2){
            System.out.println("Test 1 - Berhasil");
        }else{
            System.out.println("Test 1 - Gagal");
        }
        
        //Test 3 - NIM harus angka
        String hasilEkspestasi3 = "NIM harus berisi angka!";
        if(mhs.setNim("i2a4567") == hasilEkspestasi3){
            System.out.println("Test 1 - Berhasil");
        }else{
            System.out.println("Test 1 - Gagal");
        }
        
    }
}
