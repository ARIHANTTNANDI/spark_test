package part2df
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.scalatest.funsuite.AnyFunSuite
import part2df.df_basics.readJson

class test extends AnyFunSuite {
  val spark: SparkSession = SparkSession.builder().appName("Dataframe Basics").config("spark.master","local").getOrCreate()
//  def readJson(path: String): DataFrame = {
//    spark.read.json(path)
//  }

  test("a"){
    val df:DataFrame = readJson("/Users/a0n08gw/IdeaProjects/practice/spark-essentials/src/test/test.json",spark)
    assert(1==1)
  }
}
