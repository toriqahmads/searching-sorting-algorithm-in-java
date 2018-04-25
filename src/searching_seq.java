import java.io.*;
public class searching_seq
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temp, cari;
		boolean ketemu = false;
		
		System.out.print("Masukkan jumlah data : ");
		int jumlah = Integer.parseInt(br.readLine());
		
		int[] data = new int[jumlah];
		
		for(int i=0; i<jumlah; i++)
		{
			System.out.print("Masukkan data index ke " + i + " : ");
			data[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.print("Masukkan data yang dicari : ");
		cari = Integer.parseInt(br.readLine());
		
		for(int i=0; i<jumlah; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println("");
		
		//proses searching sequencial
		int i = 0;
		while(i<data.length && ketemu == false)
		{
			if(data[i] == cari)
			{
				ketemu = true;
				System.out.println("Data " + cari + " ditemukan pada index ke " + i);
			}
			i++;
		}
		
		if(ketemu==false)
		{
			System.out.println("Data " + cari + " tidak ditemukan");
		}
	}
}