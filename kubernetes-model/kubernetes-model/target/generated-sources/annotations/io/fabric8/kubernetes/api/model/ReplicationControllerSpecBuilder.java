package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ReplicationControllerSpecBuilder extends ReplicationControllerSpecFluentImpl<ReplicationControllerSpecBuilder> implements VisitableBuilder<ReplicationControllerSpec,ReplicationControllerSpecBuilder>{

    ReplicationControllerSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ReplicationControllerSpecBuilder(){
            this(true);
    }
    public ReplicationControllerSpecBuilder(Boolean validationEnabled){
            this(new ReplicationControllerSpec(), validationEnabled);
    }
    public ReplicationControllerSpecBuilder(ReplicationControllerSpecFluent<?> fluent){
            this(fluent, true);
    }
    public ReplicationControllerSpecBuilder(ReplicationControllerSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ReplicationControllerSpec(), validationEnabled);
    }
    public ReplicationControllerSpecBuilder(ReplicationControllerSpecFluent<?> fluent,ReplicationControllerSpec instance){
            this(fluent, instance, true);
    }
    public ReplicationControllerSpecBuilder(ReplicationControllerSpecFluent<?> fluent,ReplicationControllerSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMinReadySeconds(instance.getMinReadySeconds()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTemplate(instance.getTemplate()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicationControllerSpecBuilder(ReplicationControllerSpec instance){
            this(instance,true);
    }
    public ReplicationControllerSpecBuilder(ReplicationControllerSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withReplicas(instance.getReplicas()); 
            this.withSelector(instance.getSelector()); 
            this.withTemplate(instance.getTemplate()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicationControllerSpecBuilder(Validator validator){
            this(new ReplicationControllerSpec(), true);
    }
    public ReplicationControllerSpecBuilder(ReplicationControllerSpecFluent<?> fluent,ReplicationControllerSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMinReadySeconds(instance.getMinReadySeconds()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTemplate(instance.getTemplate()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ReplicationControllerSpecBuilder(ReplicationControllerSpec instance,Validator validator){
            this.fluent = this; 
            this.withMinReadySeconds(instance.getMinReadySeconds()); 
            this.withReplicas(instance.getReplicas()); 
            this.withSelector(instance.getSelector()); 
            this.withTemplate(instance.getTemplate()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ReplicationControllerSpec build(){
            ReplicationControllerSpec buildable = new ReplicationControllerSpec(fluent.getMinReadySeconds(),fluent.getReplicas(),fluent.getSelector(),fluent.getTemplate());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicationControllerSpecBuilder that = (ReplicationControllerSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
