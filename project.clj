(defproject cljs-test "0.1.0"
  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.495"]]
  :plugins [[lein-cljsbuild "1.1.5"]]
  :cljsbuild {:builds {:dev {:source-paths ["src"]
                             :compiler {:output-to "out/main.js"
                                        :optimizations :whitespace
                                        :pretty-print true}}
                       :test {:source-paths ["src" "test"]
                             :compiler {:output-to "out/unit_test.js"
                                        :optimizations :whitespace
                                        :pretty-print true}}}})
