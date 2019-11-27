import java.rmi.registry.LocateRegistry
object Client extends App {
 val port = 1099
  val name = "teckmin"
  val address = "172.18.208.47"

  // Setup the security manager so we can get the Student object shipped to us over RMI
  if (System.getSecurityManager == null) {
    System.setSecurityManager(new SecurityManager);
  }
  //connect to registry server 
  val registry = LocateRegistry.getRegistry(port)
  //lookup for the services
  val evaluator = registry.lookup(s"//$address:$port/$name").asInstanceOf[RectangleCircleService]
  //call the remote methods
  val student = evaluator.calculateCircleArea(50)
  //call the instance method of the object
  println(student)
}
