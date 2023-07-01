pluginManagement {
	repositories {
		maven { url = uri("https://repo.spring.io/milestone") }
		maven { url = uri("https://repo.spring.io/snapshot") }
		maven { url = uri("https://plugins.gradle.org/m2/") }
		gradlePluginPortal()
	}
}
rootProject.name = "closetcleanup"
