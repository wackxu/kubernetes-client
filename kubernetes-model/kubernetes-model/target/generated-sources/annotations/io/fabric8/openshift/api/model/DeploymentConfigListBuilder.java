package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentConfigListBuilder extends DeploymentConfigListFluentImpl<DeploymentConfigListBuilder> implements VisitableBuilder<DeploymentConfigList,DeploymentConfigListBuilder>{

    DeploymentConfigListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentConfigListBuilder(){
            this(true);
    }
    public DeploymentConfigListBuilder(Boolean validationEnabled){
            this(new DeploymentConfigList(), validationEnabled);
    }
    public DeploymentConfigListBuilder(DeploymentConfigListFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentConfigListBuilder(DeploymentConfigListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentConfigList(), validationEnabled);
    }
    public DeploymentConfigListBuilder(DeploymentConfigListFluent<?> fluent,DeploymentConfigList instance){
            this(fluent, instance, true);
    }
    public DeploymentConfigListBuilder(DeploymentConfigListFluent<?> fluent,DeploymentConfigList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentConfigListBuilder(DeploymentConfigList instance){
            this(instance,true);
    }
    public DeploymentConfigListBuilder(DeploymentConfigList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentConfigListBuilder(Validator validator){
            this(new DeploymentConfigList(), true);
    }
    public DeploymentConfigListBuilder(DeploymentConfigListFluent<?> fluent,DeploymentConfigList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentConfigListBuilder(DeploymentConfigList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentConfigList build(){
            DeploymentConfigList buildable = new DeploymentConfigList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentConfigListBuilder that = (DeploymentConfigListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
