import java. rmi.*;

public interface ConcatRem extends Remote {
    public String concatStrings(String a, String b) throws RemoteException;
}
