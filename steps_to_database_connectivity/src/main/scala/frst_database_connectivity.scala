import org.apache.spark.sql.SparkSession

import scala.reflect.macros.whitebox

object frst_database_connectivity {

   def main(args: Array[String]): Unit = {

  val spark = SparkSession.builder()
    .appName("frst_database_connectivity")
    .master("local")
    .getOrCreate()

  spark.sparkContext.setLogLevel("ERROR")

      // Loading data from a JDBC source
     val jdbcDF = spark.read
       .format("jdbc")
       .option("url", "jdbc:postgresql://192.168.0.112:5432/STAGING_DB")
       .option("dbtable", "\"test\"")
       .option("user", "STAGING_DB")
       .option("password", "staging_db")
       .load()

      jdbcDF.show()

 //write the same data read from the source to another postgres table

     jdbcDF.write
       .mode("append")
       .format("jdbc")
       .option("url", "jdbc:postgresql://192.168.0.112:5432/STAGING_DB")
       .option("dbtable", "\"test1\"")
       .option("user", "STAGING_DB")
       .option("password", "staging_db")
       .save()




   }

}
