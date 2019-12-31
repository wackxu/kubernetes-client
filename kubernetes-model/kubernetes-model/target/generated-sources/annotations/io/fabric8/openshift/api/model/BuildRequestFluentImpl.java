package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.EnvVar;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.EnvVarBuilder;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.EnvVarFluentImpl;

public class BuildRequestFluentImpl<A extends BuildRequestFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildRequestFluent<A>{

    private String apiVersion;
    private BinaryBuildSourceBuilder binary;
    private DockerStrategyOptionsBuilder dockerStrategyOptions;
    private List<EnvVarBuilder> env;
    private ObjectReferenceBuilder from;
    private String kind;
    private Long lastVersion;
    private ObjectMetaBuilder metadata;
    private SourceRevisionBuilder revision;
    private SourceStrategyOptionsBuilder sourceStrategyOptions;
    private List<BuildTriggerCauseBuilder> triggeredBy;
    private ObjectReferenceBuilder triggeredByImage;

    public BuildRequestFluentImpl(){
    }
    public BuildRequestFluentImpl(BuildRequest instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withBinary(instance.getBinary()); 
            this.withDockerStrategyOptions(instance.getDockerStrategyOptions()); 
            this.withEnv(instance.getEnv()); 
            this.withFrom(instance.getFrom()); 
            this.withKind(instance.getKind()); 
            this.withLastVersion(instance.getLastVersion()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRevision(instance.getRevision()); 
            this.withSourceStrategyOptions(instance.getSourceStrategyOptions()); 
            this.withTriggeredBy(instance.getTriggeredBy()); 
            this.withTriggeredByImage(instance.getTriggeredByImage()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    
/**
 * This method has been deprecated, please use method buildBinary instead.
 * @return The buildable object.
 */
@Deprecated public BinaryBuildSource getBinary(){
            return this.binary!=null?this.binary.build():null;
    }

    public BinaryBuildSource buildBinary(){
            return this.binary!=null?this.binary.build():null;
    }

    public A withBinary(BinaryBuildSource binary){
            _visitables.remove(this.binary);
            if (binary!=null){ this.binary= new BinaryBuildSourceBuilder(binary); _visitables.add(this.binary);} return (A) this;
    }

    public Boolean hasBinary(){
            return this.binary != null;
    }

    public A withNewBinary(String asFile){
            return (A)withBinary(new BinaryBuildSource(asFile));
    }

    public BuildRequestFluent.BinaryNested<A> withNewBinary(){
            return new BinaryNestedImpl();
    }

    public BuildRequestFluent.BinaryNested<A> withNewBinaryLike(BinaryBuildSource item){
            return new BinaryNestedImpl(item);
    }

    public BuildRequestFluent.BinaryNested<A> editBinary(){
            return withNewBinaryLike(getBinary());
    }

    public BuildRequestFluent.BinaryNested<A> editOrNewBinary(){
            return withNewBinaryLike(getBinary() != null ? getBinary(): new BinaryBuildSourceBuilder().build());
    }

    public BuildRequestFluent.BinaryNested<A> editOrNewBinaryLike(BinaryBuildSource item){
            return withNewBinaryLike(getBinary() != null ? getBinary(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDockerStrategyOptions instead.
 * @return The buildable object.
 */
@Deprecated public DockerStrategyOptions getDockerStrategyOptions(){
            return this.dockerStrategyOptions!=null?this.dockerStrategyOptions.build():null;
    }

    public DockerStrategyOptions buildDockerStrategyOptions(){
            return this.dockerStrategyOptions!=null?this.dockerStrategyOptions.build():null;
    }

    public A withDockerStrategyOptions(DockerStrategyOptions dockerStrategyOptions){
            _visitables.remove(this.dockerStrategyOptions);
            if (dockerStrategyOptions!=null){ this.dockerStrategyOptions= new DockerStrategyOptionsBuilder(dockerStrategyOptions); _visitables.add(this.dockerStrategyOptions);} return (A) this;
    }

    public Boolean hasDockerStrategyOptions(){
            return this.dockerStrategyOptions != null;
    }

    public BuildRequestFluent.DockerStrategyOptionsNested<A> withNewDockerStrategyOptions(){
            return new DockerStrategyOptionsNestedImpl();
    }

    public BuildRequestFluent.DockerStrategyOptionsNested<A> withNewDockerStrategyOptionsLike(DockerStrategyOptions item){
            return new DockerStrategyOptionsNestedImpl(item);
    }

    public BuildRequestFluent.DockerStrategyOptionsNested<A> editDockerStrategyOptions(){
            return withNewDockerStrategyOptionsLike(getDockerStrategyOptions());
    }

    public BuildRequestFluent.DockerStrategyOptionsNested<A> editOrNewDockerStrategyOptions(){
            return withNewDockerStrategyOptionsLike(getDockerStrategyOptions() != null ? getDockerStrategyOptions(): new DockerStrategyOptionsBuilder().build());
    }

    public BuildRequestFluent.DockerStrategyOptionsNested<A> editOrNewDockerStrategyOptionsLike(DockerStrategyOptions item){
            return withNewDockerStrategyOptionsLike(getDockerStrategyOptions() != null ? getDockerStrategyOptions(): item);
    }

    public A addToEnv(int index,EnvVar item){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.env.add(index >= 0 ? index : env.size(), builder); return (A)this;
    }

    public A setToEnv(int index,EnvVar item){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= env.size()) { env.add(builder); } else { env.set(index, builder);}
             return (A)this;
    }

    public A addToEnv(EnvVar... items){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.env.add(builder);} return (A)this;
    }

    public A addAllToEnv(Collection<EnvVar> items){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.env.add(builder);} return (A)this;
    }

    public A removeFromEnv(EnvVar... items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
    }

    public A removeAllFromEnv(Collection<EnvVar> items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildEnv instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getEnv(){
            return build(env);
    }

    public List<EnvVar> buildEnv(){
            return build(env);
    }

    public EnvVar buildEnv(int index){
            return this.env.get(index).build();
    }

    public EnvVar buildFirstEnv(){
            return this.env.get(0).build();
    }

    public EnvVar buildLastEnv(){
            return this.env.get(env.size() - 1).build();
    }

    public EnvVar buildMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            for (EnvVarBuilder item: env) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withEnv(List<EnvVar> env){
            if (this.env != null) { _visitables.removeAll(this.env);}
            if (env != null) {this.env = new ArrayList<EnvVarBuilder>(); for (EnvVar item : env){this.addToEnv(item);}} else { this.env = new ArrayList<EnvVarBuilder>();} return (A) this;
    }

    public A withEnv(EnvVar... env){
            if (this.env != null) {this.env.clear();}
            if (env != null) {for (EnvVar item :env){ this.addToEnv(item);}} return (A) this;
    }

    public Boolean hasEnv(){
            return env != null && !env.isEmpty();
    }

    public BuildRequestFluent.EnvNested<A> addNewEnv(){
            return new EnvNestedImpl();
    }

    public BuildRequestFluent.EnvNested<A> addNewEnvLike(EnvVar item){
            return new EnvNestedImpl(-1, item);
    }

    public BuildRequestFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item){
            return new EnvNestedImpl(index, item);
    }

    public BuildRequestFluent.EnvNested<A> editEnv(int index){
            if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public BuildRequestFluent.EnvNested<A> editFirstEnv(){
            if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
            return setNewEnvLike(0, buildEnv(0));
    }

    public BuildRequestFluent.EnvNested<A> editLastEnv(){
            int index = env.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public BuildRequestFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            int index = -1;
            for (int i=0;i<env.size();i++) { 
            if (predicate.apply(env.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
            return setNewEnvLike(index, buildEnv(index));
    }

    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom(){
            return this.from!=null?this.from.build():null;
    }

    public ObjectReference buildFrom(){
            return this.from!=null?this.from.build():null;
    }

    public A withFrom(ObjectReference from){
            _visitables.remove(this.from);
            if (from!=null){ this.from= new ObjectReferenceBuilder(from); _visitables.add(this.from);} return (A) this;
    }

    public Boolean hasFrom(){
            return this.from != null;
    }

    public BuildRequestFluent.FromNested<A> withNewFrom(){
            return new FromNestedImpl();
    }

    public BuildRequestFluent.FromNested<A> withNewFromLike(ObjectReference item){
            return new FromNestedImpl(item);
    }

    public BuildRequestFluent.FromNested<A> editFrom(){
            return withNewFromLike(getFrom());
    }

    public BuildRequestFluent.FromNested<A> editOrNewFrom(){
            return withNewFromLike(getFrom() != null ? getFrom(): new ObjectReferenceBuilder().build());
    }

    public BuildRequestFluent.FromNested<A> editOrNewFromLike(ObjectReference item){
            return withNewFromLike(getFrom() != null ? getFrom(): item);
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    public Long getLastVersion(){
            return this.lastVersion;
    }

    public A withLastVersion(Long lastVersion){
            this.lastVersion=lastVersion; return (A) this;
    }

    public Boolean hasLastVersion(){
            return this.lastVersion != null;
    }

    public A withNewLastVersion(String arg1){
            return (A)withLastVersion(new Long(arg1));
    }

    public A withNewLastVersion(long arg1){
            return (A)withLastVersion(new Long(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ObjectMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ObjectMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public BuildRequestFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public BuildRequestFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public BuildRequestFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public BuildRequestFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public BuildRequestFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRevision instead.
 * @return The buildable object.
 */
@Deprecated public SourceRevision getRevision(){
            return this.revision!=null?this.revision.build():null;
    }

    public SourceRevision buildRevision(){
            return this.revision!=null?this.revision.build():null;
    }

    public A withRevision(SourceRevision revision){
            _visitables.remove(this.revision);
            if (revision!=null){ this.revision= new SourceRevisionBuilder(revision); _visitables.add(this.revision);} return (A) this;
    }

    public Boolean hasRevision(){
            return this.revision != null;
    }

    public BuildRequestFluent.RevisionNested<A> withNewRevision(){
            return new RevisionNestedImpl();
    }

    public BuildRequestFluent.RevisionNested<A> withNewRevisionLike(SourceRevision item){
            return new RevisionNestedImpl(item);
    }

    public BuildRequestFluent.RevisionNested<A> editRevision(){
            return withNewRevisionLike(getRevision());
    }

    public BuildRequestFluent.RevisionNested<A> editOrNewRevision(){
            return withNewRevisionLike(getRevision() != null ? getRevision(): new SourceRevisionBuilder().build());
    }

    public BuildRequestFluent.RevisionNested<A> editOrNewRevisionLike(SourceRevision item){
            return withNewRevisionLike(getRevision() != null ? getRevision(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSourceStrategyOptions instead.
 * @return The buildable object.
 */
@Deprecated public SourceStrategyOptions getSourceStrategyOptions(){
            return this.sourceStrategyOptions!=null?this.sourceStrategyOptions.build():null;
    }

    public SourceStrategyOptions buildSourceStrategyOptions(){
            return this.sourceStrategyOptions!=null?this.sourceStrategyOptions.build():null;
    }

    public A withSourceStrategyOptions(SourceStrategyOptions sourceStrategyOptions){
            _visitables.remove(this.sourceStrategyOptions);
            if (sourceStrategyOptions!=null){ this.sourceStrategyOptions= new SourceStrategyOptionsBuilder(sourceStrategyOptions); _visitables.add(this.sourceStrategyOptions);} return (A) this;
    }

    public Boolean hasSourceStrategyOptions(){
            return this.sourceStrategyOptions != null;
    }

    public A withNewSourceStrategyOptions(Boolean incremental){
            return (A)withSourceStrategyOptions(new SourceStrategyOptions(incremental));
    }

    public BuildRequestFluent.SourceStrategyOptionsNested<A> withNewSourceStrategyOptions(){
            return new SourceStrategyOptionsNestedImpl();
    }

    public BuildRequestFluent.SourceStrategyOptionsNested<A> withNewSourceStrategyOptionsLike(SourceStrategyOptions item){
            return new SourceStrategyOptionsNestedImpl(item);
    }

    public BuildRequestFluent.SourceStrategyOptionsNested<A> editSourceStrategyOptions(){
            return withNewSourceStrategyOptionsLike(getSourceStrategyOptions());
    }

    public BuildRequestFluent.SourceStrategyOptionsNested<A> editOrNewSourceStrategyOptions(){
            return withNewSourceStrategyOptionsLike(getSourceStrategyOptions() != null ? getSourceStrategyOptions(): new SourceStrategyOptionsBuilder().build());
    }

    public BuildRequestFluent.SourceStrategyOptionsNested<A> editOrNewSourceStrategyOptionsLike(SourceStrategyOptions item){
            return withNewSourceStrategyOptionsLike(getSourceStrategyOptions() != null ? getSourceStrategyOptions(): item);
    }

    public A addToTriggeredBy(int index,BuildTriggerCause item){
            if (this.triggeredBy == null) {this.triggeredBy = new ArrayList<BuildTriggerCauseBuilder>();}
            BuildTriggerCauseBuilder builder = new BuildTriggerCauseBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.triggeredBy.add(index >= 0 ? index : triggeredBy.size(), builder); return (A)this;
    }

    public A setToTriggeredBy(int index,BuildTriggerCause item){
            if (this.triggeredBy == null) {this.triggeredBy = new ArrayList<BuildTriggerCauseBuilder>();}
            BuildTriggerCauseBuilder builder = new BuildTriggerCauseBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= triggeredBy.size()) { triggeredBy.add(builder); } else { triggeredBy.set(index, builder);}
             return (A)this;
    }

    public A addToTriggeredBy(BuildTriggerCause... items){
            if (this.triggeredBy == null) {this.triggeredBy = new ArrayList<BuildTriggerCauseBuilder>();}
            for (BuildTriggerCause item : items) {BuildTriggerCauseBuilder builder = new BuildTriggerCauseBuilder(item);_visitables.add(builder);this.triggeredBy.add(builder);} return (A)this;
    }

    public A addAllToTriggeredBy(Collection<BuildTriggerCause> items){
            if (this.triggeredBy == null) {this.triggeredBy = new ArrayList<BuildTriggerCauseBuilder>();}
            for (BuildTriggerCause item : items) {BuildTriggerCauseBuilder builder = new BuildTriggerCauseBuilder(item);_visitables.add(builder);this.triggeredBy.add(builder);} return (A)this;
    }

    public A removeFromTriggeredBy(BuildTriggerCause... items){
            for (BuildTriggerCause item : items) {BuildTriggerCauseBuilder builder = new BuildTriggerCauseBuilder(item);_visitables.remove(builder);if (this.triggeredBy != null) {this.triggeredBy.remove(builder);}} return (A)this;
    }

    public A removeAllFromTriggeredBy(Collection<BuildTriggerCause> items){
            for (BuildTriggerCause item : items) {BuildTriggerCauseBuilder builder = new BuildTriggerCauseBuilder(item);_visitables.remove(builder);if (this.triggeredBy != null) {this.triggeredBy.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildTriggeredBy instead.
 * @return The buildable object.
 */
@Deprecated public List<BuildTriggerCause> getTriggeredBy(){
            return build(triggeredBy);
    }

    public List<BuildTriggerCause> buildTriggeredBy(){
            return build(triggeredBy);
    }

    public BuildTriggerCause buildTriggeredBy(int index){
            return this.triggeredBy.get(index).build();
    }

    public BuildTriggerCause buildFirstTriggeredBy(){
            return this.triggeredBy.get(0).build();
    }

    public BuildTriggerCause buildLastTriggeredBy(){
            return this.triggeredBy.get(triggeredBy.size() - 1).build();
    }

    public BuildTriggerCause buildMatchingTriggeredBy(io.fabric8.kubernetes.api.builder.Predicate<BuildTriggerCauseBuilder> predicate){
            for (BuildTriggerCauseBuilder item: triggeredBy) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withTriggeredBy(List<BuildTriggerCause> triggeredBy){
            if (this.triggeredBy != null) { _visitables.removeAll(this.triggeredBy);}
            if (triggeredBy != null) {this.triggeredBy = new ArrayList<BuildTriggerCauseBuilder>(); for (BuildTriggerCause item : triggeredBy){this.addToTriggeredBy(item);}} else { this.triggeredBy = new ArrayList<BuildTriggerCauseBuilder>();} return (A) this;
    }

    public A withTriggeredBy(BuildTriggerCause... triggeredBy){
            if (this.triggeredBy != null) {this.triggeredBy.clear();}
            if (triggeredBy != null) {for (BuildTriggerCause item :triggeredBy){ this.addToTriggeredBy(item);}} return (A) this;
    }

    public Boolean hasTriggeredBy(){
            return triggeredBy != null && !triggeredBy.isEmpty();
    }

    public BuildRequestFluent.TriggeredByNested<A> addNewTriggeredBy(){
            return new TriggeredByNestedImpl();
    }

    public BuildRequestFluent.TriggeredByNested<A> addNewTriggeredByLike(BuildTriggerCause item){
            return new TriggeredByNestedImpl(-1, item);
    }

    public BuildRequestFluent.TriggeredByNested<A> setNewTriggeredByLike(int index,BuildTriggerCause item){
            return new TriggeredByNestedImpl(index, item);
    }

    public BuildRequestFluent.TriggeredByNested<A> editTriggeredBy(int index){
            if (triggeredBy.size() <= index) throw new RuntimeException("Can't edit triggeredBy. Index exceeds size.");
            return setNewTriggeredByLike(index, buildTriggeredBy(index));
    }

    public BuildRequestFluent.TriggeredByNested<A> editFirstTriggeredBy(){
            if (triggeredBy.size() == 0) throw new RuntimeException("Can't edit first triggeredBy. The list is empty.");
            return setNewTriggeredByLike(0, buildTriggeredBy(0));
    }

    public BuildRequestFluent.TriggeredByNested<A> editLastTriggeredBy(){
            int index = triggeredBy.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last triggeredBy. The list is empty.");
            return setNewTriggeredByLike(index, buildTriggeredBy(index));
    }

    public BuildRequestFluent.TriggeredByNested<A> editMatchingTriggeredBy(io.fabric8.kubernetes.api.builder.Predicate<BuildTriggerCauseBuilder> predicate){
            int index = -1;
            for (int i=0;i<triggeredBy.size();i++) { 
            if (predicate.apply(triggeredBy.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching triggeredBy. No match found.");
            return setNewTriggeredByLike(index, buildTriggeredBy(index));
    }

    
/**
 * This method has been deprecated, please use method buildTriggeredByImage instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getTriggeredByImage(){
            return this.triggeredByImage!=null?this.triggeredByImage.build():null;
    }

    public ObjectReference buildTriggeredByImage(){
            return this.triggeredByImage!=null?this.triggeredByImage.build():null;
    }

    public A withTriggeredByImage(ObjectReference triggeredByImage){
            _visitables.remove(this.triggeredByImage);
            if (triggeredByImage!=null){ this.triggeredByImage= new ObjectReferenceBuilder(triggeredByImage); _visitables.add(this.triggeredByImage);} return (A) this;
    }

    public Boolean hasTriggeredByImage(){
            return this.triggeredByImage != null;
    }

    public BuildRequestFluent.TriggeredByImageNested<A> withNewTriggeredByImage(){
            return new TriggeredByImageNestedImpl();
    }

    public BuildRequestFluent.TriggeredByImageNested<A> withNewTriggeredByImageLike(ObjectReference item){
            return new TriggeredByImageNestedImpl(item);
    }

    public BuildRequestFluent.TriggeredByImageNested<A> editTriggeredByImage(){
            return withNewTriggeredByImageLike(getTriggeredByImage());
    }

    public BuildRequestFluent.TriggeredByImageNested<A> editOrNewTriggeredByImage(){
            return withNewTriggeredByImageLike(getTriggeredByImage() != null ? getTriggeredByImage(): new ObjectReferenceBuilder().build());
    }

    public BuildRequestFluent.TriggeredByImageNested<A> editOrNewTriggeredByImageLike(ObjectReference item){
            return withNewTriggeredByImageLike(getTriggeredByImage() != null ? getTriggeredByImage(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildRequestFluentImpl that = (BuildRequestFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (binary != null ? !binary.equals(that.binary) :that.binary != null) return false;
            if (dockerStrategyOptions != null ? !dockerStrategyOptions.equals(that.dockerStrategyOptions) :that.dockerStrategyOptions != null) return false;
            if (env != null ? !env.equals(that.env) :that.env != null) return false;
            if (from != null ? !from.equals(that.from) :that.from != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (lastVersion != null ? !lastVersion.equals(that.lastVersion) :that.lastVersion != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (revision != null ? !revision.equals(that.revision) :that.revision != null) return false;
            if (sourceStrategyOptions != null ? !sourceStrategyOptions.equals(that.sourceStrategyOptions) :that.sourceStrategyOptions != null) return false;
            if (triggeredBy != null ? !triggeredBy.equals(that.triggeredBy) :that.triggeredBy != null) return false;
            if (triggeredByImage != null ? !triggeredByImage.equals(that.triggeredByImage) :that.triggeredByImage != null) return false;
            return true;
    }


    public class BinaryNestedImpl<N> extends BinaryBuildSourceFluentImpl<BuildRequestFluent.BinaryNested<N>> implements BuildRequestFluent.BinaryNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BinaryBuildSourceBuilder builder;
    
            BinaryNestedImpl(BinaryBuildSource item){
                    this.builder = new BinaryBuildSourceBuilder(this, item);
            }
            BinaryNestedImpl(){
                    this.builder = new BinaryBuildSourceBuilder(this);
            }
    
    public N and(){
            return (N) BuildRequestFluentImpl.this.withBinary(builder.build());
    }
    public N endBinary(){
            return and();
    }

}
    public class DockerStrategyOptionsNestedImpl<N> extends DockerStrategyOptionsFluentImpl<BuildRequestFluent.DockerStrategyOptionsNested<N>> implements BuildRequestFluent.DockerStrategyOptionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DockerStrategyOptionsBuilder builder;
    
            DockerStrategyOptionsNestedImpl(DockerStrategyOptions item){
                    this.builder = new DockerStrategyOptionsBuilder(this, item);
            }
            DockerStrategyOptionsNestedImpl(){
                    this.builder = new DockerStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) BuildRequestFluentImpl.this.withDockerStrategyOptions(builder.build());
    }
    public N endDockerStrategyOptions(){
            return and();
    }

}
    public class EnvNestedImpl<N> extends EnvVarFluentImpl<BuildRequestFluent.EnvNested<N>> implements BuildRequestFluent.EnvNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvVarBuilder builder;
        private final int index;
    
            EnvNestedImpl(int index,EnvVar item){
                    this.index = index;
                    this.builder = new EnvVarBuilder(this, item);
            }
            EnvNestedImpl(){
                    this.index = -1;
                    this.builder = new EnvVarBuilder(this);
            }
    
    public N and(){
            return (N) BuildRequestFluentImpl.this.setToEnv(index, builder.build());
    }
    public N endEnv(){
            return and();
    }

}
    public class FromNestedImpl<N> extends ObjectReferenceFluentImpl<BuildRequestFluent.FromNested<N>> implements BuildRequestFluent.FromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            FromNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            FromNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) BuildRequestFluentImpl.this.withFrom(builder.build());
    }
    public N endFrom(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<BuildRequestFluent.MetadataNested<N>> implements BuildRequestFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) BuildRequestFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class RevisionNestedImpl<N> extends SourceRevisionFluentImpl<BuildRequestFluent.RevisionNested<N>> implements BuildRequestFluent.RevisionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SourceRevisionBuilder builder;
    
            RevisionNestedImpl(SourceRevision item){
                    this.builder = new SourceRevisionBuilder(this, item);
            }
            RevisionNestedImpl(){
                    this.builder = new SourceRevisionBuilder(this);
            }
    
    public N and(){
            return (N) BuildRequestFluentImpl.this.withRevision(builder.build());
    }
    public N endRevision(){
            return and();
    }

}
    public class SourceStrategyOptionsNestedImpl<N> extends SourceStrategyOptionsFluentImpl<BuildRequestFluent.SourceStrategyOptionsNested<N>> implements BuildRequestFluent.SourceStrategyOptionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SourceStrategyOptionsBuilder builder;
    
            SourceStrategyOptionsNestedImpl(SourceStrategyOptions item){
                    this.builder = new SourceStrategyOptionsBuilder(this, item);
            }
            SourceStrategyOptionsNestedImpl(){
                    this.builder = new SourceStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) BuildRequestFluentImpl.this.withSourceStrategyOptions(builder.build());
    }
    public N endSourceStrategyOptions(){
            return and();
    }

}
    public class TriggeredByNestedImpl<N> extends BuildTriggerCauseFluentImpl<BuildRequestFluent.TriggeredByNested<N>> implements BuildRequestFluent.TriggeredByNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildTriggerCauseBuilder builder;
        private final int index;
    
            TriggeredByNestedImpl(int index,BuildTriggerCause item){
                    this.index = index;
                    this.builder = new BuildTriggerCauseBuilder(this, item);
            }
            TriggeredByNestedImpl(){
                    this.index = -1;
                    this.builder = new BuildTriggerCauseBuilder(this);
            }
    
    public N and(){
            return (N) BuildRequestFluentImpl.this.setToTriggeredBy(index, builder.build());
    }
    public N endTriggeredBy(){
            return and();
    }

}
    public class TriggeredByImageNestedImpl<N> extends ObjectReferenceFluentImpl<BuildRequestFluent.TriggeredByImageNested<N>> implements BuildRequestFluent.TriggeredByImageNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            TriggeredByImageNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            TriggeredByImageNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) BuildRequestFluentImpl.this.withTriggeredByImage(builder.build());
    }
    public N endTriggeredByImage(){
            return and();
    }

}


}
