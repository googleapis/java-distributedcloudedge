// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/edgecontainer/v1/service.proto

package com.google.cloud.edgecontainer.v1;

public interface ListMachinesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.ListMachinesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Machines in the site.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Machine machines = 1;</code>
   */
  java.util.List<com.google.cloud.edgecontainer.v1.Machine> 
      getMachinesList();
  /**
   * <pre>
   * Machines in the site.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Machine machines = 1;</code>
   */
  com.google.cloud.edgecontainer.v1.Machine getMachines(int index);
  /**
   * <pre>
   * Machines in the site.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Machine machines = 1;</code>
   */
  int getMachinesCount();
  /**
   * <pre>
   * Machines in the site.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Machine machines = 1;</code>
   */
  java.util.List<? extends com.google.cloud.edgecontainer.v1.MachineOrBuilder> 
      getMachinesOrBuilderList();
  /**
   * <pre>
   * Machines in the site.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Machine machines = 1;</code>
   */
  com.google.cloud.edgecontainer.v1.MachineOrBuilder getMachinesOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}