package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public class ImageSignatureFluentImpl<A extends ImageSignatureFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageSignatureFluent<A>{

    private String apiVersion;
    private List<SignatureConditionBuilder> conditions;
    private String content;
    private String created;
    private String imageIdentity;
    private SignatureIssuerBuilder issuedBy;
    private SignatureSubjectBuilder issuedTo;
    private String kind;
    private ObjectMetaBuilder metadata;
    private Map<String,String> signedClaims;
    private String type;

    public ImageSignatureFluentImpl(){
    }
    public ImageSignatureFluentImpl(ImageSignature instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withConditions(instance.getConditions()); 
            this.withContent(instance.getContent()); 
            this.withCreated(instance.getCreated()); 
            this.withImageIdentity(instance.getImageIdentity()); 
            this.withIssuedBy(instance.getIssuedBy()); 
            this.withIssuedTo(instance.getIssuedTo()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSignedClaims(instance.getSignedClaims()); 
            this.withType(instance.getType()); 
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

    public A addToConditions(int index,SignatureCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<SignatureConditionBuilder>();}
            SignatureConditionBuilder builder = new SignatureConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,SignatureCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<SignatureConditionBuilder>();}
            SignatureConditionBuilder builder = new SignatureConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(SignatureCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<SignatureConditionBuilder>();}
            for (SignatureCondition item : items) {SignatureConditionBuilder builder = new SignatureConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<SignatureCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<SignatureConditionBuilder>();}
            for (SignatureCondition item : items) {SignatureConditionBuilder builder = new SignatureConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(SignatureCondition... items){
            for (SignatureCondition item : items) {SignatureConditionBuilder builder = new SignatureConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<SignatureCondition> items){
            for (SignatureCondition item : items) {SignatureConditionBuilder builder = new SignatureConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<SignatureCondition> getConditions(){
            return build(conditions);
    }

    public List<SignatureCondition> buildConditions(){
            return build(conditions);
    }

    public SignatureCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public SignatureCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public SignatureCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public SignatureCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<SignatureConditionBuilder> predicate){
            for (SignatureConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<SignatureCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<SignatureConditionBuilder>(); for (SignatureCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<SignatureConditionBuilder>();} return (A) this;
    }

    public A withConditions(SignatureCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (SignatureCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public ImageSignatureFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public ImageSignatureFluent.ConditionsNested<A> addNewConditionLike(SignatureCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public ImageSignatureFluent.ConditionsNested<A> setNewConditionLike(int index,SignatureCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public ImageSignatureFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public ImageSignatureFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public ImageSignatureFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public ImageSignatureFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<SignatureConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public String getContent(){
            return this.content;
    }

    public A withContent(String content){
            this.content=content; return (A) this;
    }

    public Boolean hasContent(){
            return this.content != null;
    }

    public String getCreated(){
            return this.created;
    }

    public A withCreated(String created){
            this.created=created; return (A) this;
    }

    public Boolean hasCreated(){
            return this.created != null;
    }

    public String getImageIdentity(){
            return this.imageIdentity;
    }

    public A withImageIdentity(String imageIdentity){
            this.imageIdentity=imageIdentity; return (A) this;
    }

    public Boolean hasImageIdentity(){
            return this.imageIdentity != null;
    }

    
/**
 * This method has been deprecated, please use method buildIssuedBy instead.
 * @return The buildable object.
 */
@Deprecated public SignatureIssuer getIssuedBy(){
            return this.issuedBy!=null?this.issuedBy.build():null;
    }

    public SignatureIssuer buildIssuedBy(){
            return this.issuedBy!=null?this.issuedBy.build():null;
    }

    public A withIssuedBy(SignatureIssuer issuedBy){
            _visitables.remove(this.issuedBy);
            if (issuedBy!=null){ this.issuedBy= new SignatureIssuerBuilder(issuedBy); _visitables.add(this.issuedBy);} return (A) this;
    }

    public Boolean hasIssuedBy(){
            return this.issuedBy != null;
    }

    public A withNewIssuedBy(String commonName,String organization){
            return (A)withIssuedBy(new SignatureIssuer(commonName, organization));
    }

    public ImageSignatureFluent.IssuedByNested<A> withNewIssuedBy(){
            return new IssuedByNestedImpl();
    }

    public ImageSignatureFluent.IssuedByNested<A> withNewIssuedByLike(SignatureIssuer item){
            return new IssuedByNestedImpl(item);
    }

    public ImageSignatureFluent.IssuedByNested<A> editIssuedBy(){
            return withNewIssuedByLike(getIssuedBy());
    }

    public ImageSignatureFluent.IssuedByNested<A> editOrNewIssuedBy(){
            return withNewIssuedByLike(getIssuedBy() != null ? getIssuedBy(): new SignatureIssuerBuilder().build());
    }

    public ImageSignatureFluent.IssuedByNested<A> editOrNewIssuedByLike(SignatureIssuer item){
            return withNewIssuedByLike(getIssuedBy() != null ? getIssuedBy(): item);
    }

    
/**
 * This method has been deprecated, please use method buildIssuedTo instead.
 * @return The buildable object.
 */
@Deprecated public SignatureSubject getIssuedTo(){
            return this.issuedTo!=null?this.issuedTo.build():null;
    }

    public SignatureSubject buildIssuedTo(){
            return this.issuedTo!=null?this.issuedTo.build():null;
    }

    public A withIssuedTo(SignatureSubject issuedTo){
            _visitables.remove(this.issuedTo);
            if (issuedTo!=null){ this.issuedTo= new SignatureSubjectBuilder(issuedTo); _visitables.add(this.issuedTo);} return (A) this;
    }

    public Boolean hasIssuedTo(){
            return this.issuedTo != null;
    }

    public A withNewIssuedTo(String commonName,String organization,String publicKeyID){
            return (A)withIssuedTo(new SignatureSubject(commonName, organization, publicKeyID));
    }

    public ImageSignatureFluent.IssuedToNested<A> withNewIssuedTo(){
            return new IssuedToNestedImpl();
    }

    public ImageSignatureFluent.IssuedToNested<A> withNewIssuedToLike(SignatureSubject item){
            return new IssuedToNestedImpl(item);
    }

    public ImageSignatureFluent.IssuedToNested<A> editIssuedTo(){
            return withNewIssuedToLike(getIssuedTo());
    }

    public ImageSignatureFluent.IssuedToNested<A> editOrNewIssuedTo(){
            return withNewIssuedToLike(getIssuedTo() != null ? getIssuedTo(): new SignatureSubjectBuilder().build());
    }

    public ImageSignatureFluent.IssuedToNested<A> editOrNewIssuedToLike(SignatureSubject item){
            return withNewIssuedToLike(getIssuedTo() != null ? getIssuedTo(): item);
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

    public ImageSignatureFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ImageSignatureFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public ImageSignatureFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ImageSignatureFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public ImageSignatureFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public A addToSignedClaims(String key,String value){
            if(this.signedClaims == null && key != null && value != null) { this.signedClaims = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.signedClaims.put(key, value);} return (A)this;
    }

    public A addToSignedClaims(Map<String,String> map){
            if(this.signedClaims == null && map != null) { this.signedClaims = new LinkedHashMap<String,String>(); }
            if(map != null) { this.signedClaims.putAll(map);} return (A)this;
    }

    public A removeFromSignedClaims(String key){
            if(this.signedClaims == null) { return (A) this; }
            if(key != null && this.signedClaims != null) {this.signedClaims.remove(key);} return (A)this;
    }

    public A removeFromSignedClaims(Map<String,String> map){
            if(this.signedClaims == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.signedClaims != null){this.signedClaims.remove(key);}}} return (A)this;
    }

    public Map<String,String> getSignedClaims(){
            return this.signedClaims;
    }

    public A withSignedClaims(Map<String,String> signedClaims){
            if (signedClaims == null) { this.signedClaims =  new LinkedHashMap<String,String>();} else {this.signedClaims = new LinkedHashMap<String,String>(signedClaims);} return (A) this;
    }

    public Boolean hasSignedClaims(){
            return this.signedClaims != null;
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageSignatureFluentImpl that = (ImageSignatureFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (content != null ? !content.equals(that.content) :that.content != null) return false;
            if (created != null ? !created.equals(that.created) :that.created != null) return false;
            if (imageIdentity != null ? !imageIdentity.equals(that.imageIdentity) :that.imageIdentity != null) return false;
            if (issuedBy != null ? !issuedBy.equals(that.issuedBy) :that.issuedBy != null) return false;
            if (issuedTo != null ? !issuedTo.equals(that.issuedTo) :that.issuedTo != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (signedClaims != null ? !signedClaims.equals(that.signedClaims) :that.signedClaims != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends SignatureConditionFluentImpl<ImageSignatureFluent.ConditionsNested<N>> implements ImageSignatureFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SignatureConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,SignatureCondition item){
                    this.index = index;
                    this.builder = new SignatureConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new SignatureConditionBuilder(this);
            }
    
    public N and(){
            return (N) ImageSignatureFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}
    public class IssuedByNestedImpl<N> extends SignatureIssuerFluentImpl<ImageSignatureFluent.IssuedByNested<N>> implements ImageSignatureFluent.IssuedByNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SignatureIssuerBuilder builder;
    
            IssuedByNestedImpl(SignatureIssuer item){
                    this.builder = new SignatureIssuerBuilder(this, item);
            }
            IssuedByNestedImpl(){
                    this.builder = new SignatureIssuerBuilder(this);
            }
    
    public N and(){
            return (N) ImageSignatureFluentImpl.this.withIssuedBy(builder.build());
    }
    public N endIssuedBy(){
            return and();
    }

}
    public class IssuedToNestedImpl<N> extends SignatureSubjectFluentImpl<ImageSignatureFluent.IssuedToNested<N>> implements ImageSignatureFluent.IssuedToNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SignatureSubjectBuilder builder;
    
            IssuedToNestedImpl(SignatureSubject item){
                    this.builder = new SignatureSubjectBuilder(this, item);
            }
            IssuedToNestedImpl(){
                    this.builder = new SignatureSubjectBuilder(this);
            }
    
    public N and(){
            return (N) ImageSignatureFluentImpl.this.withIssuedTo(builder.build());
    }
    public N endIssuedTo(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<ImageSignatureFluent.MetadataNested<N>> implements ImageSignatureFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) ImageSignatureFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
