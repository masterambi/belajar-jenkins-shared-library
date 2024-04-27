def exec(String command) {
    sh("./mvnw ${command}")
}