import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.4.2"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
}

group = "com.svshayt"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
//	implementation("de.flapdoodle.embed:de.flapdoodle.embed.mongo:4.6.3")
//	runtimeOnly("io.netty:netty-resolver-dns-native-macos:4.1.92.Final:osx-aarch_64")
//	implementation("io.netty:netty-all:4.1.92.Final")
	implementation("io.netty:netty-transport-native-epoll:4.1.92.Final")
	implementation("io.netty:netty-transport-native-kqueue:4.1.92.Final")
//	implementation("io.netty:netty-resolver-dns-native-macos:4.1.86.Final")
//	implementation("io.netty:netty-all:4.1.65.Final")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.projectreactor:reactor-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
