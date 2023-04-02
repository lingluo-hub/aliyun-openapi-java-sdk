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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupsResponse.ApiGroupAttribute;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupsResponse.ApiGroupAttribute.TagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiGroupsResponseUnmarshaller {

	public static DescribeApiGroupsResponse unmarshall(DescribeApiGroupsResponse describeApiGroupsResponse, UnmarshallerContext _ctx) {
		
		describeApiGroupsResponse.setRequestId(_ctx.stringValue("DescribeApiGroupsResponse.RequestId"));
		describeApiGroupsResponse.setPageNumber(_ctx.integerValue("DescribeApiGroupsResponse.PageNumber"));
		describeApiGroupsResponse.setPageSize(_ctx.integerValue("DescribeApiGroupsResponse.PageSize"));
		describeApiGroupsResponse.setTotalCount(_ctx.integerValue("DescribeApiGroupsResponse.TotalCount"));

		List<ApiGroupAttribute> apiGroupAttributes = new ArrayList<ApiGroupAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiGroupsResponse.ApiGroupAttributes.Length"); i++) {
			ApiGroupAttribute apiGroupAttribute = new ApiGroupAttribute();
			apiGroupAttribute.setBasePath(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].BasePath"));
			apiGroupAttribute.setBillingStatus(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].BillingStatus"));
			apiGroupAttribute.setTrafficLimit(_ctx.integerValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].TrafficLimit"));
			apiGroupAttribute.setInstanceId(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].InstanceId"));
			apiGroupAttribute.setInstanceType(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].InstanceType"));
			apiGroupAttribute.setRegionId(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].RegionId"));
			apiGroupAttribute.setModifiedTime(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].ModifiedTime"));
			apiGroupAttribute.setGroupId(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].GroupId"));
			apiGroupAttribute.setGroupName(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].GroupName"));
			apiGroupAttribute.setDescription(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].Description"));
			apiGroupAttribute.setIllegalStatus(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].IllegalStatus"));
			apiGroupAttribute.setHttpsPolicy(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].HttpsPolicy"));
			apiGroupAttribute.setSubDomain(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].SubDomain"));
			apiGroupAttribute.setCreatedTime(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].CreatedTime"));

			List<TagInfo> tags = new ArrayList<TagInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].Tags.Length"); j++) {
				TagInfo tagInfo = new TagInfo();
				tagInfo.setKey(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].Tags["+ j +"].Key"));
				tagInfo.setValue(_ctx.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagInfo);
			}
			apiGroupAttribute.setTags(tags);

			apiGroupAttributes.add(apiGroupAttribute);
		}
		describeApiGroupsResponse.setApiGroupAttributes(apiGroupAttributes);
	 
	 	return describeApiGroupsResponse;
	}
}