# Building Kafka for Klarrio
* set the correct version in `gradle.properties`
* create/update `${GRADLE_USER_HOME}/gradle.properties` (typically, `~/.gradle/gradle.properties`)
 and assign the following variables:
  ```
   mavenUrl=https://klarrio.jfrog.io/klarrio/jvm-libs-local
   mavenUsername=<your jfrog username>
   mavenPassword=<your jfrog password, typically stored in ~/.ivy2/.klarrio-credentials>
   signing.keyId=
   signing.password=
   signing.secretKeyRingFile=
  ```          
* follow the [README](README.md) to set up gradle
* run the command `./gradlew uploadArchivesAll` to build and publish the Kafka libraries.
* For building the Kafka broker image, see [dsh-msg-kafka-broker](https://github.com/Klarrio/dsh-msg-kafka-broker)