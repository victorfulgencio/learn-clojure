(ns mini.record)
(require 'clojure.string)


(defrecord Animal [name species])

(def some-animal (->Animal "Owl" "Bird"))

(-> some-animal
    :name
    clojure.string/upper-case)