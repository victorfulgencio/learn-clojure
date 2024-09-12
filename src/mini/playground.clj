(ns mini.playground)


(defn fibo [num]
  (if (<= num 1)
    num
    (+ (fibo (- num 1)) (fibo (- num 2))))) ; how to tail recursion this?

(fibo 7)
