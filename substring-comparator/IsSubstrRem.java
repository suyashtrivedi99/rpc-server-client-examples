import java.rmi.*;

public interface IsSubstrRem extends Remote {
    public boolean isSubstr(String a, String b) throws RemoteException;
}
