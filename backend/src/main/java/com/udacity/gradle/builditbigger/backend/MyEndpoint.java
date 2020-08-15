package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.jewong.joker.Joker;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com"
        )
)
public class MyEndpoint {

    Joker mJoker = new Joker();

    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        final MyBean response = new MyBean();
        final String joke = mJoker.getJoke();
        response.setData(joke);
        return response;
    }

}
