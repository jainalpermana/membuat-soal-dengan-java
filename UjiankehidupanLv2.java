import java.util.*;
import java.io.*;

class UjiankehidupanLv2{
	public static void main(String[] args) {

		String isi, jawab;
		int pilih;

		Scanner pilihan = new Scanner(System.in);

		System.out.println("MENU : ");
		System.out.println("1. Membuat Soal ");
		System.out.println("2. Mengerjakan Soal ");
		System.out.println("3. Hasil");
		pilih = pilihan.nextInt();

		/*-----------------------------------------*/

		switch (pilih) {
			case 1 :
				try{
					//cari file
					File filesoal = new File("soal.txt");
					File filekunci = new File("kunci.txt");

					//tulis file
					FileWriter simpansoal = new FileWriter(filesoal);
					FileWriter simpankunci = new FileWriter(filekunci);
					//input ketik
					Scanner tulis = new Scanner(System.in);
					
					// nilai untuk perulangan
					int no = 0;
					String soal, kuncitxt;
					
					while(no < 5){
						
						System.out.println("MASUKAN SOAL : ");
						soal = tulis.nextLine();
						simpansoal.write(soal + "\n");

						System.out.println("MASUKAN JAWABAN : ");
						kuncitxt = tulis.nextLine();
						simpankunci.write(kuncitxt + "\n");

						no++;
					}

					simpansoal.close();
					simpankunci.close();


				}catch(Exception ex){
					ex.printStackTrace();
				}

			break;

			/*-----------------------------------------*/

			case 2 :

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
						
			break;

			/*-----------------------------------------*/

			default :
				
				try{

					//cari file
					File filejawab = new File("jawaban.txt");
					File filecekkunci = new File("kunci.txt");

					//input file
					Scanner jawaban = new Scanner(filejawab);
					Scanner kuncijawaban = new Scanner(filecekkunci);

					int nomor = 0;
					//buat baca
					while(nomor < 5){
						int hasilkunci = kuncijawaban.nextInt();
						int hasiljawaban = jawaban.nextInt();
						if (hasilkunci == hasiljawaban) {
							System.out.println("BENAR");
						}else{
							System.out.println("SALAH");
						}

						nomor ++;
					}

					jawaban.close();
					kuncijawaban.close();
				
				}catch(Exception ex){
					ex.printStackTrace();
				}

			break;
			/*-----------------------------------------*/
		}
	}
}