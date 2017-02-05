import java.util.*;
import java.io.*;

class Ujiankehidupan{
	public static void main(String[] args) {

		String isi, jawab;

		try{

			//cari file	
			File file = new File("soal.txt");
			File file2 = new File("jawaban.txt");

			//input file
			Scanner fileinput = new Scanner(file);
			//tulis file
			FileWriter simpan = new FileWriter(file2);
			//input ketik
			Scanner ketik = new Scanner(System.in);

			//buat baca
			while(fileinput.hasNextLine()){
				isi = fileinput.nextLine();
				System.out.println(isi);
				jawab = ketik.nextLine();
				simpan.write(jawab + "\n");
			}

			fileinput.close();
			simpan.close();

		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
}