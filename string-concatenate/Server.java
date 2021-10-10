import java.net.*;
import java.rmi.*;

public class Server {
  public static void main(String args[]) {
    try {
      ConcatRemImpl locObj = new ConcatRemImpl();
      Naming.rebind("rmi://localhost:5000/ConcatRem", locObj);
    } catch (RemoteException re) {
      re.printStackTrace();
    } catch (MalformedURLException mfe) {
      mfe.printStackTrace();
    }
  }
}