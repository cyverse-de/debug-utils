FROM clojure
COPY . /usr/src/debug-utils
COPY ./docker/profiles.clj /root/.lein/profiles.clj
WORKDIR /usr/src/debug-utils
RUN lein deps
CMD ["lein", "test"]
