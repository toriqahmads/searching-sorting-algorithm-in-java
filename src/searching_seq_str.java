import java.io.*;
public class searching_seq_str
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temp;
		String cari;
		boolean ketemu = false;
		
		System.out.print("Masukkan jumlah data : ");
		int jumlah = Integer.parseInt(br.readLine());
		
		String[] data = new String[jumlah];
		
		for(int i=0; i<jumlah; i++)
		{
			System.out.print("Masukkan data index ke " + i + " : ");
			data[i] = br.readLine();
		}
		
		System.out.print("Masukkan data yang dicari : ");
		cari = br.readLine();
		
		for(int i=0; i<jumlah; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println("");
		
		//proses searching sequencial
		int i = 0;
		while(i<data.length && ketemu == false)
		{
			if(data[i].equals(cari))
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