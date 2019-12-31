package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeSelectorRequirementBuilder extends NodeSelectorRequirementFluentImpl<NodeSelectorRequirementBuilder> implements VisitableBuilder<NodeSelectorRequirement,NodeSelectorRequirementBuilder>{

    NodeSelectorRequirementFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeSelectorRequirementBuilder(){
            this(true);
    }
    public NodeSelectorRequirementBuilder(Boolean validationEnabled){
            this(new NodeSelectorRequirement(), validationEnabled);
    }
    public NodeSelectorRequirementBuilder(NodeSelectorRequirementFluent<?> fluent){
            this(fluent, true);
    }
    public NodeSelectorRequirementBuilder(NodeSelectorRequirementFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeSelectorRequirement(), validationEnabled);
    }
    public NodeSelectorRequirementBuilder(NodeSelectorRequirementFluent<?> fluent,NodeSelectorRequirement instance){
            this(fluent, instance, true);
    }
    public NodeSelectorRequirementBuilder(NodeSelectorRequirementFluent<?> fluent,NodeSelectorRequirement instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withKey(instance.getKey()); 
            fluent.withOperator(instance.getOperator()); 
            fluent.withValues(instance.getValues()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeSelectorRequirementBuilder(NodeSelectorRequirement instance){
            this(instance,true);
    }
    public NodeSelectorRequirementBuilder(NodeSelectorRequirement instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withKey(instance.getKey()); 
            this.withOperator(instance.getOperator()); 
            this.withValues(instance.getValues()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeSelectorRequirementBuilder(Validator validator){
            this(new NodeSelectorRequirement(), true);
    }
    public NodeSelectorRequirementBuilder(NodeSelectorRequirementFluent<?> fluent,NodeSelectorRequirement instance,Validator validator){
            this.fluent = fluent; 
            fluent.withKey(instance.getKey()); 
            fluent.withOperator(instance.getOperator()); 
            fluent.withValues(instance.getValues()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeSelectorRequirementBuilder(NodeSelectorRequirement instance,Validator validator){
            this.fluent = this; 
            this.withKey(instance.getKey()); 
            this.withOperator(instance.getOperator()); 
            this.withValues(instance.getValues()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeSelectorRequirement build(){
            NodeSelectorRequirement buildable = new NodeSelectorRequirement(fluent.getKey(),fluent.getOperator(),fluent.getValues());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeSelectorRequirementBuilder that = (NodeSelectorRequirementBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
