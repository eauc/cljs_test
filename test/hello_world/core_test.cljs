(ns hello-world.core-test
  (:require [hello-world.core :as hello]))

(defn ^:export run []
  (assert (= (hello/foo 2 2) 4))
  (assert (= (hello/foo 2 3) 55))
  (assert (= (hello/foo 4 5) 9))
  0)
