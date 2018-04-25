import java.io.*;
public class insertion
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temp, j;
		System.out.print("Masukkan jumlah data : ");
		int jumlah = Integer.parseInt(br.readLine());
		int[] data = new int[jumlah];
		
		for(int i=0; i<jumlah; i++)
		{
			System.out.print("Masukkan data index ke " + i + " : ");
			data[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Data sebelum disorting insertion : ");
		for(int i=0; i<jumlah; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println("");
		
		//proses sorting insertion
		for(int i=1; i<data.length; i++)
		{
			temp = data[i];
			j = i-1;
			while(j>=0 && data[j]>temp)
			{
				data[j+1] = data[j];
				j--; 
			}
			data[j+1] = temp;
		}
		
		System.out.println("Data sesudah disorting insertion : ");
		for(int i=0; i<jumlah; i++)
		{
			System.out.print(data[i] + " ");
		}
	}
}