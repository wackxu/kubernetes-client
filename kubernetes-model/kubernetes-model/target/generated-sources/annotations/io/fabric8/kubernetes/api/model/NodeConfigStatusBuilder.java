package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeConfigStatusBuilder extends NodeConfigStatusFluentImpl<NodeConfigStatusBuilder> implements VisitableBuilder<NodeConfigStatus,NodeConfigStatusBuilder>{

    NodeConfigStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeConfigStatusBuilder(){
            this(true);
    }
    public NodeConfigStatusBuilder(Boolean validationEnabled){
            this(new NodeConfigStatus(), validationEnabled);
    }
    public NodeConfigStatusBuilder(NodeConfigStatusFluent<?> fluent){
            this(fluent, true);
    }
    public NodeConfigStatusBuilder(NodeConfigStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeConfigStatus(), validationEnabled);
    }
    public NodeConfigStatusBuilder(NodeConfigStatusFluent<?> fluent,NodeConfigStatus instance){
            this(fluent, instance, true);
    }
    public NodeConfigStatusBuilder(NodeConfigStatusFluent<?> fluent,NodeConfigStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withActive(instance.getActive()); 
            fluent.withAssigned(instance.getAssigned()); 
            fluent.withError(instance.getError()); 
            fluent.withLastKnownGood(instance.getLastKnownGood()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeConfigStatusBuilder(NodeConfigStatus instance){
            this(instance,true);
    }
    public NodeConfigStatusBuilder(NodeConfigStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withActive(instance.getActive()); 
            this.withAssigned(instance.getAssigned()); 
            this.withError(instance.getError()); 
            this.withLastKnownGood(instance.getLastKnownGood()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeConfigStatusBuilder(Validator validator){
            this(new NodeConfigStatus(), true);
    }
    public NodeConfigStatusBuilder(NodeConfigStatusFluent<?> fluent,NodeConfigStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withActive(instance.getActive()); 
            fluent.withAssigned(instance.getAssigned()); 
            fluent.withError(instance.getError()); 
            fluent.withLastKnownGood(instance.getLastKnownGood()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeConfigStatusBuilder(NodeConfigStatus instance,Validator validator){
            this.fluent = this; 
            this.withActive(instance.getActive()); 
            this.withAssigned(instance.getAssigned()); 
            this.withError(instance.getError()); 
            this.withLastKnownGood(instance.getLastKnownGood()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeConfigStatus build(){
            NodeConfigStatus buildable = new NodeConfigStatus(fluent.getActive(),fluent.getAssigned(),fluent.getError(),fluent.getLastKnownGood());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeConfigStatusBuilder that = (NodeConfigStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
