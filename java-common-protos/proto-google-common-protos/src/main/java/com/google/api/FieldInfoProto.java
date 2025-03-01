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
// source: google/api/field_info.proto

package com.google.api;

public final class FieldInfoProto {
  private FieldInfoProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.api.FieldInfoProto.fieldInfo);
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static final int FIELD_INFO_FIELD_NUMBER = 291403980;
  /**
   *
   *
   * <pre>
   * Rich semantic descriptor of an API field beyond the basic typing.
   *
   * Examples:
   *
   *   string request_id = 1 [(google.api.field_info).format = UUID4];
   *   string old_ip_address = 2 [(google.api.field_info).format = IPV4];
   *   string new_ip_address = 3 [(google.api.field_info).format = IPV6];
   *   string actual_ip_address = 4 [
   *     (google.api.field_info).format = IPV4_OR_IPV6
   *   ];
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.FieldOptions, com.google.api.FieldInfo>
      fieldInfo =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.api.FieldInfo.class, com.google.api.FieldInfo.getDefaultInstance());

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_FieldInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_FieldInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\033google/api/field_info.proto\022\ngoogle.ap"
          + "i\032 google/protobuf/descriptor.proto\"\214\001\n\t"
          + "FieldInfo\022,\n\006format\030\001 \001(\0162\034.google.api.F"
          + "ieldInfo.Format\"Q\n\006Format\022\026\n\022FORMAT_UNSP"
          + "ECIFIED\020\000\022\t\n\005UUID4\020\001\022\010\n\004IPV4\020\002\022\010\n\004IPV6\020\003"
          + "\022\020\n\014IPV4_OR_IPV6\020\004:L\n\nfield_info\022\035.googl"
          + "e.protobuf.FieldOptions\030\314\361\371\212\001 \001(\0132\025.goog"
          + "le.api.FieldInfoBl\n\016com.google.apiB\016Fiel"
          + "dInfoProtoP\001ZAgoogle.golang.org/genproto"
          + "/googleapis/api/annotations;annotations\242"
          + "\002\004GAPIb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DescriptorProtos.getDescriptor(),
            });
    internal_static_google_api_FieldInfo_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_FieldInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_FieldInfo_descriptor,
            new java.lang.String[] {
              "Format",
            });
    fieldInfo.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
