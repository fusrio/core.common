package io.fusr.core.common.utils;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import io.vertx.core.json.JsonObject;

public class JsonUtils {

    public static JsonObject getJsonConfig(String resourceName, String encoding) throws Exception {
        InputStream is = ClassLoader.getSystemResourceAsStream(resourceName);
        String content = IOUtils.toString(is, encoding);
        return new JsonObject(content);
    }

}
