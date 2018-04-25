import java.io.*;
public class exchange_double
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
		
		System.out.println("Data sebelum disorting exchange : ");
		for(int i=0; i<jumlah; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println("");
		
		//proses sorting exchange
		for(int i=0; i<data.length-1; i++)
		{
			for(int j=i+1; j<data.length; j++)
			{
				if(data[i]>data[j])
				{
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		System.out.println("Data sesudah disorting exchange : ");
		for(int i=0; i<jumlah; i++)
		{
			System.out.print(data[i] + " ");
		}
	}
}