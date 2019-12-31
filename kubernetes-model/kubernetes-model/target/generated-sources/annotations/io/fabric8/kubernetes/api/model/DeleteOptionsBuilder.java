package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeleteOptionsBuilder extends DeleteOptionsFluentImpl<DeleteOptionsBuilder> implements VisitableBuilder<DeleteOptions,DeleteOptionsBuilder>{

    DeleteOptionsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeleteOptionsBuilder(){
            this(true);
    }
    public DeleteOptionsBuilder(Boolean validationEnabled){
            this(new DeleteOptions(), validationEnabled);
    }
    public DeleteOptionsBuilder(DeleteOptionsFluent<?> fluent){
            this(fluent, true);
    }
    public DeleteOptionsBuilder(DeleteOptionsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeleteOptions(), validationEnabled);
    }
    public DeleteOptionsBuilder(DeleteOptionsFluent<?> fluent,DeleteOptions instance){
            this(fluent, instance, true);
    }
    public DeleteOptionsBuilder(DeleteOptionsFluent<?> fluent,DeleteOptions instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withDryRun(instance.getDryRun()); 
            fluent.withGracePeriodSeconds(instance.getGracePeriodSeconds()); 
            fluent.withKind(instance.getKind()); 
            fluent.withOrphanDependents(instance.getOrphanDependents()); 
            fluent.withPreconditions(instance.getPreconditions()); 
            fluent.withPropagationPolicy(instance.getPropagationPolicy()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeleteOptionsBuilder(DeleteOptions instance){
            this(instance,true);
    }
    public DeleteOptionsBuilder(DeleteOptions instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDryRun(instance.getDryRun()); 
            this.withGracePeriodSeconds(instance.getGracePeriodSeconds()); 
            this.withKind(instance.getKind()); 
            this.withOrphanDependents(instance.getOrphanDependents()); 
            this.withPreconditions(instance.getPreconditions()); 
            this.withPropagationPolicy(instance.getPropagationPolicy()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeleteOptionsBuilder(Validator validator){
            this(new DeleteOptions(), true);
    }
    public DeleteOptionsBuilder(DeleteOptionsFluent<?> fluent,DeleteOptions instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withDryRun(instance.getDryRun()); 
            fluent.withGracePeriodSeconds(instance.getGracePeriodSeconds()); 
            fluent.withKind(instance.getKind()); 
            fluent.withOrphanDependents(instance.getOrphanDependents()); 
            fluent.withPreconditions(instance.getPreconditions()); 
            fluent.withPropagationPolicy(instance.getPropagationPolicy()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeleteOptionsBuilder(DeleteOptions instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDryRun(instance.getDryRun()); 
            this.withGracePeriodSeconds(instance.getGracePeriodSeconds()); 
            this.withKind(instance.getKind()); 
            this.withOrphanDependents(instance.getOrphanDependents()); 
            this.withPreconditions(instance.getPreconditions()); 
            this.withPropagationPolicy(instance.getPropagationPolicy()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeleteOptions build(){
            DeleteOptions buildable = new DeleteOptions(fluent.getApiVersion(),fluent.getDryRun(),fluent.getGracePeriodSeconds(),fluent.getKind(),fluent.isOrphanDependents(),fluent.getPreconditions(),fluent.getPropagationPolicy());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeleteOptionsBuilder that = (DeleteOptionsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
