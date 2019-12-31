package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NamespaceStatusBuilder extends NamespaceStatusFluentImpl<NamespaceStatusBuilder> implements VisitableBuilder<NamespaceStatus,NamespaceStatusBuilder>{

    NamespaceStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NamespaceStatusBuilder(){
            this(true);
    }
    public NamespaceStatusBuilder(Boolean validationEnabled){
            this(new NamespaceStatus(), validationEnabled);
    }
    public NamespaceStatusBuilder(NamespaceStatusFluent<?> fluent){
            this(fluent, true);
    }
    public NamespaceStatusBuilder(NamespaceStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NamespaceStatus(), validationEnabled);
    }
    public NamespaceStatusBuilder(NamespaceStatusFluent<?> fluent,NamespaceStatus instance){
            this(fluent, instance, true);
    }
    public NamespaceStatusBuilder(NamespaceStatusFluent<?> fluent,NamespaceStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPhase(instance.getPhase()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamespaceStatusBuilder(NamespaceStatus instance){
            this(instance,true);
    }
    public NamespaceStatusBuilder(NamespaceStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPhase(instance.getPhase()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamespaceStatusBuilder(Validator validator){
            this(new NamespaceStatus(), true);
    }
    public NamespaceStatusBuilder(NamespaceStatusFluent<?> fluent,NamespaceStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPhase(instance.getPhase()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NamespaceStatusBuilder(NamespaceStatus instance,Validator validator){
            this.fluent = this; 
            this.withPhase(instance.getPhase()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NamespaceStatus build(){
            NamespaceStatus buildable = new NamespaceStatus(fluent.getPhase());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamespaceStatusBuilder that = (NamespaceStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
