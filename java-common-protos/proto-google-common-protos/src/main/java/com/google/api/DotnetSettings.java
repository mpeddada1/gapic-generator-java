/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/client.proto

package com.google.api;

/**
 *
 *
 * <pre>
 * Settings for Dotnet client libraries.
 * </pre>
 *
 * Protobuf type {@code google.api.DotnetSettings}
 */
public final class DotnetSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.DotnetSettings)
    DotnetSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DotnetSettings.newBuilder() to construct.
  private DotnetSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DotnetSettings() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DotnetSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.ClientProto.internal_static_google_api_DotnetSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.ClientProto.internal_static_google_api_DotnetSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.DotnetSettings.class, com.google.api.DotnetSettings.Builder.class);
  }

  public static final int COMMON_FIELD_NUMBER = 1;
  private com.google.api.CommonLanguageSettings common_;
  /**
   *
   *
   * <pre>
   * Some settings.
   * </pre>
   *
   * <code>.google.api.CommonLanguageSettings common = 1;</code>
   *
   * @return Whether the common field is set.
   */
  @java.lang.Override
  public boolean hasCommon() {
    return common_ != null;
  }
  /**
   *
   *
   * <pre>
   * Some settings.
   * </pre>
   *
   * <code>.google.api.CommonLanguageSettings common = 1;</code>
   *
   * @return The common.
   */
  @java.lang.Override
  public com.google.api.CommonLanguageSettings getCommon() {
    return common_ == null ? com.google.api.CommonLanguageSettings.getDefaultInstance() : common_;
  }
  /**
   *
   *
   * <pre>
   * Some settings.
   * </pre>
   *
   * <code>.google.api.CommonLanguageSettings common = 1;</code>
   */
  @java.lang.Override
  public com.google.api.CommonLanguageSettingsOrBuilder getCommonOrBuilder() {
    return getCommon();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (common_ != null) {
      output.writeMessage(1, getCommon());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (common_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCommon());
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
    if (!(obj instanceof com.google.api.DotnetSettings)) {
      return super.equals(obj);
    }
    com.google.api.DotnetSettings other = (com.google.api.DotnetSettings) obj;

    if (hasCommon() != other.hasCommon()) return false;
    if (hasCommon()) {
      if (!getCommon().equals(other.getCommon())) return false;
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
    if (hasCommon()) {
      hash = (37 * hash) + COMMON_FIELD_NUMBER;
      hash = (53 * hash) + getCommon().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.DotnetSettings parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.DotnetSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.DotnetSettings parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.DotnetSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.DotnetSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.DotnetSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.DotnetSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.DotnetSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.DotnetSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.DotnetSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.DotnetSettings parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.DotnetSettings parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.api.DotnetSettings prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Settings for Dotnet client libraries.
   * </pre>
   *
   * Protobuf type {@code google.api.DotnetSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.DotnetSettings)
      com.google.api.DotnetSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.ClientProto.internal_static_google_api_DotnetSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.ClientProto.internal_static_google_api_DotnetSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.DotnetSettings.class, com.google.api.DotnetSettings.Builder.class);
    }

    // Construct using com.google.api.DotnetSettings.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (commonBuilder_ == null) {
        common_ = null;
      } else {
        common_ = null;
        commonBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.ClientProto.internal_static_google_api_DotnetSettings_descriptor;
    }

    @java.lang.Override
    public com.google.api.DotnetSettings getDefaultInstanceForType() {
      return com.google.api.DotnetSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.DotnetSettings build() {
      com.google.api.DotnetSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.DotnetSettings buildPartial() {
      com.google.api.DotnetSettings result = new com.google.api.DotnetSettings(this);
      if (commonBuilder_ == null) {
        result.common_ = common_;
      } else {
        result.common_ = commonBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.DotnetSettings) {
        return mergeFrom((com.google.api.DotnetSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.DotnetSettings other) {
      if (other == com.google.api.DotnetSettings.getDefaultInstance()) return this;
      if (other.hasCommon()) {
        mergeCommon(other.getCommon());
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
            case 10:
              {
                input.readMessage(getCommonFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            default:
              {
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

    private com.google.api.CommonLanguageSettings common_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.CommonLanguageSettings,
            com.google.api.CommonLanguageSettings.Builder,
            com.google.api.CommonLanguageSettingsOrBuilder>
        commonBuilder_;
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     *
     * @return Whether the common field is set.
     */
    public boolean hasCommon() {
      return commonBuilder_ != null || common_ != null;
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     *
     * @return The common.
     */
    public com.google.api.CommonLanguageSettings getCommon() {
      if (commonBuilder_ == null) {
        return common_ == null
            ? com.google.api.CommonLanguageSettings.getDefaultInstance()
            : common_;
      } else {
        return commonBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    public Builder setCommon(com.google.api.CommonLanguageSettings value) {
      if (commonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        common_ = value;
        onChanged();
      } else {
        commonBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    public Builder setCommon(com.google.api.CommonLanguageSettings.Builder builderForValue) {
      if (commonBuilder_ == null) {
        common_ = builderForValue.build();
        onChanged();
      } else {
        commonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    public Builder mergeCommon(com.google.api.CommonLanguageSettings value) {
      if (commonBuilder_ == null) {
        if (common_ != null) {
          common_ =
              com.google.api.CommonLanguageSettings.newBuilder(common_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          common_ = value;
        }
        onChanged();
      } else {
        commonBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    public Builder clearCommon() {
      if (commonBuilder_ == null) {
        common_ = null;
        onChanged();
      } else {
        common_ = null;
        commonBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    public com.google.api.CommonLanguageSettings.Builder getCommonBuilder() {

      onChanged();
      return getCommonFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    public com.google.api.CommonLanguageSettingsOrBuilder getCommonOrBuilder() {
      if (commonBuilder_ != null) {
        return commonBuilder_.getMessageOrBuilder();
      } else {
        return common_ == null
            ? com.google.api.CommonLanguageSettings.getDefaultInstance()
            : common_;
      }
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.CommonLanguageSettings,
            com.google.api.CommonLanguageSettings.Builder,
            com.google.api.CommonLanguageSettingsOrBuilder>
        getCommonFieldBuilder() {
      if (commonBuilder_ == null) {
        commonBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.CommonLanguageSettings,
                com.google.api.CommonLanguageSettings.Builder,
                com.google.api.CommonLanguageSettingsOrBuilder>(
                getCommon(), getParentForChildren(), isClean());
        common_ = null;
      }
      return commonBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.api.DotnetSettings)
  }

  // @@protoc_insertion_point(class_scope:google.api.DotnetSettings)
  private static final com.google.api.DotnetSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.DotnetSettings();
  }

  public static com.google.api.DotnetSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DotnetSettings> PARSER =
      new com.google.protobuf.AbstractParser<DotnetSettings>() {
        @java.lang.Override
        public DotnetSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<DotnetSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DotnetSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.DotnetSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}