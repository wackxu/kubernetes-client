package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageStreamImportSpec extends ImageStreamImportSpecFluentImpl<DoneableImageStreamImportSpec> implements Doneable<ImageStreamImportSpec>{

    private final ImageStreamImportSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageStreamImportSpec,ImageStreamImportSpec> function;

    public DoneableImageStreamImportSpec(io.fabric8.kubernetes.api.builder.Function<ImageStreamImportSpec,ImageStreamImportSpec> function){
            super();this.builder=new ImageStreamImportSpecBuilder(this);this.function=function;
    }
    public DoneableImageStreamImportSpec(ImageStreamImportSpec item,io.fabric8.kubernetes.api.builder.Function<ImageStreamImportSpec,ImageStreamImportSpec> function){
            super(item);this.builder=new ImageStreamImportSpecBuilder(this, item);this.function=function;
    }
    public DoneableImageStreamImportSpec(ImageStreamImportSpec item){
            super(item);this.builder=new ImageStreamImportSpecBuilder(this, item);this.function=new Function<ImageStreamImportSpec, ImageStreamImportSpec>() {
    public ImageStreamImportSpec apply(ImageStreamImportSpec item) {
        return item;
    }
}
;
    }

    public ImageStreamImportSpec done(){
             return function.apply(builder.build());
    }




}
