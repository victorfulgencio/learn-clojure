(ns mini.schema
  (:require [schema.core :as s]))


(s/defn my-name-is [name :- String]
  (str "Your name is " name))

(my-name-is "Victor")


(comment "Using a record as a schema"
         (s/defrecord Person [first-name :- String, last-name :- String])

         (s/defn name-of [person :- Person]
           (str (:first-name person) " " (:last-name person)))

         (name-of (->Person "Victor" "Fulgencio"))
         (name-of {:first-name "Victor" :last-name "Fulgencio"}))

(comment "Using a protocol as schema"
         (defprotocol Something
           (say-something [text]))

         (defrecord DefenitlySomething [alive]
           Something
           (say-something [text]
             (println "Saying something..." text)
             alive))

         (s/defn process-something :- Boolean
           [something :- Something]
           (say-something something))

         (process-something (->DefenitlySomething true)))


(comment "Maps as schemas"
         (def Schema
           {:id s/Str :keep-alive s/Bool})

         (s/defn new-schema :- Schema
           [id :- String, keep-alive :- Boolean]
           {:id id, :keep-alive keep-alive, :hey ""})

         (new-schema "abcd-123" false))
