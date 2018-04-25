import java.io.*;
public class selection
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temp, pos;
		System.out.print("Masukkan jumlah data : ");
		int jumlah = Integer.parseInt(br.readLine());
		int[] data = new int[jumlah];
		
		for(int i=0; i<jumlah; i++)
		{
			System.out.print("Masukkan data index ke " + i + " : ");
			data[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Data sebelum disorting selection : ");
		for(int i=0; i<jumlah; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println("");
		
		//proses sorting selection
		for(int i=0; i<data.length; i++)
		{
			pos=i;
			for(int j=i+1; j<data.length; j++)
			{
				if(data[j]<data[pos])
				{
					pos = j;
				}
			}
			
			if(pos != i)
			{
				temp = data[pos];
				data[pos] = data[i];
				data[i] = temp;
			}
		}		
		
		System.out.println("Data sesudah disorting selection : ");
		for(int i=0; i<jumlah; i++)
		{
			System.out.print(data[i] + " ");
		}
	}
}