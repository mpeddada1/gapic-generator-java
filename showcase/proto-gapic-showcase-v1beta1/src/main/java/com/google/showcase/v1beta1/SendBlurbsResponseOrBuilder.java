// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/messaging.proto

// Protobuf Java Version: 3.25.1
package com.google.showcase.v1beta1;

public interface SendBlurbsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.SendBlurbsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The names of successful blurb creations.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   * @return A list containing the names.
   */
  java.util.List<java.lang.String>
      getNamesList();
  /**
   * <pre>
   * The names of successful blurb creations.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   * @return The count of names.
   */
  int getNamesCount();
  /**
   * <pre>
   * The names of successful blurb creations.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  java.lang.String getNames(int index);
  /**
   * <pre>
   * The names of successful blurb creations.
   * </pre>
   *
   * <code>repeated string names = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  com.google.protobuf.ByteString
      getNamesBytes(int index);
}
