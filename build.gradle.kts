import org.gradle.kotlin.dsl.repositories as repositories

plugins {
    id("application")
}
application {
    mainClass = System.getProperty("mainClass")
}

group = "org.sstokes.demo"
version = "1.0-SNAPSHOT"


val gridgain_version = "8.9.15"


repositories {
    mavenCentral()
    maven { url = uri("https://www.gridgainsystems.com/nexus/content/repositories/external") }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.gridgain:gridgain-core:$gridgain_version")
    implementation("org.gridgain:ignite-spring:$gridgain_version")
    implementation("org.gridgain:ignite-indexing:$gridgain_version")

//    testImplementation('org.apache.ignite:ignite-core:${igniteVersion}')

}

tasks.test {
    useJUnitPlatform()
}