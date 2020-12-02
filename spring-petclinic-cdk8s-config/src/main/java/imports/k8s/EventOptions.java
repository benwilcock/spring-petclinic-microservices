package imports.k8s;

/**
 * Event is a report of an event somewhere in the cluster.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:27.907Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EventOptions")
@software.amazon.jsii.Jsii.Proxy(EventOptions.Jsii$Proxy.class)
public interface EventOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * The object that this event is about.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.ObjectReference getInvolvedObject();

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     */
    @org.jetbrains.annotations.NotNull imports.k8s.ObjectMeta getMetadata();

    /**
     * What action was taken/failed regarding to the Regarding object.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAction() {
        return null;
    }

    /**
     * The number of times this event has occurred.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCount() {
        return null;
    }

    /**
     * Time when this Event was first observed.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getEventTime() {
        return null;
    }

    /**
     * The time at which the event was first recorded.
     * <p>
     * (Time of server receipt is in TypeMeta.)
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getFirstTimestamp() {
        return null;
    }

    /**
     * The time at which the most recent occurrence of this event was recorded.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getLastTimestamp() {
        return null;
    }

    /**
     * A human-readable description of the status of this operation.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMessage() {
        return null;
    }

    /**
     * This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReason() {
        return null;
    }

    /**
     * Optional secondary object for more complex actions.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectReference getRelated() {
        return null;
    }

    /**
     * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReportingComponent() {
        return null;
    }

    /**
     * ID of the controller instance, e.g. `kubelet-xyzf`.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReportingInstance() {
        return null;
    }

    /**
     * Data about the Event series this event represents or nil if it's a singleton Event.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.EventSeries getSeries() {
        return null;
    }

    /**
     * The component reporting this event.
     * <p>
     * Should be a short machine understandable string.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.EventSource getSource() {
        return null;
    }

    /**
     * Type of this event (Normal, Warning), new types could be added in the future.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EventOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EventOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EventOptions> {
        private imports.k8s.ObjectReference involvedObject;
        private imports.k8s.ObjectMeta metadata;
        private java.lang.String action;
        private java.lang.Number count;
        private java.time.Instant eventTime;
        private java.time.Instant firstTimestamp;
        private java.time.Instant lastTimestamp;
        private java.lang.String message;
        private java.lang.String reason;
        private imports.k8s.ObjectReference related;
        private java.lang.String reportingComponent;
        private java.lang.String reportingInstance;
        private imports.k8s.EventSeries series;
        private imports.k8s.EventSource source;
        private java.lang.String type;

        /**
         * Sets the value of {@link EventOptions#getInvolvedObject}
         * @param involvedObject The object that this event is about. This parameter is required.
         * @return {@code this}
         */
        public Builder involvedObject(imports.k8s.ObjectReference involvedObject) {
            this.involvedObject = involvedObject;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getMetadata}
         * @param metadata Standard object's metadata. This parameter is required.
         *                 More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getAction}
         * @param action What action was taken/failed regarding to the Regarding object.
         * @return {@code this}
         */
        public Builder action(java.lang.String action) {
            this.action = action;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getCount}
         * @param count The number of times this event has occurred.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getEventTime}
         * @param eventTime Time when this Event was first observed.
         * @return {@code this}
         */
        public Builder eventTime(java.time.Instant eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getFirstTimestamp}
         * @param firstTimestamp The time at which the event was first recorded.
         *                       (Time of server receipt is in TypeMeta.)
         * @return {@code this}
         */
        public Builder firstTimestamp(java.time.Instant firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getLastTimestamp}
         * @param lastTimestamp The time at which the most recent occurrence of this event was recorded.
         * @return {@code this}
         */
        public Builder lastTimestamp(java.time.Instant lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getMessage}
         * @param message A human-readable description of the status of this operation.
         * @return {@code this}
         */
        public Builder message(java.lang.String message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getReason}
         * @param reason This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
         * @return {@code this}
         */
        public Builder reason(java.lang.String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getRelated}
         * @param related Optional secondary object for more complex actions.
         * @return {@code this}
         */
        public Builder related(imports.k8s.ObjectReference related) {
            this.related = related;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getReportingComponent}
         * @param reportingComponent Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
         * @return {@code this}
         */
        public Builder reportingComponent(java.lang.String reportingComponent) {
            this.reportingComponent = reportingComponent;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getReportingInstance}
         * @param reportingInstance ID of the controller instance, e.g. `kubelet-xyzf`.
         * @return {@code this}
         */
        public Builder reportingInstance(java.lang.String reportingInstance) {
            this.reportingInstance = reportingInstance;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getSeries}
         * @param series Data about the Event series this event represents or nil if it's a singleton Event.
         * @return {@code this}
         */
        public Builder series(imports.k8s.EventSeries series) {
            this.series = series;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getSource}
         * @param source The component reporting this event.
         *               Should be a short machine understandable string.
         * @return {@code this}
         */
        public Builder source(imports.k8s.EventSource source) {
            this.source = source;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getType}
         * @param type Type of this event (Normal, Warning), new types could be added in the future.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EventOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EventOptions build() {
            return new Jsii$Proxy(involvedObject, metadata, action, count, eventTime, firstTimestamp, lastTimestamp, message, reason, related, reportingComponent, reportingInstance, series, source, type);
        }
    }

    /**
     * An implementation for {@link EventOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EventOptions {
        private final imports.k8s.ObjectReference involvedObject;
        private final imports.k8s.ObjectMeta metadata;
        private final java.lang.String action;
        private final java.lang.Number count;
        private final java.time.Instant eventTime;
        private final java.time.Instant firstTimestamp;
        private final java.time.Instant lastTimestamp;
        private final java.lang.String message;
        private final java.lang.String reason;
        private final imports.k8s.ObjectReference related;
        private final java.lang.String reportingComponent;
        private final java.lang.String reportingInstance;
        private final imports.k8s.EventSeries series;
        private final imports.k8s.EventSource source;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.involvedObject = software.amazon.jsii.Kernel.get(this, "involvedObject", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectReference.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.eventTime = software.amazon.jsii.Kernel.get(this, "eventTime", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.firstTimestamp = software.amazon.jsii.Kernel.get(this, "firstTimestamp", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.lastTimestamp = software.amazon.jsii.Kernel.get(this, "lastTimestamp", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.message = software.amazon.jsii.Kernel.get(this, "message", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reason = software.amazon.jsii.Kernel.get(this, "reason", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.related = software.amazon.jsii.Kernel.get(this, "related", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectReference.class));
            this.reportingComponent = software.amazon.jsii.Kernel.get(this, "reportingComponent", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reportingInstance = software.amazon.jsii.Kernel.get(this, "reportingInstance", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.series = software.amazon.jsii.Kernel.get(this, "series", software.amazon.jsii.NativeType.forClass(imports.k8s.EventSeries.class));
            this.source = software.amazon.jsii.Kernel.get(this, "source", software.amazon.jsii.NativeType.forClass(imports.k8s.EventSource.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final imports.k8s.ObjectReference involvedObject, final imports.k8s.ObjectMeta metadata, final java.lang.String action, final java.lang.Number count, final java.time.Instant eventTime, final java.time.Instant firstTimestamp, final java.time.Instant lastTimestamp, final java.lang.String message, final java.lang.String reason, final imports.k8s.ObjectReference related, final java.lang.String reportingComponent, final java.lang.String reportingInstance, final imports.k8s.EventSeries series, final imports.k8s.EventSource source, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.involvedObject = java.util.Objects.requireNonNull(involvedObject, "involvedObject is required");
            this.metadata = java.util.Objects.requireNonNull(metadata, "metadata is required");
            this.action = action;
            this.count = count;
            this.eventTime = eventTime;
            this.firstTimestamp = firstTimestamp;
            this.lastTimestamp = lastTimestamp;
            this.message = message;
            this.reason = reason;
            this.related = related;
            this.reportingComponent = reportingComponent;
            this.reportingInstance = reportingInstance;
            this.series = series;
            this.source = source;
            this.type = type;
        }

        @Override
        public final imports.k8s.ObjectReference getInvolvedObject() {
            return this.involvedObject;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.lang.String getAction() {
            return this.action;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.time.Instant getEventTime() {
            return this.eventTime;
        }

        @Override
        public final java.time.Instant getFirstTimestamp() {
            return this.firstTimestamp;
        }

        @Override
        public final java.time.Instant getLastTimestamp() {
            return this.lastTimestamp;
        }

        @Override
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override
        public final java.lang.String getReason() {
            return this.reason;
        }

        @Override
        public final imports.k8s.ObjectReference getRelated() {
            return this.related;
        }

        @Override
        public final java.lang.String getReportingComponent() {
            return this.reportingComponent;
        }

        @Override
        public final java.lang.String getReportingInstance() {
            return this.reportingInstance;
        }

        @Override
        public final imports.k8s.EventSeries getSeries() {
            return this.series;
        }

        @Override
        public final imports.k8s.EventSource getSource() {
            return this.source;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("involvedObject", om.valueToTree(this.getInvolvedObject()));
            data.set("metadata", om.valueToTree(this.getMetadata()));
            if (this.getAction() != null) {
                data.set("action", om.valueToTree(this.getAction()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getEventTime() != null) {
                data.set("eventTime", om.valueToTree(this.getEventTime()));
            }
            if (this.getFirstTimestamp() != null) {
                data.set("firstTimestamp", om.valueToTree(this.getFirstTimestamp()));
            }
            if (this.getLastTimestamp() != null) {
                data.set("lastTimestamp", om.valueToTree(this.getLastTimestamp()));
            }
            if (this.getMessage() != null) {
                data.set("message", om.valueToTree(this.getMessage()));
            }
            if (this.getReason() != null) {
                data.set("reason", om.valueToTree(this.getReason()));
            }
            if (this.getRelated() != null) {
                data.set("related", om.valueToTree(this.getRelated()));
            }
            if (this.getReportingComponent() != null) {
                data.set("reportingComponent", om.valueToTree(this.getReportingComponent()));
            }
            if (this.getReportingInstance() != null) {
                data.set("reportingInstance", om.valueToTree(this.getReportingInstance()));
            }
            if (this.getSeries() != null) {
                data.set("series", om.valueToTree(this.getSeries()));
            }
            if (this.getSource() != null) {
                data.set("source", om.valueToTree(this.getSource()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EventOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EventOptions.Jsii$Proxy that = (EventOptions.Jsii$Proxy) o;

            if (!involvedObject.equals(that.involvedObject)) return false;
            if (!metadata.equals(that.metadata)) return false;
            if (this.action != null ? !this.action.equals(that.action) : that.action != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.eventTime != null ? !this.eventTime.equals(that.eventTime) : that.eventTime != null) return false;
            if (this.firstTimestamp != null ? !this.firstTimestamp.equals(that.firstTimestamp) : that.firstTimestamp != null) return false;
            if (this.lastTimestamp != null ? !this.lastTimestamp.equals(that.lastTimestamp) : that.lastTimestamp != null) return false;
            if (this.message != null ? !this.message.equals(that.message) : that.message != null) return false;
            if (this.reason != null ? !this.reason.equals(that.reason) : that.reason != null) return false;
            if (this.related != null ? !this.related.equals(that.related) : that.related != null) return false;
            if (this.reportingComponent != null ? !this.reportingComponent.equals(that.reportingComponent) : that.reportingComponent != null) return false;
            if (this.reportingInstance != null ? !this.reportingInstance.equals(that.reportingInstance) : that.reportingInstance != null) return false;
            if (this.series != null ? !this.series.equals(that.series) : that.series != null) return false;
            if (this.source != null ? !this.source.equals(that.source) : that.source != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.involvedObject.hashCode();
            result = 31 * result + (this.metadata.hashCode());
            result = 31 * result + (this.action != null ? this.action.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.eventTime != null ? this.eventTime.hashCode() : 0);
            result = 31 * result + (this.firstTimestamp != null ? this.firstTimestamp.hashCode() : 0);
            result = 31 * result + (this.lastTimestamp != null ? this.lastTimestamp.hashCode() : 0);
            result = 31 * result + (this.message != null ? this.message.hashCode() : 0);
            result = 31 * result + (this.reason != null ? this.reason.hashCode() : 0);
            result = 31 * result + (this.related != null ? this.related.hashCode() : 0);
            result = 31 * result + (this.reportingComponent != null ? this.reportingComponent.hashCode() : 0);
            result = 31 * result + (this.reportingInstance != null ? this.reportingInstance.hashCode() : 0);
            result = 31 * result + (this.series != null ? this.series.hashCode() : 0);
            result = 31 * result + (this.source != null ? this.source.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
