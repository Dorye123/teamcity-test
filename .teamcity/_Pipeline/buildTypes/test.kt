object buildtype_test_object : buildType ({
    name = "test"
    steps {
        script {
            name = "test step"
            scriptContent = "echo 'something something'"
        }
    }
})