

/**
 * @author User
 */
object EvaluatorImpl extends Evaluator {
  def getStudent(name: String): MyStudent = {
    return new MyStudent(name)
  }
}