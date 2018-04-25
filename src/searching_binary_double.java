import java.io.*;
public class searching_binary_double
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double temp;
		System.out.print("Masukkan jumlah data : ");
		int jumlah = Integer.parseInt(br.readLine());
		Double[] data = new Double[jumlah];
		
		for(int i=0; i<jumlah; i++)
		{
			System.out.print("Masukkan data index ke " + i + " : ");
			data[i] = Double.parseDouble(br.readLine());
		}
		
		System.out.println("Data sebelum disorting bubble : ");
		for(int i=0; i<jumlah; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println("");
		
		//proses sorting bubble
		for(int i=0; i<data.length; i++)
		{
			for(int j=data.length-1; j>i; j--)
			{
				if(data[j]<data[j-1])
				{
					temp = data[j-1];
					data[j-1] = data[j];
					data[j] = temp;
				}
			}
		}
		
		System.out.println("Data sesudah disorting bubble : ");
		for(int i=0; i<jumlah; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println("");
		
		System.out.print("Masukkan data yang dicari : ");
		Double cari = Double.parseDouble(br.readLine());
		
		int l = 0;
		int r = data.length-1;
		int mid = 0;
		boolean ketemu = false;
		
		for(int i=0; i<data.length; i++)
		{
			mid = (l+r)/2;
			if(data[i].equals(cari))
			{
				ketemu = true;
			}
			else if(cari>mid)
			{
				l = mid+1;
			}
			else if(cari<mid)
			{
				r = mid-1;
			}
		}
		
		if(ketemu == true)
		{
			System.out.println("Data " + cari + " ditemukan index ke " + mid);
		}
		else
		{
			System.out.println("Data " + cari + " tidak ditemukan");
		}
	}
}