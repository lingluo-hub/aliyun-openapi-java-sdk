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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeClusterMemberInfoResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeClusterMemberInfoResponse.Children;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeClusterMemberInfoResponse.Children.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterMemberInfoResponseUnmarshaller {

	public static DescribeClusterMemberInfoResponse unmarshall(DescribeClusterMemberInfoResponse describeClusterMemberInfoResponse, UnmarshallerContext _ctx) {
		
		describeClusterMemberInfoResponse.setRequestId(_ctx.stringValue("DescribeClusterMemberInfoResponse.RequestId"));
		describeClusterMemberInfoResponse.setPageNumber(_ctx.integerValue("DescribeClusterMemberInfoResponse.PageNumber"));
		describeClusterMemberInfoResponse.setPageSize(_ctx.integerValue("DescribeClusterMemberInfoResponse.PageSize"));
		describeClusterMemberInfoResponse.setTotalCount(_ctx.integerValue("DescribeClusterMemberInfoResponse.TotalCount"));

		List<Children> clusterChildren = new ArrayList<Children>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterMemberInfoResponse.ClusterChildren.Length"); i++) {
			Children children = new Children();
			children.setCapacity(_ctx.longValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Capacity"));
			children.setUserId(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].UserId"));
			children.setLockReason(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].LockReason"));
			children.setDiskSizeMB(_ctx.integerValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].DiskSizeMB"));
			children.setBandWidth(_ctx.longValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].BandWidth"));
			children.setCurrentBandWidth(_ctx.longValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].CurrentBandWidth"));
			children.setClassCode(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].ClassCode"));
			children.setCreator(_ctx.integerValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Creator"));
			children.setBizType(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].BizType"));
			children.setService(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Service"));
			children.setBinlogRetentionDays(_ctx.integerValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].BinlogRetentionDays"));
			children.setPrimaryInsName(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].PrimaryInsName"));
			children.setModifier(_ctx.integerValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Modifier"));
			children.setConnections(_ctx.longValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Connections"));
			children.setHealth(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Health"));
			children.setResourceGroupName(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].ResourceGroupName"));
			children.setNickname(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Nickname"));
			children.setServiceVersion(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].ServiceVersion"));
			children.setReplicaSize(_ctx.integerValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].ReplicaSize"));
			children.setName(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Name"));
			children.setId(_ctx.longValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Id"));

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Items.Length"); j++) {
				Item item = new Item();
				item.setStatus(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Items["+ j +"].Status"));
				item.setZoneId(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Items["+ j +"].ZoneId"));
				item.setHostName(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Items["+ j +"].HostName"));
				item.setIp(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Items["+ j +"].Ip"));
				item.setRole(_ctx.stringValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Items["+ j +"].Role"));
				item.setId(_ctx.integerValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Items["+ j +"].Id"));

				List<Integer> ports = new ArrayList<Integer>();
				for (int k = 0; k < _ctx.lengthValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Items["+ j +"].Ports.Length"); k++) {
					ports.add(_ctx.integerValue("DescribeClusterMemberInfoResponse.ClusterChildren["+ i +"].Items["+ j +"].Ports["+ k +"]"));
				}
				item.setPorts(ports);

				items.add(item);
			}
			children.setItems(items);

			clusterChildren.add(children);
		}
		describeClusterMemberInfoResponse.setClusterChildren(clusterChildren);
	 
	 	return describeClusterMemberInfoResponse;
	}
}