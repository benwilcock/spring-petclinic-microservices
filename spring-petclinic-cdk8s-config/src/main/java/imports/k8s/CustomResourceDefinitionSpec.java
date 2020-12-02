package imports.k8s;

/**
 * CustomResourceDefinitionSpec describes how a user wants their resource to appear.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.871Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CustomResourceDefinitionSpec")
@software.amazon.jsii.Jsii.Proxy(CustomResourceDefinitionSpec.Jsii$Proxy.class)
public interface CustomResourceDefinitionSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Group is the group this resource belongs in.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getGroup();

    /**
     * Names are the names used to describe this custom resource.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.CustomResourceDefinitionNames getNames();

    /**
     * Scope indicates whether this resource is cluster or namespace scoped.
     * <p>
     * Default is namespaced
     * <p>
     * Default: namespaced
     */
    @org.jetbrains.annotations.NotNull java.lang.String getScope();

    /**
     * AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name. Defaults to a created-at column. Optional, the global columns for all versions. Top-level and per-version columns are mutually exclusive.
     * <p>
     * Default: a created-at column. Optional, the global columns for all versions. Top-level and per-version columns are mutually exclusive.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
        return null;
    }

    /**
     * `conversion` defines conversion settings for the CRD.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CustomResourceConversion getConversion() {
        return null;
    }

    /**
     * preserveUnknownFields disables pruning of object fields which are not specified in the OpenAPI schema.
     * <p>
     * apiVersion, kind, metadata and known fields inside metadata are always preserved. Defaults to true in v1beta and will default to false in v1.
     * <p>
     * Default: true in v1beta and will default to false in v1.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPreserveUnknownFields() {
        return null;
    }

    /**
     * Subresources describes the subresources for CustomResource Optional, the global subresources for all versions.
     * <p>
     * Top-level and per-version subresources are mutually exclusive.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CustomResourceSubresources getSubresources() {
        return null;
    }

    /**
     * Validation describes the validation methods for CustomResources Optional, the global validation schema for all versions.
     * <p>
     * Top-level and per-version schemas are mutually exclusive.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CustomResourceValidation getValidation() {
        return null;
    }

    /**
     * Version is the version this resource belongs in Should be always first item in Versions field if provided.
     * <p>
     * Optional, but at least one of Version or Versions must be set. Deprecated: Please use <code>Versions</code>.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * Versions is the list of all supported versions for this resource.
     * <p>
     * If Version field is provided, this field is optional. Validation: All versions must use the same validation schema for now. i.e., top level Validation field is applied to all of these versions. Order: The version name will be used to compute the order. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.CustomResourceDefinitionVersion> getVersions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CustomResourceDefinitionSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CustomResourceDefinitionSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CustomResourceDefinitionSpec> {
        private java.lang.String group;
        private imports.k8s.CustomResourceDefinitionNames names;
        private java.lang.String scope;
        private java.util.List<imports.k8s.CustomResourceColumnDefinition> additionalPrinterColumns;
        private imports.k8s.CustomResourceConversion conversion;
        private java.lang.Boolean preserveUnknownFields;
        private imports.k8s.CustomResourceSubresources subresources;
        private imports.k8s.CustomResourceValidation validation;
        private java.lang.String version;
        private java.util.List<imports.k8s.CustomResourceDefinitionVersion> versions;

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getGroup}
         * @param group Group is the group this resource belongs in. This parameter is required.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getNames}
         * @param names Names are the names used to describe this custom resource. This parameter is required.
         * @return {@code this}
         */
        public Builder names(imports.k8s.CustomResourceDefinitionNames names) {
            this.names = names;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getScope}
         * @param scope Scope indicates whether this resource is cluster or namespace scoped. This parameter is required.
         *              Default is namespaced
         * @return {@code this}
         */
        public Builder scope(java.lang.String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getAdditionalPrinterColumns}
         * @param additionalPrinterColumns AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name. Defaults to a created-at column. Optional, the global columns for all versions. Top-level and per-version columns are mutually exclusive.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder additionalPrinterColumns(java.util.List<? extends imports.k8s.CustomResourceColumnDefinition> additionalPrinterColumns) {
            this.additionalPrinterColumns = (java.util.List<imports.k8s.CustomResourceColumnDefinition>)additionalPrinterColumns;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getConversion}
         * @param conversion `conversion` defines conversion settings for the CRD.
         * @return {@code this}
         */
        public Builder conversion(imports.k8s.CustomResourceConversion conversion) {
            this.conversion = conversion;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getPreserveUnknownFields}
         * @param preserveUnknownFields preserveUnknownFields disables pruning of object fields which are not specified in the OpenAPI schema.
         *                              apiVersion, kind, metadata and known fields inside metadata are always preserved. Defaults to true in v1beta and will default to false in v1.
         * @return {@code this}
         */
        public Builder preserveUnknownFields(java.lang.Boolean preserveUnknownFields) {
            this.preserveUnknownFields = preserveUnknownFields;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getSubresources}
         * @param subresources Subresources describes the subresources for CustomResource Optional, the global subresources for all versions.
         *                     Top-level and per-version subresources are mutually exclusive.
         * @return {@code this}
         */
        public Builder subresources(imports.k8s.CustomResourceSubresources subresources) {
            this.subresources = subresources;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getValidation}
         * @param validation Validation describes the validation methods for CustomResources Optional, the global validation schema for all versions.
         *                   Top-level and per-version schemas are mutually exclusive.
         * @return {@code this}
         */
        public Builder validation(imports.k8s.CustomResourceValidation validation) {
            this.validation = validation;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getVersion}
         * @param version Version is the version this resource belongs in Should be always first item in Versions field if provided.
         *                Optional, but at least one of Version or Versions must be set. Deprecated: Please use <code>Versions</code>.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionSpec#getVersions}
         * @param versions Versions is the list of all supported versions for this resource.
         *                 If Version field is provided, this field is optional. Validation: All versions must use the same validation schema for now. i.e., top level Validation field is applied to all of these versions. Order: The version name will be used to compute the order. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder versions(java.util.List<? extends imports.k8s.CustomResourceDefinitionVersion> versions) {
            this.versions = (java.util.List<imports.k8s.CustomResourceDefinitionVersion>)versions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CustomResourceDefinitionSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CustomResourceDefinitionSpec build() {
            return new Jsii$Proxy(group, names, scope, additionalPrinterColumns, conversion, preserveUnknownFields, subresources, validation, version, versions);
        }
    }

    /**
     * An implementation for {@link CustomResourceDefinitionSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CustomResourceDefinitionSpec {
        private final java.lang.String group;
        private final imports.k8s.CustomResourceDefinitionNames names;
        private final java.lang.String scope;
        private final java.util.List<imports.k8s.CustomResourceColumnDefinition> additionalPrinterColumns;
        private final imports.k8s.CustomResourceConversion conversion;
        private final java.lang.Boolean preserveUnknownFields;
        private final imports.k8s.CustomResourceSubresources subresources;
        private final imports.k8s.CustomResourceValidation validation;
        private final java.lang.String version;
        private final java.util.List<imports.k8s.CustomResourceDefinitionVersion> versions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.names = software.amazon.jsii.Kernel.get(this, "names", software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceDefinitionNames.class));
            this.scope = software.amazon.jsii.Kernel.get(this, "scope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.additionalPrinterColumns = software.amazon.jsii.Kernel.get(this, "additionalPrinterColumns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceColumnDefinition.class)));
            this.conversion = software.amazon.jsii.Kernel.get(this, "conversion", software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceConversion.class));
            this.preserveUnknownFields = software.amazon.jsii.Kernel.get(this, "preserveUnknownFields", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.subresources = software.amazon.jsii.Kernel.get(this, "subresources", software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceSubresources.class));
            this.validation = software.amazon.jsii.Kernel.get(this, "validation", software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceValidation.class));
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.versions = software.amazon.jsii.Kernel.get(this, "versions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceDefinitionVersion.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String group, final imports.k8s.CustomResourceDefinitionNames names, final java.lang.String scope, final java.util.List<? extends imports.k8s.CustomResourceColumnDefinition> additionalPrinterColumns, final imports.k8s.CustomResourceConversion conversion, final java.lang.Boolean preserveUnknownFields, final imports.k8s.CustomResourceSubresources subresources, final imports.k8s.CustomResourceValidation validation, final java.lang.String version, final java.util.List<? extends imports.k8s.CustomResourceDefinitionVersion> versions) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.group = java.util.Objects.requireNonNull(group, "group is required");
            this.names = java.util.Objects.requireNonNull(names, "names is required");
            this.scope = java.util.Objects.requireNonNull(scope, "scope is required");
            this.additionalPrinterColumns = (java.util.List<imports.k8s.CustomResourceColumnDefinition>)additionalPrinterColumns;
            this.conversion = conversion;
            this.preserveUnknownFields = preserveUnknownFields;
            this.subresources = subresources;
            this.validation = validation;
            this.version = version;
            this.versions = (java.util.List<imports.k8s.CustomResourceDefinitionVersion>)versions;
        }

        @Override
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final imports.k8s.CustomResourceDefinitionNames getNames() {
            return this.names;
        }

        @Override
        public final java.lang.String getScope() {
            return this.scope;
        }

        @Override
        public final java.util.List<imports.k8s.CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
            return this.additionalPrinterColumns;
        }

        @Override
        public final imports.k8s.CustomResourceConversion getConversion() {
            return this.conversion;
        }

        @Override
        public final java.lang.Boolean getPreserveUnknownFields() {
            return this.preserveUnknownFields;
        }

        @Override
        public final imports.k8s.CustomResourceSubresources getSubresources() {
            return this.subresources;
        }

        @Override
        public final imports.k8s.CustomResourceValidation getValidation() {
            return this.validation;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
        }

        @Override
        public final java.util.List<imports.k8s.CustomResourceDefinitionVersion> getVersions() {
            return this.versions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("group", om.valueToTree(this.getGroup()));
            data.set("names", om.valueToTree(this.getNames()));
            data.set("scope", om.valueToTree(this.getScope()));
            if (this.getAdditionalPrinterColumns() != null) {
                data.set("additionalPrinterColumns", om.valueToTree(this.getAdditionalPrinterColumns()));
            }
            if (this.getConversion() != null) {
                data.set("conversion", om.valueToTree(this.getConversion()));
            }
            if (this.getPreserveUnknownFields() != null) {
                data.set("preserveUnknownFields", om.valueToTree(this.getPreserveUnknownFields()));
            }
            if (this.getSubresources() != null) {
                data.set("subresources", om.valueToTree(this.getSubresources()));
            }
            if (this.getValidation() != null) {
                data.set("validation", om.valueToTree(this.getValidation()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
            }
            if (this.getVersions() != null) {
                data.set("versions", om.valueToTree(this.getVersions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CustomResourceDefinitionSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CustomResourceDefinitionSpec.Jsii$Proxy that = (CustomResourceDefinitionSpec.Jsii$Proxy) o;

            if (!group.equals(that.group)) return false;
            if (!names.equals(that.names)) return false;
            if (!scope.equals(that.scope)) return false;
            if (this.additionalPrinterColumns != null ? !this.additionalPrinterColumns.equals(that.additionalPrinterColumns) : that.additionalPrinterColumns != null) return false;
            if (this.conversion != null ? !this.conversion.equals(that.conversion) : that.conversion != null) return false;
            if (this.preserveUnknownFields != null ? !this.preserveUnknownFields.equals(that.preserveUnknownFields) : that.preserveUnknownFields != null) return false;
            if (this.subresources != null ? !this.subresources.equals(that.subresources) : that.subresources != null) return false;
            if (this.validation != null ? !this.validation.equals(that.validation) : that.validation != null) return false;
            if (this.version != null ? !this.version.equals(that.version) : that.version != null) return false;
            return this.versions != null ? this.versions.equals(that.versions) : that.versions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.group.hashCode();
            result = 31 * result + (this.names.hashCode());
            result = 31 * result + (this.scope.hashCode());
            result = 31 * result + (this.additionalPrinterColumns != null ? this.additionalPrinterColumns.hashCode() : 0);
            result = 31 * result + (this.conversion != null ? this.conversion.hashCode() : 0);
            result = 31 * result + (this.preserveUnknownFields != null ? this.preserveUnknownFields.hashCode() : 0);
            result = 31 * result + (this.subresources != null ? this.subresources.hashCode() : 0);
            result = 31 * result + (this.validation != null ? this.validation.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            result = 31 * result + (this.versions != null ? this.versions.hashCode() : 0);
            return result;
        }
    }
}
