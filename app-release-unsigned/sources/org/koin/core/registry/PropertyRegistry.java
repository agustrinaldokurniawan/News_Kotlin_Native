package org.koin.core.registry;

import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.koin.core.Koin;
import org.koin.core.error.NoPropertyFileFoundException;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.ext.StringExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007J\u001b\u0010\f\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0013J\u001a\u0010\u0015\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0017J)\u0010\u0018\u001a\u00020\t\"\b\b\u0000\u0010\r*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u0002H\rH\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lorg/koin/core/registry/PropertyRegistry;", "", "_koin", "Lorg/koin/core/Koin;", "(Lorg/koin/core/Koin;)V", "_values", "", "", "close", "", "deleteProperty", "key", "getProperty", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/String;)Ljava/lang/Object;", "loadEnvironmentProperties", "loadPropertiesFromFile", "fileName", "readDataFromFile", "Ljava/util/Properties;", "content", "saveProperties", "properties", "", "saveProperty", "value", "saveProperty$koin_core", "(Ljava/lang/String;Ljava/lang/Object;)V", "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* compiled from: PropertyRegistry.kt */
public final class PropertyRegistry {
    private final Koin _koin;
    private final Map<String, Object> _values = new ConcurrentHashMap();

    public PropertyRegistry(Koin koin) {
        Intrinsics.checkNotNullParameter(koin, "_koin");
        this._koin = koin;
    }

    public final void saveProperties(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "properties");
        if (this._koin.getLogger().isAt(Level.DEBUG)) {
            Logger logger = this._koin.getLogger();
            logger.debug("load " + map.size() + " properties");
        }
        this._values.putAll(map);
    }

    public final void saveProperties(Properties properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        if (this._koin.getLogger().isAt(Level.DEBUG)) {
            Logger logger = this._koin.getLogger();
            logger.debug("load " + properties.size() + " properties");
        }
        for (Map.Entry entry : MapsKt.toMap(properties).entrySet()) {
            saveProperty$koin_core((String) entry.getKey(), StringExtKt.quoted((String) entry.getValue()));
        }
    }

    public final <T> void saveProperty$koin_core(String str, T t) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(t, "value");
        this._values.put(str, t);
    }

    public final void deleteProperty(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this._values.remove(str);
    }

    public final <T> T getProperty(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return (T) this._values.get(str);
    }

    public final void loadPropertiesFromFile(String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "fileName");
        if (this._koin.getLogger().isAt(Level.DEBUG)) {
            this._koin.getLogger().debug(Intrinsics.stringPlus("load properties from ", str));
        }
        URL resource = Koin.class.getResource(str);
        if (resource == null) {
            str2 = null;
        } else {
            str2 = new String(TextStreamsKt.readBytes(resource), Charsets.UTF_8);
        }
        if (str2 != null) {
            if (this._koin.getLogger().isAt(Level.INFO)) {
                Logger logger = this._koin.getLogger();
                logger.info("loaded properties from file:'" + str + '\'');
            }
            saveProperties(readDataFromFile(str2));
            return;
        }
        throw new NoPropertyFileFoundException("No properties found for file '" + str + '\'');
    }

    private final Properties readDataFromFile(String str) {
        Properties properties = new Properties();
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        properties.load(new ByteArrayInputStream(bytes));
        return properties;
    }

    public final void loadEnvironmentProperties() {
        if (this._koin.getLogger().isAt(Level.DEBUG)) {
            this._koin.getLogger().debug("load properties from environment");
        }
        Properties properties = System.getProperties();
        Intrinsics.checkNotNullExpressionValue(properties, "sysProperties");
        saveProperties(properties);
        Map<String, String> map = System.getenv();
        Intrinsics.checkNotNullExpressionValue(map, "getenv()");
        Properties properties2 = new Properties();
        properties2.putAll(map);
        saveProperties(properties2);
    }

    public final void close() {
        this._values.clear();
    }
}
