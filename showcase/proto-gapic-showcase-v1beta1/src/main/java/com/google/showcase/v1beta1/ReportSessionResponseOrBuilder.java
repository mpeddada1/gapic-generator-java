// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/testing.proto

// Protobuf Java Version: 3.25.1
package com.google.showcase.v1beta1;

public interface ReportSessionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.ReportSessionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The state of the report.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.ReportSessionResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <pre>
   * The state of the report.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.ReportSessionResponse.Result result = 1;</code>
   * @return The result.
   */
  com.google.showcase.v1beta1.ReportSessionResponse.Result getResult();

  /**
   * <pre>
   * The test runs of this session.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
   */
  java.util.List<com.google.showcase.v1beta1.TestRun> 
      getTestRunsList();
  /**
   * <pre>
   * The test runs of this session.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
   */
  com.google.showcase.v1beta1.TestRun getTestRuns(int index);
  /**
   * <pre>
   * The test runs of this session.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
   */
  int getTestRunsCount();
  /**
   * <pre>
   * The test runs of this session.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
   */
  java.util.List<? extends com.google.showcase.v1beta1.TestRunOrBuilder> 
      getTestRunsOrBuilderList();
  /**
   * <pre>
   * The test runs of this session.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.TestRun test_runs = 2;</code>
   */
  com.google.showcase.v1beta1.TestRunOrBuilder getTestRunsOrBuilder(
      int index);
}
