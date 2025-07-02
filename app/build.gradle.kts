plugins {
    id("application")
    id("checkstyle")
    id("com.github.ben-manes.versions") version "0.52.0"
    id("org.sonarqube") version "6.2.0.5505"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("hexlet.code.App")
}

sonar {
    properties {
        property("sonar.projectKey", "gambit328_java-project-61")
        property("sonar.organization", "gambit328")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

tasks.test {
    useJUnitPlatform()
}
