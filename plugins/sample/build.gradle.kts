import com.voxfinite.logvue.Dependencies
plugins {
    kotlin("jvm")
    kotlin("kapt")
}

dependencies {
    // These are compileOnly because these dependencies are served to plugin by the main app
    // If there are any additional dependencies which you would want to consume, add that in gradle.properties of
    // plugin module
    compileOnly(Dependencies.LogVueApi)
    compileOnly(kotlin("stdlib"))

    compileOnly(Dependencies.Pf4j)
    kapt(Dependencies.Pf4j)
//    implementation("org.apache.commons:commons-lang3:3.5") // this is an example for an external library included
}
