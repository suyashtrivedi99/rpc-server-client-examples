import java.net.*;
import java.rmi.*;

public class Server {
  public static void main(String args[]) {
    try {
      IsSubstrRemImpl locObj = new IsSubstrRemImpl();
      Naming.rebind("rmi://localhost:5000/IsSubstrRem", locObj);
    } catch (RemoteException re) {
      re.printStackTrace();
    } catch (MalformedURLException mfe) {
      mfe.printStackTrace();
    }
  }
}