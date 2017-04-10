;; (ns hello-world.core)
;; (ns hello-world.core
;;	 (:require [clojure.browser.repl :as repl]))
(ns hello-world.core
	(:require [cljs.nodejs :as nodejs]))

;; (defonce conn
;; 	(repl/connect "http://localhost:9000/repl"))

(nodejs/enable-util-print!)

(defn -main [& args]
	(println "Hello, bitch!"))

(set! *main-cli-fn* -main)

(defn foo [a b]
	(* a b))
