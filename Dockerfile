FROM clojure
COPY . /usr/src/debug-utils
WORKDIR /usr/src/debug-utils
RUN lein deps
CMD ["lein", "test"]
