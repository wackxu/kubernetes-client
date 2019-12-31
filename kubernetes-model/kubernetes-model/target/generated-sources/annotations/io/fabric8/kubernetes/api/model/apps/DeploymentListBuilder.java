package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentListBuilder extends DeploymentListFluentImpl<DeploymentListBuilder> implements VisitableBuilder<DeploymentList,DeploymentListBuilder>{

    DeploymentListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentListBuilder(){
            this(true);
    }
    public DeploymentListBuilder(Boolean validationEnabled){
            this(new DeploymentList(), validationEnabled);
    }
    public DeploymentListBuilder(DeploymentListFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentListBuilder(DeploymentListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentList(), validationEnabled);
    }
    public DeploymentListBuilder(DeploymentListFluent<?> fluent,DeploymentList instance){
            this(fluent, instance, true);
    }
    public DeploymentListBuilder(DeploymentListFluent<?> fluent,DeploymentList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentListBuilder(DeploymentList instance){
            this(instance,true);
    }
    public DeploymentListBuilder(DeploymentList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentListBuilder(Validator validator){
            this(new DeploymentList(), true);
    }
    public DeploymentListBuilder(DeploymentListFluent<?> fluent,DeploymentList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentListBuilder(DeploymentList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentList build(){
            DeploymentList buildable = new DeploymentList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentListBuilder that = (DeploymentListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
