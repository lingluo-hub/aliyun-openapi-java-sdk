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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisResponse.ApiSummary;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisResponse.ApiSummary.DeployedInfo;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisResponse.ApiSummary.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApisResponseUnmarshaller {

	public static DescribeApisResponse unmarshall(DescribeApisResponse describeApisResponse, UnmarshallerContext _ctx) {
		
		describeApisResponse.setRequestId(_ctx.stringValue("DescribeApisResponse.RequestId"));
		describeApisResponse.setPageNumber(_ctx.integerValue("DescribeApisResponse.PageNumber"));
		describeApisResponse.setPageSize(_ctx.integerValue("DescribeApisResponse.PageSize"));
		describeApisResponse.setTotalCount(_ctx.integerValue("DescribeApisResponse.TotalCount"));

		List<ApiSummary> apiSummarys = new ArrayList<ApiSummary>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApisResponse.ApiSummarys.Length"); i++) {
			ApiSummary apiSummary = new ApiSummary();
			apiSummary.setVisibility(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].Visibility"));
			apiSummary.setApiId(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].ApiId"));
			apiSummary.setModifiedTime(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].ModifiedTime"));
			apiSummary.setDescription(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].Description"));
			apiSummary.setGroupName(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].GroupName"));
			apiSummary.setGroupId(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].GroupId"));
			apiSummary.setCreatedTime(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].CreatedTime"));
			apiSummary.setApiName(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].ApiName"));
			apiSummary.setRegionId(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].RegionId"));
			apiSummary.setApiPath(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].ApiPath"));
			apiSummary.setApiMethod(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].ApiMethod"));

			List<DeployedInfo> deployedInfos = new ArrayList<DeployedInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApisResponse.ApiSummarys["+ i +"].DeployedInfos.Length"); j++) {
				DeployedInfo deployedInfo = new DeployedInfo();
				deployedInfo.setStageName(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].DeployedInfos["+ j +"].StageName"));
				deployedInfo.setEffectiveVersion(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].DeployedInfos["+ j +"].EffectiveVersion"));
				deployedInfo.setDeployedStatus(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].DeployedInfos["+ j +"].DeployedStatus"));

				deployedInfos.add(deployedInfo);
			}
			apiSummary.setDeployedInfos(deployedInfos);

			List<Tag> tagList = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApisResponse.ApiSummarys["+ i +"].TagList.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].TagList["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].TagList["+ j +"].TagValue"));

				tagList.add(tag);
			}
			apiSummary.setTagList(tagList);

			apiSummarys.add(apiSummary);
		}
		describeApisResponse.setApiSummarys(apiSummarys);
	 
	 	return describeApisResponse;
	}
}