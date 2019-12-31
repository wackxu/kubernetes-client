package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PatchBuilder extends PatchFluentImpl<PatchBuilder> implements VisitableBuilder<Patch,PatchBuilder>{

    PatchFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PatchBuilder(){
            this(true);
    }
    public PatchBuilder(Boolean validationEnabled){
            this(new Patch(), validationEnabled);
    }
    public PatchBuilder(PatchFluent<?> fluent){
            this(fluent, true);
    }
    public PatchBuilder(PatchFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Patch(), validationEnabled);
    }
    public PatchBuilder(PatchFluent<?> fluent,Patch instance){
            this(fluent, instance, true);
    }
    public PatchBuilder(PatchFluent<?> fluent,Patch instance,Boolean validationEnabled){
            this.fluent = fluent; 
            this.validationEnabled = validationEnabled; 
    }
    public PatchBuilder(Patch instance){
            this(instance,true);
    }
    public PatchBuilder(Patch instance,Boolean validationEnabled){
            this.fluent = this; 
            this.validationEnabled = validationEnabled; 
    }
    public PatchBuilder(Validator validator){
            this(new Patch(), true);
    }
    public PatchBuilder(PatchFluent<?> fluent,Patch instance,Validator validator){
            this.fluent = fluent; 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PatchBuilder(Patch instance,Validator validator){
            this.fluent = this; 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Patch build(){
            Patch buildable = new Patch();
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PatchBuilder that = (PatchBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
