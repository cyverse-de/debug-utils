(defproject org.cyverse/debug-utils "2.8.1-SNAPSHOT"
  :description "Common Debugging Utilities for Clojure Projects"
  :url "https://github.com/cyverse-de/debug-utils"
  :license {:name "BSD"
            :url "http://iplantcollaborative.org/sites/default/files/iPLANT-LICENSE.txt"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.3.1"]])
