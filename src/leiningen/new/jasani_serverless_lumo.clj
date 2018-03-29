(ns leiningen.new.jasani-serverless-lumo
  (:require [leiningen.new.templates :refer [renderer raw-resourcer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "jasani-serverless-lumo"))
(def raw (raw-resourcer "jasani-serverless-lumo"))

(defn jasani-serverless-lumo
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' jasani-serverless-lumo project.")
    (->files data
             ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
             ["package.json" (raw "package.json")]
             ["serverless-lumo.edn" (raw "serverless-lumo.edn")]
             ["serverless.yml" (render "serverless.yml" data)]
             ["Makefile" (render "Makefile" data)]
             ["README.md" (render "README.md" data)]
             )))
