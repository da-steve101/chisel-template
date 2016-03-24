import Chisel._
import chiseltemplate._

object top {
  def main(args: Array[String]): Unit = {
    val chiselArgs = args.drop(1)
    chiselMain(chiselArgs, () => Module( new MyTopLevelModule ) )
  }
}
