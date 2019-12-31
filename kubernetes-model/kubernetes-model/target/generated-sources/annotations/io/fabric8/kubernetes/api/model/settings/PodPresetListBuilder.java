package io.fabric8.kubernetes.api.model.settings;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodPresetListBuilder extends PodPresetListFluentImpl<PodPresetListBuilder> implements VisitableBuilder<PodPresetList,PodPresetListBuilder>{

    PodPresetListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodPresetListBuilder(){
            this(true);
    }
    public PodPresetListBuilder(Boolean validationEnabled){
            this(new PodPresetList(), validationEnabled);
    }
    public PodPresetListBuilder(PodPresetListFluent<?> fluent){
            this(fluent, true);
    }
    public PodPresetListBuilder(PodPresetListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodPresetList(), validationEnabled);
    }
    public PodPresetListBuilder(PodPresetListFluent<?> fluent,PodPresetList instance){
            this(fluent, instance, true);
    }
    public PodPresetListBuilder(PodPresetListFluent<?> fluent,PodPresetList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodPresetListBuilder(PodPresetList instance){
            this(instance,true);
    }
    public PodPresetListBuilder(PodPresetList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodPresetListBuilder(Validator validator){
            this(new PodPresetList(), true);
    }
    public PodPresetListBuilder(PodPresetListFluent<?> fluent,PodPresetList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodPresetListBuilder(PodPresetList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodPresetList build(){
            PodPresetList buildable = new PodPresetList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodPresetListBuilder that = (PodPresetListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
