import org.gradle.kotlin.dsl.implementation
import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
	java
	id("org.springframework.boot") version "3.5.4"
	id("com.diffplug.spotless") version "7.2.1"
}

group = "co.uk.avijit.countries"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(24)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(platform(SpringBootPlugin.BOM_COORDINATES))
	implementation("org.springframework.boot:spring-boot-starter-web")
	developmentOnly("org.springframework.boot:spring-boot-devtools:3.5.4")
	implementation("org.apache.httpcomponents.client5:httpclient5:5.5")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

spotless {
	java {
		googleJavaFormat()
	}
}
