FROM hseeberger/scala-sbt:8u222_1.3.5_2.13.1

COPY . .

CMD ["scala", "-cp" , "./target/scala-2.13/ScalaHomework.jar", "src/main/scala/Main.scala"]