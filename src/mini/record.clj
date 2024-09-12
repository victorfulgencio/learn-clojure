(ns mini.record
  (:require [clojure.string :as str]))


(defrecord Animal [name species])

(def some-animal (->Animal "Owl" "Bird"))

(type some-animal)

(-> some-animal
    :name
    str/upper-case)