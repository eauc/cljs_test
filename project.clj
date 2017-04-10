(defproject cljs-test "0.1.0"
  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.495"]]
  :plugins [[lein-cljsbuild "1.1.5"]
            [lein-figwheel "0.5.9"]]
  :cljsbuild {:builds {:dev {:source-paths ["src"]
                             :figwheel true
                             :compiler {:main "hello-world.core"
                                        :output-to "out/main.js"
                                        :output-dir "out"
                                        :optimizations :none
                                        :pretty-print true}}
                       :test {:source-paths ["src" "test"]
                              :figwheel true
                              :compiler {:main "hello-world.core-test"
                                         :output-to "out/unit_test.js"
                                         :optimizations :none
                                         :pretty-print true}}}})
