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
rootProject.name = "MovieGenie"
include(":app")
include(":data:network")
include(":domain:user")
include(":data:user")
include(":feature:signIn")
include(":feature:signUp")

