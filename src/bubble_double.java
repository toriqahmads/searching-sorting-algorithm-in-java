import java.io.*;
public class bubble_double
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
		
		System.out.println("Data sebelum disoring bubble : ");
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
		
		System.out.println("Data sesudah disoring bubble : ");
		for(int i=0; i<jumlah; i++)
		{
			System.out.print(data[i] + " ");
		}
	}
}