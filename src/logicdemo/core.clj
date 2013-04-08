(ns logicdemo.core
  (:refer-clojure :exclude [==])
  (:use [clojure.core.logic])
  (:require [clojure.core.logic.fd :as fd]))


(run* [q] (== q "It works!"))







