package com.eightydegreeswest.bfmgr.model;

import lombok.Data;

@Data
public class CreateClusterRequest {
  private String deploymentType;
  private String clusterName;
  private String redisInstanceType;
  private String serverInstanceType;
  private String workerInstanceType;
  private String vpcName;
  private String securityGroupId;
  private String subnet;
  private String ami;
  private String buildfarmTag;
  private String serverRepo;
  private String serverConfig;
  private String workerRepo;
  private String workerConfig;
  private String elbType;
  private String keyName;
}
