(ns yes-she-codes.project.wire.in.csv
  (:require [schema.core :as s]
            [clojure.string :as string]))


(s/defn ^:private is-lower-case
  [key :- s/Keyword]
  (= (string/lower-case (str key)) (str key)))

(s/defschema LowerKeyword
  (s/constrained
    s/Keyword
    is-lower-case))

(s/defschema RawCsv
  [[s/Str]])

(s/defschema CsvMapa
  {LowerKeyword s/Str})

(s/defschema CsvMapas
  [CsvMapa])
