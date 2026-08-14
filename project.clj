(defproject org.cyverse/debug-utils "2.9.1-SNAPSHOT"
  :description "Common Debugging Utilities for Clojure Projects"
  :url "https://github.com/cyverse-de/debug-utils"
  :license {:name "BSD"
            :url "https://cyverse.org/license"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :plugins [[jonase/eastwood "1.4.3"]
            [lein-ancient "1.0.0"]
            [test2junit "1.4.4"]]
  ;; Fail the build on a new dependency conflict rather than printing a
  ;; warning nobody reads.
  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.12.5"]
                 [org.clojure/tools.logging "1.3.1"]])
