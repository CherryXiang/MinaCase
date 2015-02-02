// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResRegister.proto

package com.snail.message;

public final class ResRegisterMsg {
  private ResRegisterMsg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ResRegisterOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 id = 1 [default = 101];
    /**
     * <code>optional int32 id = 1 [default = 101];</code>
     */
    boolean hasId();
    /**
     * <code>optional int32 id = 1 [default = 101];</code>
     */
    int getId();

    // optional .myProto.ResRegister.Result result = 2;
    /**
     * <code>optional .myProto.ResRegister.Result result = 2;</code>
     */
    boolean hasResult();
    /**
     * <code>optional .myProto.ResRegister.Result result = 2;</code>
     */
    com.snail.message.ResRegisterMsg.ResRegister.Result getResult();
  }
  /**
   * Protobuf type {@code myProto.ResRegister}
   */
  public static final class ResRegister extends
      com.google.protobuf.GeneratedMessage
      implements ResRegisterOrBuilder {
    // Use ResRegister.newBuilder() to construct.
    private ResRegister(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ResRegister(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ResRegister defaultInstance;
    public static ResRegister getDefaultInstance() {
      return defaultInstance;
    }

    public ResRegister getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ResRegister(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.snail.message.ResRegisterMsg.ResRegister.Result value = com.snail.message.ResRegisterMsg.ResRegister.Result.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                result_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.snail.message.ResRegisterMsg.internal_static_myProto_ResRegister_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.snail.message.ResRegisterMsg.internal_static_myProto_ResRegister_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.snail.message.ResRegisterMsg.ResRegister.class, com.snail.message.ResRegisterMsg.ResRegister.Builder.class);
    }

    public static com.google.protobuf.Parser<ResRegister> PARSER =
        new com.google.protobuf.AbstractParser<ResRegister>() {
      public ResRegister parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResRegister(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ResRegister> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code myProto.ResRegister.Result}
     */
    public enum Result
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>FAILED = 0;</code>
       */
      FAILED(0, 0),
      /**
       * <code>SUCCEED = 1;</code>
       */
      SUCCEED(1, 1),
      ;

      /**
       * <code>FAILED = 0;</code>
       */
      public static final int FAILED_VALUE = 0;
      /**
       * <code>SUCCEED = 1;</code>
       */
      public static final int SUCCEED_VALUE = 1;


      public final int getNumber() { return value; }

      public static Result valueOf(int value) {
        switch (value) {
          case 0: return FAILED;
          case 1: return SUCCEED;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Result>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Result>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Result>() {
              public Result findValueByNumber(int number) {
                return Result.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.snail.message.ResRegisterMsg.ResRegister.getDescriptor().getEnumTypes().get(0);
      }

      private static final Result[] VALUES = values();

      public static Result valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Result(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:myProto.ResRegister.Result)
    }

    private int bitField0_;
    // optional int32 id = 1 [default = 101];
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>optional int32 id = 1 [default = 101];</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 id = 1 [default = 101];</code>
     */
    public int getId() {
      return id_;
    }

    // optional .myProto.ResRegister.Result result = 2;
    public static final int RESULT_FIELD_NUMBER = 2;
    private com.snail.message.ResRegisterMsg.ResRegister.Result result_;
    /**
     * <code>optional .myProto.ResRegister.Result result = 2;</code>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .myProto.ResRegister.Result result = 2;</code>
     */
    public com.snail.message.ResRegisterMsg.ResRegister.Result getResult() {
      return result_;
    }

    private void initFields() {
      id_ = 101;
      result_ = com.snail.message.ResRegisterMsg.ResRegister.Result.FAILED;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, result_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, result_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.snail.message.ResRegisterMsg.ResRegister parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.snail.message.ResRegisterMsg.ResRegister parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.snail.message.ResRegisterMsg.ResRegister parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.snail.message.ResRegisterMsg.ResRegister parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.snail.message.ResRegisterMsg.ResRegister parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.snail.message.ResRegisterMsg.ResRegister parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.snail.message.ResRegisterMsg.ResRegister parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.snail.message.ResRegisterMsg.ResRegister parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.snail.message.ResRegisterMsg.ResRegister parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.snail.message.ResRegisterMsg.ResRegister parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.snail.message.ResRegisterMsg.ResRegister prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code myProto.ResRegister}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.snail.message.ResRegisterMsg.ResRegisterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.snail.message.ResRegisterMsg.internal_static_myProto_ResRegister_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.snail.message.ResRegisterMsg.internal_static_myProto_ResRegister_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.snail.message.ResRegisterMsg.ResRegister.class, com.snail.message.ResRegisterMsg.ResRegister.Builder.class);
      }

      // Construct using com.snail.message.ResRegisterMsg.ResRegister.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 101;
        bitField0_ = (bitField0_ & ~0x00000001);
        result_ = com.snail.message.ResRegisterMsg.ResRegister.Result.FAILED;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.snail.message.ResRegisterMsg.internal_static_myProto_ResRegister_descriptor;
      }

      public com.snail.message.ResRegisterMsg.ResRegister getDefaultInstanceForType() {
        return com.snail.message.ResRegisterMsg.ResRegister.getDefaultInstance();
      }

      public com.snail.message.ResRegisterMsg.ResRegister build() {
        com.snail.message.ResRegisterMsg.ResRegister result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.snail.message.ResRegisterMsg.ResRegister buildPartial() {
        com.snail.message.ResRegisterMsg.ResRegister result = new com.snail.message.ResRegisterMsg.ResRegister(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.result_ = result_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.snail.message.ResRegisterMsg.ResRegister) {
          return mergeFrom((com.snail.message.ResRegisterMsg.ResRegister)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.snail.message.ResRegisterMsg.ResRegister other) {
        if (other == com.snail.message.ResRegisterMsg.ResRegister.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasResult()) {
          setResult(other.getResult());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.snail.message.ResRegisterMsg.ResRegister parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.snail.message.ResRegisterMsg.ResRegister) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 id = 1 [default = 101];
      private int id_ = 101;
      /**
       * <code>optional int32 id = 1 [default = 101];</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 id = 1 [default = 101];</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>optional int32 id = 1 [default = 101];</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 id = 1 [default = 101];</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 101;
        onChanged();
        return this;
      }

      // optional .myProto.ResRegister.Result result = 2;
      private com.snail.message.ResRegisterMsg.ResRegister.Result result_ = com.snail.message.ResRegisterMsg.ResRegister.Result.FAILED;
      /**
       * <code>optional .myProto.ResRegister.Result result = 2;</code>
       */
      public boolean hasResult() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .myProto.ResRegister.Result result = 2;</code>
       */
      public com.snail.message.ResRegisterMsg.ResRegister.Result getResult() {
        return result_;
      }
      /**
       * <code>optional .myProto.ResRegister.Result result = 2;</code>
       */
      public Builder setResult(com.snail.message.ResRegisterMsg.ResRegister.Result value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .myProto.ResRegister.Result result = 2;</code>
       */
      public Builder clearResult() {
        bitField0_ = (bitField0_ & ~0x00000002);
        result_ = com.snail.message.ResRegisterMsg.ResRegister.Result.FAILED;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:myProto.ResRegister)
    }

    static {
      defaultInstance = new ResRegister(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:myProto.ResRegister)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_myProto_ResRegister_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_myProto_ResRegister_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ResRegister.proto\022\007myProto\"n\n\013ResRegis" +
      "ter\022\017\n\002id\030\001 \001(\005:\003101\022+\n\006result\030\002 \001(\0162\033.m" +
      "yProto.ResRegister.Result\"!\n\006Result\022\n\n\006F" +
      "AILED\020\000\022\013\n\007SUCCEED\020\001B#\n\021com.snail.messag" +
      "eB\016ResRegisterMsg"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_myProto_ResRegister_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_myProto_ResRegister_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_myProto_ResRegister_descriptor,
              new java.lang.String[] { "Id", "Result", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}