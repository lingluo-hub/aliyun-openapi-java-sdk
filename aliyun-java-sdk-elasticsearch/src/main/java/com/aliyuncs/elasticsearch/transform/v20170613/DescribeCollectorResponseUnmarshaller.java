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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.DescribeCollectorResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeCollectorResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeCollectorResponse.Result.ConfigsItem;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeCollectorResponse.Result.ExtendConfigsItem;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeCollectorResponse.Result.ExtendConfigsItem.MachinesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCollectorResponseUnmarshaller {

	public static DescribeCollectorResponse unmarshall(DescribeCollectorResponse describeCollectorResponse, UnmarshallerContext _ctx) {
		
		describeCollectorResponse.setRequestId(_ctx.stringValue("DescribeCollectorResponse.RequestId"));

		Result result = new Result();
		result.setResId(_ctx.stringValue("DescribeCollectorResponse.Result.resId"));
		result.setGmtUpdateTime(_ctx.stringValue("DescribeCollectorResponse.Result.gmtUpdateTime"));
		result.setDryRun(_ctx.booleanValue("DescribeCollectorResponse.Result.dryRun"));
		result.setOwnerId(_ctx.stringValue("DescribeCollectorResponse.Result.ownerId"));
		result.setVpcId(_ctx.stringValue("DescribeCollectorResponse.Result.vpcId"));
		result.setResType(_ctx.stringValue("DescribeCollectorResponse.Result.resType"));
		result.setResVersion(_ctx.stringValue("DescribeCollectorResponse.Result.resVersion"));
		result.setGmtCreatedTime(_ctx.stringValue("DescribeCollectorResponse.Result.gmtCreatedTime"));
		result.setStatus(_ctx.stringValue("DescribeCollectorResponse.Result.status"));
		result.setName(_ctx.stringValue("DescribeCollectorResponse.Result.name"));

		List<String> collectorPaths = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCollectorResponse.Result.collectorPaths.Length"); i++) {
			collectorPaths.add(_ctx.stringValue("DescribeCollectorResponse.Result.collectorPaths["+ i +"]"));
		}
		result.setCollectorPaths(collectorPaths);

		List<ConfigsItem> configs = new ArrayList<ConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCollectorResponse.Result.configs.Length"); i++) {
			ConfigsItem configsItem = new ConfigsItem();
			configsItem.setContent(_ctx.stringValue("DescribeCollectorResponse.Result.configs["+ i +"].content"));
			configsItem.setFileName(_ctx.stringValue("DescribeCollectorResponse.Result.configs["+ i +"].fileName"));

			configs.add(configsItem);
		}
		result.setConfigs(configs);

		List<ExtendConfigsItem> extendConfigs = new ArrayList<ExtendConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCollectorResponse.Result.extendConfigs.Length"); i++) {
			ExtendConfigsItem extendConfigsItem = new ExtendConfigsItem();
			extendConfigsItem.setSuccessPodsCount(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].successPodsCount"));
			extendConfigsItem.setBizProtocol(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].protocol"));
			extendConfigsItem.setUserName(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].userName"));
			extendConfigsItem.setTotalPodsCount(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].totalPodsCount"));
			extendConfigsItem.setType(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].type"));
			extendConfigsItem.setKibanaHost(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].kibanaHost"));
			extendConfigsItem.setEnableMonitoring(_ctx.booleanValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].enableMonitoring"));
			extendConfigsItem.setConfigType(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].configType"));
			extendConfigsItem.setInstanceType(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].instanceType"));
			extendConfigsItem.setGroupId(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].groupId"));
			extendConfigsItem.setHost(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].host"));
			extendConfigsItem.setInstanceId(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].instanceId"));

			List<String> hosts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].hosts.Length"); j++) {
				hosts.add(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].hosts["+ j +"]"));
			}
			extendConfigsItem.setHosts(hosts);

			List<MachinesItem> machines = new ArrayList<MachinesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].machines.Length"); j++) {
				MachinesItem machinesItem = new MachinesItem();
				machinesItem.setAgentStatus(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].machines["+ j +"].agentStatus"));
				machinesItem.setInstanceId(_ctx.stringValue("DescribeCollectorResponse.Result.extendConfigs["+ i +"].machines["+ j +"].instanceId"));

				machines.add(machinesItem);
			}
			extendConfigsItem.setMachines(machines);

			extendConfigs.add(extendConfigsItem);
		}
		result.setExtendConfigs(extendConfigs);
		describeCollectorResponse.setResult(result);
	 
	 	return describeCollectorResponse;
	}
}