plugins {
    id 'java'
}

group = 'com.example'
version = '1.0.0'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter'
    testImplementation 'junit:junit:4.13.2'
}

wrapper {
    gradleVersion = '7.5'
}
