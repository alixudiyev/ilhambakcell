pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ilhambakcell"

// App modülünü dahil et ve klasör yoksa bulutta otomatik oluştur
include(":app")
project(":app").projectDir.mkdirs()
