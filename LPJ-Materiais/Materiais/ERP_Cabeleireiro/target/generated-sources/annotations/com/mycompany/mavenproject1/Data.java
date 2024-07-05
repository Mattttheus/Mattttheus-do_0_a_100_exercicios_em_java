package com.mycompany.mavenproject1;
import net.java.html.json.*;
/** Generated for {@link DataModel}*/
public final class Data implements Cloneable {
  private static Class<DataModel> modelFor() { return DataModel.class; }
  private static final Html4JavaType TYPE = new Html4JavaType();
  private final DataModel instance = new DataModel();
  private final org.netbeans.html.json.spi.Proto proto;
  private Data(net.java.html.BrwsrCtx context) {
    this.proto = TYPE.createProto(this, context);
  };
  public Data() {
    this(net.java.html.BrwsrCtx.findDefault(Data.class));
  };
  private static class Html4JavaType extends org.netbeans.html.json.spi.Proto.Type<Data> {
    private Html4JavaType() {
      super(Data.class, DataModel.class, 0, 0);
    }
    @Override public void setValue(Data data, int type, Object value) {
      switch (type) {
      }
      throw new UnsupportedOperationException();
    }
    @Override public Object getValue(Data data, int type) {
      switch (type) {
      }
      throw new UnsupportedOperationException();
    }
    @Override public void call(Data model, int type, Object data, Object ev) throws Exception {
      switch (type) {
      }
      throw new UnsupportedOperationException();
    }
    @Override public org.netbeans.html.json.spi.Proto protoFor(Object obj) {
      return ((Data)obj).proto;    }
    @Override public void onChange(Data model, int type) {
      switch (type) {
    }
      throw new UnsupportedOperationException();
    }
  @Override public void onMessage(Data model, int index, int type, Object data, Object[] params) {
    switch (index) {
    }
    throw new UnsupportedOperationException("index: " + index + " type: " + type);
  }
    @Override public Data read(net.java.html.BrwsrCtx c, Object json) { return new Data(c, json); }
    @Override public Data cloneTo(Data o, net.java.html.BrwsrCtx c) { return o.clone(c); }
  }
  private Data(net.java.html.BrwsrCtx c, Object json) {
    this(c);
    Object[] ret = new Object[0];
    proto.extract(json, new String[] {
    }, ret);
  }
  private static Object[] useAsArray(Object o) {
    return o instanceof Object[] ? ((Object[])o) : o == null ? new Object[0] : new Object[] { o };
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append('{');
    sb.append('}');
    return sb.toString();
  }
  public Data clone() {
    return clone(proto.getContext());
  }
  private Data clone(net.java.html.BrwsrCtx ctx) {
    Data ret = new Data(ctx);
    return ret;
  }
  private Data applyBindings() {
    throw new IllegalStateException("Please specify targetId=\"\" in your @Model annotation");
  }
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Data)) return false;
    Data p = (Data)o;
    return true;
  }
  public int hashCode() {
    int h = Data.class.getName().hashCode();
    return h;
  }
}
