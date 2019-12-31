package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DownwardAPIVolumeFileBuilder extends DownwardAPIVolumeFileFluentImpl<DownwardAPIVolumeFileBuilder> implements VisitableBuilder<DownwardAPIVolumeFile,DownwardAPIVolumeFileBuilder>{

    DownwardAPIVolumeFileFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DownwardAPIVolumeFileBuilder(){
            this(true);
    }
    public DownwardAPIVolumeFileBuilder(Boolean validationEnabled){
            this(new DownwardAPIVolumeFile(), validationEnabled);
    }
    public DownwardAPIVolumeFileBuilder(DownwardAPIVolumeFileFluent<?> fluent){
            this(fluent, true);
    }
    public DownwardAPIVolumeFileBuilder(DownwardAPIVolumeFileFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DownwardAPIVolumeFile(), validationEnabled);
    }
    public DownwardAPIVolumeFileBuilder(DownwardAPIVolumeFileFluent<?> fluent,DownwardAPIVolumeFile instance){
            this(fluent, instance, true);
    }
    public DownwardAPIVolumeFileBuilder(DownwardAPIVolumeFileFluent<?> fluent,DownwardAPIVolumeFile instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFieldRef(instance.getFieldRef()); 
            fluent.withMode(instance.getMode()); 
            fluent.withPath(instance.getPath()); 
            fluent.withResourceFieldRef(instance.getResourceFieldRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public DownwardAPIVolumeFileBuilder(DownwardAPIVolumeFile instance){
            this(instance,true);
    }
    public DownwardAPIVolumeFileBuilder(DownwardAPIVolumeFile instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFieldRef(instance.getFieldRef()); 
            this.withMode(instance.getMode()); 
            this.withPath(instance.getPath()); 
            this.withResourceFieldRef(instance.getResourceFieldRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public DownwardAPIVolumeFileBuilder(Validator validator){
            this(new DownwardAPIVolumeFile(), true);
    }
    public DownwardAPIVolumeFileBuilder(DownwardAPIVolumeFileFluent<?> fluent,DownwardAPIVolumeFile instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFieldRef(instance.getFieldRef()); 
            fluent.withMode(instance.getMode()); 
            fluent.withPath(instance.getPath()); 
            fluent.withResourceFieldRef(instance.getResourceFieldRef()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DownwardAPIVolumeFileBuilder(DownwardAPIVolumeFile instance,Validator validator){
            this.fluent = this; 
            this.withFieldRef(instance.getFieldRef()); 
            this.withMode(instance.getMode()); 
            this.withPath(instance.getPath()); 
            this.withResourceFieldRef(instance.getResourceFieldRef()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DownwardAPIVolumeFile build(){
            DownwardAPIVolumeFile buildable = new DownwardAPIVolumeFile(fluent.getFieldRef(),fluent.getMode(),fluent.getPath(),fluent.getResourceFieldRef());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DownwardAPIVolumeFileBuilder that = (DownwardAPIVolumeFileBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
