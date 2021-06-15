package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* access modifiers changed from: package-private */
public abstract class ParameterHandler<T> {
    /* access modifiers changed from: package-private */
    public abstract void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException;

    ParameterHandler() {
    }

    /* access modifiers changed from: package-private */
    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() {
            /* class retrofit2.ParameterHandler.AnonymousClass1 */

            /* access modifiers changed from: package-private */
            @Override // retrofit2.ParameterHandler
            public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                apply(requestBuilder, (Iterable) ((Iterable) obj));
            }

            /* access modifiers changed from: package-private */
            public void apply(RequestBuilder requestBuilder, @Nullable Iterable<T> iterable) throws IOException {
                if (iterable != null) {
                    for (T t : iterable) {
                        ParameterHandler.this.apply(requestBuilder, t);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() {
            /* class retrofit2.ParameterHandler.AnonymousClass2 */

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: retrofit2.ParameterHandler */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: package-private */
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        ParameterHandler.this.apply(requestBuilder, Array.get(obj, i));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;
        private final int p;

        RelativeUrl(Method method2, int i) {
            this.method = method2;
            this.p = i;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable Object obj) {
            if (obj != null) {
                requestBuilder.setRelativeUrl(obj);
                return;
            }
            throw Utils.parameterError(this.method, this.p, "@Url parameter is null.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Header<T> extends ParameterHandler<T> {
        private final String name;
        private final Converter<T, String> valueConverter;

        Header(String str, Converter<T, String> converter) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String convert;
            if (t != null && (convert = this.valueConverter.convert(t)) != null) {
                requestBuilder.addHeader(this.name, convert);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;
        private final int p;
        private final Converter<T, String> valueConverter;

        Path(Method method2, int i, String str, Converter<T, String> converter, boolean z) {
            this.method = method2;
            this.p = i;
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            if (t != null) {
                requestBuilder.addPathParam(this.name, this.valueConverter.convert(t), this.encoded);
                return;
            }
            Method method2 = this.method;
            int i = this.p;
            throw Utils.parameterError(method2, i, "Path parameter \"" + this.name + "\" value must not be null.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Query(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String convert;
            if (t != null && (convert = this.valueConverter.convert(t)) != null) {
                requestBuilder.addQueryParam(this.name, convert, this.encoded);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        QueryName(Converter<T, String> converter, boolean z) {
            this.nameConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            if (t != null) {
                requestBuilder.addQueryParam(this.nameConverter.convert(t), null, this.encoded);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        QueryMap(Method method2, int i, Converter<T, String> converter, boolean z) {
            this.method = method2;
            this.p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addQueryParam(key, convert, this.encoded);
                            } else {
                                Method method2 = this.method;
                                int i = this.p;
                                throw Utils.parameterError(method2, i, "Query map value '" + ((Object) value) + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            Method method3 = this.method;
                            int i2 = this.p;
                            throw Utils.parameterError(method3, i2, "Query map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Query map was null", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        HeaderMap(Method method2, int i, Converter<T, String> converter) {
            this.method = method2;
            this.p = i;
            this.valueConverter = converter;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addHeader(key, this.valueConverter.convert(value));
                        } else {
                            Method method2 = this.method;
                            int i = this.p;
                            throw Utils.parameterError(method2, i, "Header map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Header map was null.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Headers extends ParameterHandler<okhttp3.Headers> {
        private final Method method;
        private final int p;

        Headers(Method method2, int i) {
            this.method = method2;
            this.p = i;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable okhttp3.Headers headers) {
            if (headers != null) {
                requestBuilder.addHeaders(headers);
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Field(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) throws IOException {
            String convert;
            if (t != null && (convert = this.valueConverter.convert(t)) != null) {
                requestBuilder.addFormField(this.name, convert, this.encoded);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        FieldMap(Method method2, int i, Converter<T, String> converter, boolean z) {
            this.method = method2;
            this.p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addFormField(key, convert, this.encoded);
                            } else {
                                Method method2 = this.method;
                                int i = this.p;
                                throw Utils.parameterError(method2, i, "Field map value '" + ((Object) value) + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            Method method3 = this.method;
                            int i2 = this.p;
                            throw Utils.parameterError(method3, i2, "Field map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Field map was null.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, RequestBody> converter;
        private final okhttp3.Headers headers;
        private final Method method;
        private final int p;

        Part(Method method2, int i, okhttp3.Headers headers2, Converter<T, RequestBody> converter2) {
            this.method = method2;
            this.p = i;
            this.headers = headers2;
            this.converter = converter2;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            if (t != null) {
                try {
                    requestBuilder.addPart(this.headers, this.converter.convert(t));
                } catch (IOException e) {
                    Method method2 = this.method;
                    int i = this.p;
                    throw Utils.parameterError(method2, i, "Unable to convert " + ((Object) t) + " to RequestBody", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class RawPart extends ParameterHandler<MultipartBody.Part> {
        static final RawPart INSTANCE = new RawPart();

        private RawPart() {
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable MultipartBody.Part part) {
            if (part != null) {
                requestBuilder.addPart(part);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;
        private final int p;
        private final String transferEncoding;
        private final Converter<T, RequestBody> valueConverter;

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        PartMap(Method method2, int i, Converter<T, RequestBody> converter, String str) {
            this.method = method2;
            this.p = i;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addPart(okhttp3.Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
                        } else {
                            Method method2 = this.method;
                            int i = this.p;
                            throw Utils.parameterError(method2, i, "Part map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Part map was null.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, RequestBody> converter;
        private final Method method;
        private final int p;

        Body(Method method2, int i, Converter<T, RequestBody> converter2) {
            this.method = method2;
            this.p = i;
            this.converter = converter2;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            if (t != null) {
                try {
                    requestBuilder.setBody(this.converter.convert(t));
                } catch (IOException e) {
                    Method method2 = this.method;
                    int i = this.p;
                    throw Utils.parameterError(method2, e, i, "Unable to convert " + ((Object) t) + " to RequestBody", new Object[0]);
                }
            } else {
                throw Utils.parameterError(this.method, this.p, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        Tag(Class<T> cls2) {
            this.cls = cls2;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            requestBuilder.addTag(this.cls, t);
        }
    }
}