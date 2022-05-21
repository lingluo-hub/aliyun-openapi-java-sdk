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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeDynamicTagRuleListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeDynamicTagRuleListResponse.TagGroup;
import com.aliyuncs.cms.model.v20190101.DescribeDynamicTagRuleListResponse.TagGroup.MatchExpressItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDynamicTagRuleListResponseUnmarshaller {

	public static DescribeDynamicTagRuleListResponse unmarshall(DescribeDynamicTagRuleListResponse describeDynamicTagRuleListResponse, UnmarshallerContext _ctx) {
		
		describeDynamicTagRuleListResponse.setRequestId(_ctx.stringValue("DescribeDynamicTagRuleListResponse.RequestId"));
		describeDynamicTagRuleListResponse.setSuccess(_ctx.booleanValue("DescribeDynamicTagRuleListResponse.Success"));
		describeDynamicTagRuleListResponse.setCode(_ctx.stringValue("DescribeDynamicTagRuleListResponse.Code"));
		describeDynamicTagRuleListResponse.setMessage(_ctx.stringValue("DescribeDynamicTagRuleListResponse.Message"));
		describeDynamicTagRuleListResponse.setPageSize(_ctx.stringValue("DescribeDynamicTagRuleListResponse.PageSize"));
		describeDynamicTagRuleListResponse.setPageNumber(_ctx.stringValue("DescribeDynamicTagRuleListResponse.PageNumber"));
		describeDynamicTagRuleListResponse.setTotal(_ctx.integerValue("DescribeDynamicTagRuleListResponse.Total"));

		List<TagGroup> tagGroupList = new ArrayList<TagGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDynamicTagRuleListResponse.TagGroupList.Length"); i++) {
			TagGroup tagGroup = new TagGroup();
			tagGroup.setStatus(_ctx.stringValue("DescribeDynamicTagRuleListResponse.TagGroupList["+ i +"].Status"));
			tagGroup.setMatchExpressFilterRelation(_ctx.stringValue("DescribeDynamicTagRuleListResponse.TagGroupList["+ i +"].MatchExpressFilterRelation"));
			tagGroup.setRegionId(_ctx.stringValue("DescribeDynamicTagRuleListResponse.TagGroupList["+ i +"].RegionId"));
			tagGroup.setTagKey(_ctx.stringValue("DescribeDynamicTagRuleListResponse.TagGroupList["+ i +"].TagKey"));
			tagGroup.setDynamicTagRuleId(_ctx.stringValue("DescribeDynamicTagRuleListResponse.TagGroupList["+ i +"].DynamicTagRuleId"));

			List<String> templateIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDynamicTagRuleListResponse.TagGroupList["+ i +"].TemplateIdList.Length"); j++) {
				templateIdList.add(_ctx.stringValue("DescribeDynamicTagRuleListResponse.TagGroupList["+ i +"].TemplateIdList["+ j +"]"));
			}
			tagGroup.setTemplateIdList(templateIdList);

			List<String> contactGroupList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDynamicTagRuleListResponse.TagGroupList["+ i +"].ContactGroupList.Length"); j++) {
				contactGroupList.add(_ctx.stringValue("DescribeDynamicTagRuleListResponse.TagGroupList["+ i +"].ContactGroupList["+ j +"]"));
			}
			tagGroup.setContactGroupList(contactGroupList);

			List<MatchExpressItem> matchExpress = new ArrayList<MatchExpressItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDynamicTagRuleListResponse.TagGroupList["+ i +"].MatchExpress.Length"); j++) {
				MatchExpressItem matchExpressItem = new MatchExpressItem();
				matchExpressItem.setTagValue(_ctx.stringValue("DescribeDynamicTagRuleListResponse.TagGroupList["+ i +"].MatchExpress["+ j +"].TagValue"));
				matchExpressItem.setTagValueMatchFunction(_ctx.stringValue("DescribeDynamicTagRuleListResponse.TagGroupList["+ i +"].MatchExpress["+ j +"].TagValueMatchFunction"));

				matchExpress.add(matchExpressItem);
			}
			tagGroup.setMatchExpress(matchExpress);

			tagGroupList.add(tagGroup);
		}
		describeDynamicTagRuleListResponse.setTagGroupList(tagGroupList);
	 
	 	return describeDynamicTagRuleListResponse;
	}
}