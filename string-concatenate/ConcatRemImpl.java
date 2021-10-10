import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class ConcatRemImpl extends UnicastRemoteObject implements ConcatRem {
  public ConcatRemImpl() throws RemoteException {}

  public String concatStrings(String a, String b) {
    System.out.println(">>> concatStrings("+ a + "," + b +") invoked");
    return a + b;
  }
}