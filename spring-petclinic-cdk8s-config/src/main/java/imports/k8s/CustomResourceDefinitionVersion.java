package imports.k8s;

/**
 * CustomResourceDefinitionVersion describes a version for CRD.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.873Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CustomResourceDefinitionVersion")
@software.amazon.jsii.Jsii.Proxy(CustomResourceDefinitionVersion.Jsii$Proxy.class)
public interface CustomResourceDefinitionVersion extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name is the version name, e.g. “v1”, “v2beta1”, etc.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Served is a flag enabling/disabling this version from being served via REST APIs.
     */
    @org.jetbrains.annotations.NotNull java.lang.Boolean getServed();

    /**
     * Storage flags the version as storage version.
     * <p>
     * There must be exactly one flagged as storage version.
     */
    @org.jetbrains.annotations.NotNull java.lang.Boolean getStorage();

    /**
     * AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name. Defaults to a created-at column. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead) This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature. NOTE: CRDs created prior to 1.13 populated the top-level additionalPrinterColumns field by default. To apply an update that changes to per-version additionalPrinterColumns, the top-level additionalPrinterColumns field must be explicitly set to null.
     * <p>
     * Default: a created-at column. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead) This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature. NOTE: CRDs created prior to 1.13 populated the top-level additionalPrinterColumns field by default. To apply an update that changes to per-version additionalPrinterColumns, the top-level additionalPrinterColumns field must be explicitly set to null
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
        return null;
    }

    /**
     * Schema describes the schema for CustomResource used in validation, pruning, and defaulting.
     * <p>
     * Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all be set to identical values (top-level validation schema should be used instead) This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CustomResourceValidation getSchema() {
        return null;
    }

    /**
     * Subresources describes the subresources for CustomResource Top-level and per-version subresources are mutually exclusive.
     * <p>
     * Per-version subresources must not all be set to identical values (top-level subresources should be used instead) This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.CustomResourceSubresources getSubresources() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CustomResourceDefinitionVersion}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CustomResourceDefinitionVersion}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CustomResourceDefinitionVersion> {
        private java.lang.String name;
        private java.lang.Boolean served;
        private java.lang.Boolean storage;
        private java.util.List<imports.k8s.CustomResourceColumnDefinition> additionalPrinterColumns;
        private imports.k8s.CustomResourceValidation schema;
        private imports.k8s.CustomResourceSubresources subresources;

        /**
         * Sets the value of {@link CustomResourceDefinitionVersion#getName}
         * @param name Name is the version name, e.g. “v1”, “v2beta1”, etc. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionVersion#getServed}
         * @param served Served is a flag enabling/disabling this version from being served via REST APIs. This parameter is required.
         * @return {@code this}
         */
        public Builder served(java.lang.Boolean served) {
            this.served = served;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionVersion#getStorage}
         * @param storage Storage flags the version as storage version. This parameter is required.
         *                There must be exactly one flagged as storage version.
         * @return {@code this}
         */
        public Builder storage(java.lang.Boolean storage) {
            this.storage = storage;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionVersion#getAdditionalPrinterColumns}
         * @param additionalPrinterColumns AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name. Defaults to a created-at column. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead) This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature. NOTE: CRDs created prior to 1.13 populated the top-level additionalPrinterColumns field by default. To apply an update that changes to per-version additionalPrinterColumns, the top-level additionalPrinterColumns field must be explicitly set to null.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder additionalPrinterColumns(java.util.List<? extends imports.k8s.CustomResourceColumnDefinition> additionalPrinterColumns) {
            this.additionalPrinterColumns = (java.util.List<imports.k8s.CustomResourceColumnDefinition>)additionalPrinterColumns;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionVersion#getSchema}
         * @param schema Schema describes the schema for CustomResource used in validation, pruning, and defaulting.
         *               Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all be set to identical values (top-level validation schema should be used instead) This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature.
         * @return {@code this}
         */
        public Builder schema(imports.k8s.CustomResourceValidation schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionVersion#getSubresources}
         * @param subresources Subresources describes the subresources for CustomResource Top-level and per-version subresources are mutually exclusive.
         *                     Per-version subresources must not all be set to identical values (top-level subresources should be used instead) This field is alpha-level and is only honored by servers that enable the CustomResourceWebhookConversion feature.
         * @return {@code this}
         */
        public Builder subresources(imports.k8s.CustomResourceSubresources subresources) {
            this.subresources = subresources;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CustomResourceDefinitionVersion}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CustomResourceDefinitionVersion build() {
            return new Jsii$Proxy(name, served, storage, additionalPrinterColumns, schema, subresources);
        }
    }

    /**
     * An implementation for {@link CustomResourceDefinitionVersion}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CustomResourceDefinitionVersion {
        private final java.lang.String name;
        private final java.lang.Boolean served;
        private final java.lang.Boolean storage;
        private final java.util.List<imports.k8s.CustomResourceColumnDefinition> additionalPrinterColumns;
        private final imports.k8s.CustomResourceValidation schema;
        private final imports.k8s.CustomResourceSubresources subresources;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.served = software.amazon.jsii.Kernel.get(this, "served", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.storage = software.amazon.jsii.Kernel.get(this, "storage", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.additionalPrinterColumns = software.amazon.jsii.Kernel.get(this, "additionalPrinterColumns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceColumnDefinition.class)));
            this.schema = software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceValidation.class));
            this.subresources = software.amazon.jsii.Kernel.get(this, "subresources", software.amazon.jsii.NativeType.forClass(imports.k8s.CustomResourceSubresources.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.lang.String name, final java.lang.Boolean served, final java.lang.Boolean storage, final java.util.List<? extends imports.k8s.CustomResourceColumnDefinition> additionalPrinterColumns, final imports.k8s.CustomResourceValidation schema, final imports.k8s.CustomResourceSubresources subresources) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.served = java.util.Objects.requireNonNull(served, "served is required");
            this.storage = java.util.Objects.requireNonNull(storage, "storage is required");
            this.additionalPrinterColumns = (java.util.List<imports.k8s.CustomResourceColumnDefinition>)additionalPrinterColumns;
            this.schema = schema;
            this.subresources = subresources;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Boolean getServed() {
            return this.served;
        }

        @Override
        public final java.lang.Boolean getStorage() {
            return this.storage;
        }

        @Override
        public final java.util.List<imports.k8s.CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
            return this.additionalPrinterColumns;
        }

        @Override
        public final imports.k8s.CustomResourceValidation getSchema() {
            return this.schema;
        }

        @Override
        public final imports.k8s.CustomResourceSubresources getSubresources() {
            return this.subresources;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("served", om.valueToTree(this.getServed()));
            data.set("storage", om.valueToTree(this.getStorage()));
            if (this.getAdditionalPrinterColumns() != null) {
                data.set("additionalPrinterColumns", om.valueToTree(this.getAdditionalPrinterColumns()));
            }
            if (this.getSchema() != null) {
                data.set("schema", om.valueToTree(this.getSchema()));
            }
            if (this.getSubresources() != null) {
                data.set("subresources", om.valueToTree(this.getSubresources()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CustomResourceDefinitionVersion"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CustomResourceDefinitionVersion.Jsii$Proxy that = (CustomResourceDefinitionVersion.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!served.equals(that.served)) return false;
            if (!storage.equals(that.storage)) return false;
            if (this.additionalPrinterColumns != null ? !this.additionalPrinterColumns.equals(that.additionalPrinterColumns) : that.additionalPrinterColumns != null) return false;
            if (this.schema != null ? !this.schema.equals(that.schema) : that.schema != null) return false;
            return this.subresources != null ? this.subresources.equals(that.subresources) : that.subresources == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.served.hashCode());
            result = 31 * result + (this.storage.hashCode());
            result = 31 * result + (this.additionalPrinterColumns != null ? this.additionalPrinterColumns.hashCode() : 0);
            result = 31 * result + (this.schema != null ? this.schema.hashCode() : 0);
            result = 31 * result + (this.subresources != null ? this.subresources.hashCode() : 0);
            return result;
        }
    }
}
