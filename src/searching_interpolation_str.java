import java.io.*;
public class searching_interpolation_str
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		System.out.print("Masukkan jumlah data : ");
		int jumlah = Integer.parseInt(br.readLine());
		String[] data = new String[jumlah];
		
		for(int i=0; i<jumlah; i++)
		{
			System.out.print("Masukkan data index ke " + i + " : ");
			data[i] = br.readLine();
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
				if(data[j].compareTo(data[j-1])<1)
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
		
		int low, high, flag, pos1, pos, n;
       	System.out.print("Masukan Data Yang Dicari : ");
		String cari = br.readLine();

		flag = 0;
		n = data.length;
		low = 0;
		high = n - 1;
	
		do
		{		
			pos1 = Math.abs((Integer.parseInt(cari)-Integer.parseInt(data[low])) / (Integer.parseInt(data[high]) - Integer.parseInt(data[low])) * (high - low) + low);
			pos = pos1;
			
			if (data[pos].equals(cari))
			{
				flag = 1;
				break;
			}
			
			if (data[pos].compareTo(cari)>1) 
				high = pos - 1;
			else if (data[pos].compareTo(cari)<1) 
				low = pos + 1;
		}
		while (cari.compareTo(data[low])>=1 && cari.compareTo(data[high])<=1);
		
		if (flag == 0) 
			System.out.println("Data " + cari + " tidak ditemukan");
		else
			System.out.println("Data " + cari + " ditemukan pada index ke " + pos);
	}
}