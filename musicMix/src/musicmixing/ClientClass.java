package musicmixing;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
public class ClientClass {
    public static void main(String[] args) throws  RemoteException {
           try
           {
        new serverMusic().setVisible(true);
            musicInterface ob=(musicInterface) Naming.lookup("rmi://localhost:25//objects");
            ob.btnplayActionPerformed();
             ob.run();
    }catch(Exception e)
    {
     System.out.println("this is exception"+e);
    }
    }
} 
    
                                                                                                                                                                                                                                    