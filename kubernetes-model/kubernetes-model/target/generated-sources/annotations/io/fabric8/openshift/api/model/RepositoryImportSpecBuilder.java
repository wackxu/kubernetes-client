package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RepositoryImportSpecBuilder extends RepositoryImportSpecFluentImpl<RepositoryImportSpecBuilder> implements VisitableBuilder<RepositoryImportSpec,RepositoryImportSpecBuilder>{

    RepositoryImportSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RepositoryImportSpecBuilder(){
            this(true);
    }
    public RepositoryImportSpecBuilder(Boolean validationEnabled){
            this(new RepositoryImportSpec(), validationEnabled);
    }
    public RepositoryImportSpecBuilder(RepositoryImportSpecFluent<?> fluent){
            this(fluent, true);
    }
    public RepositoryImportSpecBuilder(RepositoryImportSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RepositoryImportSpec(), validationEnabled);
    }
    public RepositoryImportSpecBuilder(RepositoryImportSpecFluent<?> fluent,RepositoryImportSpec instance){
            this(fluent, instance, true);
    }
    public RepositoryImportSpecBuilder(RepositoryImportSpecFluent<?> fluent,RepositoryImportSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFrom(instance.getFrom()); 
            fluent.withImportPolicy(instance.getImportPolicy()); 
            fluent.withIncludeManifest(instance.getIncludeManifest()); 
            fluent.withReferencePolicy(instance.getReferencePolicy()); 
            this.validationEnabled = validationEnabled; 
    }
    public RepositoryImportSpecBuilder(RepositoryImportSpec instance){
            this(instance,true);
    }
    public RepositoryImportSpecBuilder(RepositoryImportSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFrom(instance.getFrom()); 
            this.withImportPolicy(instance.getImportPolicy()); 
            this.withIncludeManifest(instance.getIncludeManifest()); 
            this.withReferencePolicy(instance.getReferencePolicy()); 
            this.validationEnabled = validationEnabled; 
    }
    public RepositoryImportSpecBuilder(Validator validator){
            this(new RepositoryImportSpec(), true);
    }
    public RepositoryImportSpecBuilder(RepositoryImportSpecFluent<?> fluent,RepositoryImportSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFrom(instance.getFrom()); 
            fluent.withImportPolicy(instance.getImportPolicy()); 
            fluent.withIncludeManifest(instance.getIncludeManifest()); 
            fluent.withReferencePolicy(instance.getReferencePolicy()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RepositoryImportSpecBuilder(RepositoryImportSpec instance,Validator validator){
            this.fluent = this; 
            this.withFrom(instance.getFrom()); 
            this.withImportPolicy(instance.getImportPolicy()); 
            this.withIncludeManifest(instance.getIncludeManifest()); 
            this.withReferencePolicy(instance.getReferencePolicy()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RepositoryImportSpec build(){
            RepositoryImportSpec buildable = new RepositoryImportSpec(fluent.getFrom(),fluent.getImportPolicy(),fluent.isIncludeManifest(),fluent.getReferencePolicy());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RepositoryImportSpecBuilder that = (RepositoryImportSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
