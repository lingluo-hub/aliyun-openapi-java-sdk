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

package com.aliyuncs.cs.transform.v20151215;

import com.aliyuncs.cs.model.v20151215.DescribeUserQuotaResponse;
import com.aliyuncs.cs.model.v20151215.DescribeUserQuotaResponse.Edge_improved_nodepool_quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserQuotaResponseUnmarshaller {

	public static DescribeUserQuotaResponse unmarshall(DescribeUserQuotaResponse describeUserQuotaResponse, UnmarshallerContext _ctx) {
		
		describeUserQuotaResponse.setAmk_cluster_quota(_ctx.longValue("DescribeUserQuotaResponse.amk_cluster_quota"));
		describeUserQuotaResponse.setAsk_cluster_quota(_ctx.longValue("DescribeUserQuotaResponse.ask_cluster_quota"));
		describeUserQuotaResponse.setCluster_nodepool_quota(_ctx.longValue("DescribeUserQuotaResponse.cluster_nodepool_quota"));
		describeUserQuotaResponse.setCluster_quota(_ctx.longValue("DescribeUserQuotaResponse.cluster_quota"));
		describeUserQuotaResponse.setNode_quota(_ctx.longValue("DescribeUserQuotaResponse.node_quota"));

		Edge_improved_nodepool_quota edge_improved_nodepool_quota = new Edge_improved_nodepool_quota();
		edge_improved_nodepool_quota.setBandwidth(_ctx.integerValue("DescribeUserQuotaResponse.edge_improved_nodepool_quota.bandwidth"));
		edge_improved_nodepool_quota.setCount(_ctx.integerValue("DescribeUserQuotaResponse.edge_improved_nodepool_quota.count"));
		edge_improved_nodepool_quota.setPeriod(_ctx.integerValue("DescribeUserQuotaResponse.edge_improved_nodepool_quota.period"));
		describeUserQuotaResponse.setEdge_improved_nodepool_quota(edge_improved_nodepool_quota);
	 
	 	return describeUserQuotaResponse;
	}
}