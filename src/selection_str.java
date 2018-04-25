import java.io.*;
public class selection_str
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pos;
		String temp;
		System.out.print("Masukkan jumlah data : ");
		int jumlah = Integer.parseInt(br.readLine());
		String[] data = new String[jumlah];
		
		for(int i=0; i<jumlah; i++)
		{
			System.out.print("Masukkan data index ke " + i + " : ");
			data[i] = br.readLine();
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
				if(data[j].compareTo(data[pos])<1)
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