import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class IsSubstrRemImpl extends UnicastRemoteObject implements IsSubstrRem {
  public IsSubstrRemImpl() throws RemoteException {}

  public boolean isSubstr(String a, String b) {
    System.out.println(">>> isSubstr("+ a + "," + b +") invoked");
    return a.contains(b);
  }
}