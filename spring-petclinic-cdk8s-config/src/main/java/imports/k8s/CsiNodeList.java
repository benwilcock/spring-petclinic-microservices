package imports.k8s;

/**
 * CSINodeList is a collection of CSINode objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.862Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CsiNodeList")
public class CsiNodeList extends org.cdk8s.ApiObject {

    protected CsiNodeList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CsiNodeList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.storage.v1beta1.CSINodeList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public CsiNodeList(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull imports.k8s.CsiNodeListOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.CsiNodeList}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.CsiNodeList> {
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
        private final imports.k8s.CsiNodeListOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new imports.k8s.CsiNodeListOptions.Builder();
        }

        /**
         * items is the list of CSINode.
         * <p>
         * @return {@code this}
         * @param items items is the list of CSINode. This parameter is required.
         */
        public Builder items(final java.util.List<? extends imports.k8s.CsiNode> items) {
            this.options.items(items);
            return this;
        }

        /**
         * Standard list metadata More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard list metadata More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ListMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.CsiNodeList}.
         */
        @Override
        public imports.k8s.CsiNodeList build() {
            return new imports.k8s.CsiNodeList(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
