# DIO Gradle course
* Build ./gradlew
* Run ./gradlew run

## Configuração de dependencias para download antes do build

````
repositories {
  jcenter()
}

dependencies {
  implementation ("com.google.guava:guava:21.0")
}
````

