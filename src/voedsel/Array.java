package voedsel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;


public class Array {
    ArrayList<StokMakanan> array = new ArrayList<>();

     public static void simpan(ArrayList<StokMakanan> arrayy){
        XStream xStream = new XStream(new StaxDriver());
        String sxml = xStream.toXML(arrayy);
        FileOutputStream fileOutput;
        try {
            byte[] bytes = sxml.getBytes("UTF-8");
            fileOutput = new FileOutputStream("src/voedsel/StockMakanan.xml");
            fileOutput.write(bytes);
            fileOutput.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void addStokMakanan(String nama, String stok, String tanggalPengambilan){
        array.add(new StokMakanan(nama, stok, tanggalPengambilan));
        simpan(array);
    }
    
    public StokMakanan getStok(int index){
        return array.get(index);
    }

    public ArrayList<StokMakanan> getStokMakananList(){
        return array;
    }

    public Array(){
        array = baca(array);
    }

    public static ArrayList<StokMakanan> baca(ArrayList<StokMakanan> arrayy) {
        XStream xStream = new XStream(new StaxDriver());
        xStream.addPermission(AnyTypePermission.ANY);
        FileInputStream fileInput;
        try {
            fileInput = new FileInputStream("src/voedsel/StockMakanan.xml");

            String sxml = "";
            int isi;
            char c;
            while ((isi = fileInput.read()) != -1) {
                c = (char) isi;
                sxml +=c;
            }

            arrayy = (ArrayList<StokMakanan>) xStream.fromXML(sxml);
            fileInput.close();
            return arrayy;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return arrayy;
        }
    }
}
