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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.ApplicationInfo;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.EcsInfo;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.EcsInfo.Compute;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.EcsInfo.Login;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.EcsInfo.Manager;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.EcsInfo.ProxyMgr;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.OnPremiseInfoItem;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.PostInstallScriptInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterResponseUnmarshaller {

	public static DescribeClusterResponse unmarshall(DescribeClusterResponse describeClusterResponse, UnmarshallerContext _ctx) {
		
		describeClusterResponse.setRequestId(_ctx.stringValue("DescribeClusterResponse.RequestId"));

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setStatus(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Status"));
		clusterInfo.setVpcId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.VpcId"));
		clusterInfo.setKeyPairName(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.KeyPairName"));
		clusterInfo.setEcsChargeType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.EcsChargeType"));
		clusterInfo.setSecurityGroupId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.SecurityGroupId"));
		clusterInfo.setSccClusterId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.SccClusterId"));
		clusterInfo.setCreateTime(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.CreateTime"));
		clusterInfo.setAccountType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.AccountType"));
		clusterInfo.setVolumeProtocol(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.VolumeProtocol"));
		clusterInfo.setDescription(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Description"));
		clusterInfo.setVolumeId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.VolumeId"));
		clusterInfo.setHaEnable(_ctx.booleanValue("DescribeClusterResponse.ClusterInfo.HaEnable"));
		clusterInfo.setBaseOsTag(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.BaseOsTag"));
		clusterInfo.setName(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Name"));
		clusterInfo.setImageId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.ImageId"));
		clusterInfo.setSchedulerType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.SchedulerType"));
		clusterInfo.setDeployMode(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.DeployMode"));
		clusterInfo.setImageOwnerAlias(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.ImageOwnerAlias"));
		clusterInfo.setOsTag(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.OsTag"));
		clusterInfo.setVolumeMountpoint(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.VolumeMountpoint"));
		clusterInfo.setRemoteDirectory(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.RemoteDirectory"));
		clusterInfo.setRegionId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.RegionId"));
		clusterInfo.setVSwitchId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.VSwitchId"));
		clusterInfo.setImageName(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.ImageName"));
		clusterInfo.setVolumeType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.VolumeType"));
		clusterInfo.setLocation(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Location"));
		clusterInfo.setId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Id"));
		clusterInfo.setClientVersion(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.ClientVersion"));

		EcsInfo ecsInfo = new EcsInfo();

		Manager manager = new Manager();
		manager.setInstanceType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Manager.InstanceType"));
		manager.setCount(_ctx.integerValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Manager.Count"));
		ecsInfo.setManager(manager);

		Compute compute = new Compute();
		compute.setInstanceType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Compute.InstanceType"));
		compute.setCount(_ctx.integerValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Compute.Count"));
		ecsInfo.setCompute(compute);

		Login login = new Login();
		login.setInstanceType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Login.InstanceType"));
		login.setCount(_ctx.integerValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Login.Count"));
		ecsInfo.setLogin(login);

		ProxyMgr proxyMgr = new ProxyMgr();
		proxyMgr.setInstanceType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.EcsInfo.ProxyMgr.InstanceType"));
		proxyMgr.setCount(_ctx.integerValue("DescribeClusterResponse.ClusterInfo.EcsInfo.ProxyMgr.Count"));
		ecsInfo.setProxyMgr(proxyMgr);
		clusterInfo.setEcsInfo(ecsInfo);

		List<ApplicationInfo> applications = new ArrayList<ApplicationInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterResponse.ClusterInfo.Applications.Length"); i++) {
			ApplicationInfo applicationInfo = new ApplicationInfo();
			applicationInfo.setTag(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Applications["+ i +"].Tag"));
			applicationInfo.setName(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Applications["+ i +"].Name"));
			applicationInfo.setVersion(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Applications["+ i +"].Version"));

			applications.add(applicationInfo);
		}
		clusterInfo.setApplications(applications);

		List<PostInstallScriptInfo> postInstallScripts = new ArrayList<PostInstallScriptInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterResponse.ClusterInfo.PostInstallScripts.Length"); i++) {
			PostInstallScriptInfo postInstallScriptInfo = new PostInstallScriptInfo();
			postInstallScriptInfo.setUrl(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.PostInstallScripts["+ i +"].Url"));
			postInstallScriptInfo.setArgs(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.PostInstallScripts["+ i +"].Args"));

			postInstallScripts.add(postInstallScriptInfo);
		}
		clusterInfo.setPostInstallScripts(postInstallScripts);

		List<OnPremiseInfoItem> onPremiseInfo = new ArrayList<OnPremiseInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterResponse.ClusterInfo.OnPremiseInfo.Length"); i++) {
			OnPremiseInfoItem onPremiseInfoItem = new OnPremiseInfoItem();
			onPremiseInfoItem.setType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.OnPremiseInfo["+ i +"].Type"));
			onPremiseInfoItem.setHostName(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.OnPremiseInfo["+ i +"].HostName"));
			onPremiseInfoItem.setIP(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.OnPremiseInfo["+ i +"].IP"));

			onPremiseInfo.add(onPremiseInfoItem);
		}
		clusterInfo.setOnPremiseInfo(onPremiseInfo);
		describeClusterResponse.setClusterInfo(clusterInfo);
	 
	 	return describeClusterResponse;
	}
}