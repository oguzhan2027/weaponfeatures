package weaponFeatures;
import java.io.*;
import java.util.*;

public class weaponFeatures {
	public static void main(String[] args) {
		
		String str = "";
		String data = "";
		ArrayList<String> data1 = new ArrayList<String>();
		try{
			FileInputStream fStream = new FileInputStream("weapon features.txt");
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));
			
			
			while((str = bReader.readLine()) != null){
				
				data1.add(str);
				
			}
			dStream.close();
			
		}catch(Exception e)
		{
			System.err.println("Error : " + e.getMessage());
		}
		
		for(int i = 0; i < data1.size() ; i++){
			System.out.println(data1.get(i));
			
		}
		
		
	}
	public static int numberOfLines(){
		int counter = 0;
		try{
			FileInputStream fStream = new FileInputStream("test.txt");
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));
			
			
			while(bReader.readLine() != null){
				counter++;
			}
			dStream.close();
			
		}catch(Exception e)
		{
			System.err.println("Error : " + e.getMessage());
		}
		
		return counter;

		
	}

}
