package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildListBuilder extends BuildListFluentImpl<BuildListBuilder> implements VisitableBuilder<BuildList,BuildListBuilder>{

    BuildListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildListBuilder(){
            this(true);
    }
    public BuildListBuilder(Boolean validationEnabled){
            this(new BuildList(), validationEnabled);
    }
    public BuildListBuilder(BuildListFluent<?> fluent){
            this(fluent, true);
    }
    public BuildListBuilder(BuildListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildList(), validationEnabled);
    }
    public BuildListBuilder(BuildListFluent<?> fluent,BuildList instance){
            this(fluent, instance, true);
    }
    public BuildListBuilder(BuildListFluent<?> fluent,BuildList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildListBuilder(BuildList instance){
            this(instance,true);
    }
    public BuildListBuilder(BuildList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildListBuilder(Validator validator){
            this(new BuildList(), true);
    }
    public BuildListBuilder(BuildListFluent<?> fluent,BuildList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildListBuilder(BuildList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildList build(){
            BuildList buildable = new BuildList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildListBuilder that = (BuildListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
