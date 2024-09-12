(ns mini.playground)

(defn fibo [num]
  (if (<= num 1)
    num
    (+ (fibo (- num 1)) (fibo (- num 2)))))

(fibo 7)
