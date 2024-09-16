(ns mini.record
  (:require [clojure.string :as str]))


(defprotocol Something (something [input]))

(defrecord Animal [name type]
  Something
  (something [_] 
    (str "I'm a " type " and my name is " name)))

(def some-animal (->Animal "Owl" "Bird"))

(type some-animal)

(something some-animal)

(-> some-animal
    :name
    str/upper-case)

(-> some-animal
    something)