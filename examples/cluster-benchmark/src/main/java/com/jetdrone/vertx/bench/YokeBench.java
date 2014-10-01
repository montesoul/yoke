package com.jetdrone.vertx.bench;

import com.jetdrone.vertx.yoke.Middleware;
import com.jetdrone.vertx.yoke.Yoke;
import com.jetdrone.vertx.yoke.middleware.Router;
import com.jetdrone.vertx.yoke.middleware.YokeRequest;
import org.vertx.java.core.Handler;
import org.vertx.java.platform.Verticle;

public class YokeBench extends Verticle {

    @Override
    public void start() {

        new Yoke(this)
                .use(new Router()
                        .get("/", (request, next) -> request.response().end("Hello World\n"))
                ).listen(8080);
    }
}
