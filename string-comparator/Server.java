import java.net.*;
import java.rmi.*;

public class Server {
  public static void main(String args[]) {
    try {
      CompareRemImpl locObj = new CompareRemImpl();
      Naming.rebind("rmi://localhost:5000/CompareRem", locObj);
    } catch (RemoteException re) {
      re.printStackTrace();
    } catch (MalformedURLException mfe) {
      mfe.printStackTrace();
    }
  }
}