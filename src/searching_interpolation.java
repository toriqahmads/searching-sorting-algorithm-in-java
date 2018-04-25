import java.io.*;
public class searching_interpolation
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temp;
		System.out.print("Masukkan jumlah data : ");
		int jumlah = Integer.parseInt(br.readLine());
		int[] data = new int[jumlah];
		
		for(int i=0; i<jumlah; i++)
		{
			System.out.print("Masukkan data index ke " + i + " : ");
			data[i] = Integer.parseInt(br.readLine());
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
		
		int low, high, flag, cari, pos1, pos, n;
       	System.out.print("Masukan Data Yang Dicari : ");
		cari = Integer.parseInt(br.readLine());

		flag = 0;
		n = data.length;
		low = 0;
		high = n - 1;
	
		do
		{		
			pos1 = Math.abs((cari-data[low]) / (data[high] - data[low]) * (high - low) + low);
			pos = pos1;
			
			if (data[pos] == cari)
			{
				flag = 1;
				break;
			}
			
			if (data[pos] > cari) 
				high = pos - 1;
			else
				if (data[pos] < cari) 
					low = pos + 1;
		}
		while (cari >= data[low] && cari <= data[high]);
		
		if (flag == 0) 
			System.out.println("Data " + cari + " tidak ditemukan");
		else
			System.out.println("Data " + cari + " ditemukan pada index ke " + pos);
	}
}