package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeAffinityBuilder extends NodeAffinityFluentImpl<NodeAffinityBuilder> implements VisitableBuilder<NodeAffinity,NodeAffinityBuilder>{

    NodeAffinityFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeAffinityBuilder(){
            this(true);
    }
    public NodeAffinityBuilder(Boolean validationEnabled){
            this(new NodeAffinity(), validationEnabled);
    }
    public NodeAffinityBuilder(NodeAffinityFluent<?> fluent){
            this(fluent, true);
    }
    public NodeAffinityBuilder(NodeAffinityFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeAffinity(), validationEnabled);
    }
    public NodeAffinityBuilder(NodeAffinityFluent<?> fluent,NodeAffinity instance){
            this(fluent, instance, true);
    }
    public NodeAffinityBuilder(NodeAffinityFluent<?> fluent,NodeAffinity instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            fluent.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeAffinityBuilder(NodeAffinity instance){
            this(instance,true);
    }
    public NodeAffinityBuilder(NodeAffinity instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeAffinityBuilder(Validator validator){
            this(new NodeAffinity(), true);
    }
    public NodeAffinityBuilder(NodeAffinityFluent<?> fluent,NodeAffinity instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            fluent.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeAffinityBuilder(NodeAffinity instance,Validator validator){
            this.fluent = this; 
            this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeAffinity build(){
            NodeAffinity buildable = new NodeAffinity(fluent.getPreferredDuringSchedulingIgnoredDuringExecution(),fluent.getRequiredDuringSchedulingIgnoredDuringExecution());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeAffinityBuilder that = (NodeAffinityBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
