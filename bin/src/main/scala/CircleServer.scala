import java.rmi.registry.LocateRegistry
import java.rmi.server.UnicastRemoteObject
import java.rmi.Remote
import scala.remote
import java.rmi.RemoteException
/**
 * @author User
 */
object CircleServer extends App {
  val registry = LocateRegistry.createRegistry(1099)


  val stub = UnicastRemoteObject.exportObject(RecCirImpl, 0)
  registry.rebind(
      "//172.18.208.47:1099/teckmin", stub)
  

}