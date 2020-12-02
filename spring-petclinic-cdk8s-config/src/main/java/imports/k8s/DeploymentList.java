package imports.k8s;

/**
 * DeploymentList is a list of Deployments.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.886Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DeploymentList")
public class DeploymentList extends org.cdk8s.ApiObject {

    protected DeploymentList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DeploymentList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.apps.v1.DeploymentList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public DeploymentList(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull imports.k8s.DeploymentListOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.DeploymentList}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.DeploymentList> {
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
        private final imports.k8s.DeploymentListOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new imports.k8s.DeploymentListOptions.Builder();
        }

        /**
         * Items is the list of Deployments.
         * <p>
         * @return {@code this}
         * @param items Items is the list of Deployments. This parameter is required.
         */
        public Builder items(final java.util.List<? extends imports.k8s.Deployment> items) {
            this.options.items(items);
            return this;
        }

        /**
         * Standard list metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard list metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ListMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.DeploymentList}.
         */
        @Override
        public imports.k8s.DeploymentList build() {
            return new imports.k8s.DeploymentList(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
