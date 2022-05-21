/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.QueryClusterDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryClusterDetailResponse extends AcsResponse {

	private Integer code;

	private String errMsg;

	private String requestId;

	private Boolean success;

	private Result result;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<String> nodeWorkLoadList;

		private BasicInfo basicInfo;

		private InstanceInfo instanceInfo;

		private NetInfo netInfo;

		private WorkLoad workLoad;

		public List<String> getNodeWorkLoadList() {
			return this.nodeWorkLoadList;
		}

		public void setNodeWorkLoadList(List<String> nodeWorkLoadList) {
			this.nodeWorkLoadList = nodeWorkLoadList;
		}

		public BasicInfo getBasicInfo() {
			return this.basicInfo;
		}

		public void setBasicInfo(BasicInfo basicInfo) {
			this.basicInfo = basicInfo;
		}

		public InstanceInfo getInstanceInfo() {
			return this.instanceInfo;
		}

		public void setInstanceInfo(InstanceInfo instanceInfo) {
			this.instanceInfo = instanceInfo;
		}

		public NetInfo getNetInfo() {
			return this.netInfo;
		}

		public void setNetInfo(NetInfo netInfo) {
			this.netInfo = netInfo;
		}

		public WorkLoad getWorkLoad() {
			return this.workLoad;
		}

		public void setWorkLoad(WorkLoad workLoad) {
			this.workLoad = workLoad;
		}

		public static class BasicInfo {

			private String vpcId;

			private Boolean hasInstallLogController;

			private Boolean installArmsInProcess;

			private String clusterInstanceId;

			private String businessCode;

			private String userNick;

			private String envType;

			private String regionId;

			private Boolean installLogInProcess;

			private String regionName;

			private String mainUserId;

			private String clusterName;

			private Boolean hasInstallArmsPilot;

			private Long clusterId;

			private List<String> vswitchs;

			private List<String> ecsIds;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public Boolean getHasInstallLogController() {
				return this.hasInstallLogController;
			}

			public void setHasInstallLogController(Boolean hasInstallLogController) {
				this.hasInstallLogController = hasInstallLogController;
			}

			public Boolean getInstallArmsInProcess() {
				return this.installArmsInProcess;
			}

			public void setInstallArmsInProcess(Boolean installArmsInProcess) {
				this.installArmsInProcess = installArmsInProcess;
			}

			public String getClusterInstanceId() {
				return this.clusterInstanceId;
			}

			public void setClusterInstanceId(String clusterInstanceId) {
				this.clusterInstanceId = clusterInstanceId;
			}

			public String getBusinessCode() {
				return this.businessCode;
			}

			public void setBusinessCode(String businessCode) {
				this.businessCode = businessCode;
			}

			public String getUserNick() {
				return this.userNick;
			}

			public void setUserNick(String userNick) {
				this.userNick = userNick;
			}

			public String getEnvType() {
				return this.envType;
			}

			public void setEnvType(String envType) {
				this.envType = envType;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Boolean getInstallLogInProcess() {
				return this.installLogInProcess;
			}

			public void setInstallLogInProcess(Boolean installLogInProcess) {
				this.installLogInProcess = installLogInProcess;
			}

			public String getRegionName() {
				return this.regionName;
			}

			public void setRegionName(String regionName) {
				this.regionName = regionName;
			}

			public String getMainUserId() {
				return this.mainUserId;
			}

			public void setMainUserId(String mainUserId) {
				this.mainUserId = mainUserId;
			}

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}

			public Boolean getHasInstallArmsPilot() {
				return this.hasInstallArmsPilot;
			}

			public void setHasInstallArmsPilot(Boolean hasInstallArmsPilot) {
				this.hasInstallArmsPilot = hasInstallArmsPilot;
			}

			public Long getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(Long clusterId) {
				this.clusterId = clusterId;
			}

			public List<String> getVswitchs() {
				return this.vswitchs;
			}

			public void setVswitchs(List<String> vswitchs) {
				this.vswitchs = vswitchs;
			}

			public List<String> getEcsIds() {
				return this.ecsIds;
			}

			public void setEcsIds(List<String> ecsIds) {
				this.ecsIds = ecsIds;
			}
		}

		public static class InstanceInfo {

			private Integer appCount;

			private Integer allocatePodCount;

			private List<String> availablePodInfoList;

			private List<String> allocatedPodInfoList;

			public Integer getAppCount() {
				return this.appCount;
			}

			public void setAppCount(Integer appCount) {
				this.appCount = appCount;
			}

			public Integer getAllocatePodCount() {
				return this.allocatePodCount;
			}

			public void setAllocatePodCount(Integer allocatePodCount) {
				this.allocatePodCount = allocatePodCount;
			}

			public List<String> getAvailablePodInfoList() {
				return this.availablePodInfoList;
			}

			public void setAvailablePodInfoList(List<String> availablePodInfoList) {
				this.availablePodInfoList = availablePodInfoList;
			}

			public List<String> getAllocatedPodInfoList() {
				return this.allocatedPodInfoList;
			}

			public void setAllocatedPodInfoList(List<String> allocatedPodInfoList) {
				this.allocatedPodInfoList = allocatedPodInfoList;
			}
		}

		public static class NetInfo {

			private String prodCIDR;

			private String serviceCIDR;

			private String netPlugType;

			public String getProdCIDR() {
				return this.prodCIDR;
			}

			public void setProdCIDR(String prodCIDR) {
				this.prodCIDR = prodCIDR;
			}

			public String getServiceCIDR() {
				return this.serviceCIDR;
			}

			public void setServiceCIDR(String serviceCIDR) {
				this.serviceCIDR = serviceCIDR;
			}

			public String getNetPlugType() {
				return this.netPlugType;
			}

			public void setNetPlugType(String netPlugType) {
				this.netPlugType = netPlugType;
			}
		}

		public static class WorkLoad {

			private String memCapacityTotal;

			private Integer allocateAllPodCount;

			private String cpuRequest;

			private Integer allNodeCount;

			private Integer allocateAppPodCount;

			private String memUse;

			private String cpuCapacityTotal;

			private String cpuUsePercent;

			private String cpuRequestPercent;

			private String memRequest;

			private String cpuLevel;

			private String memUsePercent;

			private String memLevel;

			private String cpuTotal;

			private String memTotal;

			private String memRequestPercent;

			private String cpuUse;

			public String getMemCapacityTotal() {
				return this.memCapacityTotal;
			}

			public void setMemCapacityTotal(String memCapacityTotal) {
				this.memCapacityTotal = memCapacityTotal;
			}

			public Integer getAllocateAllPodCount() {
				return this.allocateAllPodCount;
			}

			public void setAllocateAllPodCount(Integer allocateAllPodCount) {
				this.allocateAllPodCount = allocateAllPodCount;
			}

			public String getCpuRequest() {
				return this.cpuRequest;
			}

			public void setCpuRequest(String cpuRequest) {
				this.cpuRequest = cpuRequest;
			}

			public Integer getAllNodeCount() {
				return this.allNodeCount;
			}

			public void setAllNodeCount(Integer allNodeCount) {
				this.allNodeCount = allNodeCount;
			}

			public Integer getAllocateAppPodCount() {
				return this.allocateAppPodCount;
			}

			public void setAllocateAppPodCount(Integer allocateAppPodCount) {
				this.allocateAppPodCount = allocateAppPodCount;
			}

			public String getMemUse() {
				return this.memUse;
			}

			public void setMemUse(String memUse) {
				this.memUse = memUse;
			}

			public String getCpuCapacityTotal() {
				return this.cpuCapacityTotal;
			}

			public void setCpuCapacityTotal(String cpuCapacityTotal) {
				this.cpuCapacityTotal = cpuCapacityTotal;
			}

			public String getCpuUsePercent() {
				return this.cpuUsePercent;
			}

			public void setCpuUsePercent(String cpuUsePercent) {
				this.cpuUsePercent = cpuUsePercent;
			}

			public String getCpuRequestPercent() {
				return this.cpuRequestPercent;
			}

			public void setCpuRequestPercent(String cpuRequestPercent) {
				this.cpuRequestPercent = cpuRequestPercent;
			}

			public String getMemRequest() {
				return this.memRequest;
			}

			public void setMemRequest(String memRequest) {
				this.memRequest = memRequest;
			}

			public String getCpuLevel() {
				return this.cpuLevel;
			}

			public void setCpuLevel(String cpuLevel) {
				this.cpuLevel = cpuLevel;
			}

			public String getMemUsePercent() {
				return this.memUsePercent;
			}

			public void setMemUsePercent(String memUsePercent) {
				this.memUsePercent = memUsePercent;
			}

			public String getMemLevel() {
				return this.memLevel;
			}

			public void setMemLevel(String memLevel) {
				this.memLevel = memLevel;
			}

			public String getCpuTotal() {
				return this.cpuTotal;
			}

			public void setCpuTotal(String cpuTotal) {
				this.cpuTotal = cpuTotal;
			}

			public String getMemTotal() {
				return this.memTotal;
			}

			public void setMemTotal(String memTotal) {
				this.memTotal = memTotal;
			}

			public String getMemRequestPercent() {
				return this.memRequestPercent;
			}

			public void setMemRequestPercent(String memRequestPercent) {
				this.memRequestPercent = memRequestPercent;
			}

			public String getCpuUse() {
				return this.cpuUse;
			}

			public void setCpuUse(String cpuUse) {
				this.cpuUse = cpuUse;
			}
		}
	}

	@Override
	public QueryClusterDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryClusterDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
