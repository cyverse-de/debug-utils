FROM clojure
COPY ./docker/profiles.clj /root/.lein/profiles.clj
WORKDIR /usr/src/debug-utils

COPY project.clj /usr/src/debug-utils/
RUN lein deps

COPY . /usr/src/debug-utils
CMD ["lein", "test"]
