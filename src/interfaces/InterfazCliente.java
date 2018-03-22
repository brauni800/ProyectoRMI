package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfazCliente extends Remote {
	public void cambiarVentana(String nombreVentana) throws RemoteException;
	public void colocarImagen(int id) throws RemoteException;
	public void mostrarMensaje(String tipo) throws RemoteException;
}
