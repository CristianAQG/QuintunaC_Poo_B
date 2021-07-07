    
package ec.edu.intsuperior.modelo;

/**
 *
 * @author User
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(){
        
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x=x;
                
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
     public double distanciaEntreDosPuntos(int x1, int x2,int y1, int y2){
       double d;
      d=Math.sqrt((Math.pow(((double)(y2)-(double)(y2)),2)))+ (Math.pow(((double)(x2)-(double)(x1)),2));
        return d;
     }
}
   

