package imports.k8s;

/**
 * RoleBinding references a role, but does not contain it.
 * <p>
 * It can reference a Role in the same namespace or a ClusterRole in the global namespace. It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given namespace only have effect in that namespace.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.110Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RoleBinding")
public class RoleBinding extends org.cdk8s.ApiObject {

    protected RoleBinding(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RoleBinding(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.rbac.v1.RoleBinding" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public RoleBinding(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull imports.k8s.RoleBindingOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.RoleBinding}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.RoleBinding> {
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
        private final imports.k8s.RoleBindingOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new imports.k8s.RoleBindingOptions.Builder();
        }

        /**
         * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
         * <p>
         * If the RoleRef cannot be resolved, the Authorizer must return an error.
         * <p>
         * @return {@code this}
         * @param roleRef RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. This parameter is required.
         */
        public Builder roleRef(final imports.k8s.RoleRef roleRef) {
            this.options.roleRef(roleRef);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * Subjects holds references to the objects the role applies to.
         * <p>
         * @return {@code this}
         * @param subjects Subjects holds references to the objects the role applies to. This parameter is required.
         */
        public Builder subjects(final java.util.List<? extends imports.k8s.Subject> subjects) {
            this.options.subjects(subjects);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.RoleBinding}.
         */
        @Override
        public imports.k8s.RoleBinding build() {
            return new imports.k8s.RoleBinding(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
