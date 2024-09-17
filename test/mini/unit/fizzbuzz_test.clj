(ns mini.unit.fizzbuzz-test
  (:require [clojure.test :refer [deftest is testing]]
            [mini.fizzbuzz :refer [fizz-buzz]]
            [matcher-combinators.test :refer [match?]]))


(deftest fizz-buzz-test
  (testing "Should return FizzBuzz when divisible by 3 and 5"
    (is (=
         ["FizzBuzz", "FizzBuzz", "FizzBuzz"]
         (fizz-buzz [15 30 45]))))
  (testing "Should match Buzz when divisible by 5, 3, 5 and 3 and none"
     (is (match?
          ["1", "FizzBuzz", "Buzz", "Fizz"]
          (fizz-buzz [1 30 5 3])))))

