(defproject yes-she-codes "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.csv "1.0.1"]
                 [clojure.java-time "0.3.2"]
                 [com.datomic/datomic-pro "1.0.6397"]
                 [prismatic/schema "1.2.1"]]
  :repl-options {:init-ns yes-she-codes.project.core})
