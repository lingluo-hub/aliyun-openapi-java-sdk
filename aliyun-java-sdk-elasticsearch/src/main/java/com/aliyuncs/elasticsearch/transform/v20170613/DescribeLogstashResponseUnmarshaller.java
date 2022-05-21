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

import com.aliyuncs.elasticsearch.model.v20170613.DescribeLogstashResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeLogstashResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeLogstashResponse.Result.Endpoint;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeLogstashResponse.Result.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeLogstashResponse.Result.NodeSpec;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeLogstashResponse.Result.TagsItem;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeLogstashResponse.Result.ZoneInfosItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogstashResponseUnmarshaller {

	public static DescribeLogstashResponse unmarshall(DescribeLogstashResponse describeLogstashResponse, UnmarshallerContext _ctx) {
		
		describeLogstashResponse.setRequestId(_ctx.stringValue("DescribeLogstashResponse.RequestId"));

		Result result = new Result();
		result.setInstanceId(_ctx.stringValue("DescribeLogstashResponse.Result.instanceId"));
		result.setDescription(_ctx.stringValue("DescribeLogstashResponse.Result.description"));
		result.setNodeAmount(_ctx.integerValue("DescribeLogstashResponse.Result.nodeAmount"));
		result.setPaymentType(_ctx.stringValue("DescribeLogstashResponse.Result.paymentType"));
		result.setStatus(_ctx.stringValue("DescribeLogstashResponse.Result.status"));
		result.setVersion(_ctx.stringValue("DescribeLogstashResponse.Result.version"));
		result.setCreatedAt(_ctx.stringValue("DescribeLogstashResponse.Result.createdAt"));
		result.setUpdatedAt(_ctx.stringValue("DescribeLogstashResponse.Result.updatedAt"));
		result.setVpcInstanceId(_ctx.stringValue("DescribeLogstashResponse.Result.vpcInstanceId"));
		result.setConfig(_ctx.mapValue("DescribeLogstashResponse.Result.config"));
		result.setResourceGroupId(_ctx.stringValue("DescribeLogstashResponse.Result.ResourceGroupId"));

		List<Map<Object, Object>> extendConfigs = _ctx.listMapValue("DescribeLogstashResponse.Result.ExtendConfigs");
		result.setExtendConfigs(extendConfigs);

		NodeSpec nodeSpec = new NodeSpec();
		nodeSpec.setSpec(_ctx.stringValue("DescribeLogstashResponse.Result.nodeSpec.spec"));
		nodeSpec.setDisk(_ctx.integerValue("DescribeLogstashResponse.Result.nodeSpec.disk"));
		nodeSpec.setDiskType(_ctx.stringValue("DescribeLogstashResponse.Result.nodeSpec.diskType"));
		nodeSpec.setDiskEncryption(_ctx.booleanValue("DescribeLogstashResponse.Result.nodeSpec.diskEncryption"));
		result.setNodeSpec(nodeSpec);

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setType(_ctx.stringValue("DescribeLogstashResponse.Result.networkConfig.type"));
		networkConfig.setVpcId(_ctx.stringValue("DescribeLogstashResponse.Result.networkConfig.vpcId"));
		networkConfig.setVswitchId(_ctx.stringValue("DescribeLogstashResponse.Result.networkConfig.vswitchId"));
		networkConfig.setVsArea(_ctx.stringValue("DescribeLogstashResponse.Result.networkConfig.vsArea"));
		result.setNetworkConfig(networkConfig);

		List<Endpoint> endpointList = new ArrayList<Endpoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogstashResponse.Result.endpointList.Length"); i++) {
			Endpoint endpoint = new Endpoint();
			endpoint.setHost(_ctx.stringValue("DescribeLogstashResponse.Result.endpointList["+ i +"].host"));
			endpoint.setPort(_ctx.stringValue("DescribeLogstashResponse.Result.endpointList["+ i +"].port"));
			endpoint.setZoneId(_ctx.stringValue("DescribeLogstashResponse.Result.endpointList["+ i +"].zoneId"));

			endpointList.add(endpoint);
		}
		result.setEndpointList(endpointList);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogstashResponse.Result.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagKey(_ctx.stringValue("DescribeLogstashResponse.Result.Tags["+ i +"].tagKey"));
			tagsItem.setTagValue(_ctx.stringValue("DescribeLogstashResponse.Result.Tags["+ i +"].tagValue"));

			tags.add(tagsItem);
		}
		result.setTags(tags);

		List<ZoneInfosItem> zoneInfos = new ArrayList<ZoneInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogstashResponse.Result.ZoneInfos.Length"); i++) {
			ZoneInfosItem zoneInfosItem = new ZoneInfosItem();
			zoneInfosItem.setZoneId(_ctx.stringValue("DescribeLogstashResponse.Result.ZoneInfos["+ i +"].zoneId"));
			zoneInfosItem.setStatus(_ctx.stringValue("DescribeLogstashResponse.Result.ZoneInfos["+ i +"].status"));

			zoneInfos.add(zoneInfosItem);
		}
		result.setZoneInfos(zoneInfos);
		describeLogstashResponse.setResult(result);
	 
	 	return describeLogstashResponse;
	}
}