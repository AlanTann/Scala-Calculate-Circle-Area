import java.rmi.registry.LocateRegistry
import java.rmi.server.UnicastRemoteObject
import java.rmi.Remote
import java.rmi.RemoteException
 object Server extends App  {
  val port = 1099
  val name = "112342343" //student id
  val address = "172.18.208.47"

  // Setup the security manager since we're going to export the Student over RMI
  if (System.getSecurityManager == null) {
    System.setSecurityManager(new SecurityManager)
  }
//setup LocateRegistry
  val registry = LocateRegistry.getRegistry("172.18.208.47", 1099)
//export object receive call using particular random port
  val stub = UnicastRemoteObject.exportObject(EvaluatorImpl, 0)
//setup the url for the Exported object
  val url = s"//$address:$port/$name"
  //binding the object to registry
  registry.rebind(url, stub)
}
