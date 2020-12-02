package imports.k8s;

/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.988Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ManagedFieldsEntry")
@software.amazon.jsii.Jsii.Proxy(ManagedFieldsEntry.Jsii$Proxy.class)
public interface ManagedFieldsEntry extends software.amazon.jsii.JsiiSerializable {

    /**
     * APIVersion defines the version of this resource that this field set applies to.
     * <p>
     * The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiVersion() {
        return null;
    }

    /**
     * Fields identifies a set of fields.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getFields() {
        return null;
    }

    /**
     * Manager is an identifier of the workflow managing these fields.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getManager() {
        return null;
    }

    /**
     * Operation is the type of operation which lead to this ManagedFieldsEntry being created.
     * <p>
     * The only valid values for this field are 'Apply' and 'Update'.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOperation() {
        return null;
    }

    /**
     * Time is timestamp of when these fields were set.
     * <p>
     * It should always be empty if Operation is 'Apply'
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getTime() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ManagedFieldsEntry}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ManagedFieldsEntry}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ManagedFieldsEntry> {
        private java.lang.String apiVersion;
        private java.lang.Object fields;
        private java.lang.String manager;
        private java.lang.String operation;
        private java.time.Instant time;

        /**
         * Sets the value of {@link ManagedFieldsEntry#getApiVersion}
         * @param apiVersion APIVersion defines the version of this resource that this field set applies to.
         *                   The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getFields}
         * @param fields Fields identifies a set of fields.
         * @return {@code this}
         */
        public Builder fields(java.lang.Object fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getManager}
         * @param manager Manager is an identifier of the workflow managing these fields.
         * @return {@code this}
         */
        public Builder manager(java.lang.String manager) {
            this.manager = manager;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getOperation}
         * @param operation Operation is the type of operation which lead to this ManagedFieldsEntry being created.
         *                  The only valid values for this field are 'Apply' and 'Update'.
         * @return {@code this}
         */
        public Builder operation(java.lang.String operation) {
            this.operation = operation;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getTime}
         * @param time Time is timestamp of when these fields were set.
         *             It should always be empty if Operation is 'Apply'
         * @return {@code this}
         */
        public Builder time(java.time.Instant time) {
            this.time = time;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ManagedFieldsEntry}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ManagedFieldsEntry build() {
            return new Jsii$Proxy(apiVersion, fields, manager, operation, time);
        }
    }

    /**
     * An implementation for {@link ManagedFieldsEntry}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ManagedFieldsEntry {
        private final java.lang.String apiVersion;
        private final java.lang.Object fields;
        private final java.lang.String manager;
        private final java.lang.String operation;
        private final java.time.Instant time;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiVersion = software.amazon.jsii.Kernel.get(this, "apiVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fields = software.amazon.jsii.Kernel.get(this, "fields", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.manager = software.amazon.jsii.Kernel.get(this, "manager", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.operation = software.amazon.jsii.Kernel.get(this, "operation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.time = software.amazon.jsii.Kernel.get(this, "time", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String apiVersion, final java.lang.Object fields, final java.lang.String manager, final java.lang.String operation, final java.time.Instant time) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiVersion = apiVersion;
            this.fields = fields;
            this.manager = manager;
            this.operation = operation;
            this.time = time;
        }

        @Override
        public final java.lang.String getApiVersion() {
            return this.apiVersion;
        }

        @Override
        public final java.lang.Object getFields() {
            return this.fields;
        }

        @Override
        public final java.lang.String getManager() {
            return this.manager;
        }

        @Override
        public final java.lang.String getOperation() {
            return this.operation;
        }

        @Override
        public final java.time.Instant getTime() {
            return this.time;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getApiVersion() != null) {
                data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            }
            if (this.getFields() != null) {
                data.set("fields", om.valueToTree(this.getFields()));
            }
            if (this.getManager() != null) {
                data.set("manager", om.valueToTree(this.getManager()));
            }
            if (this.getOperation() != null) {
                data.set("operation", om.valueToTree(this.getOperation()));
            }
            if (this.getTime() != null) {
                data.set("time", om.valueToTree(this.getTime()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ManagedFieldsEntry"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ManagedFieldsEntry.Jsii$Proxy that = (ManagedFieldsEntry.Jsii$Proxy) o;

            if (this.apiVersion != null ? !this.apiVersion.equals(that.apiVersion) : that.apiVersion != null) return false;
            if (this.fields != null ? !this.fields.equals(that.fields) : that.fields != null) return false;
            if (this.manager != null ? !this.manager.equals(that.manager) : that.manager != null) return false;
            if (this.operation != null ? !this.operation.equals(that.operation) : that.operation != null) return false;
            return this.time != null ? this.time.equals(that.time) : that.time == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiVersion != null ? this.apiVersion.hashCode() : 0;
            result = 31 * result + (this.fields != null ? this.fields.hashCode() : 0);
            result = 31 * result + (this.manager != null ? this.manager.hashCode() : 0);
            result = 31 * result + (this.operation != null ? this.operation.hashCode() : 0);
            result = 31 * result + (this.time != null ? this.time.hashCode() : 0);
            return result;
        }
    }
}
