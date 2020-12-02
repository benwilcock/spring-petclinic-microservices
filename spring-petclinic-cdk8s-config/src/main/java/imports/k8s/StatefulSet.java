package imports.k8s;

/**
 * StatefulSet represents a set of pods with consistent identities.
 * <p>
 * Identities are defined as:
 * <p>
 * <ul>
 * <li>Network: A single stable DNS and hostname.</li>
 * <li>Storage: As many VolumeClaims as requested.
 * The StatefulSet guarantees that a given network identity will always map to the same storage identity.</li>
 * </ul>
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.158Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.StatefulSet")
public class StatefulSet extends org.cdk8s.ApiObject {

    protected StatefulSet(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StatefulSet(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.apps.v1.StatefulSet" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public StatefulSet(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable imports.k8s.StatefulSetOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "io.k8s.api.apps.v1.StatefulSet" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public StatefulSet(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.StatefulSet}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.StatefulSet> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param name a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String name) {
            return new Builder(scope, name);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String name;
        private imports.k8s.StatefulSetOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * @return {@code this}
         * @param metadata This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.options().metadata(metadata);
            return this;
        }

        /**
         * Spec defines the desired identities of pods in this set.
         * <p>
         * @return {@code this}
         * @param spec Spec defines the desired identities of pods in this set. This parameter is required.
         */
        public Builder spec(final imports.k8s.StatefulSetSpec spec) {
            this.options().spec(spec);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.StatefulSet}.
         */
        @Override
        public imports.k8s.StatefulSet build() {
            return new imports.k8s.StatefulSet(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private imports.k8s.StatefulSetOptions.Builder options() {
            if (this.options == null) {
                this.options = new imports.k8s.StatefulSetOptions.Builder();
            }
            return this.options;
        }
    }
}
