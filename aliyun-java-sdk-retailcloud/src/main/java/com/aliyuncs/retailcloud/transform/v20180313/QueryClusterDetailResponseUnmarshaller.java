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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.QueryClusterDetailResponse;
import com.aliyuncs.retailcloud.model.v20180313.QueryClusterDetailResponse.Result;
import com.aliyuncs.retailcloud.model.v20180313.QueryClusterDetailResponse.Result.BasicInfo;
import com.aliyuncs.retailcloud.model.v20180313.QueryClusterDetailResponse.Result.InstanceInfo;
import com.aliyuncs.retailcloud.model.v20180313.QueryClusterDetailResponse.Result.NetInfo;
import com.aliyuncs.retailcloud.model.v20180313.QueryClusterDetailResponse.Result.WorkLoad;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryClusterDetailResponseUnmarshaller {

	public static QueryClusterDetailResponse unmarshall(QueryClusterDetailResponse queryClusterDetailResponse, UnmarshallerContext _ctx) {
		
		queryClusterDetailResponse.setRequestId(_ctx.stringValue("QueryClusterDetailResponse.RequestId"));
		queryClusterDetailResponse.setCode(_ctx.integerValue("QueryClusterDetailResponse.Code"));
		queryClusterDetailResponse.setErrMsg(_ctx.stringValue("QueryClusterDetailResponse.ErrMsg"));
		queryClusterDetailResponse.setSuccess(_ctx.booleanValue("QueryClusterDetailResponse.Success"));

		Result result = new Result();

		List<String> nodeWorkLoadList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryClusterDetailResponse.Result.NodeWorkLoadList.Length"); i++) {
			nodeWorkLoadList.add(_ctx.stringValue("QueryClusterDetailResponse.Result.NodeWorkLoadList["+ i +"]"));
		}
		result.setNodeWorkLoadList(nodeWorkLoadList);

		BasicInfo basicInfo = new BasicInfo();
		basicInfo.setVpcId(_ctx.stringValue("QueryClusterDetailResponse.Result.BasicInfo.VpcId"));
		basicInfo.setHasInstallLogController(_ctx.booleanValue("QueryClusterDetailResponse.Result.BasicInfo.HasInstallLogController"));
		basicInfo.setInstallArmsInProcess(_ctx.booleanValue("QueryClusterDetailResponse.Result.BasicInfo.InstallArmsInProcess"));
		basicInfo.setClusterInstanceId(_ctx.stringValue("QueryClusterDetailResponse.Result.BasicInfo.ClusterInstanceId"));
		basicInfo.setBusinessCode(_ctx.stringValue("QueryClusterDetailResponse.Result.BasicInfo.BusinessCode"));
		basicInfo.setUserNick(_ctx.stringValue("QueryClusterDetailResponse.Result.BasicInfo.UserNick"));
		basicInfo.setEnvType(_ctx.stringValue("QueryClusterDetailResponse.Result.BasicInfo.EnvType"));
		basicInfo.setRegionId(_ctx.stringValue("QueryClusterDetailResponse.Result.BasicInfo.RegionId"));
		basicInfo.setInstallLogInProcess(_ctx.booleanValue("QueryClusterDetailResponse.Result.BasicInfo.InstallLogInProcess"));
		basicInfo.setRegionName(_ctx.stringValue("QueryClusterDetailResponse.Result.BasicInfo.RegionName"));
		basicInfo.setMainUserId(_ctx.stringValue("QueryClusterDetailResponse.Result.BasicInfo.MainUserId"));
		basicInfo.setClusterName(_ctx.stringValue("QueryClusterDetailResponse.Result.BasicInfo.ClusterName"));
		basicInfo.setHasInstallArmsPilot(_ctx.booleanValue("QueryClusterDetailResponse.Result.BasicInfo.HasInstallArmsPilot"));
		basicInfo.setClusterId(_ctx.longValue("QueryClusterDetailResponse.Result.BasicInfo.ClusterId"));

		List<String> vswitchs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryClusterDetailResponse.Result.BasicInfo.Vswitchs.Length"); i++) {
			vswitchs.add(_ctx.stringValue("QueryClusterDetailResponse.Result.BasicInfo.Vswitchs["+ i +"]"));
		}
		basicInfo.setVswitchs(vswitchs);

		List<String> ecsIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryClusterDetailResponse.Result.BasicInfo.EcsIds.Length"); i++) {
			ecsIds.add(_ctx.stringValue("QueryClusterDetailResponse.Result.BasicInfo.EcsIds["+ i +"]"));
		}
		basicInfo.setEcsIds(ecsIds);
		result.setBasicInfo(basicInfo);

		InstanceInfo instanceInfo = new InstanceInfo();
		instanceInfo.setAppCount(_ctx.integerValue("QueryClusterDetailResponse.Result.InstanceInfo.AppCount"));
		instanceInfo.setAllocatePodCount(_ctx.integerValue("QueryClusterDetailResponse.Result.InstanceInfo.AllocatePodCount"));

		List<String> availablePodInfoList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryClusterDetailResponse.Result.InstanceInfo.AvailablePodInfoList.Length"); i++) {
			availablePodInfoList.add(_ctx.stringValue("QueryClusterDetailResponse.Result.InstanceInfo.AvailablePodInfoList["+ i +"]"));
		}
		instanceInfo.setAvailablePodInfoList(availablePodInfoList);

		List<String> allocatedPodInfoList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryClusterDetailResponse.Result.InstanceInfo.AllocatedPodInfoList.Length"); i++) {
			allocatedPodInfoList.add(_ctx.stringValue("QueryClusterDetailResponse.Result.InstanceInfo.AllocatedPodInfoList["+ i +"]"));
		}
		instanceInfo.setAllocatedPodInfoList(allocatedPodInfoList);
		result.setInstanceInfo(instanceInfo);

		NetInfo netInfo = new NetInfo();
		netInfo.setProdCIDR(_ctx.stringValue("QueryClusterDetailResponse.Result.NetInfo.ProdCIDR"));
		netInfo.setServiceCIDR(_ctx.stringValue("QueryClusterDetailResponse.Result.NetInfo.ServiceCIDR"));
		netInfo.setNetPlugType(_ctx.stringValue("QueryClusterDetailResponse.Result.NetInfo.NetPlugType"));
		result.setNetInfo(netInfo);

		WorkLoad workLoad = new WorkLoad();
		workLoad.setMemCapacityTotal(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.MemCapacityTotal"));
		workLoad.setAllocateAllPodCount(_ctx.integerValue("QueryClusterDetailResponse.Result.WorkLoad.AllocateAllPodCount"));
		workLoad.setCpuRequest(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.CpuRequest"));
		workLoad.setAllNodeCount(_ctx.integerValue("QueryClusterDetailResponse.Result.WorkLoad.AllNodeCount"));
		workLoad.setAllocateAppPodCount(_ctx.integerValue("QueryClusterDetailResponse.Result.WorkLoad.AllocateAppPodCount"));
		workLoad.setMemUse(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.MemUse"));
		workLoad.setCpuCapacityTotal(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.CpuCapacityTotal"));
		workLoad.setCpuUsePercent(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.CpuUsePercent"));
		workLoad.setCpuRequestPercent(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.CpuRequestPercent"));
		workLoad.setMemRequest(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.MemRequest"));
		workLoad.setCpuLevel(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.CpuLevel"));
		workLoad.setMemUsePercent(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.MemUsePercent"));
		workLoad.setMemLevel(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.MemLevel"));
		workLoad.setCpuTotal(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.CpuTotal"));
		workLoad.setMemTotal(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.MemTotal"));
		workLoad.setMemRequestPercent(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.MemRequestPercent"));
		workLoad.setCpuUse(_ctx.stringValue("QueryClusterDetailResponse.Result.WorkLoad.CpuUse"));
		result.setWorkLoad(workLoad);
		queryClusterDetailResponse.setResult(result);
	 
	 	return queryClusterDetailResponse;
	}
}