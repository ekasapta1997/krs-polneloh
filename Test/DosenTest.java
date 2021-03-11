package Test;
import Model.ModelDosen;

public class DosenTest {
    public static void main(String [] args){
        ModelDosen dsn = new ModelDosen();
        
        //Test 1 - Menguji panjang karakter 
        String hasilEkspestasi = "Panjang NIDN harus 7 karakter !";
        if(dsn.setNidn("12345678") == hasilEkspestasi){
            System.out.println("Test 1 - Berhasil");
        }else{
            System.out.println("Test 1 - Gagal");
        }
        
        //Test 2 - NIDN tidak boleh kosong
        String hasilEkspestasi2 = "NIDN tidak boleh kosong!";
        if(dsn.setNidn("") == hasilEkspestasi2){
            System.out.println("Test 1 - Berhasil");
        }else{
            System.out.println("Test 1 - Gagal");
        }
        
        //Test 3 - NIDN harus angka
        String hasilEkspestasi3 = "NIDN harus angka!";
        if(dsn.setNidn("i2e4567") == hasilEkspestasi3){
            System.out.println("Test 1 - Berhasil");
        }else{
            System.out.println("Test 1 - Gagal");
        }
      
    }
}
