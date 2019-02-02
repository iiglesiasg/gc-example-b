./gradlew assemble
docker build . -t gc-example-b
docker run --network host gc-example-b
