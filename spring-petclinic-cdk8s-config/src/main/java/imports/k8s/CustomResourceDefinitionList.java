package imports.k8s;

/**
 * CustomResourceDefinitionList is a list of CustomResourceDefinition objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.869Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CustomResourceDefinitionList")
public class CustomResourceDefinitionList extends org.cdk8s.ApiObject {

    protected CustomResourceDefinitionList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CustomResourceDefinitionList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1beta1.CustomResourceDefinitionList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public CustomResourceDefinitionList(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull imports.k8s.CustomResourceDefinitionListOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.CustomResourceDefinitionList}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.CustomResourceDefinitionList> {
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
        private final imports.k8s.CustomResourceDefinitionListOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new imports.k8s.CustomResourceDefinitionListOptions.Builder();
        }

        /**
         * Items individual CustomResourceDefinitions.
         * <p>
         * @return {@code this}
         * @param items Items individual CustomResourceDefinitions. This parameter is required.
         */
        public Builder items(final java.util.List<? extends imports.k8s.CustomResourceDefinition> items) {
            this.options.items(items);
            return this;
        }

        /**
         * @return {@code this}
         * @param metadata This parameter is required.
         */
        public Builder metadata(final imports.k8s.ListMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.CustomResourceDefinitionList}.
         */
        @Override
        public imports.k8s.CustomResourceDefinitionList build() {
            return new imports.k8s.CustomResourceDefinitionList(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
