package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeDaemonEndpointsBuilder extends NodeDaemonEndpointsFluentImpl<NodeDaemonEndpointsBuilder> implements VisitableBuilder<NodeDaemonEndpoints,NodeDaemonEndpointsBuilder>{

    NodeDaemonEndpointsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeDaemonEndpointsBuilder(){
            this(true);
    }
    public NodeDaemonEndpointsBuilder(Boolean validationEnabled){
            this(new NodeDaemonEndpoints(), validationEnabled);
    }
    public NodeDaemonEndpointsBuilder(NodeDaemonEndpointsFluent<?> fluent){
            this(fluent, true);
    }
    public NodeDaemonEndpointsBuilder(NodeDaemonEndpointsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeDaemonEndpoints(), validationEnabled);
    }
    public NodeDaemonEndpointsBuilder(NodeDaemonEndpointsFluent<?> fluent,NodeDaemonEndpoints instance){
            this(fluent, instance, true);
    }
    public NodeDaemonEndpointsBuilder(NodeDaemonEndpointsFluent<?> fluent,NodeDaemonEndpoints instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withKubeletEndpoint(instance.getKubeletEndpoint()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeDaemonEndpointsBuilder(NodeDaemonEndpoints instance){
            this(instance,true);
    }
    public NodeDaemonEndpointsBuilder(NodeDaemonEndpoints instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withKubeletEndpoint(instance.getKubeletEndpoint()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeDaemonEndpointsBuilder(Validator validator){
            this(new NodeDaemonEndpoints(), true);
    }
    public NodeDaemonEndpointsBuilder(NodeDaemonEndpointsFluent<?> fluent,NodeDaemonEndpoints instance,Validator validator){
            this.fluent = fluent; 
            fluent.withKubeletEndpoint(instance.getKubeletEndpoint()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeDaemonEndpointsBuilder(NodeDaemonEndpoints instance,Validator validator){
            this.fluent = this; 
            this.withKubeletEndpoint(instance.getKubeletEndpoint()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeDaemonEndpoints build(){
            NodeDaemonEndpoints buildable = new NodeDaemonEndpoints(fluent.getKubeletEndpoint());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeDaemonEndpointsBuilder that = (NodeDaemonEndpointsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
