#FROM oracle/graalvm-ce:19.3.0-java8 as graalvm
FROM oracle/graalvm-ce:19.3.1-java11 as graalvm
COPY . /home/app/simple-log-client
WORKDIR /home/app/simple-log-client
RUN gu install native-image
RUN native-image --no-server --static -cp build/libs/simple-log-client-*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/simple-log-client/simple-log-client /app/simple-log-client
ENTRYPOINT ["/app/simple-log-client", "-Djava.library.path=/app"]
