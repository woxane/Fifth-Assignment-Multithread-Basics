plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/junit/junit
// https://mvnrepository.com/artifact/junit/junit
    testImplementation("junit:junit:4.13.2")
    // https://mvnrepository.com/artifact/org.ejml/ejml-core
    // https://mvnrepository.com/artifact/org.ejml/ejml-core
    implementation("org.ejml:ejml-simple:0.41") // Replace with the desired version

}

tasks.test {
    useJUnitPlatform()
}