package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageImportSpec extends ImageImportSpecFluentImpl<DoneableImageImportSpec> implements Doneable<ImageImportSpec>{

    private final ImageImportSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageImportSpec,ImageImportSpec> function;

    public DoneableImageImportSpec(io.fabric8.kubernetes.api.builder.Function<ImageImportSpec,ImageImportSpec> function){
            super();this.builder=new ImageImportSpecBuilder(this);this.function=function;
    }
    public DoneableImageImportSpec(ImageImportSpec item,io.fabric8.kubernetes.api.builder.Function<ImageImportSpec,ImageImportSpec> function){
            super(item);this.builder=new ImageImportSpecBuilder(this, item);this.function=function;
    }
    public DoneableImageImportSpec(ImageImportSpec item){
            super(item);this.builder=new ImageImportSpecBuilder(this, item);this.function=new Function<ImageImportSpec, ImageImportSpec>() {
    public ImageImportSpec apply(ImageImportSpec item) {
        return item;
    }
}
;
    }

    public ImageImportSpec done(){
             return function.apply(builder.build());
    }




}
