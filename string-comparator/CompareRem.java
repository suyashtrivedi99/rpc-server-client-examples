import java. rmi.*;

public interface CompareRem extends Remote {
    public boolean compareStrings(String a, String b) throws RemoteException;
}
