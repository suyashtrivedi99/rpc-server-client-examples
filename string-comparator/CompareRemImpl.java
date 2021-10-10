import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class CompareRemImpl extends UnicastRemoteObject implements CompareRem {
  public CompareRemImpl() throws RemoteException {}

  public boolean compareStrings(String a, String b) {
    System.out.println(">>> compareStrings("+ a + "," + b +") invoked");
    return a.equals(b);
  }
}