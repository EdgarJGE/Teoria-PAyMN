import java.io*
String buscar;

  Cadena cp = 0;
  int dirección;
  Static in contador = 0;

  public cp(String cp[5], int dirección){
  	this.cp = cp;
  	this.dirección = dirección;
  	
  }
  
  public class Buscar{
  
  public static void main(String args[]){

    try{
    FileReader fr = new FileReader("CPdescarga.txt"); //Abrimos el archivo
    BufferedReader br = new BufferedReader(fr);
    
 
    String s;
    while((s = br.readLine()) != null) {
    
      String[] registro = s.split("\\|");
      String num="01010";                             //num variable que contiene el CP
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


  public String toString(){
  	return "Tu CP es:" + cp + "y tu dirección es:" + dirección;
  }
