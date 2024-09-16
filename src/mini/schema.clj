(ns mini.schema
  (:require [schema.core :as s]))


(s/defn my-name-is [name :- String]
  (str "Your name is " name))

(my-name-is "Victor")


(comment "Using a record as a reference"
         (s/defrecord Person [first-name :- String, last-name :- String])

         (s/defn name-of [person :- Person]
           (str (:first-name person) " " (:last-name person)))

         (name-of (->Person "Victor" "Fulgencio"))
         (name-of {:first-name "Victor" :last-name "Fulgencio"}))
