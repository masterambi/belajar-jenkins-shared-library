def call() {
    pipeline {
        agent any
        stages{
            stage("Maven Clean") {
                steps {
                    script {
                        maven(["clean"])
                    }
                    
                }
            }
            stage("Maven compile") {
                steps {
                    script {
                        maven(["compile"])
                    }
                    
                }
            }
            stage("Maven Test") {
                steps {
                    script {
                        maven(["test"])
                    }
                    
                }
            }
        }
    }
}