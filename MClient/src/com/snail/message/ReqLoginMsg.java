// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReqLogin.proto

package com.snail.message;

public final class ReqLoginMsg {
  private ReqLoginMsg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ReqLoginOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 id = 1 [default = 103];
    /**
     * <code>optional int32 id = 1 [default = 103];</code>
     */
    boolean hasId();
    /**
     * <code>optional int32 id = 1 [default = 103];</code>
     */
    int getId();

    // optional int32 userId = 2;
    /**
     * <code>optional int32 userId = 2;</code>
     */
    boolean hasUserId();
    /**
     * <code>optional int32 userId = 2;</code>
     */
    int getUserId();

    // optional string username = 3;
    /**
     * <code>optional string username = 3;</code>
     */
    boolean hasUsername();
    /**
     * <code>optional string username = 3;</code>
     */
    java.lang.String getUsername();
    /**
     * <code>optional string username = 3;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    // optional string pwd = 4;
    /**
     * <code>optional string pwd = 4;</code>
     */
    boolean hasPwd();
    /**
     * <code>optional string pwd = 4;</code>
     */
    java.lang.String getPwd();
    /**
     * <code>optional string pwd = 4;</code>
     */
    com.google.protobuf.ByteString
        getPwdBytes();
  }
  /**
   * Protobuf type {@code myProto.ReqLogin}
   */
  public static final class ReqLogin extends
      com.google.protobuf.GeneratedMessage
      implements ReqLoginOrBuilder {
    // Use ReqLogin.newBuilder() to construct.
    private ReqLogin(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReqLogin(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReqLogin defaultInstance;
    public static ReqLogin getDefaultInstance() {
      return defaultInstance;
    }

    public ReqLogin getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReqLogin(
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
              bitField0_ |= 0x00000002;
              userId_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              username_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              pwd_ = input.readBytes();
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
      return com.snail.message.ReqLoginMsg.internal_static_myProto_ReqLogin_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.snail.message.ReqLoginMsg.internal_static_myProto_ReqLogin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.snail.message.ReqLoginMsg.ReqLogin.class, com.snail.message.ReqLoginMsg.ReqLogin.Builder.class);
    }

    public static com.google.protobuf.Parser<ReqLogin> PARSER =
        new com.google.protobuf.AbstractParser<ReqLogin>() {
      public ReqLogin parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqLogin(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReqLogin> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 id = 1 [default = 103];
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>optional int32 id = 1 [default = 103];</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 id = 1 [default = 103];</code>
     */
    public int getId() {
      return id_;
    }

    // optional int32 userId = 2;
    public static final int USERID_FIELD_NUMBER = 2;
    private int userId_;
    /**
     * <code>optional int32 userId = 2;</code>
     */
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 userId = 2;</code>
     */
    public int getUserId() {
      return userId_;
    }

    // optional string username = 3;
    public static final int USERNAME_FIELD_NUMBER = 3;
    private java.lang.Object username_;
    /**
     * <code>optional string username = 3;</code>
     */
    public boolean hasUsername() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string username = 3;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          username_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string username = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string pwd = 4;
    public static final int PWD_FIELD_NUMBER = 4;
    private java.lang.Object pwd_;
    /**
     * <code>optional string pwd = 4;</code>
     */
    public boolean hasPwd() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string pwd = 4;</code>
     */
    public java.lang.String getPwd() {
      java.lang.Object ref = pwd_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          pwd_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string pwd = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPwdBytes() {
      java.lang.Object ref = pwd_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pwd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      id_ = 103;
      userId_ = 0;
      username_ = "";
      pwd_ = "";
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
        output.writeInt32(2, userId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getUsernameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getPwdBytes());
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
          .computeInt32Size(2, userId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getUsernameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getPwdBytes());
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

    public static com.snail.message.ReqLoginMsg.ReqLogin parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.snail.message.ReqLoginMsg.ReqLogin parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.snail.message.ReqLoginMsg.ReqLogin parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.snail.message.ReqLoginMsg.ReqLogin parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.snail.message.ReqLoginMsg.ReqLogin parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.snail.message.ReqLoginMsg.ReqLogin parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.snail.message.ReqLoginMsg.ReqLogin parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.snail.message.ReqLoginMsg.ReqLogin parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.snail.message.ReqLoginMsg.ReqLogin parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.snail.message.ReqLoginMsg.ReqLogin parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.snail.message.ReqLoginMsg.ReqLogin prototype) {
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
     * Protobuf type {@code myProto.ReqLogin}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.snail.message.ReqLoginMsg.ReqLoginOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.snail.message.ReqLoginMsg.internal_static_myProto_ReqLogin_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.snail.message.ReqLoginMsg.internal_static_myProto_ReqLogin_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.snail.message.ReqLoginMsg.ReqLogin.class, com.snail.message.ReqLoginMsg.ReqLogin.Builder.class);
      }

      // Construct using com.snail.message.ReqLoginMsg.ReqLogin.newBuilder()
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
        id_ = 103;
        bitField0_ = (bitField0_ & ~0x00000001);
        userId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        username_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        pwd_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.snail.message.ReqLoginMsg.internal_static_myProto_ReqLogin_descriptor;
      }

      public com.snail.message.ReqLoginMsg.ReqLogin getDefaultInstanceForType() {
        return com.snail.message.ReqLoginMsg.ReqLogin.getDefaultInstance();
      }

      public com.snail.message.ReqLoginMsg.ReqLogin build() {
        com.snail.message.ReqLoginMsg.ReqLogin result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.snail.message.ReqLoginMsg.ReqLogin buildPartial() {
        com.snail.message.ReqLoginMsg.ReqLogin result = new com.snail.message.ReqLoginMsg.ReqLogin(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.userId_ = userId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.username_ = username_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.pwd_ = pwd_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.snail.message.ReqLoginMsg.ReqLogin) {
          return mergeFrom((com.snail.message.ReqLoginMsg.ReqLogin)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.snail.message.ReqLoginMsg.ReqLogin other) {
        if (other == com.snail.message.ReqLoginMsg.ReqLogin.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasUserId()) {
          setUserId(other.getUserId());
        }
        if (other.hasUsername()) {
          bitField0_ |= 0x00000004;
          username_ = other.username_;
          onChanged();
        }
        if (other.hasPwd()) {
          bitField0_ |= 0x00000008;
          pwd_ = other.pwd_;
          onChanged();
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
        com.snail.message.ReqLoginMsg.ReqLogin parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.snail.message.ReqLoginMsg.ReqLogin) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 id = 1 [default = 103];
      private int id_ = 103;
      /**
       * <code>optional int32 id = 1 [default = 103];</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 id = 1 [default = 103];</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>optional int32 id = 1 [default = 103];</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 id = 1 [default = 103];</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 103;
        onChanged();
        return this;
      }

      // optional int32 userId = 2;
      private int userId_ ;
      /**
       * <code>optional int32 userId = 2;</code>
       */
      public boolean hasUserId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 userId = 2;</code>
       */
      public int getUserId() {
        return userId_;
      }
      /**
       * <code>optional int32 userId = 2;</code>
       */
      public Builder setUserId(int value) {
        bitField0_ |= 0x00000002;
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 userId = 2;</code>
       */
      public Builder clearUserId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        userId_ = 0;
        onChanged();
        return this;
      }

      // optional string username = 3;
      private java.lang.Object username_ = "";
      /**
       * <code>optional string username = 3;</code>
       */
      public boolean hasUsername() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string username = 3;</code>
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string username = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string username = 3;</code>
       */
      public Builder setUsername(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string username = 3;</code>
       */
      public Builder clearUsername() {
        bitField0_ = (bitField0_ & ~0x00000004);
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>optional string username = 3;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        username_ = value;
        onChanged();
        return this;
      }

      // optional string pwd = 4;
      private java.lang.Object pwd_ = "";
      /**
       * <code>optional string pwd = 4;</code>
       */
      public boolean hasPwd() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string pwd = 4;</code>
       */
      public java.lang.String getPwd() {
        java.lang.Object ref = pwd_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          pwd_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string pwd = 4;</code>
       */
      public com.google.protobuf.ByteString
          getPwdBytes() {
        java.lang.Object ref = pwd_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          pwd_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string pwd = 4;</code>
       */
      public Builder setPwd(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        pwd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string pwd = 4;</code>
       */
      public Builder clearPwd() {
        bitField0_ = (bitField0_ & ~0x00000008);
        pwd_ = getDefaultInstance().getPwd();
        onChanged();
        return this;
      }
      /**
       * <code>optional string pwd = 4;</code>
       */
      public Builder setPwdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        pwd_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:myProto.ReqLogin)
    }

    static {
      defaultInstance = new ReqLogin(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:myProto.ReqLogin)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_myProto_ReqLogin_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_myProto_ReqLogin_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016ReqLogin.proto\022\007myProto\"J\n\010ReqLogin\022\017\n" +
      "\002id\030\001 \001(\005:\003103\022\016\n\006userId\030\002 \001(\005\022\020\n\010userna" +
      "me\030\003 \001(\t\022\013\n\003pwd\030\004 \001(\tB \n\021com.snail.messa" +
      "geB\013ReqLoginMsg"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_myProto_ReqLogin_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_myProto_ReqLogin_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_myProto_ReqLogin_descriptor,
              new java.lang.String[] { "Id", "UserId", "Username", "Pwd", });
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
