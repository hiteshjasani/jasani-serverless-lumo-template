(ns leiningen.new.jasani-serverless-lumo
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "jasani-serverless-lumo"))

(defn jasani-serverless-lumo
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' jasani-serverless-lumo project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
