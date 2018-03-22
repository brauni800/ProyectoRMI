package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfazServidor extends Remote {
	public void login(String user) throws RemoteException;
	public void preguntar(int id) throws RemoteException;
	public void responder(int respuesta) throws RemoteException;
}
