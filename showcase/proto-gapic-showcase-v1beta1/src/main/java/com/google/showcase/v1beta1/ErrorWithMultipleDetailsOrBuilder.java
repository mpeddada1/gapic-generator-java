// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/echo.proto

// Protobuf Java Version: 3.25.1
package com.google.showcase.v1beta1;

public interface ErrorWithMultipleDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.ErrorWithMultipleDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .google.protobuf.Any details = 1;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getDetailsList();
  /**
   * <code>repeated .google.protobuf.Any details = 1;</code>
   */
  com.google.protobuf.Any getDetails(int index);
  /**
   * <code>repeated .google.protobuf.Any details = 1;</code>
   */
  int getDetailsCount();
  /**
   * <code>repeated .google.protobuf.Any details = 1;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getDetailsOrBuilderList();
  /**
   * <code>repeated .google.protobuf.Any details = 1;</code>
   */
  com.google.protobuf.AnyOrBuilder getDetailsOrBuilder(
      int index);
}
