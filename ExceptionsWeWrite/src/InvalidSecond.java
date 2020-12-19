
import java.io.IOException;


public class InvalidSecond extends IOException{//BU ALAN CHECKEXCEPTİON

    public InvalidSecond(String message){
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Bu alan bir invalid 2 hatasıdır.");
    }
 
    
}
