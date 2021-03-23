FROM openjdk:11

WORKDIR .

COPY . .

CMD java -jar target/scala-2.13/ScalaHomework.jar