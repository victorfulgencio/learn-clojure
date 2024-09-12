(ns mini.collection
  (:require [clojure.string :as str]))

(def some-collection [1 2 64 54 11 87 0])

; https://clojure-doc.org/articles/language/collections_and_sequences

(comment "good to know"
         (type [1 2 3 4])
         (type (seq [1 2 3]))
         (type '(1 2 3 4))
         (type #{1 3 4 2 0 10})
         (instance? java.util.List some-collection)
         (nth some-collection 4))


(comment "thread first vs thread last"
         (-> some-collection
             first
             (- 2))

         (->> some-collection
              first
              (- 2)))

(defn starts-with-a-or-b [text] 
  (let [first-char (first (str/upper-case text))]
    (or (= \A first-char) (= \B first-char))))

(starts-with-a-or-b "alex")

(comment "stream library like"
         (some even? [1 2 3 4 5])
         (map #(mod % 2) [1 2 3 4 5])
         (filter zero? [0 1 1 0 0])
         (->> ["Bob", "Alice", "John Doe", "Fulano"]
              (filter starts-with-a-or-b)
              (map #(str "Hey," % "!"))
              (run! println)))
