package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildConfigListBuilder extends BuildConfigListFluentImpl<BuildConfigListBuilder> implements VisitableBuilder<BuildConfigList,BuildConfigListBuilder>{

    BuildConfigListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildConfigListBuilder(){
            this(true);
    }
    public BuildConfigListBuilder(Boolean validationEnabled){
            this(new BuildConfigList(), validationEnabled);
    }
    public BuildConfigListBuilder(BuildConfigListFluent<?> fluent){
            this(fluent, true);
    }
    public BuildConfigListBuilder(BuildConfigListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildConfigList(), validationEnabled);
    }
    public BuildConfigListBuilder(BuildConfigListFluent<?> fluent,BuildConfigList instance){
            this(fluent, instance, true);
    }
    public BuildConfigListBuilder(BuildConfigListFluent<?> fluent,BuildConfigList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildConfigListBuilder(BuildConfigList instance){
            this(instance,true);
    }
    public BuildConfigListBuilder(BuildConfigList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildConfigListBuilder(Validator validator){
            this(new BuildConfigList(), true);
    }
    public BuildConfigListBuilder(BuildConfigListFluent<?> fluent,BuildConfigList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildConfigListBuilder(BuildConfigList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildConfigList build(){
            BuildConfigList buildable = new BuildConfigList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildConfigListBuilder that = (BuildConfigListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
