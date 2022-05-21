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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayBucketCachesResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewayBucketCachesResponse.BucketCache;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayBucketCachesResponseUnmarshaller {

	public static DescribeGatewayBucketCachesResponse unmarshall(DescribeGatewayBucketCachesResponse describeGatewayBucketCachesResponse, UnmarshallerContext _ctx) {
		
		describeGatewayBucketCachesResponse.setRequestId(_ctx.stringValue("DescribeGatewayBucketCachesResponse.RequestId"));
		describeGatewayBucketCachesResponse.setTotalCount(_ctx.integerValue("DescribeGatewayBucketCachesResponse.TotalCount"));
		describeGatewayBucketCachesResponse.setMessage(_ctx.stringValue("DescribeGatewayBucketCachesResponse.Message"));
		describeGatewayBucketCachesResponse.setPageSize(_ctx.integerValue("DescribeGatewayBucketCachesResponse.PageSize"));
		describeGatewayBucketCachesResponse.setPageNumber(_ctx.integerValue("DescribeGatewayBucketCachesResponse.PageNumber"));
		describeGatewayBucketCachesResponse.setCode(_ctx.stringValue("DescribeGatewayBucketCachesResponse.Code"));
		describeGatewayBucketCachesResponse.setSuccess(_ctx.booleanValue("DescribeGatewayBucketCachesResponse.Success"));

		List<BucketCache> bucketCaches = new ArrayList<BucketCache>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayBucketCachesResponse.BucketCaches.Length"); i++) {
			BucketCache bucketCache = new BucketCache();
			bucketCache.setVpcId(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].VpcId"));
			bucketCache.setType(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].Type"));
			bucketCache.setMountPoint(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].MountPoint"));
			bucketCache.setGatewayId(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].GatewayId"));
			bucketCache.setCacheMode(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].CacheMode"));
			bucketCache.setBizProtocol(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].Protocol"));
			bucketCache.setGatewayName(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].GatewayName"));
			bucketCache.setCacheStats(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].CacheStats"));
			bucketCache.setShareName(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].ShareName"));
			bucketCache.setRegionId(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].RegionId"));
			bucketCache.setVpcCidr(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].VpcCidr"));
			bucketCache.setBucketName(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].BucketName"));
			bucketCache.setCategory(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].Category"));
			bucketCache.setLocation(_ctx.stringValue("DescribeGatewayBucketCachesResponse.BucketCaches["+ i +"].Location"));

			bucketCaches.add(bucketCache);
		}
		describeGatewayBucketCachesResponse.setBucketCaches(bucketCaches);
	 
	 	return describeGatewayBucketCachesResponse;
	}
}