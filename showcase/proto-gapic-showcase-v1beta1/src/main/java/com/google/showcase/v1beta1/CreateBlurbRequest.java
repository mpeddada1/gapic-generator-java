// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/messaging.proto

// Protobuf Java Version: 3.25.0
package com.google.showcase.v1beta1;

/**
 * <pre>
 * The request message for the google.showcase.v1beta1.Messaging&#92;CreateBlurb
 * method.
 * </pre>
 *
 * Protobuf type {@code google.showcase.v1beta1.CreateBlurbRequest}
 */
public final class CreateBlurbRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.CreateBlurbRequest)
    CreateBlurbRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateBlurbRequest.newBuilder() to construct.
  private CreateBlurbRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateBlurbRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateBlurbRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.MessagingOuterClass.internal_static_google_showcase_v1beta1_CreateBlurbRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.MessagingOuterClass.internal_static_google_showcase_v1beta1_CreateBlurbRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.CreateBlurbRequest.class, com.google.showcase.v1beta1.CreateBlurbRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * The resource name of the chat room or user profile that this blurb will
   * be tied to.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the chat room or user profile that this blurb will
   * be tied to.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BLURB_FIELD_NUMBER = 2;
  private com.google.showcase.v1beta1.Blurb blurb_;
  /**
   * <pre>
   * The blurb to create.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
   * @return Whether the blurb field is set.
   */
  @java.lang.Override
  public boolean hasBlurb() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The blurb to create.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
   * @return The blurb.
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.Blurb getBlurb() {
    return blurb_ == null ? com.google.showcase.v1beta1.Blurb.getDefaultInstance() : blurb_;
  }
  /**
   * <pre>
   * The blurb to create.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.BlurbOrBuilder getBlurbOrBuilder() {
    return blurb_ == null ? com.google.showcase.v1beta1.Blurb.getDefaultInstance() : blurb_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getBlurb());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBlurb());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.showcase.v1beta1.CreateBlurbRequest)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.CreateBlurbRequest other = (com.google.showcase.v1beta1.CreateBlurbRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasBlurb() != other.hasBlurb()) return false;
    if (hasBlurb()) {
      if (!getBlurb()
          .equals(other.getBlurb())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasBlurb()) {
      hash = (37 * hash) + BLURB_FIELD_NUMBER;
      hash = (53 * hash) + getBlurb().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.CreateBlurbRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.CreateBlurbRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.CreateBlurbRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.CreateBlurbRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.CreateBlurbRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.CreateBlurbRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.CreateBlurbRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.CreateBlurbRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.CreateBlurbRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.CreateBlurbRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.CreateBlurbRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.CreateBlurbRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.showcase.v1beta1.CreateBlurbRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The request message for the google.showcase.v1beta1.Messaging&#92;CreateBlurb
   * method.
   * </pre>
   *
   * Protobuf type {@code google.showcase.v1beta1.CreateBlurbRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.CreateBlurbRequest)
      com.google.showcase.v1beta1.CreateBlurbRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.MessagingOuterClass.internal_static_google_showcase_v1beta1_CreateBlurbRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.MessagingOuterClass.internal_static_google_showcase_v1beta1_CreateBlurbRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.CreateBlurbRequest.class, com.google.showcase.v1beta1.CreateBlurbRequest.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.CreateBlurbRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getBlurbFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      blurb_ = null;
      if (blurbBuilder_ != null) {
        blurbBuilder_.dispose();
        blurbBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.MessagingOuterClass.internal_static_google_showcase_v1beta1_CreateBlurbRequest_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.CreateBlurbRequest getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.CreateBlurbRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.CreateBlurbRequest build() {
      com.google.showcase.v1beta1.CreateBlurbRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.CreateBlurbRequest buildPartial() {
      com.google.showcase.v1beta1.CreateBlurbRequest result = new com.google.showcase.v1beta1.CreateBlurbRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.showcase.v1beta1.CreateBlurbRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.blurb_ = blurbBuilder_ == null
            ? blurb_
            : blurbBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.showcase.v1beta1.CreateBlurbRequest) {
        return mergeFrom((com.google.showcase.v1beta1.CreateBlurbRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.CreateBlurbRequest other) {
      if (other == com.google.showcase.v1beta1.CreateBlurbRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasBlurb()) {
        mergeBlurb(other.getBlurb());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getBlurbFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The resource name of the chat room or user profile that this blurb will
     * be tied to.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the chat room or user profile that this blurb will
     * be tied to.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the chat room or user profile that this blurb will
     * be tied to.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the chat room or user profile that this blurb will
     * be tied to.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the chat room or user profile that this blurb will
     * be tied to.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.showcase.v1beta1.Blurb blurb_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.showcase.v1beta1.Blurb, com.google.showcase.v1beta1.Blurb.Builder, com.google.showcase.v1beta1.BlurbOrBuilder> blurbBuilder_;
    /**
     * <pre>
     * The blurb to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
     * @return Whether the blurb field is set.
     */
    public boolean hasBlurb() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The blurb to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
     * @return The blurb.
     */
    public com.google.showcase.v1beta1.Blurb getBlurb() {
      if (blurbBuilder_ == null) {
        return blurb_ == null ? com.google.showcase.v1beta1.Blurb.getDefaultInstance() : blurb_;
      } else {
        return blurbBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The blurb to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
     */
    public Builder setBlurb(com.google.showcase.v1beta1.Blurb value) {
      if (blurbBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blurb_ = value;
      } else {
        blurbBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The blurb to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
     */
    public Builder setBlurb(
        com.google.showcase.v1beta1.Blurb.Builder builderForValue) {
      if (blurbBuilder_ == null) {
        blurb_ = builderForValue.build();
      } else {
        blurbBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The blurb to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
     */
    public Builder mergeBlurb(com.google.showcase.v1beta1.Blurb value) {
      if (blurbBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          blurb_ != null &&
          blurb_ != com.google.showcase.v1beta1.Blurb.getDefaultInstance()) {
          getBlurbBuilder().mergeFrom(value);
        } else {
          blurb_ = value;
        }
      } else {
        blurbBuilder_.mergeFrom(value);
      }
      if (blurb_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The blurb to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
     */
    public Builder clearBlurb() {
      bitField0_ = (bitField0_ & ~0x00000002);
      blurb_ = null;
      if (blurbBuilder_ != null) {
        blurbBuilder_.dispose();
        blurbBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The blurb to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
     */
    public com.google.showcase.v1beta1.Blurb.Builder getBlurbBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBlurbFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The blurb to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
     */
    public com.google.showcase.v1beta1.BlurbOrBuilder getBlurbOrBuilder() {
      if (blurbBuilder_ != null) {
        return blurbBuilder_.getMessageOrBuilder();
      } else {
        return blurb_ == null ?
            com.google.showcase.v1beta1.Blurb.getDefaultInstance() : blurb_;
      }
    }
    /**
     * <pre>
     * The blurb to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Blurb blurb = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.showcase.v1beta1.Blurb, com.google.showcase.v1beta1.Blurb.Builder, com.google.showcase.v1beta1.BlurbOrBuilder> 
        getBlurbFieldBuilder() {
      if (blurbBuilder_ == null) {
        blurbBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.showcase.v1beta1.Blurb, com.google.showcase.v1beta1.Blurb.Builder, com.google.showcase.v1beta1.BlurbOrBuilder>(
                getBlurb(),
                getParentForChildren(),
                isClean());
        blurb_ = null;
      }
      return blurbBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.CreateBlurbRequest)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.CreateBlurbRequest)
  private static final com.google.showcase.v1beta1.CreateBlurbRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.CreateBlurbRequest();
  }

  public static com.google.showcase.v1beta1.CreateBlurbRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBlurbRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateBlurbRequest>() {
    @java.lang.Override
    public CreateBlurbRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CreateBlurbRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBlurbRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.CreateBlurbRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

