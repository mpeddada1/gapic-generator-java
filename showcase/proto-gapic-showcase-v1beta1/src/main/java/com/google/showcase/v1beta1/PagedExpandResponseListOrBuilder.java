// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/echo.proto

// Protobuf Java Version: 3.25.0
package com.google.showcase.v1beta1;

public interface PagedExpandResponseListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.PagedExpandResponseList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string words = 1;</code>
   * @return A list containing the words.
   */
  java.util.List<java.lang.String>
      getWordsList();
  /**
   * <code>repeated string words = 1;</code>
   * @return The count of words.
   */
  int getWordsCount();
  /**
   * <code>repeated string words = 1;</code>
   * @param index The index of the element to return.
   * @return The words at the given index.
   */
  java.lang.String getWords(int index);
  /**
   * <code>repeated string words = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the words at the given index.
   */
  com.google.protobuf.ByteString
      getWordsBytes(int index);
}
