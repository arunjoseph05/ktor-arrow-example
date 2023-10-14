rootProject.name = "ktor-arrow-sample"

//pluginManagement {
//  repositories {
//    gradlePluginPortal()
//    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
//  }
//
//  plugins {
//    kotlin("jvm").version(extra["kotlin.version"] as String)
//    id("org.jetbrains.compose").version(extra["compose.version"] as String)
//  }
//}

plugins {
  id("com.gradle.enterprise") version "3.15.1"
//  kotlin("jvm").version("1.8.20")
//  id("org.jetbrains.compose").version("1.4.1")
}

dependencyResolutionManagement {
  versionCatalogs {
    create("libs") {
      from(files("libs.versions.toml"))
    }
  }

  repositories {
    mavenCentral()
    gradlePluginPortal()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
  }
}

gradleEnterprise {
  buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
  }
}
include("frontend")
