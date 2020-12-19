
public class InvalidAgeException extends ArithmeticException{//bu alan UncheckException 

    public InvalidAgeException(String message){
        super(message);
    }
    @Override
    public void printStackTrace() {
        System.out.println("Bu Bir İnvalid age hatasıdır...");
        //super.printStackTrace(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
