package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RuleWithOperationsBuilder extends RuleWithOperationsFluentImpl<RuleWithOperationsBuilder> implements VisitableBuilder<RuleWithOperations,RuleWithOperationsBuilder>{

    RuleWithOperationsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RuleWithOperationsBuilder(){
            this(true);
    }
    public RuleWithOperationsBuilder(Boolean validationEnabled){
            this(new RuleWithOperations(), validationEnabled);
    }
    public RuleWithOperationsBuilder(RuleWithOperationsFluent<?> fluent){
            this(fluent, true);
    }
    public RuleWithOperationsBuilder(RuleWithOperationsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RuleWithOperations(), validationEnabled);
    }
    public RuleWithOperationsBuilder(RuleWithOperationsFluent<?> fluent,RuleWithOperations instance){
            this(fluent, instance, true);
    }
    public RuleWithOperationsBuilder(RuleWithOperationsFluent<?> fluent,RuleWithOperations instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiGroups(instance.getApiGroups()); 
            fluent.withApiVersions(instance.getApiVersions()); 
            fluent.withOperations(instance.getOperations()); 
            fluent.withResources(instance.getResources()); 
            this.validationEnabled = validationEnabled; 
    }
    public RuleWithOperationsBuilder(RuleWithOperations instance){
            this(instance,true);
    }
    public RuleWithOperationsBuilder(RuleWithOperations instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiGroups(instance.getApiGroups()); 
            this.withApiVersions(instance.getApiVersions()); 
            this.withOperations(instance.getOperations()); 
            this.withResources(instance.getResources()); 
            this.validationEnabled = validationEnabled; 
    }
    public RuleWithOperationsBuilder(Validator validator){
            this(new RuleWithOperations(), true);
    }
    public RuleWithOperationsBuilder(RuleWithOperationsFluent<?> fluent,RuleWithOperations instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiGroups(instance.getApiGroups()); 
            fluent.withApiVersions(instance.getApiVersions()); 
            fluent.withOperations(instance.getOperations()); 
            fluent.withResources(instance.getResources()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RuleWithOperationsBuilder(RuleWithOperations instance,Validator validator){
            this.fluent = this; 
            this.withApiGroups(instance.getApiGroups()); 
            this.withApiVersions(instance.getApiVersions()); 
            this.withOperations(instance.getOperations()); 
            this.withResources(instance.getResources()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RuleWithOperations build(){
            RuleWithOperations buildable = new RuleWithOperations(fluent.getApiGroups(),fluent.getApiVersions(),fluent.getOperations(),fluent.getResources());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RuleWithOperationsBuilder that = (RuleWithOperationsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
