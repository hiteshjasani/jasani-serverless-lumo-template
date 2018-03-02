(ns {{name}}.core)

(defn ^:export get [event ctx cb]
  (let [resp #js {:statusCode 200
                  :headers #js {"Access-Control-Allow-Origin" "*"
                                "Content-Type" "text/plain"}
                  :body "Lambda function says 'Hello, World!'"}]
    (js/console.log "Invoked lambda function {{name}}.core/get")
    (cb nil resp)))
