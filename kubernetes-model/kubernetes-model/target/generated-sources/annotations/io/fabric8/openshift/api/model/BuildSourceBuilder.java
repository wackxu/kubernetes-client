package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildSourceBuilder extends BuildSourceFluentImpl<BuildSourceBuilder> implements VisitableBuilder<BuildSource,BuildSourceBuilder>{

    BuildSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildSourceBuilder(){
            this(true);
    }
    public BuildSourceBuilder(Boolean validationEnabled){
            this(new BuildSource(), validationEnabled);
    }
    public BuildSourceBuilder(BuildSourceFluent<?> fluent){
            this(fluent, true);
    }
    public BuildSourceBuilder(BuildSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildSource(), validationEnabled);
    }
    public BuildSourceBuilder(BuildSourceFluent<?> fluent,BuildSource instance){
            this(fluent, instance, true);
    }
    public BuildSourceBuilder(BuildSourceFluent<?> fluent,BuildSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withBinary(instance.getBinary()); 
            fluent.withConfigMaps(instance.getConfigMaps()); 
            fluent.withContextDir(instance.getContextDir()); 
            fluent.withDockerfile(instance.getDockerfile()); 
            fluent.withGit(instance.getGit()); 
            fluent.withImages(instance.getImages()); 
            fluent.withSecrets(instance.getSecrets()); 
            fluent.withSourceSecret(instance.getSourceSecret()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildSourceBuilder(BuildSource instance){
            this(instance,true);
    }
    public BuildSourceBuilder(BuildSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withBinary(instance.getBinary()); 
            this.withConfigMaps(instance.getConfigMaps()); 
            this.withContextDir(instance.getContextDir()); 
            this.withDockerfile(instance.getDockerfile()); 
            this.withGit(instance.getGit()); 
            this.withImages(instance.getImages()); 
            this.withSecrets(instance.getSecrets()); 
            this.withSourceSecret(instance.getSourceSecret()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildSourceBuilder(Validator validator){
            this(new BuildSource(), true);
    }
    public BuildSourceBuilder(BuildSourceFluent<?> fluent,BuildSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withBinary(instance.getBinary()); 
            fluent.withConfigMaps(instance.getConfigMaps()); 
            fluent.withContextDir(instance.getContextDir()); 
            fluent.withDockerfile(instance.getDockerfile()); 
            fluent.withGit(instance.getGit()); 
            fluent.withImages(instance.getImages()); 
            fluent.withSecrets(instance.getSecrets()); 
            fluent.withSourceSecret(instance.getSourceSecret()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildSourceBuilder(BuildSource instance,Validator validator){
            this.fluent = this; 
            this.withBinary(instance.getBinary()); 
            this.withConfigMaps(instance.getConfigMaps()); 
            this.withContextDir(instance.getContextDir()); 
            this.withDockerfile(instance.getDockerfile()); 
            this.withGit(instance.getGit()); 
            this.withImages(instance.getImages()); 
            this.withSecrets(instance.getSecrets()); 
            this.withSourceSecret(instance.getSourceSecret()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildSource build(){
            BuildSource buildable = new BuildSource(fluent.getBinary(),fluent.getConfigMaps(),fluent.getContextDir(),fluent.getDockerfile(),fluent.getGit(),fluent.getImages(),fluent.getSecrets(),fluent.getSourceSecret(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildSourceBuilder that = (BuildSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
