 import java.rmi.registry.LocateRegistry
import java.rmi.server.UnicastRemoteObject
import java.rmi.Remote
import scala.remote
import java.rmi.RemoteException


@remote 
  trait RectangleCircleService extends Remote {
    def calculateCircleArea(radius: Double): Double
    def calculateRectangleArea(widht: Double,
        height: Double): Double  
  }
  object RecCirImpl extends RectangleCircleService {
    def calculateCircleArea(radius: Double): Double = {
      return 3.142 * radius * radius
    }
    def calculateRectangleArea(widht: Double,
        height: Double): Double  = {
     widht * height
    }
  }