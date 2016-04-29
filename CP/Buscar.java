import java.io.*;

public class Buscar{
	
	public static void main(String args[]){

    try{
    FileReader fr = new FileReader("CPdescarga.txt"); //Abrimos el archivo que contiene los CP
    BufferedReader br = new BufferedReader(fr);
    
 
    String s;
    while((s = br.readLine()) != null) {
    
      String[] registro = s.split("\\|");
      String num="01010";                                 //num variable que contiene el CP
      int comparacion=registro[0].compareTo(num);   
      if (comparacion==0){
        int j=0;
        while(j<registro.length){
        System.out.println(registro[j]);
        j++;
        }
    }
    } 
    }catch(IOException e){
			System.out.println("Error");
		}  

}
}
