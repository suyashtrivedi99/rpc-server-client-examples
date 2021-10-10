import java.rmi.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
  public static void main(String args[]) {
    String host = "localhost";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First String:");
    String a = sc.nextLine();
    System.out.println("Enter Second String:");
    String b = sc.nextLine();
    try {
      CompareRem remObj = (CompareRem) Naming.lookup("rmi://localhost:5000/CompareRem");
      System.out.println(remObj.compareStrings(a, b) ? ">>> Equal" : ">>> Not Equal");
    } catch (RemoteException re) {
      re.printStackTrace();
    } catch (NotBoundException nbe) {
      nbe.printStackTrace();
    } catch (MalformedURLException mfe) {
      mfe.printStackTrace();
    }
  }
}