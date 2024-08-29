package part2df

//import org.apache.hadoop.shaded.org.eclipse.jetty.websocket.common.frames.DataFrame
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame

object df_basics extends App {
  val spark= SparkSession.builder().appName("Dataframe Basics").config("spark.master","local").getOrCreate()

  val df = spark.read.format("json").option("inferSchema","true").load("src/main/resources/data/cars.json")
  df.show()
  df.printSchema()
  val driver ="org.postgresql.Driver"
  val url = "jdbc:postgresql://localhost:5432/rtjvm"
  val user= "docker"
  val pass= "docker"

  def readJson(path: String,spark:SparkSession): DataFrame = {
    spark.read.json(path)
  }

  //assert(readJson(jsonData) )

  val df1= readJson("src/main/resources/data/cars.json",spark)

  //df1.write.format("csv").option("header","true").option("sep","\t").save("src/main/resources/data/cars.csv")

  //df1.write.save("src/main/resources/data/cars.parquet")
  df1.write.format("jdbc").option("driver",driver).option("url",url).option("user",user).option("password",pass).option("dbtable","public.movies").save()
println("")


}
