package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageLookupPolicy extends ImageLookupPolicyFluentImpl<DoneableImageLookupPolicy> implements Doneable<ImageLookupPolicy>{

    private final ImageLookupPolicyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageLookupPolicy,ImageLookupPolicy> function;

    public DoneableImageLookupPolicy(io.fabric8.kubernetes.api.builder.Function<ImageLookupPolicy,ImageLookupPolicy> function){
            super();this.builder=new ImageLookupPolicyBuilder(this);this.function=function;
    }
    public DoneableImageLookupPolicy(ImageLookupPolicy item,io.fabric8.kubernetes.api.builder.Function<ImageLookupPolicy,ImageLookupPolicy> function){
            super(item);this.builder=new ImageLookupPolicyBuilder(this, item);this.function=function;
    }
    public DoneableImageLookupPolicy(ImageLookupPolicy item){
            super(item);this.builder=new ImageLookupPolicyBuilder(this, item);this.function=new Function<ImageLookupPolicy, ImageLookupPolicy>() {
    public ImageLookupPolicy apply(ImageLookupPolicy item) {
        return item;
    }
}
;
    }

    public ImageLookupPolicy done(){
             return function.apply(builder.build());
    }




}
