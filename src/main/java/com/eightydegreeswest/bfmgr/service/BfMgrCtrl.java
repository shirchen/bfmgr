package com.eightydegreeswest.bfmgr.service;

import com.amazonaws.services.ec2.model.KeyPairInfo;
import com.amazonaws.services.ec2.model.SecurityGroup;
import com.amazonaws.services.ec2.model.Subnet;
import com.eightydegreeswest.bfmgr.model.BuildfarmCluster;
import com.eightydegreeswest.bfmgr.model.CreateClusterRequest;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

public interface BfMgrCtrl {
  List<BuildfarmCluster> getBuildfarmClusters() throws UnknownHostException;
  void createCluster(CreateClusterRequest createClusterRequest) throws IOException;
  void terminateCluster(String clusterName);
  CreateClusterRequest getDefaultCreateClusterRequest();
  List<Subnet> getSubnets();
  List<SecurityGroup> getSecurityGroups();
  List<KeyPairInfo> getKeyNames();
}
