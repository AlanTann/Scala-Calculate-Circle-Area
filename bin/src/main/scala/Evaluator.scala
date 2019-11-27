
//Remote services
import java.rmi.Remote
import java.rmi.RemoteException
import scala.remote
class MyStudent (val name: String) extends Serializable {
  def printme: String = s" My name is $name"
}

@remote 
trait Evaluator extends Remote {
  def getStudent(name: String) : MyStudent
}
