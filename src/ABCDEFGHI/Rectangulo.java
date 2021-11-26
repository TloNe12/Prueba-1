package ABCDEFGHI;

public class Rectangulo {

    //atributos
    private int largo;
    private int ancho;

    //constructores
    public Rectangulo() {
    }

    public Rectangulo(int x) {
        largo = x;
    }
//this. es para aclarar que elementos son miembros de la clase
    public Rectangulo(int largo, int y) {
        largo = largo;
        ancho = y;
    }

    //mutadores
       public void setLargo(int l){
           largo = l;
       }
    
       public void setAncho(int a){
           ancho = a;
       }
    
       public int getLatgo(){
           return largo;
       }
       
       public int getAncho(){
           return ancho;
       }
       
    //Metodos de Administracion
       //es la representacion en cadena del nuevo tipo
       public String toString(){ 
           return "Largo: " +largo+ " Ancho: " +ancho;
       }
       
}
