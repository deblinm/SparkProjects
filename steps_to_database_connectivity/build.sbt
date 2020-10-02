name := "steps_to_database_connectivity"

version := "0.1"

scalaVersion := "2.11.12"



// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-avro
libraryDependencies += "org.apache.spark" %% "spark-avro" % "2.4.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-yarn
libraryDependencies += "org.apache.spark" %% "spark-yarn" % "2.4.0"


// https://mvnrepository.com/artifact/org.postgresql/postgresql
libraryDependencies += "org.postgresql" % "postgresql" % "9.4.1212"
