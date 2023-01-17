import java.security.SecureRandom;
import java.util.Random;

public class Password {


    private int longitud;
    private char[] contraseña;

    public Password(){
        longitud = 8;
        contraseña = null;
    }

    public Password(int longitud){
        this.longitud = longitud;
        contraseña = generarPassword(longitud);
    }

    public Password(Password p){
        this.longitud = p.longitud;
        this.contraseña = p.contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña.toString();
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public char[] generarPassword(int len)
    {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        char[] contraseña=new char[len];

        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            contraseña[i]=chars.charAt(randomIndex);
        }

        return contraseña;
    }

    public boolean esFuerte(char[] contraseña){
        int mayus=0, minus=0, num=0, i=0;
        boolean fuerte=false;

        while(i!=longitud){
            if(contraseña[i]<'Z' || contraseña[i]>'A'){
                mayus++;
            } else if(contraseña[i]<'9' || contraseña[i]>'0'){
                num++;
            }else if(contraseña[i]>'a' || contraseña[i]<'z'){
                minus++;
            }
          i++;
        }
        if(mayus>2 && minus>1 && num>5){
            fuerte=true;
        }
        return fuerte;
    }
    public int compareTo(Password p1)
    {
        return this.getContraseña().compareTo(p1.getContraseña());
    }

}
