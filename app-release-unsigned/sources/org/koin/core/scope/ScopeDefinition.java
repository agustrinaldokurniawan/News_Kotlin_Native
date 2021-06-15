package org.koin.core.scope;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Options;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;

public final class ScopeDefinition {
    public static final Companion Companion = new Companion(null);
    public static final String ROOT_SCOPE_ID;
    private static final StringQualifier ROOT_SCOPE_QUALIFIER = QualifierKt._q(ROOT_SCOPE_ID);
    private final HashSet<BeanDefinition<?>> definitions;
    private final boolean isRoot;
    private final Qualifier qualifier;

    public static /* synthetic */ ScopeDefinition copy$default(ScopeDefinition scopeDefinition, Qualifier qualifier2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier2 = scopeDefinition.qualifier;
        }
        if ((i & 2) != 0) {
            z = scopeDefinition.isRoot;
        }
        return scopeDefinition.copy(qualifier2, z);
    }

    public final Qualifier component1() {
        return this.qualifier;
    }

    public final boolean component2() {
        return this.isRoot;
    }

    public final ScopeDefinition copy(Qualifier qualifier2, boolean z) {
        Intrinsics.checkNotNullParameter(qualifier2, "qualifier");
        return new ScopeDefinition(qualifier2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScopeDefinition)) {
            return false;
        }
        ScopeDefinition scopeDefinition = (ScopeDefinition) obj;
        return Intrinsics.areEqual(this.qualifier, scopeDefinition.qualifier) && this.isRoot == scopeDefinition.isRoot;
    }

    public int hashCode() {
        int hashCode = this.qualifier.hashCode() * 31;
        boolean z = this.isRoot;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "ScopeDefinition(qualifier=" + this.qualifier + ", isRoot=" + this.isRoot + ')';
    }

    public ScopeDefinition(Qualifier qualifier2, boolean z) {
        Intrinsics.checkNotNullParameter(qualifier2, "qualifier");
        this.qualifier = qualifier2;
        this.isRoot = z;
        this.definitions = new HashSet<>();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScopeDefinition(Qualifier qualifier2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qualifier2, (i & 2) != 0 ? false : z);
    }

    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final HashSet<BeanDefinition<?>> getDefinitions() {
        return this.definitions;
    }

    public static /* synthetic */ void save$default(ScopeDefinition scopeDefinition, BeanDefinition beanDefinition, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        scopeDefinition.save(beanDefinition, z);
    }

    public final void save(BeanDefinition<?> beanDefinition, boolean z) {
        T t;
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        if (this.definitions.contains(beanDefinition)) {
            if (beanDefinition.getOptions().getOverride() || z) {
                this.definitions.remove(beanDefinition);
            } else {
                Iterator<T> it = this.definitions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t, beanDefinition)) {
                        break;
                    }
                }
                throw new DefinitionOverrideException("Definition '" + beanDefinition + "' try to override existing definition. Please use override option or check for definition '" + ((Object) t) + '\'');
            }
        }
        this.definitions.add(beanDefinition);
    }

    public final void remove(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        this.definitions.remove(beanDefinition);
    }

    public final int size$koin_core() {
        return this.definitions.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: org.koin.core.definition.Definitions */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeanDefinition declareNewDefinition$default(ScopeDefinition scopeDefinition, Object obj, Qualifier qualifier2, List list, boolean z, int i, Object obj2) {
        T t = null;
        Qualifier qualifier3 = (i & 2) != 0 ? null : qualifier2;
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(obj, "instance");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass<?> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Iterator<T> it = scopeDefinition.getDefinitions().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.is(orCreateKotlinClass, qualifier3, scopeDefinition.getQualifier())) {
                t = next;
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            if (z) {
                scopeDefinition.remove(t2);
            } else {
                throw new DefinitionOverrideException("Trying to override existing definition '" + ((Object) t2) + "' with new definition typed '" + orCreateKotlinClass + '\'');
            }
        }
        BeanDefinition<?> createSingle = Definitions.INSTANCE.createSingle(orCreateKotlinClass, qualifier3, new ScopeDefinition$declareNewDefinition$beanDefinition$1(obj), new Options(false, z, true), list == null ? CollectionsKt.emptyList() : list, scopeDefinition.getQualifier());
        scopeDefinition.save(createSingle, z);
        return createSingle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: org.koin.core.definition.Definitions */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ BeanDefinition declareNewDefinition(Object obj, Qualifier qualifier2, List list, boolean z) {
        T t;
        Intrinsics.checkNotNullParameter(obj, "instance");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass<?> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Iterator<T> it = getDefinitions().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.is(orCreateKotlinClass, qualifier2, getQualifier())) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            if (z) {
                remove(t2);
            } else {
                throw new DefinitionOverrideException("Trying to override existing definition '" + ((Object) t2) + "' with new definition typed '" + orCreateKotlinClass + '\'');
            }
        }
        Definitions definitions2 = Definitions.INSTANCE;
        ScopeDefinition$declareNewDefinition$beanDefinition$1 scopeDefinition$declareNewDefinition$beanDefinition$1 = new ScopeDefinition$declareNewDefinition$beanDefinition$1(obj);
        Options options = new Options(false, z, true);
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        BeanDefinition<?> createSingle = definitions2.createSingle(orCreateKotlinClass, qualifier2, scopeDefinition$declareNewDefinition$beanDefinition$1, options, list, getQualifier());
        save(createSingle, z);
        return createSingle;
    }

    public final void unloadDefinition$koin_core(BeanDefinition<?> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        this.definitions.remove(beanDefinition);
    }

    public final void removeExtras$koin_core() {
        ArrayList arrayList = new ArrayList();
        for (T t : this.definitions) {
            if (t.getOptions().isExtraDefinition()) {
                arrayList.add(t);
            }
        }
        this.definitions.removeAll(arrayList);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StringQualifier getROOT_SCOPE_QUALIFIER() {
            return ScopeDefinition.ROOT_SCOPE_QUALIFIER;
        }

        public final ScopeDefinition rootDefinition$koin_core() {
            return new ScopeDefinition(getROOT_SCOPE_QUALIFIER(), true);
        }
    }
}
