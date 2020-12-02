package imports.k8s;

/**
 * CSINode holds information about all CSI drivers installed on a node.
 * <p>
 * CSI drivers do not need to create the CSINode object directly. As long as they use the node-driver-registrar sidecar container, the kubelet will automatically populate the CSINode object for the CSI driver as part of kubelet plugin registration. CSINode has the same name as a node. If the object is missing, it means either there are no CSI Drivers available on the node, or the Kubelet version is low enough that it doesn't create this object. CSINode has an OwnerReference that points to the corresponding node object.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.861Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CsiNode")
public class CsiNode extends org.cdk8s.ApiObject {

    protected CsiNode(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CsiNode(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.storage.v1beta1.CSINode" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public CsiNode(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull imports.k8s.CsiNodeOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.CsiNode}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.CsiNode> {
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
        private final imports.k8s.CsiNodeOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new imports.k8s.CsiNodeOptions.Builder();
        }

        /**
         * spec is the specification of CSINode.
         * <p>
         * @return {@code this}
         * @param spec spec is the specification of CSINode. This parameter is required.
         */
        public Builder spec(final imports.k8s.CsiNodeSpec spec) {
            this.options.spec(spec);
            return this;
        }

        /**
         * metadata.name must be the Kubernetes node name.
         * <p>
         * @return {@code this}
         * @param metadata metadata.name must be the Kubernetes node name. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.CsiNode}.
         */
        @Override
        public imports.k8s.CsiNode build() {
            return new imports.k8s.CsiNode(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
