package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SourceRevisionBuilder extends SourceRevisionFluentImpl<SourceRevisionBuilder> implements VisitableBuilder<SourceRevision,SourceRevisionBuilder>{

    SourceRevisionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SourceRevisionBuilder(){
            this(true);
    }
    public SourceRevisionBuilder(Boolean validationEnabled){
            this(new SourceRevision(), validationEnabled);
    }
    public SourceRevisionBuilder(SourceRevisionFluent<?> fluent){
            this(fluent, true);
    }
    public SourceRevisionBuilder(SourceRevisionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SourceRevision(), validationEnabled);
    }
    public SourceRevisionBuilder(SourceRevisionFluent<?> fluent,SourceRevision instance){
            this(fluent, instance, true);
    }
    public SourceRevisionBuilder(SourceRevisionFluent<?> fluent,SourceRevision instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withGit(instance.getGit()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public SourceRevisionBuilder(SourceRevision instance){
            this(instance,true);
    }
    public SourceRevisionBuilder(SourceRevision instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withGit(instance.getGit()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public SourceRevisionBuilder(Validator validator){
            this(new SourceRevision(), true);
    }
    public SourceRevisionBuilder(SourceRevisionFluent<?> fluent,SourceRevision instance,Validator validator){
            this.fluent = fluent; 
            fluent.withGit(instance.getGit()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SourceRevisionBuilder(SourceRevision instance,Validator validator){
            this.fluent = this; 
            this.withGit(instance.getGit()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SourceRevision build(){
            SourceRevision buildable = new SourceRevision(fluent.getGit(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SourceRevisionBuilder that = (SourceRevisionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
