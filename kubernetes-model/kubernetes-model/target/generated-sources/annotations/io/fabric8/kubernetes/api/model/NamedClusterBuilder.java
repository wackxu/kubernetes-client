package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NamedClusterBuilder extends NamedClusterFluentImpl<NamedClusterBuilder> implements VisitableBuilder<NamedCluster,NamedClusterBuilder>{

    NamedClusterFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NamedClusterBuilder(){
            this(true);
    }
    public NamedClusterBuilder(Boolean validationEnabled){
            this(new NamedCluster(), validationEnabled);
    }
    public NamedClusterBuilder(NamedClusterFluent<?> fluent){
            this(fluent, true);
    }
    public NamedClusterBuilder(NamedClusterFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NamedCluster(), validationEnabled);
    }
    public NamedClusterBuilder(NamedClusterFluent<?> fluent,NamedCluster instance){
            this(fluent, instance, true);
    }
    public NamedClusterBuilder(NamedClusterFluent<?> fluent,NamedCluster instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCluster(instance.getCluster()); 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamedClusterBuilder(NamedCluster instance){
            this(instance,true);
    }
    public NamedClusterBuilder(NamedCluster instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCluster(instance.getCluster()); 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public NamedClusterBuilder(Validator validator){
            this(new NamedCluster(), true);
    }
    public NamedClusterBuilder(NamedClusterFluent<?> fluent,NamedCluster instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCluster(instance.getCluster()); 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NamedClusterBuilder(NamedCluster instance,Validator validator){
            this.fluent = this; 
            this.withCluster(instance.getCluster()); 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NamedCluster build(){
            NamedCluster buildable = new NamedCluster(fluent.getCluster(),fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamedClusterBuilder that = (NamedClusterBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
