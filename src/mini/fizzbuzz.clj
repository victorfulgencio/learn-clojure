(ns mini.fizzbuzz
  (:require [schema.core :as s]))


(defn divisible [num denum]
  (= (mod num denum) 0))

(defn message [num]
  (cond
    (and (divisible num 3) (divisible num 5)) "FizzBuzz"
    (divisible num 3) "Fizz"
    (divisible num 5) "Buzz"
    :else (str num)))

(s/defn fizz-buzz :- [s/Num] [arr :- [s/Num]]
  (map message arr))


(fizz-buzz [1 3 15 17 21 25 40 30])